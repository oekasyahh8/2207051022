package com.acacaca.uas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.acacaca.uas.ui.theme.UASTheme

@Composable
fun LoginScreen(onLogin: () -> Unit = {}) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF4CAF50)), // Warna latar belakang hijau
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.pio), // Gambar latar belakang atas
            contentDescription = null,
            modifier = Modifier.size(250.dp) // Sesuaikan ukuran gambar
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.pio2), // Gambar logo
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text("Viona Almadea Miranda", fontSize = 24.sp, color = Color.Black)

            Spacer(modifier = Modifier.height(8.dp))

            BasicTextField(
                value = email,
                onValueChange = { email = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .background(Color(0xFFE0E0E0)),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                decorationBox = { innerTextField ->
                    if (email.isEmpty()) Text("Email", color = Color.Gray)
                    innerTextField()
                }
            )

            BasicTextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .background(Color(0xFFE0E0E0)),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                decorationBox = { innerTextField ->
                    if (password.isEmpty()) Text("Password", color = Color.Gray)
                    innerTextField()
                }
            )

            Button(
                onClick = {
                    if (email == "your_email@example.com" && password == "your_password") {
                        onLogin()
                    }
                },
                modifier = Modifier
                    .padding(top = 16.dp)
                    .background(Color(0xFF4CAF50))
            ) {
                Text("LOGIN", color = Color.White)
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text("Lupa Password? Klik Disini!", color = Color.Black)
            Text("Belum punya akun? Daftar Disini!", color = Color.Black)
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF6BAE45))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.pio2),
            contentDescription = null,
            modifier = Modifier.size(200.dp) // Adjust size as needed
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painter = painterResource(R.drawable.pio2), contentDescription = null)
                    Text("VIONA", color = Color.Black)
                }
                Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = null)
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painter = painterResource(R.drawable.pio2), contentDescription = null)
                    Text("VIONA", color = Color.Black)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text("Rekomendasi Lapangan", fontSize = 20.sp, color = Color.Black)

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = null, modifier = Modifier.size(100.dp))
                Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = null, modifier = Modifier.size(100.dp))
                Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = null, modifier = Modifier.size(100.dp))
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text("Minggu, 29 Agustus 2021", color = Color.Black)
            Text("Pukul 19.00 WIB", color = Color.Black)

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {},
                modifier = Modifier
                    .background(Color(0xFF00B2A9))
                    .align(Alignment.CenterHorizontally)
            ) {
                Text("AJAK MAIN", color = Color.White)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    UASTheme {
        LoginScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    UASTheme {
        MainScreen()
    }
}
