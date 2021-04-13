package com.sivakame.learningdagger.di

import com.sivakame.learningdagger.PrimaryFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeFirstFragment(): PrimaryFragment
}
