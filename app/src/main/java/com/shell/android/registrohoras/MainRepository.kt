package com.shell.android.registrohoras

import android.util.Log
import com.shell.android.registrohoras.rest.base.DriverClient
import com.shell.android.registrohoras.rest.services.registerHour.RegisterHourRequest
import com.shell.android.registrohoras.rest.services.registerHour.RegisterHourResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*

val TAG = "Repository"

fun registerHour(url : String, type : Int, date : Date, commentary : String) {
    val service = DriverClient(url).getDriveService()
    val request : RegisterHourRequest = createRequest(type, date, commentary)
    val call = service.registerHour(request)
    call.enqueue(object : Callback<RegisterHourResponse> {
        override fun onResponse(call: Call<RegisterHourResponse>, response: Response<RegisterHourResponse>) {
            val res = response.body()
            Log.i(TAG, res!!.message)
            post(res!!.message)
        }

        override fun onFailure(call: Call<RegisterHourResponse>?, t: Throwable) {
            Log.i(TAG, t.localizedMessage)
            post(t.localizedMessage)
        }

    })
}

fun createRequest(type: Int, date: Date, commentary: String): RegisterHourRequest {
    val fecha = SimpleDateFormat("yyyy-MM-dd").format(date)
    val hora = SimpleDateFormat("HH:mm").format(date)
    var request = RegisterHourRequest(type, fecha, hora, commentary)
    return request
}

fun post(message : String) {
    // TODO
}


