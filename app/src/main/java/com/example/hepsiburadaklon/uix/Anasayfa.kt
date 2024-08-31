package com.example.hepsiburadaklon.uix

import android.app.Activity
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hepsiburadaklon.R
import com.example.hepsiburadaklon.data.entity.Gorseller
import com.example.hepsiburadaklon.ui.theme.HepsiburadaKlonTheme
import com.example.hepsiburadaklon.ui.theme.acikMavi
import com.example.hepsiburadaklon.ui.theme.aramaBg
import com.example.hepsiburadaklon.ui.theme.aramaBorder
import com.example.hepsiburadaklon.ui.theme.aramaicon
import com.example.hepsiburadaklon.ui.theme.bg
import com.example.hepsiburadaklon.ui.theme.butonBg
import com.example.hepsiburadaklon.ui.theme.gri
import com.example.hepsiburadaklon.ui.theme.griYazi
import com.example.hepsiburadaklon.ui.theme.hepsipayBorder
import com.example.hepsiburadaklon.ui.theme.koyuGri
import com.example.hepsiburadaklon.ui.theme.mavi
import com.example.hepsiburadaklon.ui.theme.mor
import com.example.hepsiburadaklon.ui.theme.premium
import com.example.hepsiburadaklon.ui.theme.suYesili
import com.example.hepsiburadaklon.ui.theme.turuncu
import com.example.hepsiburadaklon.ui.theme.yesil
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager

