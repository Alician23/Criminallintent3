package database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bignerdranch.android.criminalIntent_1.Crime

@Database(entities =  [ Crime::class ], version=1)
abstract  class  CrimeDatabase : RoomDatabase() {


}

