package com.beyazidyargici.pokeinfo.di.module

import com.beyazidyargici.pokeinfo.PokeApp
import com.beyazidyargici.pokeinfo.data.network.ApiService
import com.beyazidyargici.pokeinfo.data.network.BASE_URL
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 *  Created by beyazid on 31.12.2018.
 */
@Module
class NetworkModule {

    /*
     * The method returns the Gson object
     * */
    @Provides
    @Singleton
    fun provideGson(): Gson {
        val gsonBuilder = GsonBuilder()
        return gsonBuilder.create()
    }

    /*
     * The method returns the Cache object
     * */
    @Provides
    @Singleton
    fun provideCache(application: PokeApp): Cache {
        val cacheSize = (10 * 1024 * 1024).toLong() // 10 MB
        val httpCacheDirectory = File(application.cacheDir, "http-cache")
        return Cache(httpCacheDirectory, cacheSize)
    }

    @Provides
    @Singleton
    fun provideInterceptor(): Interceptor {
        //build interceptor
        return Interceptor { chain ->
            // HttpUrl builder with api key
            val url = chain.request()
                .url()
                .newBuilder()
//                .addQueryParameter("key", "if there is an apikey")
                .build()

            // request builder
            val request = chain.request()
                .newBuilder()
                .url(url)
                .build()

            return@Interceptor chain.proceed(request)
        }
    }

    /*
     * The method returns the Okhttp object
     * */
    @Provides
    @Singleton
    fun provideOkhttpClient(cache: Cache, interceptor: Interceptor): OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        val httpClient = OkHttpClient.Builder()
            .cache(cache)
            .addInterceptor(logging)
            .addInterceptor(interceptor)
            //todo add connectivityInterceptor
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
        return httpClient.build()


    }

    /*
     * The method returns the Retrofit object
     * */
    @Provides
    @Singleton
    fun provideRetrofit(gson: Gson, okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
//            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .build()
    }



    /*
     * We need ApiService module.
     * For this, We need the Retrofit object, Gson, Cache and OkHttpClient .
     * So we will define the providers for these objects here in this module.
     * */
    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService {
        return retrofit.create<ApiService>(ApiService::class.java)
    }

}