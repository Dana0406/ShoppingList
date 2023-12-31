package com.example.shoppinglist.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "node_list")
data class NodeItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,

    @ColumnInfo(name = "title")
    val title:String,

    @ColumnInfo(name = "content")
    val content:String,

    @ColumnInfo(name = "time")
    val time:String,

    @ColumnInfo(name = "category")
    val category:String,
    )