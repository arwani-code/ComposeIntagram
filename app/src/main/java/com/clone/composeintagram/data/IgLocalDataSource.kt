package com.clone.composeintagram.data

import androidx.compose.ui.graphics.Color
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class IgLocalDataSource @Inject constructor() {
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
            peopleImage = "https://scontent.cdninstagram.com/v/t51.2885-19/336227546_229199639582173_1993471805021603123_n.jpg?stp=dst-jpg_s150x150&_nc_ht=scontent.cdninstagram.com&_nc_cat=101&_nc_ohc=7NZU-BT1U2QAX9fTlJw&edm=APs17CUBAAAA&ccb=7-5&oh=00_AfCbRZqx5X7mG4_PtZ1PzQtU-Ma4NSNQ2QVJz4Ff6B7WEg&oe=64DA81D1&_nc_sid=10d13b",
            postImage = "https://instagram.fcgk16-1.fna.fbcdn.net/v/t51.2885-15/362406677_285041827538650_2575399651211044762_n.jpg?stp=c240.0.959.959a_dst-jpg_e35_s320x320&_nc_ht=instagram.fcgk16-1.fna.fbcdn.net&_nc_cat=110&_nc_ohc=j5TbUuHXddUAX_5Op-o&edm=AOQ1c0wBAAAA&ccb=7-5&oh=00_AfCvK9u6gl03MTcSBTHErO01EQqmb0cMR9DQtFLet0bbnA&oe=64DB392E&_nc_sid=8b3546",
            likes = "25",
            contentDescription = "🌟 Enjoying a wonderful day at the beach with friends! Feeling the sun on my skin and the sound of waves 🏖️🌞 #BeachVibes #FriendsTime",
            moments = "2 hours ago"
        ),
        DataModel(
            name = "Bob",
            peopleImage = "https://scontent.cdninstagram.com/v/t51.2885-19/25009480_287649568425345_7333893143114285056_n.jpg?stp=dst-jpg_s150x150&_nc_ht=scontent.cdninstagram.com&_nc_cat=109&_nc_ohc=Z89kmT_yEX4AX_3mOMh&edm=APs17CUBAAAA&ccb=7-5&oh=00_AfBuaHe_bsjiKItNohfxm7rqtJV8j2twbv-cCW3OXx6fmg&oe=64DAA5BA&_nc_sid=10d13b",
            postImage = "https://scontent.cdninstagram.com/v/t51.2885-15/274096934_656193372093889_7146190388435401985_n.jpg?stp=dst-jpg_e35&_nc_ht=scontent.cdninstagram.com&_nc_cat=101&_nc_ohc=Llp1UlmrByYAX8cNXRV&edm=APs17CUBAAAA&ccb=7-5&ig_cache_key=Mjc3NjY3MzE5MjU1MzYzNzEwMw%3D%3D.2-ccb7-5&oh=00_AfAoBCNidJ3CN7dh__XCbMrhB-1YwfIS6EmixkATvJtKzw&oe=64DA005D&_nc_sid=10d13b",
            likes = "10",
            contentDescription = "🍔 Tried out a new burger joint today. The cheeseburger was so cheesy and juicy! 🍔🧀 Highly recommended for all foodies out there! #BurgerDelight #Foodie",
            moments = "1 day ago"
        ),
        DataModel(
            name = "Carol",
            peopleImage = "https://scontent.cdninstagram.com/v/t51.2885-19/14583451_324907121227473_492739757961379840_a.jpg?stp=dst-jpg_s150x150&_nc_ht=scontent.cdninstagram.com&_nc_cat=109&_nc_ohc=MAHblT_Rad8AX8uIoGZ&edm=APs17CUBAAAA&ccb=7-5&oh=00_AfB7GnBPaQVOUSUH1KecxjThUVv6_N_BQoj2qMYDpe0c4w&oe=64DBAA72&_nc_sid=10d13b",
            postImage = "https://scontent.cdninstagram.com/v/t51.2885-15/361797595_796842641846922_2846790747548522165_n.jpg?stp=dst-jpg_e35&_nc_ht=scontent.cdninstagram.com&_nc_cat=106&_nc_ohc=mfQQDuWWDsYAX-O-fSq&edm=APs17CUBAAAA&ccb=7-5&ig_cache_key=MzE1MTgzMDUyMTUzMjk1MjAxMQ%3D%3D.2-ccb7-5&oh=00_AfAASsy52aNUK07sJCGL2k84_LskmSwF2FXKbRS8u8Iwwg&oe=64DA898D&_nc_sid=10d13b",
            likes = "50",
            contentDescription = "🎨 Visited an art exhibition showcasing local talents. The paintings were so vibrant and full of life! A true feast for the eyes. 🖼️🎉 #ArtExpo #LocalTalent",
            moments = "3 hours ago"
        ),
        DataModel(
            name = "David",
            peopleImage = "https://scontent.cdninstagram.com/v/t51.2885-19/82567389_1021174808266508_9216768975608741888_n.jpg?stp=dst-jpg_s150x150&_nc_ht=scontent.cdninstagram.com&_nc_cat=108&_nc_ohc=ULgysL7JBH4AX9KhS5D&edm=APs17CUBAAAA&ccb=7-5&oh=00_AfA5pROe0xcgfv7lW8q9Dm4YJDZ3nw0PzHt5ZJzFpzoCKg&oe=64DAD640&_nc_sid=10d13b",
            postImage = "https://scontent.cdninstagram.com/v/t51.2885-15/187780532_322904202861992_529397833852860351_n.jpg?stp=dst-jpg_e35&_nc_ht=scontent.cdninstagram.com&_nc_cat=108&_nc_ohc=YjSXj1LD_u4AX_aRMcn&edm=APs17CUBAAAA&ccb=7-5&ig_cache_key=MjU3NjgxMjk5Njg1NTQ1MDEzNw%3D%3D.2-ccb7-5&oh=00_AfCUV7CbQ4BjId39CCS91GSsLNybEcX3LrqCLjzWEuCHeg&oe=64DAEAC5&_nc_sid=10d13b",
            likes = "8",
            contentDescription = "📚 Spent the afternoon diving into a captivating fantasy novel. The magical world and intricate characters have me hooked! 📖✨ #BookLover #Fantasy",
            moments = "6 hours ago"
        ),
        DataModel(
            name = "Eva",
            peopleImage = "https://scontent.cdninstagram.com/v/t51.2885-19/362662127_218905637343794_5825529137515600306_n.jpg?stp=dst-jpg_s150x150&_nc_ht=scontent.cdninstagram.com&_nc_cat=102&_nc_ohc=5fMD-9xw-7cAX9K1waz&edm=APs17CUBAAAA&ccb=7-5&oh=00_AfD5y5HKyE4DsHKih_DNDgep5SsIX37uvP9D8GnidUhrww&oe=64DB8519&_nc_sid=10d13b",
            postImage = "https://scontent.cdninstagram.com/v/t51.2885-15/366125297_1204883050366173_7193986314969830614_n.jpg?stp=dst-jpg_e35&_nc_ht=scontent.cdninstagram.com&_nc_cat=109&_nc_ohc=i_FvhIHLHN0AX9bC7s0&edm=APs17CUBAAAA&ccb=7-5&ig_cache_key=MzE2NjExNDEwMDAyNDExMDQ0NQ%3D%3D.2-ccb7-5&oh=00_AfDkyj-MIROHe8Z_jhZs5U8UgFJTf-vTYRGDqrbVzh_-5w&oe=64DA2B2C&_nc_sid=10d13b",
            likes = "30",
            contentDescription = "🎉 Celebrated my birthday with an amazing party last night! Grateful for all the love and good times. 🥳🎂 #BirthdayBash #Gratitude",
            moments = "1 day ago"
        ),
        DataModel(
            name = "Frank",
            peopleImage = "https://scontent.cdninstagram.com/v/t51.2885-19/90426620_494232524794919_3272821167529918464_n.jpg?stp=dst-jpg_s150x150&_nc_ht=scontent.cdninstagram.com&_nc_cat=111&_nc_ohc=BKZ_lgyE3l8AX8GZhne&edm=APs17CUBAAAA&ccb=7-5&oh=00_AfCitAZI1dXetm3k4QZThEHKXCr_S5sgX9UoOuLHkiAZyg&oe=64DAC4A1&_nc_sid=10d13b",
            postImage = "https://scontent.cdninstagram.com/v/t51.2885-15/363852656_1632979113877368_7831228762005320319_n.jpg?stp=dst-jpg_e35&_nc_ht=scontent.cdninstagram.com&_nc_cat=100&_nc_ohc=XGAQqHBrZ2wAX8h9_OP&edm=APs17CUBAAAA&ccb=7-5&ig_cache_key=MzE2NjQwMTYzNDU2ODUyODYzMA%3D%3D.2-ccb7-5&oh=00_AfBaFlsvWtnsbNiWoOqFD4i1y7ApVC6N1TFtauajgvnx0w&oe=64DA6E71&_nc_sid=10d13b",
            likes = "15",
            contentDescription = "🚴‍♂️ Went for a challenging mountain biking adventure today. The adrenaline rush and stunning views were totally worth it! 🏞️🚵‍♂️ #MountainBiking #Adventure",
            moments = "5 hours ago"
        ),
        DataModel(
            name = "Grace",
            peopleImage = "https://scontent.cdninstagram.com/v/t51.2885-19/317775363_1292206828017499_5877445952772613164_n.jpg?stp=dst-jpg_s150x150&_nc_ht=scontent.cdninstagram.com&_nc_cat=107&_nc_ohc=z7s5Oc34UfYAX9J4eIs&edm=APs17CUBAAAA&ccb=7-5&oh=00_AfDR2WnDS8euQj5EtU_VDFlNJVfl4P643yoVbZFHVFu5tw&oe=64DA81B3&_nc_sid=10d13b",
            postImage = "https://scontent.cdninstagram.com/v/t51.2885-15/365490133_1287522005215426_7632816090100608494_n.jpg?stp=dst-jpg_e35&_nc_ht=scontent.cdninstagram.com&_nc_cat=110&_nc_ohc=Ld3ONWgfgakAX8t4a7m&edm=APs17CUBAAAA&ccb=7-5&ig_cache_key=MzE2MzQ2OTg1MDU2NjI2NjIwNA%3D%3D.2-ccb7-5&oh=00_AfCPHQvs5PEwMY7xZIIdPDnYCgr2_ATox3CttFXwziIWgw&oe=64DAC899&_nc_sid=10d13b",
            likes = "12",
            contentDescription = "☕ Enjoying a cozy afternoon with a cup of hot cocoa and a good book. Perfect way to unwind on a rainy day! 📚🌧️ #RainyDay #CozyTime",
            moments = "4 hours ago"
        ),
        DataModel(
            name = "Henry",
            peopleImage = "https://scontent.cdninstagram.com/v/t51.2885-19/246278592_1294396997664384_5094226250704543076_n.jpg?stp=dst-jpg_s150x150&_nc_ht=scontent.cdninstagram.com&_nc_cat=1&_nc_ohc=-7ox6suY0cQAX_qDWK_&edm=APs17CUBAAAA&ccb=7-5&oh=00_AfBlUsleShYu8-L2ArEUtiNyl8s_V3ylPyTUbDGMj5PKjA&oe=64D9DA3B&_nc_sid=10d13b",
            postImage = "https://scontent.cdninstagram.com/v/t39.30808-6/364803627_18025149622610663_4855225294138474942_n.jpg?stp=dst-jpg_e15&_nc_ht=scontent.cdninstagram.com&_nc_cat=111&_nc_ohc=AULX4sEMd7IAX9Q8ibT&edm=APs17CUAAAAA&ccb=7-5&ig_cache_key=MzE2NjY1MDMyNzAxNTk2NzMyNg%3D%3D.2-ccb7-5&oh=00_AfBhvSZ0oIC1A3auDpWQ7X9nA2DsVHdosVC9dAAf34ZZGg&oe=64DB6C7C&_nc_sid=10d13b",
            likes = "40",
            contentDescription = "🎶 Attended an electrifying live concert last night. The music, lights, and energy of the crowd were absolutely incredible! 🎤🎸 #LiveMusic #Euphoria",
            moments = "1 day ago"
        ),
        DataModel(
            name = "Ivy",
            peopleImage = "https://scontent.cdninstagram.com/v/t51.2885-19/352415622_573735221610415_7333092392164216928_n.jpg?stp=dst-jpg_s150x150&_nc_ht=scontent.cdninstagram.com&_nc_cat=107&_nc_ohc=Lwp8K-bs-IgAX9ensn_&edm=APs17CUBAAAA&ccb=7-5&oh=00_AfBbOHnn1hsTjK9lH7tKTXwb9meBWbHby96qxm9eUKNFQA&oe=64DBCE89&_nc_sid=10d13b",
            postImage = "https://scontent.cdninstagram.com/v/t51.2885-15/366419884_306621491834943_6321740673982413001_n.jpg?stp=dst-jpg_e35&_nc_ht=scontent.cdninstagram.com&_nc_cat=103&_nc_ohc=rnpL01uGtn0AX9KZiby&edm=APs17CUBAAAA&ccb=7-5&ig_cache_key=MzE2NjQwNTcyOTUzNTA1NzI0NQ%3D%3D.2-ccb7-5&oh=00_AfBnO3cYIeWUkuMQ2AdkAZXGxcbEKik0l1iq7iaeXBWoaA&oe=64DAC588&_nc_sid=10d13b",
            likes = "18",
            contentDescription = "🌄 Watched a breathtaking sunrise from the mountaintop. Nature's beauty never fails to leave me speechless. 🌅🏞️ #SunriseMagic #NatureLover",
            moments = "7 hours ago"
        ),
        DataModel(
            name = "Jack",
            peopleImage = "https://instagram.fcgk16-1.fna.fbcdn.net/v/t51.2885-19/121192198_770816950162037_4995068312254486338_n.jpg?stp=dst-jpg_s150x150&_nc_ht=instagram.fcgk16-1.fna.fbcdn.net&_nc_cat=105&_nc_ohc=XzeT1gxb-5wAX8epxXs&edm=ACWDqb8BAAAA&ccb=7-5&oh=00_AfB59I4EnDA6AoAZw1qV-TtfCNAsj12_IKrWUU61dKBsjQ&oe=64DA0259&_nc_sid=ee9879",
            postImage = "https://scontent.cdninstagram.com/v/t51.2885-15/365925660_1053949405984707_3661010620340508961_n.jpg?stp=dst-jpg_e35&_nc_ht=scontent.cdninstagram.com&_nc_cat=103&_nc_ohc=YV-1-EyQY-cAX8l2EHH&edm=APs17CUBAAAA&ccb=7-5&ig_cache_key=MzE2NTU2MDUzOTcyMzY5NTMyMw%3D%3D.2-ccb7-5&oh=00_AfD_Lpip5bCrmxU9wPaQpPj7nd5Sn4ki_MpOlOnDD6e4LA&oe=64DAECAE&_nc_sid=10d13b",
            likes = "28",
            contentDescription = "🎮 Spent the evening playing my favorite video game. Achieved a new high score and had a blast battling virtual foes! 🕹️🎮 #GamingFun #HighScore",
            moments = "2 days ago"
        )
    )

}