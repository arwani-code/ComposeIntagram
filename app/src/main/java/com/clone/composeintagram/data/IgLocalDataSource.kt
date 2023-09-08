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
        ),
        DataModel(
            postImage = "https://images.unsplash.com/photo-1692450932066-785f248b4013?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3wzODc1Mjd8MHwxfHJhbmRvbXx8fHx8fHx8fDE2OTM5NTUxMzJ8&ixlib=rb-4.0.3&q=80&w=1080",
            canLargeImage = true
        ),
        DataModel(
            postImage = "https://images.unsplash.com/photo-1547744152-14d985cb937f?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max"
        ),
        DataModel(
            postImage = "https://images.unsplash.com/photo-1513002749550-c59d786b8e6c?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max"
        ),
        DataModel(
            postImage = "https://images.unsplash.com/photo-1539593395743-7da5ee10ff07?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max"
        ),
        DataModel(
            postImage = "https://images.unsplash.com/photo-1691198913445-d7032ec7f2dc?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3wzODc1Mjd8MHwxfHJhbmRvbXx8fHx8fHx8fDE2OTM5NTUzNDd8&ixlib=rb-4.0.3&q=80&w=1080"
        ),
        DataModel(
            postImage = "https://images.unsplash.com/photo-1693487720548-cef983c29c7a?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3wzODc1Mjd8MHwxfHJhbmRvbXx8fHx8fHx8fDE2OTM5NTU0MzZ8&ixlib=rb-4.0.3&q=80&w=1080"
        ),
        DataModel(
            postImage = "https://images.unsplash.com/photo-1492144534655-ae79c964c9d7?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max"
        ),
        DataModel(
            postImage = "https://images.unsplash.com/photo-1691256853764-f9917b70e5e5?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3wzODc1Mjd8MHwxfHJhbmRvbXx8fHx8fHx8fDE2OTM5NTU2MDR8&ixlib=rb-4.0.3&q=80&w=1080",
            canLargeImage = true
        ),
        DataModel(
            postImage = "https://images.unsplash.com/photo-1691944435602-a219037ac417?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3wzODc1Mjd8MHwxfHJhbmRvbXx8fHx8fHx8fDE2OTM5NTU1MDF8&ixlib=rb-4.0.3&q=80&w=1080"
        ),
        DataModel(
            postImage = "https://images.unsplash.com/photo-1692659071201-4a368a8a61c1?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3wzODc1Mjd8MHwxfHJhbmRvbXx8fHx8fHx8fDE2OTM5NTU1MzJ8&ixlib=rb-4.0.3&q=80&w=1080"
        )
    )

    val sampleVideos = listOf(
        "https://media.istockphoto.com/id/1282763864/id/video/hilton-falls-dekat-milton-ontario-kanada.mp4?s=mp4-640x640-is&k=20&c=Kdg1rPjjoaeSOIW26xwDuJg_9iE-07Cp8jLpqFzKqEA=",
        "https://media.istockphoto.com/id/1317701201/id/video/eceng-gondok-overwintering-eceng-gondok-overwintering.mp4?s=mp4-640x640-is&k=20&c=jKtrDkuqz_9_8ma4VggyMs-1FgxJMxJEf2iBzjel8Eo=",
        "https://media.istockphoto.com/id/928119722/id/video/mencuci-sayuran-segar-video-gerakan-lambat.mp4?s=mp4-640x640-is&k=20&c=Lm0vHy0nc-sbAAoSK31NPyxUWnE1exXtrMlptLX43v4=",
        "https://media.istockphoto.com/id/1090547236/id/video/pria-dan-wanita-kaki-bawah-air-berdiri-di-tepi-lubang-dengan-dasar-laut-berbatu-kamera-tahan.mp4?s=mp4-640x640-is&k=20&c=OXhoAoe5r5WGUlvtXhOYsxI7RwPB58SI9C5Xf7vzac8=",
        "https://media.istockphoto.com/id/129550690/id/video/gutta-cavat-lapidem-hd-30f.mp4?s=mp4-640x640-is&k=20&c=SDTmdXx6qDV-V2e_R_pOXdrbB6i_o0qjVBBL45gVfP0=",
        "https://media.istockphoto.com/id/925552678/id/video/jacuzzi.mp4?s=mp4-640x640-is&k=20&c=exyxAz1UFCM0wKFzlZD13evlVgGvhMsACWk6ufMvePI=",
        "https://media.istockphoto.com/id/1436176201/id/video/elemen-air-mancur-yang-berfungsi-di-taman-melawan-semak-hijau-gerakan-lambat.mp4?s=mp4-640x640-is&k=20&c=oJ2qi_yC3ouKAb6xNb5PWP9dZ-1-Cw145cFNtjTH0YE=",
        "https://media.istockphoto.com/id/1324825893/id/video/tetesan-air-jatuh-dari-batu-dalam-gerakan-lambat-250fps.mp4?s=mp4-640x640-is&k=20&c=SCIoEweYLkD_7dhqVKtrRway4IQdmcMIOCmQkLOgwGI="
    ).map {
        val name = nameRegex.find(it)?.groups?.firstOrNull()?.value
        val thumb =
            "https://images.pexels.com/videos/9905538/bokeh-9905538.jpeg?auto=compress&cs=tinysrgb&w=600"
        Video(url = it, isFavorite = Random.nextBoolean(), thumbnail = thumb)
    }

    val followedProfile = listOf(
        DataModel(
            peopleImage = "https://images.unsplash.com/photo-1682686578601-e7851641d52c?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3wzODc1Mjd8MXwxfGFsbHwxfHx8fHx8Mnx8MTY5MzYyNzk0Nnw&ixlib=rb-4.0.3&q=80&w=400",
            name = "Michael Johnson",
            followed = "William Taylor and 20 more"
        ),
        DataModel(
            peopleImage = "https://images.unsplash.com/profile-1679489218992-ebe823c797dfimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128",
            name = "Emily Davis",
            followed = "Sophia Anderson and 15 more"
        ),
        DataModel(
            peopleImage = "https://images.unsplash.com/photo-1693370268702-92402dd47484?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3wzODc1Mjd8MHwxfGFsbHwyfHx8fHx8Mnx8MTY5MzYyNzk0Nnw&ixlib=rb-4.0.3&q=80&w=400",
            name = "Daniel Brown",
            followed = "Ava Harris and 18 more"
        ),
        DataModel(
            peopleImage = "https://images.unsplash.com/profile-1650823265094-d12ce7a91369image?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128",
            name = "Sophia Anderson",
            followed = "Emily Davis and 12 more"
        ),
        DataModel(
            peopleImage = "https://images.unsplash.com/profile-1592328433409-d9ce8a5333eaimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128",
            name = "William Taylor",
            followed = "Michael Johnson and 25 more"
        ),
        DataModel(
            peopleImage = "https://images.unsplash.com/profile-1601206918608-f38b995faee6image?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128",
            name = "Ava Harris",
            followed = "Daniel Brown and 17 more"
        ),
        DataModel(
            peopleImage = "https://images.unsplash.com/profile-1555528272665-3f3363727dae?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128",
            name = "Olivia White",
            followed = "James Miller and 22 more"
        ),
        DataModel(
            peopleImage = "https://images.unsplash.com/profile-1583427783052-3da8ceab5579image?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128",
            name = "Ethan Wilson",
            followed = "Jessica Smith and 19 more"
        ),
        DataModel(
            peopleImage = "https://images.unsplash.com/profile-1692693935949-83c01fd43f85image?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128",
            name = "Jessica Smith",
            followed = "Ethan Wilson and 16 more"
        ),
        DataModel(
            peopleImage = "https://images.unsplash.com/profile-1503350572760-b44aa5280785?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128",
            name = "James Miller",
            followed = "Olivia White and 21 more"
        )
    )
}