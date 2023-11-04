package com.example.myapplication.ViewModels


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeActivityViewModel : ViewModel() {
    var counter: Int = 0
    val currentNumber: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
}