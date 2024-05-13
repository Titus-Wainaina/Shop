package com.example.shop.ui.theme.Screen.Home

import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.shop.Navigation.ROUTE_ADD_PRODUCTS
import com.example.shop.Navigation.ROUTE_BUY_PRODUCT
import com.example.shop.Navigation.ROUTE_VIEW_UPLOAD
import com.example.shop.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    val context = LocalContext.current.applicationContext
    Column {
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
        TopAppBar(title = { Text(text = "Shop ") },
            navigationIcon = {
                IconButton(onClick = {  }) {
                    Icon(
                        imageVector = Icons.Filled.Menu,
                        contentDescription = "Menu",
                        tint = Color.White
                    )
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Blue,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White
            ),
            actions = {
                IconButton(onClick = {  navController.navigate(ROUTE_ADD_PRODUCTS)}) {
                    Icon(
                        imageVector = Icons.Filled.Add,
                        contentDescription = "Home",
                        tint = Color.White
                    )
                }
                IconButton(onClick = {  navController.navigate(ROUTE_BUY_PRODUCT)}) {
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        contentDescription = "Home",
                        tint = Color.White
                    )
                }
            }
        )
        Column() {
            val mContext = LocalContext.current
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier.padding(start = 20.dp)
            ) {
                //Column1

                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.b
                                ),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Sport Shoes",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.1200",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))


                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                            .background(color = Color.White)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.a),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Smart Watch",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.5000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
            }
            Spacer(modifier =Modifier.height(10.dp))
            Row(
                modifier = Modifier.padding(start = 20.dp)
            ) {
                //Column1

                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.e
                                ),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Hand Bad",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.2500",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))


                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                            .background(color = Color.White)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.d),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Water Bottle",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.600",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
            }
            Spacer(modifier =Modifier.height(10.dp))
            Row(
                modifier = Modifier.padding(start = 20.dp)
            ) {
                //Column1

                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.f
                                ),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Jbl speaker",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.6000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))


                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                            .background(color = Color.White)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.g),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Computer Speakers",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.1999",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
            }
            Spacer(modifier =Modifier.height(10.dp))
            Row(
                modifier = Modifier.padding(start = 20.dp)
            ) {
                //Column1

                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.i
                                ),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "HeadPhones",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.999",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))


                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                            .background(color = Color.White)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.j),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Utensils",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.19999",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
            }
            Spacer(modifier =Modifier.height(10.dp))
            Row(
                modifier = Modifier.padding(start = 20.dp)
            ) {
                //Column1

                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.k
                                ),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Television",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.45999",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))


                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                            .background(color = Color.White)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.l),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Sofa sets",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.69999",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
            }
            Spacer(modifier =Modifier.height(10.dp))
            Row(
                modifier = Modifier.padding(start = 20.dp)
            ) {
                //Column1

                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.m
                                ),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Cooker",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.32899",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))


                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                            .background(color = Color.White)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.n),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Coffe Table",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.5106",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
            }
            Spacer(modifier =Modifier.height(10.dp))
            Row(
                modifier = Modifier.padding(start = 20.dp)
            ) {
                //Column1

                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.o
                                ),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Curtains",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.550",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))


                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                            .background(color = Color.White)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.p),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Microwave",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.7000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
            }
            Spacer(modifier =Modifier.height(10.dp))
            Row(
                modifier = Modifier.padding(start = 20.dp)
            ) {
                //Column1

                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.q
                                ),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Laptop",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.74000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))


                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                            .background(color = Color.White)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.r),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Rice cooker",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.6000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
            }
            Spacer(modifier =Modifier.height(10.dp))
            Row(
                modifier = Modifier.padding(start = 20.dp)
            ) {
                //Column1

                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.s
                                ),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Clothes",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.50",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))


                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                            .background(color = Color.White)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.t),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Phones",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.67000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
            }
            Spacer(modifier =Modifier.height(10.dp))
            Row(
                modifier = Modifier.padding(start = 20.dp)
            ) {
                //Column1

                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.u
                                ),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Mouse",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.3900",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))


                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                            .background(color = Color.White)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.v),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Vase",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.500",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
            }
            Spacer(modifier =Modifier.height(10.dp))
            Row(
                modifier = Modifier.padding(start = 20.dp)
            ) {
                //Column1

                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.b
                                ),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Sport Shoes",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.1200",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))


                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                            .background(color = Color.White)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.a),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Smart Watch",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.5000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
            }
            Spacer(modifier =Modifier.height(10.dp))
            Row(
                modifier = Modifier.padding(start = 20.dp)
            ) {
                //Column1

                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.b
                                ),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Sport Shoes",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.1200",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))


                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                            .background(color = Color.White)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.a),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Smart Watch",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.5000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
            }
            Spacer(modifier =Modifier.height(10.dp))
            Row(
                modifier = Modifier.padding(start = 20.dp)
            ) {
                //Column1

                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.b
                                ),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Sport Shoes",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.1200",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))


                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                            .background(color = Color.White)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.a),
                                contentDescription = "null",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .absolutePadding(left = 15.dp, right = 15.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Smart Watch",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.5000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:074843451448".toUri()
                        mContext.startActivity(callIntent)
                    },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, Color.Red)


                    ) {
                        Text(text = "Call", color = Color.Cyan)
                    }
                }
            }

        }
    }


   }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Login(){
    HomeScreen(rememberNavController())
}

