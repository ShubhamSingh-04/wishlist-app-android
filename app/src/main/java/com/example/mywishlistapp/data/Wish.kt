package com.example.mywishlistapp.data

data class Wish(
    val id : Long = 0L,
    val title: String = "",
    val description: String = ""
)


object DummyWish{
    val wishList = listOf<Wish>(
        Wish(title ="Google Pixel 2", description = "Android"),
        Wish(title ="Google Pixel 3", description = "Android2"),
    )
}