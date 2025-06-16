package com.example.mywishlistapp

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.mywishlistapp.data.Wish

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


@Composable
fun WishItem(wish: Wish, onClick: () -> Unit) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 8.dp, start = 8.dp, end = 8.dp)
        .clickable{
            onClick()
        },
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
            contentColor = Color.Black
        )) {
            Column(modifier = Modifier.padding(16.dp)){
                Text(text = wish.title, fontWeight = FontWeight.Bold)
                Text(text = wish.description)
            }
    }
}