package com.example.mywishlistapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import com.example.mywishlistapp.ui.theme.MyWishlistAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyWishlistAppTheme {
                Scaffold {innerPadding->
                    HomeView(innerPadding)
                }

            }
        }
    }
}

