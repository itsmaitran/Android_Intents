package com.lambdaschool.imageviewer.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.imageviewer.R
import com.lambdaschool.imageviewer.model.ImageData
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    private var data: ImageData? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val intent = intent
        data = intent.getSerializableExtra("object") as ImageData
        val context = this
    }

    override fun onStart() {
        super.onStart()

        image.setImageURI(data?.fileUri)
        text_name.text = data?.name
        text_uri.text = data?.fileUri.toString()
    }
}