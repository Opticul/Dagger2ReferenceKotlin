package com.opticulapps.daggertest2.car

import android.util.Log
import javax.inject.Inject

// Can injects constructors, fields and methods, and they are instansiated in that order.
class Car //     For instanciating with access to wheels injection
@Inject constructor(private val driver: Driver, private val engine: EngineInterface, //private Engine engine;
        //private ExternalLibraryWheels wheels;
                    private val wheels: ExternalLibraryWheels) {
    /* For instanciating with external wheels production
    @Inject
    public Car (Engine engine, ExternalLibraryWheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
        }
*/
    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.startEngine()
        Log.d(TAG, "$driver is driving $this ! Wroom!")
    }

    companion object {
        private const val TAG = "Car"
    }
}