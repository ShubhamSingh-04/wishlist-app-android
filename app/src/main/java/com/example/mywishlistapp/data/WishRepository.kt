package com.example.mywishlistapp.data

import kotlinx.coroutines.flow.Flow

class WishRepository(private val _wishDao: WishDao) {
    suspend fun addAWish(wish: Wish){
        _wishDao.addWish(wish)
    }

    fun getWishes(): Flow<List<Wish>> = _wishDao.getAllWishes()

    fun getWishById(id: Long): Flow<Wish>{
        return _wishDao.getAWishes(id)
    }

    suspend fun deleteAWish(wish: Wish){
        _wishDao.deleteAWish(wish)
    }

    suspend fun updateAWish(wish: Wish){
        _wishDao.updateAWish(wish)
    }
}