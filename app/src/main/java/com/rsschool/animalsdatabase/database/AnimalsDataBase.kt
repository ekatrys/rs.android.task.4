package com.rsschool.animalsdatabase.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Animal::class], version = 1)
abstract class AnimalsDataBase : RoomDatabase() {
    abstract val animalsListDao: AnimalsListDao

    companion object {
        fun create(context: Context) = Room.databaseBuilder(
            context,
            AnimalsDataBase::class.java,
            "list-animals-db"
        ).build()
    }
}