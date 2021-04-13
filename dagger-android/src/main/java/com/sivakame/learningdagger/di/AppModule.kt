package com.sivakame.learningdagger.di

import dagger.Module

// This Module includes the ViewModelModule.
// So transitively it takes care of providing the ViewModelFactory and ViewModel to our app.
@Module(includes = [ViewModelModule::class])
class AppModule
