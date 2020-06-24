package com.tian.myapplication

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

/**
 *  create by txm  on 2020/6/24
 *  desc
 */
class DataViewModel: ViewModel() {
    val num = MutableLiveData<Int>()

    init {
        num.postValue(Random.nextInt(100))
    }


    fun click(view: View?) {
        num.postValue(3)
    }


}