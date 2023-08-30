package com.clone.composeintagram.ui.reels.components

import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.PlaybackException
import com.google.android.exoplayer2.Player


@Composable
fun rememberPlaybackState(player: ExoPlayer, mediaItemIndex: Int): PlayerState {

    var state by remember { mutableStateOf(PlayerState()) }

    val updateState: (block: PlayerState.() -> PlayerState) -> Unit = { block ->
        if (player.currentMediaItemIndex == mediaItemIndex) {
            val update = block(state)
            if (update != state) state = update
        }
    }

    DisposableEffect(player) {
        val listener = object : Player.Listener {
            override fun onIsPlayingChanged(isPlaying: Boolean) {
                super.onIsPlayingChanged(isPlaying)
                updateState {
                    copy(playing = isPlaying)
                }
            }

            override fun onPlaybackStateChanged(playbackState: Int) {
                super.onPlaybackStateChanged(playbackState)
                updateState {
                    copy(isReady = playbackState == Player.STATE_READY)
                }
            }

            override fun onRenderedFirstFrame() {
                super.onRenderedFirstFrame()
                updateState {
                    copy(firstFrameRendered = true)
                }
            }

            override fun onMediaItemTransition(mediaItem: MediaItem?, reason: Int) {
                super.onMediaItemTransition(mediaItem, reason)
                state = state.copy(currentMediaItem = mediaItem ?: MediaItem.EMPTY)
            }
        }
        player.addListener(listener)
        onDispose {
            player.removeListener(listener)
        }
    }

    return state
}

data class PlayerState(
    val isReady: Boolean = false,
    val playing: Boolean = false,
    val firstFrameRendered: Boolean = false,
    val currentMediaItem: MediaItem = MediaItem.EMPTY,
)