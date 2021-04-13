package com.sivakame.learningdagger

import com.sivakame.learningdagger.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

// TODO 2: Create Application class that starts injection
class LearningDaggerApp : DaggerApplication() {
    private val applicationInjector = DaggerAppComponent.builder().application(this).build()
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = applicationInjector
}
