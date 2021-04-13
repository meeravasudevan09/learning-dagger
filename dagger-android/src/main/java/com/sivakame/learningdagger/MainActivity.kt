/**
 * This module is based on a dagger.android example project.
 * https://proandroiddev.com/getting-started-with-dagger-2-27-on-android-by-example-8534f468175
 */

package com.sivakame.learningdagger

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        /**
         * Since this implements DaggerAppCompatActivity(),
         * it takes care of injection behind the scenes in onCreate()
         */
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
