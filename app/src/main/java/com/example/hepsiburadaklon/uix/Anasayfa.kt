package com.example.hepsiburadaklon.uix

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hepsiburadaklon.R
import com.example.hepsiburadaklon.ui.theme.HepsiburadaKlonTheme
import com.example.hepsiburadaklon.ui.theme.aramaBg
import com.example.hepsiburadaklon.ui.theme.aramaBorder
import com.example.hepsiburadaklon.ui.theme.aramaicon
import com.example.hepsiburadaklon.ui.theme.bg
import com.example.hepsiburadaklon.ui.theme.butonBg
import com.example.hepsiburadaklon.ui.theme.gri
import com.example.hepsiburadaklon.ui.theme.griYazi
import com.example.hepsiburadaklon.ui.theme.hepsipayBorder
import com.example.hepsiburadaklon.ui.theme.mor
import com.example.hepsiburadaklon.ui.theme.premium
import com.example.hepsiburadaklon.ui.theme.turuncu

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Anasayfa() {
    val bottomBarSecim = remember { mutableStateOf(-1) }
    val configuration = LocalConfiguration.current
    Log.w("conff","${configuration.screenHeightDp}-${configuration.screenWidthDp}")
    Scaffold(modifier = Modifier
        .fillMaxSize(),
        containerColor = bg,
        topBar = {
            TopAppBar(
                modifier = Modifier,
                title = {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(0.dp) // Reduced padding
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 4.dp), // Reduced padding
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            // Search Bar
                            Box(
                                modifier = Modifier
                                    .border(1.dp, aramaBorder, RoundedCornerShape(9.dp))
                                    .weight(1f)
                                    .height(40.dp) // Reduced height
                                    .width(310.dp)
                                    .background(aramaBg, shape = RoundedCornerShape(8.dp))
                                    .padding(horizontal = 8.dp)
                                    , // Reduced padding
                                contentAlignment = Alignment.CenterStart
                            ) {
                                Row(horizontalArrangement = Arrangement.Absolute.SpaceBetween, modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Icon(
                                            painter = painterResource(id = R.drawable.arama), // Replace with your search icon resource
                                            contentDescription = "Search",
                                            modifier = Modifier.size(16.dp), // Reduced size
                                            tint = Color.Gray
                                        )
                                        Text(
                                            text = "Ürün, kategori veya marka ara",
                                            fontSize = 12.sp, // Reduced font size
                                            color = Color.Gray,
                                            modifier = Modifier.padding(start = 4.dp) // Reduced padding
                                        )
                                }

                                    Icon(
                                        painter = painterResource(id = R.drawable.kamera), // Replace with your camera icon resource
                                        contentDescription = "Camera",
                                        modifier = Modifier
                                            .size(24.dp) // Reduced size
                                            .padding(end = 2.dp), // Reduced padding
                                        tint = aramaicon
                                    )
                                }
                            }

                            // Camera Icon


                            // Location Info
                            Column(
                                modifier = Modifier
                                    .padding(start = 8.dp) // Reduced padding
                                    .background(Color.White, shape = RoundedCornerShape(8.dp))
                                    .padding(end = 16.dp) // Reduced padding
                            ) {
                                Box(modifier = Modifier
                                    .border(1.dp, aramaBorder, RoundedCornerShape(8.dp))
                                    .width(69.dp)
                                    .height(40.dp)
                                    .background(bg, shape = RoundedCornerShape(8.dp))
                                    .padding(horizontal = 8.dp)
                                    , // Reduced padding
                                    ){
                                    Row(verticalAlignment = Alignment.CenterVertically,horizontalArrangement = Arrangement.Center, modifier = Modifier.align(Alignment.TopStart)) {
                                        Icon(
                                            painter = painterResource(id = R.drawable.konum), // Replace with your location icon resource
                                            contentDescription = "Location",
                                            modifier = Modifier.size(9.dp), // Reduced size
                                            tint = turuncu // Replace with the desired color
                                        )
                                        Text(
                                            text = "ev",
                                            fontSize = 9.sp, // Reduced font size
                                            color = turuncu,
                                            modifier = Modifier.padding(start = 2.dp) // Reduced padding
                                        )
                                    }


                                    Text(
                                        text = "Seyrante...",
                                        fontSize = 11.sp, // Reduced font size
                                        color = Color.Gray,
                                        modifier = Modifier.align(alignment = Alignment.BottomStart)// Ensure this text is also centered within the Box
                                    )


                                }
                            }
                        }


                    }
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = bg
                )
            )
        }
