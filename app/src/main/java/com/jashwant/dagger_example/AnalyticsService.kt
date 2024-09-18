package com.jashwant.dagger_example

import android.util.Log

interface AnalyticsService {
    fun trackEvent(eventName:String,eventType:String)
}

class MixPanel : AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("jashwant", "mixpanel $eventName ,  $eventType ")
    }
}

class FirebaseAnalytics : AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("jashwant", "FirebaseAnalytics $eventName ,  $eventType ")
    }
}