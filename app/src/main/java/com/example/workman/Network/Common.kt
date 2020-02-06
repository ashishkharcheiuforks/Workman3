package com.example.workman.Network

import com.example.workman.Model.User

object Common {
    var select_user: User? = null

    val registerapi: ServiceApi
        get() {
            val retrofit = RetrofitClient.instance
            return retrofit.create(ServiceApi::class.java)
        }
}