package com.sivakame.basicintro

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class GardenModule {
    @Provides
    fun providePlant(): Plant {
        return Plant()
    }

    @Provides
    @Singleton
    fun provideGeneralPlantingAdvice(): GeneralPlantingAdvice {
        return GeneralPlantingAdvice()
    }
}
