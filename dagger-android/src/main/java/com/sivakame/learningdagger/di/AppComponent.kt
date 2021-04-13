package com.sivakame.learningdagger.di

import android.app.Application
import com.sivakame.learningdagger.LearningDaggerApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

// TODO 6: Create a component to bridge dependencies with class requesting it
@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        MainActivityModule::class
    ]
)
interface AppComponent : AndroidInjector<LearningDaggerApp> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    // This method injects dependencies marked with @Inject
    override fun inject(app: LearningDaggerApp)
}
