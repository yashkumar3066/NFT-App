package com.example.nftapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.nftapp.ui.theme.NftAppTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.nftapp.navigation.NavGraph
import com.example.nftapp.navigation.Screens


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NftAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    NavGraph(navController = navController)

                }
            }
        }
    }
}

@Composable
fun AddImage(s1: String, s2: String, s3: String, navController: NavController) {
    val image = painterResource(id = R.drawable.javier_miranda_mrwocgkfvdg_unsplash_1)
    Image(
        painter = image, contentDescription = null,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentScale = ContentScale.Crop
    )
    HomePage(s1 = s1, s2 = s2, s3 = s3, navController)
}

@Composable
fun HomePage(s1: String, s2: String, s3: String, navController: NavController) {

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = s1,
            color = Color.White,
            fontSize = 54.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .padding(start = 30.dp, top = 40.dp)
        )
        Spacer(modifier = Modifier.height(200.dp))
        Box(

        ) {
            Image(painter = painterResource(id = R.drawable.card), contentDescription =null,
                  modifier = Modifier
                      .fillMaxSize()
                      .padding(top = 40.dp, start = 20.dp, end = 20.dp, bottom =50.dp ),
                  alignment = Alignment.Center
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(top = 80.dp)) {
                Text(
                    text = s2,
                    color = Color.White,
                    fontSize = 30.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(align = Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = s3,
                    color = Color.White,
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(start = 80.dp, end = 80.dp)
                )
                Button(onClick = {
                    navController.navigate(Screens.SecondScreen.route)
                }, modifier = Modifier.padding(top = 24.dp),
                       shape = RoundedCornerShape(percent = 50)) {
                    Text(text = stringResource(id = R.string.Get_started_now))
                }
            }
        }
    }
}
