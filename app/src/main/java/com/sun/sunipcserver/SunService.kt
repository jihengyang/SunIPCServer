package com.sun.sunipcserver

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

/**
 * @author hengyangji
 * on 2022/8/8
 */
class SunService : Service() {
    override fun onStart(intent: Intent?, startId: Int) {
        Log.i("MyBinder", "onStart")
        super.onStart(intent, startId)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("MyBinder", "onStartCommand")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        Log.i("MyBinder", "onDestroy")
        super.onDestroy()
    }

    override fun onBind(intent: Intent?): IBinder {
        Log.i("MyBinder", "onBind")
        val ret = object : ISunLike.Stub() {
            override fun basicTypes(
                anInt: Int,
                aLong: Long,
                aBoolean: Boolean,
                aFloat: Float,
                aDouble: Double,
                aString: String?
            ) {
            }

            override fun getName(): String {
                return "Sun"
            }

        }
//        Log.i("MyBinder", "ret hash:${ret.hashCode()}")
        return ret
    }
}