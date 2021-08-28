package com.rsschool.animalsdatabase.database

import androidx.room.*

@Entity(tableName = "list_animals")
data class Animal(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val name: String = "",
    val age: Int = 0,
    val type: String = ""
)