@OptIn(ExperimentalMaterial3Api::class, ExperimentalPagerApi::class)
@Composable
fun Anasayfa() {
    val activity = (LocalContext.current as Activity)


    val bottomBarSecim = remember { mutableStateOf(0) }
    val configuration = LocalConfiguration.current
    val gorseller = remember {
        mutableListOf<Gorseller>()
    }
    val kaydirilabilir = remember {
        mutableListOf<Gorseller>()
    }
    val kaydirilabilir2 = remember {
        mutableListOf<Gorseller>()
    }
    LaunchedEffect(key1 = true) {
        val f1 = Gorseller(1, "Avantajlı Fiyat", "avantajlifiyat")
        val f2 = Gorseller(2, "Düşük Faiz", "dusukfaiz")
        val f3 = Gorseller(3, "Okul Alışverişi", "erteleme")
        val f4 = Gorseller(4, "Alışverişe Başla", "kart")
        val f5 = Gorseller(5, "Ev ve Yaşam", "sehredonus")
        val f6 = Gorseller(6, "Sevilen Ürünler", "topliste")
        val f7 = Gorseller(7, "Alışverişe Başla", "turboindirimler")
        val f8 = Gorseller(8, "Televizyon", "tv")
        val k1 = Gorseller(9, "Samsung Kampanya", "kaydirmali")
        val k2 = Gorseller(9, "oral", "oralb")
        val k2_1 = Gorseller(10, "kampanya", "k2")
        gorseller.add(f1)
        gorseller.add(f2)
        gorseller.add(f3)
        gorseller.add(f4)
        gorseller.add(f5)
        gorseller.add(f6)
        gorseller.add(f7)
        gorseller.add(f8)
        kaydirilabilir.add(k1)
        kaydirilabilir.add(k2)
        kaydirilabilir2.add(k2_1)
    }


    Log.w("conff", "${configuration.screenHeightDp}-${configuration.screenWidthDp}")
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
                                    .border(1.dp , aramaBorder , RoundedCornerShape(9.dp))
                                    .weight(1f)
                                    .height(40.dp) // Reduced height
                                    .width(310.dp)
                                    .background(aramaBg , shape = RoundedCornerShape(8.dp))
                                    .padding(horizontal = 8.dp), // Reduced padding
                                contentAlignment = Alignment.CenterStart
                            ) {
                                Row(
                                    horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                                    modifier = Modifier.fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Icon(
                                            painter = painterResource(id = R.drawable.arama), // Replace with your search icon resource
                                            contentDescription = "Search",
                                            modifier = Modifier.size(16.dp), // Reduced size
                                            tint = koyuGri
                                        )
                                        Text(
                                            text = "Ürün, kategori veya marka ara",
                                            fontSize = 12.sp, // Reduced font size
                                            color = griYazi,
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
                                    .background(Color.White , shape = RoundedCornerShape(8.dp))
                                    .padding(end = 16.dp) // Reduced padding
                            ) {
                                Box(
                                    modifier = Modifier
                                        .border(1.dp , aramaBorder , RoundedCornerShape(8.dp))
                                        .width(69.dp)
                                        .height(40.dp)
                                        .background(bg , shape = RoundedCornerShape(8.dp))
                                        .padding(horizontal = 8.dp), // Reduced padding
                                ) {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.Center,
                                        modifier = Modifier.align(Alignment.TopStart)
                                    ) {
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
        },
        bottomBar = {
            BottomAppBar(containerColor = bg, modifier = Modifier.height(75.dp),

                content = {


                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(bg)
                            .drawBehind {
                                val strokeWidth = 1.dp.toPx() // Border kalınlığı
                                val y = strokeWidth - 8  // Border'ın ortasına hizalama
                                drawLine(
                                    color = Color.LightGray , // Border rengi
                                    start = Offset(0f - 10 , y) , // Başlangıç noktası (sol üst)
                                    end = Offset(size.width + 10 , y) , // Bitiş noktası (sağ üst)
                                    strokeWidth = strokeWidth // Border kalınlığı
                                )


                            },


                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .clip(RoundedCornerShape(20))
                                .size(width = 80.dp , height = 45.dp)
                                .background(color = (if (bottomBarSecim.value == 0) butonBg else Color.Transparent))
                                .clickable { bottomBarSecim.value = 0 }) {
                            Icon(
                                painter = painterResource(id = R.drawable.anasayfa),
                                contentDescription = "",
                                tint = (if (bottomBarSecim.value == 0) turuncu else gri),
                                modifier = Modifier.size(26.dp)
                            )
                            Text(
                                text = "Ana Sayfam",
                                color = (if (bottomBarSecim.value == 0) turuncu else gri),
                                fontSize = 12.sp
                            )
                        }
                        Column(verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .clip(RoundedCornerShape(20))
                                .size(width = 80.dp , height = 45.dp)
                                .background(color = (if (bottomBarSecim.value == 1) butonBg else Color.Transparent))
                                .clickable { bottomBarSecim.value = 1 }) {
                            Icon(
                                painter = painterResource(id = R.drawable.listelerim),
                                contentDescription = "",
                                tint = (if (bottomBarSecim.value == 1) turuncu else gri),
                                modifier = Modifier.size(26.dp)
                            )
                            Text(
                                text = "Listelerim",
                                color = (if (bottomBarSecim.value == 1) turuncu else gri),
                                fontSize = 12.sp
                            )
                        }
                        Column(verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .clip(RoundedCornerShape(20))
                                .size(width = 80.dp , height = 45.dp)
                                .background(color = (if (bottomBarSecim.value == 2) butonBg else Color.Transparent))
                                .clickable { bottomBarSecim.value = 2 }) {
                            Icon(
                                painter = painterResource(id = R.drawable.sepet),
                                contentDescription = "",
                                tint = (if (bottomBarSecim.value == 2) turuncu else gri),
                                modifier = Modifier.size(26.dp)
                            )
                            Text(
                                text = "Sepetim",
                                color = (if (bottomBarSecim.value == 2) turuncu else gri),
                                fontSize = 12.sp
                            )
                        }
                        Column(verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .clip(RoundedCornerShape(20))
                                .size(width = 80.dp , height = 45.dp)
                                .background(color = (if (bottomBarSecim.value == 3) butonBg else Color.Transparent))
                                .clickable { bottomBarSecim.value = 3 }) {
                            Icon(
                                painter = painterResource(id = R.drawable.profilim),
                                contentDescription = "",
                                tint = (if (bottomBarSecim.value == 3) turuncu else gri),
                                modifier = Modifier.size(26.dp)
                            )
                            Text(
                                text = "Hesabım",
                                color = (if (bottomBarSecim.value == 3) turuncu else gri),
                                fontSize = 12.sp
                            )
                        }
                        Column(
                            verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .clip(RoundedCornerShape(20))
                                .size(width = 80.dp , height = 45.dp)
                                .background(color = (if (bottomBarSecim.value == 4) butonBg else Color.Transparent))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.hizmetler),
                                contentDescription = "",
                                modifier = Modifier.size(26.dp)
                            )
                            Text(
                                text = "Hizmetler",
                                fontSize = 12.sp,
                                color = (if (bottomBarSecim.value == 4) turuncu else gri)
                            )
                        }

                    }


                }
            )
        }


    ) { paddingValues ->

        LazyColumn(modifier = Modifier.padding(paddingValues)) {
            item{
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp , end = 16.dp)
                    ,


                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Premium Button
                    Box(

                        modifier = Modifier
                            .height(42.dp)
                            .width(153.dp)
                            .background(Color(0xFFFFE0E0) , shape = RoundedCornerShape(8.dp))
                            .padding(start = 10.dp)
                            .padding(end = 2.dp , top = 0.dp , bottom = 0.dp)

                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(modifier = Modifier.fillMaxHeight()) {
                                Row(
                                    modifier = Modifier
                                        .height(23.dp)
                                        .padding(top = 6.dp , bottom = 0.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.premium),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .size(65.dp),
                                        tint = premium
                                    )
                                }
                                Row(
                                    modifier = Modifier
                                        .height(24.dp)
                                        .padding(top = 0.dp , bottom = 7.dp)
                                        .align(Alignment.BottomStart),
                                ) {
                                    Text(
                                        text = "Avantajları gör",
                                        color = griYazi,
                                        fontSize = 9.sp,
                                        modifier = Modifier.padding(top = 0.dp)
                                    )// Reduced font size)

                                }

                            }
                            Icon(
                                painter = painterResource(id = R.drawable.ok),
                                contentDescription = "",
                                tint = premium,
                                modifier = Modifier
                                    .size(16.dp)
                                    .padding(end = 10.dp)
                            )


                        }


                    }

                    Spacer(modifier = Modifier.width(10.dp))
                    // HepsiPay Button

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .border(1.dp , hepsipayBorder , RoundedCornerShape(9.dp))
                            .width(20.dp)
                            .height(42.dp)
                            .padding(
                                start = 10.dp ,
                                bottom = 0.dp ,
                                end = 10.dp ,
                                top = 0.dp
                            )
                            .background(bg , shape = RoundedCornerShape(8.dp)),


                        ) {
                        Column(verticalArrangement = Arrangement.spacedBy(4.dp),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier.fillMaxHeight()) {

                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.padding(top = 7.dp, bottom = 2.dp)

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.hepsipay),
                                    contentDescription = "",
                                    modifier = Modifier.size(70.dp, 11.dp).padding()
                                )
                                Text(
                                    text = "0,00 TL",
                                    fontSize = 10.sp,
                                    lineHeight = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(start = 4.dp),
                                    color = mor
                                )


                            }


                            Text(
                                text = "Her yerde %3 kazan",
                                fontSize = 9.sp,
                                color = griYazi,
                                lineHeight = 9.sp,
                                modifier = Modifier.padding(bottom = 4.dp)
                                )
                        }




                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(0.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ok),
                                contentDescription = "",
                                tint = mor
                            )
                            Icon(
                                painter = painterResource(id = R.drawable.spacer),
                                contentDescription = "",
                                tint = hepsipayBorder,
                                modifier = Modifier.size(30.dp)
                            )
                            Icon(
                                painter = painterResource(id = R.drawable.karekod),
                                contentDescription = "",
                                tint = mor,
                                modifier = Modifier.size(22.dp)
                            )


                        }
                    }
                }
            }
            item{
                HorizontalPager(
                    count = kaydirilabilir.size,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    val g = kaydirilabilir[it]
                    Image(
                        painter = painterResource(id = activity.resources.getIdentifier(g.resim,"drawable",activity.packageName)),
                        contentDescription = "",
                        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp)
                    )

                }
            }
            item{
                LazyVerticalGrid(
                    columns = GridCells.Fixed(4),

                    modifier = Modifier
                        .padding(start = 17.dp , end = 8.dp , top = 6.dp)
                        .height((100 * gorseller.count() * 0.25).dp),
                ) {
                    items(
                        count = gorseller.count(),
                        itemContent = {
                            val g = gorseller[it]
                            Column(
                                modifier = Modifier.padding(top = 4.dp, end = 8.dp, bottom = 0.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painter = painterResource(id = activity.resources.getIdentifier(g.resim,"drawable",activity.packageName)),

                                    contentDescription = ""
                                )
                                Text(
                                    text = g.aciklama,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = koyuGri,
                                    lineHeight = 10.sp
                                )
                            }

                        }
                    )


                }
            }
            item{
                HorizontalPager(
                    count = kaydirilabilir2.size,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    val g1 = kaydirilabilir2[it]
                    Image(
                        painter = painterResource(id = activity.resources.getIdentifier(g1.resim,"drawable",activity.packageName)),

                        contentDescription = "",
                        modifier = Modifier
                            .padding(start = 16.dp , end = 16.dp , top = 0.dp)
                            .height(165.dp)
                    )

                }
            }
            item{
                Row() {

                    Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(
                            start = 18.dp ,
                            bottom = 0.dp ,
                            end = 18.dp ,
                            top = 10.dp
                        )

                        .border(1.dp , hepsipayBorder , RoundedCornerShape(9.dp))
                        .width(180.dp)
                        .height(42.dp)
                        .background(bg , shape = RoundedCornerShape(8.dp)),


                    ) {

                        Box(modifier = Modifier.padding(start = 6.dp, bottom = 5.dp) ){
                            Icon(painter = painterResource(id =R.drawable.baseline_circle_24) , contentDescription ="" , tint = suYesili, modifier = Modifier.align(Alignment.Center))
                            Icon(painter = painterResource(id =R.drawable.yildiz) , contentDescription ="" , tint = yesil, modifier = Modifier
                                .size(15.dp)
                                .align(Alignment.Center))

                        }
                        Column(verticalArrangement = Arrangement.spacedBy(0.dp),
                            horizontalAlignment = Alignment.Start, modifier = Modifier.padding(start = 7.dp, top = 4.dp)) {
                            Text(text = "Sana Özel Fırsatlar", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 12.sp,  lineHeight = 8.sp,modifier = Modifier.padding(bottom = 0.dp))
                            Text(text = "20+ kupon fırsatı var", color = Color.Gray, fontSize = 8.sp, modifier = Modifier
                                .padding(bottom = 0.dp)
                                .height(15.dp), lineHeight = 8.sp)
                        }

                    
                }
                    Spacer(modifier = Modifier.width(0.dp) )

                    Row(

                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(
                                start = 0.dp ,
                                bottom = 0.dp ,
                                end = 16.dp ,
                                top = 10.dp
                            )

                            .border(1.dp , hepsipayBorder , RoundedCornerShape(9.dp))
                            .width(180.dp)
                            .height(42.dp)
                            .background(bg , shape = RoundedCornerShape(8.dp)),



                        ) {

                        Box(modifier = Modifier.padding(start = 6.dp, bottom = 5.dp) ){
                            Icon(painter = painterResource(id =R.drawable.baseline_circle_24) , contentDescription ="" , tint = acikMavi, modifier = Modifier.align(Alignment.Center))
                            Icon(painter = painterResource(id =R.drawable.kategori) , contentDescription ="" , tint = mavi, modifier = Modifier
                                .size(15.dp)
                                .align(Alignment.Center))

                        }
                        Column(verticalArrangement = Arrangement.spacedBy(0.dp),
                            horizontalAlignment = Alignment.Start, modifier = Modifier.padding(start = 7.dp, top = 0.dp)) {
                            Text(text = "Tüm Kategoriler", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 12.sp,  lineHeight = 8.sp,modifier = Modifier.padding(bottom = 0.dp))
                            Text(text = "Keşfetmeye Başla", color = Color.Gray, fontSize = 8.sp, modifier = Modifier.padding(bottom = 0.dp), lineHeight = 8.sp)
                        }
                    }

                }


            }


        }


    }

}


