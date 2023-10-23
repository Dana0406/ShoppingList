package com.example.shoppinglist.db

import androidx.room.Insert
import androidx.room.Query
import com.example.shoppinglist.entities.NodeItem
import kotlinx.coroutines.flow.Flow


@androidx.room.Dao
interface Dao {
    @Query("SELECT * FROM note_list")
    fun getAllNotes():Flow<List<NodeItem>>
    @Insert
    suspend fun insertNote(node: NodeItem)
}