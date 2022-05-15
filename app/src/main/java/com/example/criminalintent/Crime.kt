package com.example.criminalintent


import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity//анотация. Эта аннотация указывает, что класс определяет структуру таблицы или набора таблиц в базе данных.
//Каждое свойство, определенное в классе, превратится в столбец в таблице, при этом имя свойства станет именем столбца.
data class Crime(@PrimaryKey//анотация.Вторая добавленная нами аннотация — это @PrimaryKey, которую вы добавили к свойству id. Эта аннотация указывает, какой столбец в базе данных является первичным ключом.
    val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isSolved: Boolean = false)
