package dev.havlicektomas.notemark.di

import dev.havlicektomas.notemark.MainViewModel
import dev.havlicektomas.notemark.auth.data.EncryptedSessionStorage
import dev.havlicektomas.notemark.auth.domain.SessionStorage
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    singleOf(::EncryptedSessionStorage).bind<SessionStorage>()

    viewModelOf(::MainViewModel)
}