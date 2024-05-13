package com.example.shop.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.shop.ui.theme.Screen.Products.AddProductsScreen
import com.example.shop.ui.theme.Screen.Home.HomeScreen
import com.example.shop.ui.theme.Screen.Login.LoginScreen
import com.example.shop.ui.theme.Screen.Products.BuyProductScreen
import com.example.shop.ui.theme.Screen.Products.UpdateProductsScreen
import com.example.shop.ui.theme.Screen.Products.ViewProductsScreen
import com.example.shop.ui.theme.Screen.Products.ViewUploadsScreen
import com.example.shop.ui.theme.Screen.Register.RegisterScreen

@Composable
fun AppNavPost(modifier: Modifier=Modifier, navController: NavHostController = rememberNavController(), startDestination: String = ROUTE_REGISTER) {
    NavHost(navController = navController, modifier = Modifier, startDestination = startDestination ){
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCTS) {
            AddProductsScreen(navController)

        }
        composable(ROUTE_UPDATE_PRODUCT + "/{id}") { passedData ->
            UpdateProductsScreen(navController, passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_VIEW_UPLOAD){
            ViewUploadsScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT) {
            ViewProductsScreen(navController)
        }
        composable(ROUTE_BUY_PRODUCT) {
            BuyProductScreen(navController)
        }


    }
}


