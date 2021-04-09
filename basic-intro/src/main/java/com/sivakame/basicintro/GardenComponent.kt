package com.sivakame.basicintro

import dagger.Component
import javax.inject.Singleton

/*
* @Component bridge between @Module and @Inject.
* In this example, generates the DiscoveryGarden instances
* by injecting dependecies provided by GardenModule.
* */
@Singleton
@Component(modules = [GardenModule::class])
interface GardenComponent {
    fun buildDiscoveryGarden(): DiscoveryGarden
}
