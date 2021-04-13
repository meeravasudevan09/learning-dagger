package com.sivakame.learningdagger.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sivakame.learningdagger.PrimaryViewModel
import com.sivakame.learningdagger.ViewModelFactory
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import kotlin.reflect.KClass

// TODO 5: Create the module class that builds the dependencies
@Module
abstract class ViewModelModule {
    /**
     * @see IntoMap before Binds annotation indicate multi-binding
     */
    @Binds
    @IntoMap
    @ViewModelKey(PrimaryViewModel::class)
    abstract fun bindPrimaryViewModel(fragmentViewModel: PrimaryViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}

@MustBeDocumented
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)
