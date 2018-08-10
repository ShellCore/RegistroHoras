package com.shell.android.registrohoras.rest.services.registerHour

data class RegisterHourRequest(
        var operacion : Int,
        var fecha : String,
        var hora : String,
        var comentarios : String
)