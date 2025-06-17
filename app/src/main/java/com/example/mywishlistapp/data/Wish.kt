package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0L,

    @ColumnInfo(name =  "wish-title")
    val title: String = "",

    @ColumnInfo(name =  "wish-desc")
    val description: String = ""
)


object DummyWish{
    val wishList = listOf<Wish>(
        Wish(title ="Google Pixel 2", description = "Android"),
        Wish(title ="Google Pixel 3", description = "Android2"),
    )
}