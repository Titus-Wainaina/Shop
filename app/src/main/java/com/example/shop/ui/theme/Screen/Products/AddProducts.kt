package com.example.shop.ui.theme.Screen.Products

import android.content.Context
import android.content.res.Configuration
import android.net.Uri
import android.provider.MediaStore
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import com.example.shop.R
import com.example.shop.Data.ProductViewModel
import com.example.shop.Navigation.ROUTE_ADD_PRODUCTS
import com.example.shop.Navigation.ROUTE_VIEW_PRODUCT
import com.example.shop.Navigation.ROUTE_VIEW_UPLOAD

//import com.example.firebaseauth.data.productviewmodel
//import com.example.firebaseauth.navigation.ROUTE_VIEW_PRODUCT

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddProductsScreen(navController: NavHostController) {
Column (modifier = Modifier.verticalScroll(rememberScrollState())){
    Box (modifier = Modifier.fillMaxSize())
    {
        Image(painter = painterResource(id = R.drawable.bbbqc),
            contentDescription ="Background Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize())




        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            var context = LocalContext.current
            Text(
                text = "Add product",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red,
                modifier = Modifier.padding(20.dp),
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline
            )

            var productName by remember { mutableStateOf(TextFieldValue("")) }
            var productQuantity by remember { mutableStateOf(TextFieldValue("")) }
            var productPrice by remember { mutableStateOf(TextFieldValue("")) }

            OutlinedTextField(
                value = productName,
                onValueChange = { productName = it },
                label = { Text(text = "Product name *") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = productQuantity,
                onValueChange = { productQuantity = it },
                label = { Text(text = "Product quantity *") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = productPrice,
                onValueChange = { productPrice = it },
                label = { Text(text = "Product price *") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {
                val productRepository = ProductViewModel(navController, context)
                productRepository.saveProduct(
                    productName.text.trim(), productQuantity.text.trim(),
                    productPrice.text
                )
                navController.navigate(ROUTE_VIEW_PRODUCT)


            }, colors = ButtonDefaults.buttonColors(Color.Green),
                modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp)) {
                Text( modifier = Modifier.padding(10.dp),
                    text = "Save",color = Color.White)
            }
            Spacer(modifier = Modifier.height(15.dp))

            //---------------------IMAGE PICKER START-----------------------------------//

            ImagePicker(
                Modifier,
                context,
                navController,
                productName.text.trim(),
                productQuantity.text.trim(),
                productPrice.text.trim()
            )

        }
    }
}
}
@Composable
fun ImagePicker(modifier: Modifier = Modifier, context: Context, navController: NavHostController, name:String, quantity:String, price:String) {
    var hasImage by remember { mutableStateOf(false) }
    var imageUri by remember { mutableStateOf<Uri?>(null) }

    val imagePicker = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent(),
        onResult = { uri ->
            hasImage = uri != null
            imageUri = uri
        }
    )

    Column(modifier = modifier,) {
        if (hasImage && imageUri != null) {
            val bitmap = MediaStore.Images.Media.
            getBitmap(context.contentResolver,imageUri)
            Image(bitmap = bitmap.asImageBitmap(), contentDescription = "Selected image")
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 32.dp), horizontalAlignment = Alignment.CenterHorizontally,) {
            Button(
                onClick = { imagePicker.launch("image/*") },
                colors = ButtonDefaults.buttonColors(Color.Green),
                modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp)
            ) {
                Text( modifier = Modifier.padding(10.dp),
                    text = "Select Image", color = Color.White
                )
            }

            Spacer(modifier = Modifier.height(15.dp))

            Button(onClick = {
                //-----------WRITE THE UPLOAD LOGIC HERE---------------//
                var productRepository = ProductViewModel(navController,context)
                productRepository.saveProductWithImage(name, quantity, price,imageUri!!)
                navController.navigate(ROUTE_VIEW_UPLOAD)

            },colors = ButtonDefaults.buttonColors(Color.Green),
                modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp)) {
                Text(modifier = Modifier.padding(10.dp),
                    text = "Upload",color = Color.White)
            }
            Spacer(modifier = Modifier.height(15.dp))

            Button(onClick = { navController.navigate(ROUTE_VIEW_UPLOAD) }, colors = ButtonDefaults.buttonColors(Color.Green),
                modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp)) {
                Text( modifier = Modifier.padding(10.dp),
                    text = "view uploads", color = Color.White)
            }

        }
    }
}

@Preview
@Composable
fun AddProductsScreenPreview() {
    AddProductsScreen(rememberNavController())

}