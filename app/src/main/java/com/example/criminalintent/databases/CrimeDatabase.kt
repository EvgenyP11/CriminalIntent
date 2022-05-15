package com.example.criminalintent.databases

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.criminalintent.Crime

@Database(entities = [Crime::class], version = 1)//Аннотация @Database сообщает Room о том, что этот класс представляет собой базу данных в приложении.
@TypeConverters(CrimeTypeConverters::class)//аннотая @TypeConverters  инструктирует базу данных использовать функции в классе CrimeTypeConverters при преобразовании типов.


abstract class CrimeDatabase : RoomDatabase(){

    abstract fun crimeDao(): CrimeDao
}