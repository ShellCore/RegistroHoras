package com.shell.android.registrohoras.rest.base

import com.shell.android.registrohoras.rest.services.registerHour.RegisterHourRequest
import com.shell.android.registrohoras.rest.services.registerHour.RegisterHourResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface DriverService {

    @POST("AKfycbzhrnbWrwprkeaPIOGyab5498_R-9aOQa9xMpKpra1AOs2Mdtjv/exec")
    fun registerHour(@Body request : RegisterHourRequest) : Call<RegisterHourResponse>
}