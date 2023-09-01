package com.clone.composeintagram.data

import androidx.compose.ui.graphics.Color
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.random.Random

@Singleton
class IgLocalDataSource @Inject constructor() {
    private val nameRegex = Regex("([A-Z])\\w+")
    val colorList = listOf(
        Color(0xFF962fbf),
        Color(0xFFd62976),
        Color(0xFFfa7e1e),
        Color(0xFFfeda75),
    )
    val statusIg = listOf(
        DataModel(
            name = "MarkZuckerberg",
            statusImage = "https://i.postimg.cc/dtYKnxFc/mark.jpg"
        ),
        DataModel(
            name = "FifaWorldCup",
            statusImage = "https://i.postimg.cc/gjKtg4yG/fifaworldcup.jpg"
        ),
        DataModel(
            statusImage = "https://i.postimg.cc/FFGxnf5F/Emily-Johnson.jpg",
            name = "EmilyJohnson"
        ),
        DataModel(
            name = "MichaelSmith",
            statusImage = "https://i.postimg.cc/G2LykQpF/Ava-Miller.jpg"
        ),
        DataModel(
            name = "OliviaWilliams",
            statusImage = "https://i.postimg.cc/7hcJrrn9/Ethan-Davis.jpg"
        ),
        DataModel(
            name = "JamesBrown",
            statusImage = "https://i.postimg.cc/vmMgszfJ/James-Brown.jpg"
        ),
        DataModel(
            name = "AvaMiller",
            statusImage = "https://i.postimg.cc/3NyWBbQv/Michael-Smith.jpg"
        ),
        DataModel(
            name = "EthanDavis",
            statusImage = "https://i.postimg.cc/RC8WF9wQ/Olivia-Williams.jpg"
        ),
        DataModel(
            name = "SophiaWilson",
            statusImage = "https://i.postimg.cc/9fWMSfjV/Sophia-Wilson.jpg"
        ),
        DataModel(
            name = "WilliamAnderson",
            statusImage = "https://i.postimg.cc/T3xgdfXN/William-Anderson.jpg"
        ),
    )

    val dataItems: List<DataModel> = listOf(
        DataModel(
            name = "Alice",
            peopleImage = "https://i.imgur.com/cJsS2qE.jpg",
            postImage = "https://i.imgur.com/jSNTiYB.jpg",
            likes = "25",
            contentDescription = "🌟 Enjoying a wonderful day at the beach with friends! Feeling the sun on my skin and the sound of waves 🏖️🌞 #BeachVibes #FriendsTime",
            moments = "2 hours ago"
        ),
        DataModel(
            name = "Bob",
            peopleImage = "https://i.imgur.com/bscz39M.jpg",
            postImage = "https://i.imgur.com/2NRMItw.jpg",
            likes = "10",
            contentDescription = "🍔 Tried out a new burger joint today. The cheeseburger was so cheesy and juicy! 🍔🧀 Highly recommended for all foodies out there! #BurgerDelight #Foodie",
            moments = "1 day ago"
        ),
        DataModel(
            name = "Carol",
            peopleImage = "https://i.imgur.com/Nna0JyR.jpg",
            postImage = "https://i.imgur.com/VhvZGHO.jpg",
            likes = "50",
            contentDescription = "🎨 Visited an art exhibition showcasing local talents. The paintings were so vibrant and full of life! A true feast for the eyes. 🖼️🎉 #ArtExpo #LocalTalent",
            moments = "3 hours ago"
        ),
        DataModel(
            name = "David",
            peopleImage = "https://i.imgur.com/BJq1g2K.jpg",
            postImage = "https://i.imgur.com/RCwv1fG.jpg",
            likes = "8",
            contentDescription = "📚 Spent the afternoon diving into a captivating fantasy novel. The magical world and intricate characters have me hooked! 📖✨ #BookLover #Fantasy",
            moments = "6 hours ago"
        ),
        DataModel(
            name = "Eva",
            peopleImage = "https://i.imgur.com/ws1ApUc.jpg",
            postImage = "https://i.imgur.com/dgm1nid.jpg",
            likes = "30",
            contentDescription = "🎉 Celebrated my birthday with an amazing party last night! Grateful for all the love and good times. 🥳🎂 #BirthdayBash #Gratitude",
            moments = "1 day ago"
        ),
        DataModel(
            name = "Frank",
            peopleImage = "https://i.imgur.com/aG6Fu7V.jpg",
            postImage = "https://i.imgur.com/iivsKJK.jpg",
            likes = "15",
            contentDescription = "🚴‍♂️ Went for a challenging mountain biking adventure today. The adrenaline rush and stunning views were totally worth it! 🏞️🚵‍♂️ #MountainBiking #Adventure",
            moments = "5 hours ago"
        ),
        DataModel(
            name = "Grace",
            peopleImage = "https://i.imgur.com/tqhUGbZ.jpg",
            postImage = "https://i.imgur.com/xQAfPTW.jpg",
            likes = "12",
            contentDescription = "☕ Enjoying a cozy afternoon with a cup of hot cocoa and a good book. Perfect way to unwind on a rainy day! 📚🌧️ #RainyDay #CozyTime",
            moments = "4 hours ago"
        ),
        DataModel(
            name = "Henry",
            peopleImage = "https://i.imgur.com/z3IIhhR.jpg",
            postImage = "https://i.imgur.com/7vFsFMx.jpg",
            likes = "40",
            contentDescription = "🎶 Attended an electrifying live concert last night. The music, lights, and energy of the crowd were absolutely incredible! 🎤🎸 #LiveMusic #Euphoria",
            moments = "1 day ago"
        ),
        DataModel(
            name = "Ivy",
            peopleImage = "https://i.imgur.com/DZev8BH.jpg",
            postImage = "https://i.imgur.com/foTBWS6.jpg",
            likes = "18",
            contentDescription = "🌄 Watched a breathtaking sunrise from the mountaintop. Nature's beauty never fails to leave me speechless. 🌅🏞️ #SunriseMagic #NatureLover",
            moments = "7 hours ago"
        ),
        DataModel(
            name = "Jack",
            peopleImage = "https://i.imgur.com/IE9ZAPa.jpg",
            postImage = "https://i.imgur.com/NR2yMVQ.jpg",
            likes = "28",
            contentDescription = "🎮 Spent the evening playing my favorite video game. Achieved a new high score and had a blast battling virtual foes! 🕹️🎮 #GamingFun #HighScore",
            moments = "2 days ago"
        )
    )

