package com.example.inject

import android.app.Activity
import android.os.Bundle

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //invoke-static {p0}, Lcom/example/inject/Core;->callPlugin(Landroid/app/Activity;)V
        Core.callPlugin(this)

    }

}