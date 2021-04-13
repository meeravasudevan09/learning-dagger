package com.sivakame.dagger2

import dagger.Module
import dagger.Provides

@Module
class TextModule {
    @Provides
    fun providesSomeText(): SomeText {
        return SomeText("Simple Dagger 2 demo app")
    }
}
