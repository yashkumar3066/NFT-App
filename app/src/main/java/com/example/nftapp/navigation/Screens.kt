package com.example.nftapp.navigation

import com.example.nftapp.R


sealed class Screens(val route: String) {
    object SecondScreen : Screens("SecondScreen")
    object HomePage : Screens("Home")

}

sealed class BottomNavItem(val route: String){

    object Home : BottomNavItem("Home")
    object Stats: BottomNavItem("Stats")
    object AddPost: BottomNavItem("Add")
    object Search: BottomNavItem("Search")
    object Account: BottomNavItem("Account")
}