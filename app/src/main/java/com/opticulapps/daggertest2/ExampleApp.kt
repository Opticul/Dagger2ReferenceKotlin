package com.opticulapps.daggertest2

import android.app.Application
import com.opticulapps.daggertest2.car.Car
import dagger.Component

class ExampleApp : Application() {
    // Unlike the simpleton annotation in the carcomponement class, this class is decleared as a wrapper in the android manifest and is always available and only created once.
    val appComponent: CarComponent by lazy {
        DaggerCarComponent.builder()
            .horsePower(120)
            .engineCapacity(1400)
            .build()
    }


    override fun onCreate() {
        super.onCreate()


    }
}