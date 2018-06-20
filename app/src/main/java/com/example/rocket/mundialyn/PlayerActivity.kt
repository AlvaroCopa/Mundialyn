package com.example.rocket.mundialyn

import android.app.Activity
import android.os.Bundle
import android.widget.ImageView
import android.opengl.ETC1.getHeight
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import android.support.v4.graphics.drawable.RoundedBitmapDrawable
import android.graphics.drawable.BitmapDrawable
import android.graphics.Bitmap
import android.graphics.drawable.Drawable



class PlayerActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)
        //extraemos el drawable en un bitmap
        val originalDrawable = resources.getDrawable(R.drawable.messi)
        val originalBitmap = (originalDrawable as BitmapDrawable).bitmap

        //creamos el drawable redondeado
        val roundedDrawable = RoundedBitmapDrawableFactory.create(resources, originalBitmap)

        //asignamos el CornerRadius
        roundedDrawable.cornerRadius = originalBitmap.height.toFloat()

        val imagen : ImageView = findViewById(R.id.messi)
        imagen.setImageDrawable(roundedDrawable)
    }
}
