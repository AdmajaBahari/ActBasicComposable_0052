package com.example.actbasiccomposable_0052

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val YellowLogin = Color(0xFFFFEB3B)
private val PinkText = Color(0xFFFF8FB8)
private val LineWidth = 280.dp

private val TextShadow = Shadow(
    color = Color.Black.copy(alpha = 0.45f),
    offset = Offset(2f, 2f),
    blurRadius = 6f
)

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Login",
                color = YellowLogin,
                fontSize = 48.sp,
                fontWeight = FontWeight.ExtraBold,
                style = TextStyle(shadow = TextShadow)
            )

            Text(
                text = "Silahkan masuk untuk melanjutkan",
                color = PinkText,
                fontSize = 16.sp,
                fontStyle = FontStyle.Italic,
                fontFamily = FontFamily.Cursive
            )

            Spacer(modifier = Modifier.height(24.dp))

            Image(
                painter = painterResource(id = R.drawable.foto),
                contentDescription = "Foto",
                modifier = Modifier
                    .size(220.dp)
                    .clip(CircleShape)
                    .border(3.dp, Color.White, CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(32.dp))

            InfoField(label = "Nama", value = "Admaja Bahari", valueSize = 24.sp)

            Spacer(modifier = Modifier.height(24.dp))

            InfoField(label = "NIM", value = "20230140052", valueSize = 28.sp)
        }
    }
}

@Composable
private fun InfoField(
    label: String,
    value: String,
    valueSize: TextUnit,
    lineWidth: Dp = LineWidth
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = label,
            color = YellowLogin,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            style = TextStyle(shadow = TextShadow)
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = value,
            color = Color.White,
            fontSize = valueSize,
            fontWeight = FontWeight.Bold,
            style = TextStyle(shadow = TextShadow)
        )

        Spacer(modifier = Modifier.height(4.dp))

        Box(
            modifier = Modifier
                .width(lineWidth)
                .height(2.dp)
                .background(YellowLogin)
        )
    }
}