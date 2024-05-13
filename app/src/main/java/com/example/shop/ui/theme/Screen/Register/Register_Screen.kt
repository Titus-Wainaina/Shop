package com.example.shop.ui.theme.Screen.Register

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.shop.Data.AuthViewModel
import com.example.shop.Navigation.ROUTE_HOME
import com.example.shop.Navigation.ROUTE_LOGIN
import com.example.shop.R

@Composable
fun RegisterScreen(navController: NavHostController) {
    Surface {
        Column(modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())) {
            Box(contentAlignment = Alignment.TopCenter) {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(fraction = 0.40F),
                    painter = painterResource(id = R.drawable.shapes),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )

                Row(
                    modifier = Modifier.padding(top = 90.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Spacer(modifier = Modifier.width(15.dp))
                    Column(
                        modifier = Modifier.align(alignment = Alignment.CenterVertically),

                        ) {
                        Text(
                            text = "Your Number One",
                            style = MaterialTheme.typography.headlineMedium
                        )
                        Text(
                            text = "shopping app",
                            style = MaterialTheme.typography.headlineSmall
                        )
                    }
                }
                Text(
                    modifier = Modifier
                        .padding(10.dp)
                        .align(alignment = Alignment.BottomCenter),
                    text = "SignUp",
                    style = MaterialTheme.typography.headlineLarge,
                )
            }
            Spacer(modifier = Modifier.height(15.dp))

            Column (modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp)
                ){
            var Name by remember { mutableStateOf(TextFieldValue(""))}
            var PhoneContact by remember { mutableStateOf(TextFieldValue(""))}
            var email by remember { mutableStateOf(TextFieldValue(""))}
            var pass by remember { mutableStateOf(TextFieldValue(""))}
            var confppass by remember { mutableStateOf(TextFieldValue("")) }
            var context= LocalContext.current
            Column(){
                    OutlinedTextField(
                        value = Name, onValueChange = {Name = it},
                        placeholder = { Text(text = "User_Name")},
                        leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "icon for person") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                    )
                    OutlinedTextField(
                        value = PhoneContact, onValueChange = {PhoneContact = it},
                        placeholder = { Text(text = "Phone_Contact")},
                        leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = "icon for person") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                    )
                    OutlinedTextField(
                        value = email, onValueChange = {email = it},
                        placeholder = { Text(text = "Enter_Email")},
                        leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "icon for person") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                    )
                    OutlinedTextField(
                        value = pass, onValueChange = {pass = it},
                        placeholder = { Text(text = "Enter_PassWord")},
                        leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "icon for person") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                    )
                    OutlinedTextField(
                        value = confppass, onValueChange = {confppass = it},
                        placeholder = { Text(text = "Enter_PassWord")},
                        leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "icon for person") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                    )
                Spacer(modifier = Modifier.height(15.dp))
                    Button(onClick = { val myregister = AuthViewModel(navController, context)
                        myregister.signup(  email.text.trim(), pass.text.trim(), confppass.text.trim() )
                        navController.navigate(ROUTE_HOME)},
                        modifier = Modifier.fillMaxWidth()) {
                        Text(text = "Register")
                    }
                    Spacer(modifier = Modifier.height(15.dp))
                    Button(onClick = { navController.navigate(ROUTE_LOGIN)},
                        modifier = Modifier.fillMaxWidth()) {
                        Text(text = "Have an Account? Click to Login")
                    }
                }
            }
        }
    }
}



@Preview(showBackground = true, showSystemUi =true )
@Composable
fun Register(){
    RegisterScreen(rememberNavController())
}

