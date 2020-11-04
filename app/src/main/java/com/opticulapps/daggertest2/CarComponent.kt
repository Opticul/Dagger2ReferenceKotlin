package com.opticulapps.daggertest2

import com.opticulapps.daggertest2.car.Car
import com.opticulapps.daggertest2.dagger.PetrolEngineModule
import com.opticulapps.daggertest2.dagger.WheelsModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

//@Component (modules = {WheelsModule.class, DieselEngineModule.class})
@Singleton // Because at least one of the instances needed (driver) is a singleton. Uses double-checked locking pattern to design the singleton.
@Component(
    modules = [
        WheelsModule::class,
        PetrolEngineModule::class
    ]
)
interface CarComponent {
    val car: Car
    fun inject(mainActivity: MainActivity)

    //Creates API for component by overriding the builder implementation
    @Component.Builder
    interface Builder {
        //If not named, the builder looks for "an int" and complains if there is several of them in the builder. If named here and in module, it works.
        //Worth mentioning: They are javax standard, not dagger, so can be used with other systems. Can make annotations instead of strings to enforce safety.
        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder
        fun build(): CarComponent
    }
}