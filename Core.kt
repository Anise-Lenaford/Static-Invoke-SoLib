package com.example.inject

import android.app.Activity
import android.widget.Toast
import android.util.Log

object Core {
    private const val LIBRARY_NAME = "inject"

    @JvmStatic
    fun callPlugin(activity: Activity) {
        activity.runOnUiThread {
            Toast.makeText(activity, "Init", Toast.LENGTH_LONG).show()
        }

        try {
            System.loadLibrary(LIBRARY_NAME)
        } catch (e: UnsatisfiedLinkError) {
            activity.runOnUiThread {
                Toast.makeText(activity, "Error: Native library failed to load.", Toast.LENGTH_LONG).show()
            }
            Log.e("Core", "Failed to load native library: ${LIBRARY_NAME}", e)
        }
    }
}