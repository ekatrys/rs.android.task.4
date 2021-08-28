package com.rsschool.animalsdatabase.database

import androidx.room.*
import kotlinx.coroutines.flow.Flow


enum class SortBy(
    val NAME: Int = 0,
    val AGE: Int = 1,
    val TYPE: Int
)

@Dao
interface AnimalsListDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(animal: Animal)

    @Delete
    fun delete(animal: Animal)

    @Query("SELECT * FROM list_animals")
    fun getAll(): Flow<Animal>

    @Query(
        "SELECT * FROM list_animals ORDER BY" +
            "CASE WHEN :by = 0 THEN name END ASC," +
            "CASE WHEN :by = 1 THEN age END DESC, " +
            "CASE WHEN :by = 0 THEN type END ASC"
    )
    fun sort(by: SortBy)
}