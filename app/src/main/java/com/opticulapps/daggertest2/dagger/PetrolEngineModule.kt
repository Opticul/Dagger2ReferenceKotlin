package com.opticulapps.daggertest2.dagger

import com.opticulapps.daggertest2.car.EngineInterface
import com.opticulapps.daggertest2.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun bindEngine(engine: PetrolEngine): EngineInterface
}
