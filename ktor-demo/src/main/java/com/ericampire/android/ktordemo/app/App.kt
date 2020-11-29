package com.ericampire.android.ktordemo.app

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        setupKoinModule()
    }

    private fun setupKoinModule() {
        startKoin {
            androidContext(this@App)
            modules(repositoryModule, netModule, viewModelModule)
        }
    }
}