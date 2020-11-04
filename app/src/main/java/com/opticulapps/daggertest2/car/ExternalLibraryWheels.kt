package com.opticulapps.daggertest2.car

import javax.inject.Inject

//Cannot annotate with @inject since it is external
class ExternalLibraryWheels @Inject constructor(private val rims: Rims, private val tires: Tires)