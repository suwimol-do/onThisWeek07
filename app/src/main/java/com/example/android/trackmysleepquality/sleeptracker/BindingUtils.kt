package com.example.android.trackmysleepquality.sleeptracker

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.android.trackmysleepquality.database.SleepNight


    @BindingAdapter("setDuration")
    fun TextView.setDuration(item: SleepNight) {
        text = "Hello"//item.startTimeMilli.toString() + ", " +item.endTimeMilli.toString() + " !!!"
    }

    @BindingAdapter("setSleepQuality")
    fun TextView.setSleepQuality(item: SleepNight) {
        text = "world"//item.sleepQuality.toString() + "!!!"
    }

