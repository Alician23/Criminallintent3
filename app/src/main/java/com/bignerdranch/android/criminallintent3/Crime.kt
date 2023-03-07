package com.bignerdranch.android.criminallintent3

import java.util.*

class Crime {

    data class Crime(val id: UUID = UUID.randomUUID(),
                     var title: String = "",
                     var date: Date = Date(),
                     var isSolved: Boolean = false)
}