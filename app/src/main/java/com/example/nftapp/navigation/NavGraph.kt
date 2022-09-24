package com.example.nftapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.nftapp.AddImage
import com.example.nftapp.R
import com.example.nftapp.ui.theme.SecondScreen


@Composable
fun NavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination =  Screens.HomePage.route )
    {
        composable(route = Screens.SecondScreen.route) {
            SecondScreen(navController)
        }
        composable(route = Screens.HomePage.route) {
            AddImage(
                s1 = stringResource(id = R.string.s1),
                s2 = stringResource(id = R.string.s2),
                s3 = stringResource(id = R.string.s3),
                navController
            )
        }


    }
}
