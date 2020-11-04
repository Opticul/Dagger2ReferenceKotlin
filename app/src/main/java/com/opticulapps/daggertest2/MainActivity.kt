package com.opticulapps.daggertest2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.opticulapps.daggertest2.car.Car
import javax.inject.Inject
import javax.inject.Provider

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car1: Provider<Car>
    @Inject lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Use create if you don't need any variables passed to constructors
        // CarComponent component = DaggerCarComponent.create();
        val component = (application as ExampleApp).appComponent
        component.inject(this)
        car1.get().drive()
        car2.drive()
    }
}