package androidkotlin.formation.lifecycle

import android.util.Log
import androidx.lifecycle.*

class VideoPlayerComponent: LifecycleEventObserver {
    companion object {
        const val TAG = "VideoPlayerComponent"
    }

    private fun onStart() {
        Log.d(TAG, "Starting play")
    }
    private fun onStop() {
        Log.d(TAG, "Stopping play")
    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when (event) {
            Lifecycle.Event.ON_RESUME -> onStart()
            Lifecycle.Event.ON_STOP -> onStop()
            else -> {}
        }
    }
}


class VideoPlayerComponentDefault: DefaultLifecycleObserver {

    companion object {
        const val TAG = "VideoPlayerComponentDefault"
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.d(TAG, "Starting play")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.d(TAG, "Stopping play")
    }
}