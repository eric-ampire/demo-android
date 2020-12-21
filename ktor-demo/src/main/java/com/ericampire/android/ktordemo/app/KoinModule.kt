package com.ericampire.android.ktordemo.app

import com.ericampire.android.ktordemo.ui.repository.ListRepoRepository
import com.ericampire.android.ktordemo.ui.repository.ListRepoViewModel
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*
    import kotlinx.serialization.json.Json as KotlinJson
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val repositoryModule = module {
    single { ListRepoRepository(get()) }
}

val viewModelModule = module {
    viewModel { ListRepoViewModel(get()) }
}

val netModule = module {
    fun provideKtorClient(): HttpClient {
        return HttpClient(Android) {
            install(JsonFeature) {
                val json = KotlinJson {
                    isLenient = true
                    ignoreUnknownKeys = true
                    prettyPrint = true
                }
                serializer = KotlinxSerializer(json)
            }
            install(Logging) {
                logger = Logger.DEFAULT
                level = LogLevel.HEADERS
            }
        }
    }

    single { provideKtorClient() }
}