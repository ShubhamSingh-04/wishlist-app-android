package com.example.mywishlistapp

import android.widget.Toast
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

@Composable
fun HomeView(paddingValues: PaddingValues) {
    val context = LocalContext.current
    Scaffold(topBar = {
        AppBarView(title = "WishList", paddingValues = paddingValues, onBackNavClicked = {
            Toast.makeText(context, "Back Btn Clicked", Toast.LENGTH_LONG).show()
        })
    }, floatingActionButton = {
        FloatingActionButton(
            onClick = {
                Toast.makeText(context, "Floating Action", Toast.LENGTH_SHORT).show()
            }, contentColor = Color.White, containerColor = Color.Black

        ) {
            Icon(
                imageVector = Icons.Default.Add, contentDescription = null
            )
        }
    }) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) { }
    }
}