package com.opticulapps.daggertest2.car

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {
    fun setListener(car: Car) {
        Log.d(TAG, "Remote Connected")
    }

    companion object {
        private const val TAG = "Remote"
    }
}