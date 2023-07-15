package com.androiddevs.mvvmnewsapp.ui.db

import androidx.room.TypeConverter
import com.androiddevs.mvvmnewsapp.ui.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source) = source.name

    @TypeConverter
    fun toSource(name: String) = Source(name, name)
}