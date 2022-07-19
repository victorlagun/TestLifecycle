package com.techmeskills.testlifecycle

import android.util.Log
import androidx.lifecycle.*

class MainActivityObserver : DefaultLifecycleObserver, LifecycleEventObserver {

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.d("MY_OBSERVER", "ON_START")
    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        Log.d("MY_OBSERVER", event.name)
    }
}