package com.clone.composeintagram

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.clone.composeintagram.navigation.InstagramNavHost
import com.clone.composeintagram.ui.theme.ComposeIntagramTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.google.android.exoplayer2.database.DatabaseProvider
import com.google.android.exoplayer2.database.StandaloneDatabaseProvider
import com.google.android.exoplayer2.upstream.cache.Cache
import com.google.android.exoplayer2.upstream.cache.CacheEvictor
import com.google.android.exoplayer2.upstream.cache.LeastRecentlyUsedCacheEvictor
import com.google.android.exoplayer2.upstream.cache.SimpleCache
import dagger.hilt.android.AndroidEntryPoint


@OptIn(ExperimentalMaterial3Api::class)
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var cache: Cache
    private lateinit var cacheEvictor: CacheEvictor
    private lateinit var databaseProvider: DatabaseProvider
    private val cacheSize: Long = 100 * 1024 * 1024

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cacheEvictor = LeastRecentlyUsedCacheEvictor(cacheSize)
        databaseProvider = StandaloneDatabaseProvider(this)
        cache = SimpleCache(cacheDir, cacheEvictor, databaseProvider)
        setContent {
            ComposeIntagramTheme {
                val uiSystemController = rememberSystemUiController()
                uiSystemController.setStatusBarColor(MaterialTheme.colorScheme.background)
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    InstagramNavHost(cache = cache)
                }
            }
        }
    }

    override fun onPause() {
        super.onPause()
        cache.release()
    }
}
