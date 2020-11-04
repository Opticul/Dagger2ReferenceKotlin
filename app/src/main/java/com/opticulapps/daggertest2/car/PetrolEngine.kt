package com.opticulapps.daggertest2.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

@Singleton
class PetrolEngine @Inject constructor(
    @Named("engineCapacity") private val engineCapacity: Int,
    @Named("horsePower") private val horsePower: Int,
) : EngineInterface {
    override fun startEngine() {
        Log.d(TAG, "WROOOOM but with petrol and $horsePower hk and $engineCapacity capacity!")
    }

    companion object {
        private const val TAG = "PetrolEngine"
    }
}