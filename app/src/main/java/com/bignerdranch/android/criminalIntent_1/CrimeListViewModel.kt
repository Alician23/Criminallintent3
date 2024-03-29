package com.bignerdranch.android.criminalIntent_1

import androidx.lifecycle.ViewModel
import database.CrimeRepository


class CrimeListViewModel : ViewModel() {


    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()

    fun addCrime(crime: Crime) {
        crimeRepository.addCrime(crime)
    }
}
