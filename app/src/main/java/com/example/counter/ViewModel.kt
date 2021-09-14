package com.example.counter

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {

    var x: MutableLiveData<Int> = MutableLiveData(0)

    fun counter(){
        x.value = x.value?.plus(1)
    }
}