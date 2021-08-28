package com.rsschool.animalsdatabase

import android.app.Application
import com.rsschool.animalsdatabase.database.AnimalsDataBase

class AnimalsListApplication : Application() {
    companion object {
        var database: AnimalsDataBase? = null
    }

    override fun onCreate() {
        super.onCreate()
        database = AnimalsDataBase.create(this)
    }
}

