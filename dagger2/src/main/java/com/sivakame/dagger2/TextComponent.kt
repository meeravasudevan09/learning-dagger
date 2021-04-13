package com.sivakame.dagger2

import dagger.Component

@Component(modules = [TextModule::class])
interface InjectTextComponent {
    fun inject(app: MainActivity)
}
