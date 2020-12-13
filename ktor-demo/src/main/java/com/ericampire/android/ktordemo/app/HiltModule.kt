package com.ericampire.android.ktordemo.app

import androidx.lifecycle.ViewModelProviders
import com.ericampire.android.ktordemo.ui.repository.ListRepoRepository
import com.ericampire.android.ktordemo.ui.repository.ListRepoViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.ApplicationComponent
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(ActivityRetainedComponent::class)
object RepositoryModule {

    @Provides
    fun provideListRepository(client: HttpClient): ListRepoRepository {
        return ListRepoRepository(client)
    }
}


@Module
@InstallIn(ApplicationComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideKtorClient(): HttpClient {
        return HttpClient(Android) {
            install(JsonFeature) {
                val json = kotlinx.serialization.json.Json {
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
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class AuthInterceptorOkHttp

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class OtherInterceptorOkHttp