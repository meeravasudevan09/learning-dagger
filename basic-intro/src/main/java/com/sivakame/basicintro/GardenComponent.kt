package com.sivakame.basicintro

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [GardenModule::class])
interface GardenComponent {
    fun buildDiscoveryGarden(): DiscoveryGarden
}