package com.example.vmcalc

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var total = 0

    fun getTotal(): Int{
        return total
    }

    fun setTotal(input:Int){
        total += input
    }

}