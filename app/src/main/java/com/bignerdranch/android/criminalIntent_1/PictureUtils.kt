package com.bignerdranch.android.criminalIntent_1

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Point

class PictureUtils {

    fun getScaledBitmap(path: String, activity: Activity) : Bitmap {
        val size = Point()
        activity.windowManager.defaultDisplay.getSize(size)

        return getScaledBitmap(path, size.x, size.y)
    }

    fun getScaledBitmap(path: String, destWidth: Int, destHeight: Int): Bitmap {
        // Read in the dimensions of the image on disk
        var options = BitmapFactory.Options()
        options.inJustDecodeBounds = true
        BitmapFactory.decodeFile(path, options)

        val  srsWidth = options.outWidth.toFloat()
        val srsHeight = options.outHeight.toFloat()

        // Figure out how much to scale down by
        var inSampleSize = 1
        if (srsHeight > destHeight || srsWidth > destWidth) {
            val heightScale = srsHeight / destHeight
            val widthScale = srsWidth / destWidth

            val sampleScale = if (heightScale > widthScale) {
                heightScale

            } else {
                widthScale
            }
            inSampleSize = Math.round(sampleScale)
        }

        options = BitmapFactory.Options()
        options.inSampleSize = inSampleSize

        // Read in and create final bitmap
        return BitmapFactory.decodeFile(path, options)
    }
}