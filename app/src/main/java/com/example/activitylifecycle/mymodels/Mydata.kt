package com.example.activitylifecycle.mymodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Mydata : ViewModel(){

    //live data changes
    var name = MutableLiveData<String>()
    var age = MutableLiveData<Int>()

}