package com.example.nftapp.ui.theme

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.nftapp.ui.theme.NftAppTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nftapp.R
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import com.example.nftapp.navigation.Screens

@Composable
fun SecondScreen(navController: NavController) {
    Scaffold(
        bottomBar = { BottomAppBar(backgroundColor = Color(0xff4B4187).copy(0.9f),

                                   modifier = Modifier
                                       .height(height = 72.dp)
                                       .graphicsLayer {
                                           shape =
                                               RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
                                           clip = true
                                       }
                                   ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
               IconButton(onClick = {

               }) {
                   Icon(imageVector = Icons.Filled.Home,
                        contentDescription =null,
                        modifier = Modifier.size(size = 36.dp),
                        tint = Color.White )
               }
                IconButton(onClick = {
                    navController.navigate(Screens.SecondScreen.route)
                }) {
                    Icon(imageVector = Icons.Filled.BarChart,
                         contentDescription =null,
                         modifier = Modifier.size(size = 36.dp),
                         tint = Color.White )
                }
                IconButton(onClick = {
                    navController.navigate(Screens.SecondScreen.route)
                }) {
                    Icon(imageVector = Icons.Filled.AddCircle,
                         contentDescription =null,
                         modifier = Modifier.size(size = 40.dp),
                         tint = Color.White )
                }
                IconButton(onClick = {
                    navController.navigate(Screens.SecondScreen.route)
                }) {
                    Icon(imageVector = Icons.Filled.Search,
                         contentDescription =null,
                         modifier = Modifier.size(size = 36.dp),
                         tint = Color.White )
                }
                IconButton(onClick = {
                    navController.navigate(Screens.SecondScreen.route)
                }) {
                    Icon(imageVector = Icons.Filled.Person,
                         contentDescription =null,
                         modifier = Modifier.size(size = 36.dp),
                         tint = Color.White )
                }
            }
        } }
    ) {


        val image = painterResource(id = R.drawable.stats)
        Image(
            painter = image, contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState()),

            ) {
            Text(text = "NFT Market Place",
                 modifier = Modifier
                     .fillMaxWidth()
                     .align(alignment = Alignment.CenterHorizontally)
                     .padding(horizontal = 20.dp, vertical = 30.dp),
                 color = Color.White,
                 fontWeight = FontWeight.SemiBold,
                 fontSize = 30.sp)

            Spacer(modifier = Modifier.height(height = 10.dp))

            Row(
                modifier = Modifier.horizontalScroll(rememberScrollState())
            ) {

                Spacer(modifier = Modifier.width(width = 5.dp))
                NftCategory(image = R.drawable.art )

                Spacer(modifier = Modifier.width(width = 5.dp))
                NftCategory(image = R.drawable.m )

                Spacer(modifier = Modifier.width(width = 5.dp))
                NftCategory(image = R.drawable.vr )
            }
            Text(text = "Trending Collections",
                 modifier = Modifier.padding(horizontal = 20.dp, vertical = 30.dp),
                 fontSize = 20.sp,
                 color = Color.White,
            )
            Row(
                modifier = Modifier.horizontalScroll(rememberScrollState())
            ) {

                Spacer(modifier = Modifier.width(width = 5.dp))
                NftCards(image = R.drawable.nft4, name = "3D Art", likes = 200)

                Spacer(modifier = Modifier.width(width = 5.dp))
                NftCards(image = R.drawable.nft2, name = "Portrait Art", likes = 140)

                Spacer(modifier = Modifier.width(width = 5.dp))
                NftCards(image = R.drawable.nft3, name = "3D Art", likes = 200)
            }
            Text(text = "Top Sellers",
                 modifier = Modifier.padding(horizontal = 20.dp, vertical = 30.dp),
                 fontSize = 20.sp,
                 color = Color.White,
            )
            Row(
                modifier = Modifier.horizontalScroll(rememberScrollState())
            ) {

                Spacer(modifier = Modifier.width(width = 5.dp))
                NftCards(image = R.drawable.nft1, name = "Abstract#1", likes = 700)

                Spacer(modifier = Modifier.width(width = 5.dp))
                NftCards(image = R.drawable.nft5, name = "Alien", likes = 470)

                Spacer(modifier = Modifier.width(width = 5.dp))
                NftCards(image = R.drawable.nft6, name = "Planet", likes = 682)
            }
            Text(text = "Best of All Times",
                 modifier = Modifier.padding(horizontal = 20.dp, vertical = 30.dp),
                 fontSize = 20.sp,
                 color = Color.White,
            )
            Row(
                modifier = Modifier.horizontalScroll(rememberScrollState())
            ) {

                Spacer(modifier = Modifier.width(width = 5.dp))
                NftCards(image = R.drawable.nft7, name = "Gradient", likes = 1000)

                Spacer(modifier = Modifier.width(width = 5.dp))
                NftCards(image = R.drawable.nft8, name = "Montains", likes = 1420)

                Spacer(modifier = Modifier.width(width = 5.dp))
                NftCards(image = R.drawable.nft2, name = "Portrait Art", likes = 200)
            }

        }
    }

    }



@Composable
fun NftCategory(image : Int){
    Card(
        modifier = Modifier
            .height(height = 180.dp)
            .width(width = 260.dp)
            .padding(all = 8.dp),
        shape = RoundedCornerShape(size = 30.dp),
        elevation = 10.dp,

        ) {
        Image(painter = painterResource(id = image), contentDescription = null, modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
    }
}

@Composable
fun NftCards(image : Int, name: String, likes: Int){

        Card(
            modifier = Modifier
                .height(height = 235.dp)
                .width(width = 200.dp)
                .padding(all = 8.dp),
            shape = RoundedCornerShape(size = 30.dp),
            elevation = 10.dp,
            backgroundColor = Color.White.copy(0.2f)

            ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(all = 10.dp)
                        .clip(RoundedCornerShape(size = 20.dp))
                        .size(size = 160.dp)
                        .aspectRatio(1f),
                    contentScale = ContentScale.Crop
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp, end = 8.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        text = name,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    Text(
                        text = "❤️ $likes",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }

        }

}
