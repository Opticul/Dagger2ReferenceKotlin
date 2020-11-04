package com.opticulapps.daggertest2.dagger

import com.opticulapps.daggertest2.car.ExternalLibraryWheels
import com.opticulapps.daggertest2.car.Rims
import com.opticulapps.daggertest2.car.Tires
import dagger.Module
import dagger.Provides

// Created so that, even if you cannot add "inject" to rims, tires or wheels, you can still provide them
@Module
abstract class WheelsModule {

    companion object {
        @Provides
        fun provideRims(): Rims {
            return Rims()
        }

        @Provides
        fun provideTires(): Tires {
            val tires = Tires()
            tires.inflate()
            return tires
        }

        @Provides
        fun provideWheels(rims: Rims, tires: Tires): ExternalLibraryWheels {

            return ExternalLibraryWheels(rims, tires)
        }
    }

}