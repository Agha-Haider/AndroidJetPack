package com.example.basicviewmodel.viewmode

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class MainActivityVieModel(application: Application):AndroidViewModel(application) {

    var count=0

    fun  getCounting():Int{

        return count
    }

    fun updateCounting():Int{

        return count++
    }

}