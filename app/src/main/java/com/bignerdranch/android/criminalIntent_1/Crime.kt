package com.bignerdranch.android.criminalIntent_1

import java.util.*

class Crime {

    @Entity
    data class Crime(@PrimaryKey val id: UUID = UUID.randomUUID(),
                     var title: String = "",
                     var date: Date = Date(),
                     var isSolved: Boolean = false)
}