package com.jashwant.dagger_example

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService{
    fun send(to: String, from:String, body: String?)
}

@Singleton
class EmailService @Inject constructor():NotificationService{
    override fun send(to: String, from: String, body: String?) {
        Log.d("jashwant", "send: Email Sent")
    }
}

class MessageService(private val retryCount:Int):NotificationService{
    override fun send(to: String, from: String, body: String?) {
        Log.d("jashwant", "send: Message Sent , $retryCount")
    }
}