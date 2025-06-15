package dev.havlicektomas.notemark

import android.app.Application
import dev.havlicektomas.notemark.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import timber.log.Timber

class NoteMarkApp : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@NoteMarkApp)
            modules(
                appModule
            )
        }
    }
}