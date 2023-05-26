package androidkotlin.formation.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var videoPlayerDefault: VideoPlayerComponentDefault
    private lateinit var videoPlayer: VideoPlayerComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        videoPlayerDefault = VideoPlayerComponentDefault()
        videoPlayer = VideoPlayerComponent()

        lifecycle.addObserver(videoPlayerDefault)
        lifecycle.addObserver(videoPlayer)
    }

    override fun onDestroy() {
        lifecycle.removeObserver(videoPlayerDefault)
        lifecycle.removeObserver(videoPlayer)
        super.onDestroy()
    }
}