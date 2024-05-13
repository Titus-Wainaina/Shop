package com.example.shop.ui.theme.Screen.Products

import com.example.shop.Data.ProductViewModel



import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.shop.R
import com.example.shop.Navigation.ROUTE_UPDATE_PRODUCT
import com.example.shop.Models.Product




@Composable
fun ViewProductsScreen(navController:NavHostController) {
    Box (modifier = Modifier.fillMaxSize())
    {
        Image(painter = painterResource(id = R.drawable.bbbqc),
            contentDescription ="Background Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize())
    }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        val context = LocalContext.current
        val productRepository = ProductViewModel(navController, context)
        val emptyProductState = remember { mutableStateOf(Product("","","","")) }
        val emptyProductsListState = remember { mutableStateListOf<Product>() }

        val products = productRepository.viewProducts(emptyProductState, emptyProductsListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "All products",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(){
                items(products){
                    ProductItem(
                        name = it.name,
                        quantity = it.quantity,
                        price = it.price,
                        id = it.id,
                        navController = navController,
                        productRepository = productRepository
                    )
                }
            }
        }
    }
}



@Composable
fun ProductItem(name:String, quantity:String, price:String, id:String,
                navController:NavHostController, productRepository: ProductViewModel
) {

    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = name)
        Text(text = quantity)
        Text(text = price)
        Button(onClick = {
            productRepository.deleteProduct(id)
        }) {
            Text(text = "Delete")
        }
        Button(onClick = {
            navController.navigate(ROUTE_UPDATE_PRODUCT+"/$id")
        }) {
            Text(text = "Update")
        }
    }

}

@Preview
@Composable
fun View(){
    ViewProductsScreen(rememberNavController())
}