package com.example.shoppinglist.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.shoppinglist.entities.LibraryItem
import com.example.shoppinglist.entities.NodeItem
import com.example.shoppinglist.entities.ShoppingListItem
import com.example.shoppinglist.entities.ShoppingListNames

@Database (entities = [LibraryItem::class, NodeItem::class,
    ShoppingListItem::class, ShoppingListNames::class],version = 1)
abstract class MainDataBase: RoomDatabase() {

    companion object{
        @Volatile
        private var INSTANCE: MainDataBase? = null

        fun getDataBase(context: Context):MainDataBase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,MainDataBase::class.java,
                "shopping_list.db").build()

                instance
            }
        }
    }
    
}