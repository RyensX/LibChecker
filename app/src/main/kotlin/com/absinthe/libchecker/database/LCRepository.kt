package com.absinthe.libchecker.database

import androidx.lifecycle.LiveData

class LCRepository(private val lcDao: LCDao) {

    val allItems: LiveData<List<LCItem>> = lcDao.getItems()
    val allLibItems: LiveData<List<NativeLibItem>> = lcDao.getLibItems()

    suspend fun insert(item: LCItem) {
        lcDao.insert(item)
    }

    suspend fun update(item: LCItem) {
        lcDao.update(item)
    }

    suspend fun delete(item: LCItem) {
        lcDao.delete(item)
    }

    suspend fun deleteAll() {
        lcDao.deleteAll()
    }

    suspend fun insert(item: NativeLibItem) {
        lcDao.insert(item)
    }

    suspend fun update(item: NativeLibItem) {
        lcDao.update(item)
    }
}