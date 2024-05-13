package com.example.shop.ui.theme.Screen.Products

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.example.shop.R
import com.example.shop.Data.ProductViewModel
import com.example.shop.Models.Upload
import com.example.shop.Navigation.ROUTE_UPDATE_PRODUCT


@Composable
fun BuyProductScreen(navController:NavHostController) {
    Box (modifier = Modifier.fillMaxSize())
    {
        Image(painter = painterResource(id = R.drawable.bbbqc),
            contentDescription ="Background Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize())
    }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        var context = LocalContext.current
        var productRepository = ProductViewModel(navController, context)


        val emptyUploadState = remember { mutableStateOf(Upload("","","","","")) }
        var emptyUploadsListState = remember { mutableStateListOf<Upload>() }

        var uploads = productRepository.viewUploads(emptyUploadState, emptyUploadsListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Text(text = "All uploads",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(){
                items(uploads){
                    UploadItems(
                        name = it.name,
                        quantity = it.quantity,
                        price = it.price,
                        imageUrl = it.imageUrl,
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
fun UploadItems(name:String, quantity:String, price:String, imageUrl:String, id:String,
               navController:NavHostController, productRepository: ProductViewModel

) {        val mContext = LocalContext.current


    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Card (modifier = Modifier
            .height(100.dp)
            .width(200.dp)){

            Image(
                painter = rememberAsyncImagePainter(imageUrl),
                contentDescription = null,
                modifier = Modifier
                    .size(128.dp)
                    .height(90.dp)
                    .width(190.dp)
            )
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

    Text(text = name)
    Text(text = quantity)
    Text(text = price)

    Button(onClick = {
        val callIntent= Intent(Intent.ACTION_DIAL)
        callIntent.data="tel:074843451448".toUri()
        mContext.startActivity(callIntent)
    }, modifier = Modifier
        .padding(start = 30.dp, end = 30.dp),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(2.dp, Color.Red)
    ) {
        Text(text = "Call")
    }
    Button(onClick = {
        val simToolKitLaunchIntent =
            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
        simToolKitLaunchIntent?.let { mContext.startActivity(it) }
    },modifier = Modifier
        .fillMaxWidth()
        .padding(start = 30.dp, end = 30.dp),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(2.dp, Color.Red)) {
        Text(text = "Mpesa")
    }
}
