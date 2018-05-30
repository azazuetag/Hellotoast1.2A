package com.mtw.alejandro.hellotoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private var mCount = 0
    private var mShowCount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun countUp(view: View) {
        // Comentario
        mCount++;
        if (show_count != null)
            show_count.setText(Integer.toString(mCount))
    }

    fun showToast(view: View) {
        // Comentario
        val toast = Toast.makeText(this, getString(R.string.toast_message), Toast.LENGTH_LONG)
        toast.show()
    }
}
