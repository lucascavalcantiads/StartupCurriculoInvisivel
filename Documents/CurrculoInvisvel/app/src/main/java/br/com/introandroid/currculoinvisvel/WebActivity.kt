package br.com.introandroid.currculoinvisvel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        wbvSite.settings.javaScriptEnabled = true
        wbvSite.loadUrl("https://www.99jobs.com/")

    }
}
