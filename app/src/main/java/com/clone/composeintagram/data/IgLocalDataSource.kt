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
            image = "https://instagram.fcgk16-1.fna.fbcdn.net/v/t51.2885-19/352224138_1028122805231303_1175896139426286760_n.jpg?stp=dst-jpg_s150x150&_nc_ht=instagram.fcgk16-1.fna.fbcdn.net&_nc_cat=1&_nc_ohc=XjOcY8EMjbEAX96wJgq&edm=AAAAAAABAAAA&ccb=7-5&oh=00_AfCBz4fdzOHblc2Rakg8X0mt07RNOHobNZOCbkj3pyj52w&oe=64D5992A"
        ),
        DataModel(
            name = "FifaWorldCup",
            image = "https://instagram.fcgk16-1.fna.fbcdn.net/v/t51.2885-19/353075677_1476803672724898_7186900499832148947_n.jpg?stp=dst-jpg_s150x150&_nc_ht=instagram.fcgk16-1.fna.fbcdn.net&_nc_cat=1&_nc_ohc=FrcAY9NH72QAX8_dXhT&edm=AJ9x6zYBAAAA&ccb=7-5&oh=00_AfDYB77rA2EVMd4xuMeKyRuSke8EPpjjN6w37U2cvPRnAw&oe=64D63111&_nc_sid=65462d"
        ),
        DataModel(
            image = "https://instagram.fcgk16-1.fna.fbcdn.net/v/t51.2885-19/11260543_895634410510536_921521816_a.jpg?_nc_ht=instagram.fcgk16-1.fna.fbcdn.net&_nc_cat=100&_nc_ohc=czgI9xz8NN4AX9sUv_L&edm=AHG7ALcBAAAA&ccb=7-5&oh=00_AfApzI8Zg7HJjSTWkjtUTtTgTGB5LaeIlW14XkUCSn4EFA&oe=64D4FD1C&_nc_sid=c9086e",
            name = "EmilyJohnson"
        ),
        DataModel(
            name = "MichaelSmith",
            image = "https://instagram.fcgk16-1.fna.fbcdn.net/v/t51.2885-19/278931269_360124899498969_9006978846103417088_n.jpg?stp=dst-jpg_s320x320&_nc_ht=instagram.fcgk16-1.fna.fbcdn.net&_nc_cat=1&_nc_ohc=L4iA4am9JQ0AX9C6MC9&edm=AOQ1c0wBAAAA&ccb=7-5&oh=00_AfBbA22GkOWRjJLoHGbgOpqu15LqqqRZaAcNQUF8r4ILNw&oe=64D62DCE&_nc_sid=8b3546"
        ),
        DataModel(
            name = "OliviaWilliams",
            image = "https://instagram.fcgk16-1.fna.fbcdn.net/v/t51.2885-19/26871971_450285575390281_6200924299923030016_n.jpg?stp=dst-jpg_s150x150&_nc_ht=instagram.fcgk16-1.fna.fbcdn.net&_nc_cat=101&_nc_ohc=Ri8PJnqIl1AAX8aec6x&edm=AHG7ALcBAAAA&ccb=7-5&oh=00_AfBdYIo-9LHeePwKj8k_O5bVNolSomWK8CsGLCZtBfcaaA&oe=64D65531&_nc_sid=c9086e"
        ),
        DataModel(
            name = "JamesBrown",
            image = "https://instagram.fcgk16-1.fna.fbcdn.net/v/t51.2885-19/360062397_280451334638888_3992436507607291684_n.jpg?stp=dst-jpg_s150x150&_nc_ht=instagram.fcgk16-1.fna.fbcdn.net&_nc_cat=108&_nc_ohc=lvB1uGIV-tIAX_tVjCm&edm=AHG7ALcBAAAA&ccb=7-5&oh=00_AfCUBc1Sk4Mxm4D2NoEvDKd7N2yYQHDVKBsKMKcr10UBmw&oe=64D536A4&_nc_sid=c9086e"
        ),
        DataModel(
            name = "AvaMiller",
            image = "https://instagram.fcgk16-1.fna.fbcdn.net/v/t51.2885-19/140570243_693797584646033_2762531085115909555_n.jpg?stp=dst-jpg_s150x150&_nc_ht=instagram.fcgk16-1.fna.fbcdn.net&_nc_cat=1&_nc_ohc=19Gt_B_BLI8AX_7LJ6P&edm=AHG7ALcBAAAA&ccb=7-5&oh=00_AfBP5dqR5JKQcgIglYtH4XD2J9xstbED_q-dRuwMsGyXkA&oe=64D56998&_nc_sid=c9086e"
        ),
        DataModel(
            name = "EthanDavis",
            image = "https://instagram.fcgk16-1.fna.fbcdn.net/v/t51.2885-19/321843764_848212199792345_5141250513909516278_n.jpg?stp=dst-jpg_s150x150&_nc_ht=instagram.fcgk16-1.fna.fbcdn.net&_nc_cat=105&_nc_ohc=r6HHf64-cxwAX_OHvgs&edm=AHG7ALcBAAAA&ccb=7-5&oh=00_AfCIkMg0IoZuP2zMuK0tKPu9ys0A-QA3Xvc7LDNaCuSQvw&oe=64D67636&_nc_sid=c9086e"
        ),
        DataModel(
            name = "SophiaWilson",
            image = "https://instagram.fcgk16-1.fna.fbcdn.net/v/t51.2885-19/358015397_227125003575860_1981401302830446990_n.jpg?stp=dst-jpg_s150x150&_nc_ht=instagram.fcgk16-1.fna.fbcdn.net&_nc_cat=108&_nc_ohc=v7f0amJjPUQAX9VhtF3&edm=AHG7ALcBAAAA&ccb=7-5&oh=00_AfBF92QNUdSG3uiTlOvLZr1lZVx8ox9tebyeOZW-a2-fqg&oe=64D603EA&_nc_sid=c9086e"
        ),
        DataModel(
            name = "WilliamAnderson",
            image = "https://instagram.fcgk16-1.fna.fbcdn.net/v/t51.2885-19/361578320_271867905489791_5343004461074629979_n.jpg?stp=dst-jpg_s150x150&_nc_ht=instagram.fcgk16-1.fna.fbcdn.net&_nc_cat=1&_nc_ohc=Rb8K799QtoQAX9LxAJz&edm=AHG7ALcBAAAA&ccb=7-5&oh=00_AfBz2r98DVdc2kWEXo7x-GvTQUr86fgJ6BmDv9TzGJTsHg&oe=64D53036&_nc_sid=c9086e"
        ),
    )
}