package com.shell.android.registrohoras.rest.base

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DriverClient(BASE_URL : String) {

    var retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun getDriveService() = retrofit.create(DriverService::class.java)
}