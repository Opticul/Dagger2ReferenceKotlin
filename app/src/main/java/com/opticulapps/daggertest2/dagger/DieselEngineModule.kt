package com.opticulapps.daggertest2.dagger

import com.opticulapps.daggertest2.car.DieselEngine
import com.opticulapps.daggertest2.car.EngineInterface
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private val horsePower: Int) {
    @Provides
    fun provideHorsePower(): Int {
        return horsePower
    }

    //Cannot use "bind" if you need runtime variables set
    @Provides
    fun provideEngine(engine: DieselEngine): EngineInterface {
        return engine
    }
}