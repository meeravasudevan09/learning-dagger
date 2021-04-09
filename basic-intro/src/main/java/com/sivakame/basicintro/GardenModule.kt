package com.sivakame.basicintro

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/*
@Module indicates class that builds dependencies.
* */
@Module
class GardenModule {

    /*
    * @Provides provides the objects dependencies.
    * */
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
