package com.bignerdranch.android.criminalIntent_1

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*



    @Entity
    data class Crime(@PrimaryKey val id: UUID = UUID.randomUUID(),
                     var title: String = "",
                     var date: Date = Date(),
                     var isSolved: Boolean = false,
                     var suspect: String = "")