,
        bottomBar = {
            BottomAppBar(containerColor = bg, modifier = Modifier.height(75.dp),

                content = {


                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .background(bg),
                        horizontalArrangement = Arrangement.SpaceEvenly) {
                        Column(verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .clip(RoundedCornerShape(20))
                                .size(width = 80.dp, height = 45.dp)
                                .background(color = (if (bottomBarSecim.value == 0) butonBg else Color.Transparent))
                                .clickable { bottomBarSecim.value = 0 }) {
                            Icon(painter = painterResource(id = R.drawable.anasayfa), contentDescription = "", tint = (if (bottomBarSecim.value ==0) turuncu else gri) , modifier = Modifier.size(26.dp))
                            Text(text = "Ana Sayfam", color = (if (bottomBarSecim.value ==0) turuncu else gri), fontSize = 12.sp)
                        }
                        Column(verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .clip(RoundedCornerShape(20))
                                .size(width = 80.dp, height = 45.dp)
                                .background(color = (if (bottomBarSecim.value == 1) butonBg else Color.Transparent))
                                .clickable { bottomBarSecim.value = 1 }) {
                            Icon(painter = painterResource(id = R.drawable.listelerim), contentDescription = "", tint = (if (bottomBarSecim.value ==1) turuncu else gri) , modifier = Modifier.size(26.dp))
                            Text(text = "Listelerim", color = (if (bottomBarSecim.value ==1) turuncu else gri), fontSize = 12.sp)
                        }
                        Column(verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .clip(RoundedCornerShape(20))
                                .size(width = 80.dp, height = 45.dp)
                                .background(color = (if (bottomBarSecim.value == 2) butonBg else Color.Transparent))
                                .clickable { bottomBarSecim.value = 2 }) {
                            Icon(painter = painterResource(id = R.drawable.sepet), contentDescription = "", tint = (if (bottomBarSecim.value ==2) turuncu else gri) , modifier = Modifier.size(26.dp))
                            Text(text = "Sepetim", color = (if (bottomBarSecim.value ==2) turuncu else gri), fontSize = 12.sp)
                        }
                        Column(verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .clip(RoundedCornerShape(20))
                                .size(width = 80.dp, height = 45.dp)
                                .background(color = (if (bottomBarSecim.value == 3) butonBg else Color.Transparent))
                                .clickable { bottomBarSecim.value = 3 }) {
                            Icon(painter = painterResource(id = R.drawable.profilim), contentDescription = "", tint = (if (bottomBarSecim.value ==3) turuncu else gri) , modifier = Modifier.size(26.dp))
                            Text(text = "Hesabım", color = (if (bottomBarSecim.value ==3) turuncu else gri), fontSize = 12.sp)
                        }
                        Column(verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .clip(RoundedCornerShape(20))
                                .size(width = 80.dp, height = 45.dp)
                                .background(color = (if (bottomBarSecim.value == 4) butonBg else Color.Transparent))
                                ) {
                            Image(painter = painterResource(id = R.drawable.hizmetler), contentDescription = "", modifier = Modifier.size(26.dp))
                            Text(text = "Hizmetler",  fontSize = 12.sp,color = (if (bottomBarSecim.value ==4) turuncu else gri))
                        }

                    }


                }
            )
        }


    ) { paddingValues ->

        Column(modifier = Modifier.padding(paddingValues)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Premium Button
                Box(

                    modifier = Modifier
                        .height(42.dp)
                        .width(153.dp)
                        .background(Color(0xFFFFE0E0), shape = RoundedCornerShape(8.dp))
                        .padding(start = 10.dp)
                        .padding(end = 2.dp, top = 0.dp, bottom = 0.dp)

                ) {
                    Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                        Box(modifier = Modifier.fillMaxHeight(),) {
                            Row(modifier = Modifier
                                .height(23.dp)
                                .padding(top = 6.dp, bottom = 0.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
                                Icon(painter = painterResource(id = R.drawable.premium), contentDescription = "", modifier = Modifier
                                    .size(65.dp)
                                    , tint = premium)
                            }
                            Row(modifier = Modifier
                                .height(24.dp)
                                .padding(top = 0.dp, bottom = 7.dp)
                                .align(Alignment.BottomStart),){
                                Text(text = "Avantajları gör", color = Color.Gray, fontSize = 9.sp , modifier = Modifier.padding(top = 0.dp))// Reduced font size)

                            }

                        }
                        Icon(painter = painterResource(id = R.drawable.ok), contentDescription ="", tint = premium , modifier = Modifier
                            .size(16.dp)
                            .padding(end = 10.dp))


                    }






                }
                Spacer(modifier = Modifier.height(16.dp)) // Dikey boşluk ekler

                // HepsiPay Button
                Box(
                    modifier = Modifier
                        .border(1.dp, hepsipayBorder, RoundedCornerShape(9.dp))
                        .width(215.dp)
                        .height(42.dp)
                        .padding(start = 2.dp) // Reduced padding
                        .background(bg, shape = RoundedCornerShape(8.dp))
                        .padding(8.dp) // Reduced padding
                ) {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                        Box(modifier = Modifier.fillMaxHeight()) {
                            Row(verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .height(12.dp)
                                    .align(Alignment.TopStart)) {
                               Image(painter = painterResource(id = R.drawable.hepsipay), contentDescription = "")
                                Text(text = "0,00 TL", fontSize = 11.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 4.dp, top = 0.dp), color = mor)


                            }
                            Row(modifier = Modifier
                                .height(19.dp)
                                .align(Alignment.BottomStart)) {
                                Text(text = "Her yerde %3 kazan",fontSize = 10.sp, color = griYazi)

                            }
                        }
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                            Icon(painter = painterResource(id = R.drawable.ok), contentDescription = "", tint = mor)
                            Icon(painter = painterResource(id = R.drawable.spacer), contentDescription = "", tint = hepsipayBorder)
                            Icon(painter = painterResource(id = R.drawable.karekod), contentDescription = "", tint = mor, modifier = Modifier.size(20.dp))


                        }
                    }
                }
            }

        }

    }


}
@Preview(showBackground = true, locale = "tr")
@Composable
fun AnasayfaPreview() {
    HepsiburadaKlonTheme {
        Anasayfa()
    }
}

