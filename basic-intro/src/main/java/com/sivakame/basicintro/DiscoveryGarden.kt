package com.sivakame.basicintro

import javax.inject.Inject

/*
* @Inject notation indicates the request for the dependency we need.
* */
class DiscoveryGarden @Inject constructor(
    val plant: Plant,
    val generalPlantingAdvice: GeneralPlantingAdvice
)