    val dataSearchItem: List<DataModel> = listOf(
        DataModel(
            postImage = "https://i.imgur.com/jCyy4PW.jpg"
        ),
        DataModel(
            postImage = "https://i.imgur.com/aGM0EMm.jpg"
        ),
        DataModel(
            canLargeImage = true,
            postImage = "https://i.imgur.com/vALLRqH.jpg"
        ),
        DataModel(
            postImage = "https://i.imgur.com/1YijIyZ.jpg"
        ),
        DataModel(
            postImage = "https://i.imgur.com/9RFd0Va.jpg"
        ),
        DataModel(
            canLargeImage = true,
            postImage = "https://i.imgur.com/p0ATmFx.jpg"
        ),
        DataModel(
            postImage = "https://i.imgur.com/bsDDwss.jpg"
        ),
        DataModel(
            postImage = "https://i.imgur.com/gTvdqhw.jpg"
        ),
        DataModel(
            postImage = "https://i.imgur.com/jO2kZDG.jpg"
        ),
        DataModel(
            postImage = "https://i.imgur.com/LaerLSy.jpg"
        ),
        DataModel(
            postImage = "https://i.imgur.com/1hL5xun.jpg"
        ),
        DataModel(
            postImage = "https://i.imgur.com/80fcL4R.jpg"
        ),
        DataModel(
            postImage = "https://i.imgur.com/sUeXfAg.jpg",
            canLargeImage = true
        ),
        DataModel(
            postImage = "https://i.imgur.com/ykifcVk.jpg"
        ),
        DataModel(
            postImage = "https://i.imgur.com/pSefFIC.jpg"
        )
    )

    val sampleVideos = listOf(
        "https://dms-exp2.licdn.com/playlist/vid/D4D05AQHk3m5ZbShWBg/feedshare-ambry-analyzed_servable_progressive_video/0/1693382416327?e=1694052000&v=beta&t=ZB1zfA8R11xsCPf2bL_zi79Fhn8UE6HX-TMuJ3homX0",
        "https://dms-exp2.licdn.com/playlist/vid/D5610AQGrNRa64UJrIA/mp4-720p-30fp-crf28/0/1688128248955?e=1693998000&v=beta&t=BsNvVTIfdzO9eEQLmm-O_kRd1cqsByOQza4EdVdLcX4",
        "https://dms-exp2.licdn.com/playlist/vid/D4E10AQG0XvddsFze-w/mp4-720p-30fp-crf28/0/1693386485919/0-_islamic_finance_2023720pmp4?e=1694062800&v=beta&t=JaPLxt5JXHQcK1pNIlcBg9GrRo03zDYewfBfIjQUglY",
        "https://dms-exp2.licdn.com/playlist/vid/D5605AQGSHFLQs718bw/mp4-720p-30fp-crf28/0/1692948614540?e=1694062800&v=beta&t=rHpQa-o8FbQy4n1V1GD2PG2nveqq9oO3W329SSIzGks"
    ).map {
        val name = nameRegex.find(it)?.groups?.firstOrNull()?.value
        val thumb =
            "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/$name.jpg"
        Video(url = it, isFavorite = Random.nextBoolean(), thumbnail = thumb)
    }

    val followedProfile = listOf(
        DataModel(
            peopleImage = "https://picsum.photos/200",
            name = "Jhon Doe",
            followed = "Aku sayang dan cinta dia selalu"
        ),
        DataModel(
            peopleImage = "https://picsum.photos/200",
            name = "Jhon Doe",
            followed = "Aku sayang dan cinta dia selalu"
        ),
        DataModel(
            peopleImage = "https://picsum.photos/200",
            name = "Jhon Doe",
            followed = "Aku sayang dan cinta dia selalu"
        ),
        DataModel(
            peopleImage = "https://picsum.photos/200",
            name = "Jhon Doe",
            followed = "Aku sayang dan cinta dia selalu"
        ),
        DataModel(
            peopleImage = "https://picsum.photos/200",
            name = "Jhon Doe",
            followed = "Aku sayang dan cinta dia selalu"
        ),
        DataModel(
            peopleImage = "https://picsum.photos/200",
            name = "Jhon Doe",
            followed = "Aku sayang dan cinta dia selalu"
        ),
        DataModel(
            peopleImage = "https://picsum.photos/200",
            name = "Jhon Doe",
            followed = "Aku sayang dan cinta dia selalu"
        )
    )
}