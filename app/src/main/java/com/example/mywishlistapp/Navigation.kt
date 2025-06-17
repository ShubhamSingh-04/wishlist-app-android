package com.example.mywishlistapp

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(
    paddingValues: PaddingValues,
    viewModel: WishViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ){
        composable(Screen.HomeScreen.route) {
            HomeView(paddingValues, navController = navController, viewModel = viewModel)
        }

        composable(route = Screen.AddScreen.route) {
            AddEditDetailView(paddingValues = paddingValues,
                id = 0L,
                viewModel = viewModel,
                navController = navController)
        }
    }
}