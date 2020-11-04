package com.opticulapps.daggertest2.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(private val horsePower: Int) : EngineInterface {

    override fun startEngine() {
        Log.d(TAG, "WROOOOM with diesel! Horsepower: $horsePower")
    }

    companion object {
        private const val TAG = "DieselEngine"
    }
}