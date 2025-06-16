package com.example.mywishlistapp

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeView(paddingValues: PaddingValues){
    Scaffold(
        topBar = {AppBarView(title = "WishList", paddingValues = paddingValues)}
    ) {
        LazyColumn(modifier = Modifier.fillMaxSize()
            .padding(it)) {  }
    }
}