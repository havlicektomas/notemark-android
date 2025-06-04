package dev.havlicektomas.notemark

import android.app.Application
import timber.log.Timber

class NoteMarkApp : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}