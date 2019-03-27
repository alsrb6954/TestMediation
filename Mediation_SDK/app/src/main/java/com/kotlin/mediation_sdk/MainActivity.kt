package com.kotlin.mediation_sdk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        MobileAds.initialize(applicationContext, "ca-app-pub-3940256099942544~3347511713")
        MobileAds.initialize(applicationContext, "ca-app-pub-8719241048822250~7462420148")

        val adRequest = AdRequest.Builder().build()
        (adView as AdView).loadAd(adRequest)
        (adView as AdView).adListener = object :AdListener(){

        }

    }
}
