package com.example.actbasiccomposable_0052

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.actbasiccomposable_0052.ui.theme.ActBasicComposable_0052Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ActBasicComposable_0052Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        LoginScreen()
                    }
                    )
                }
            }
        }
    }
}