package com.sun.sunipcserver

import android.app.Application
import android.content.Context
import android.content.Intent
import android.util.Log

/**
 * @author hengyangji
 * on 2022/8/13
 */
class ServerApplication: Application() {
    init {
        Log.i("MyBinder", "ServerApplication init")
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        Log.i("MyBinder", "ServerApplication attachBaseContext")
        startService(Intent(this, SunService::class.java))
    }
}