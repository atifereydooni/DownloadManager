package com.frcoding.downloadmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.frcoding.downloadmanager.ui.theme.DownloadManagerTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val downloader = AndroidDownloader(this)
        downloader.downloadFile("https://developer-blogs.nvidia.com/wp-content/uploads/2016/07/cute.jpg")

        super.onCreate(savedInstanceState)
        setContent {
            DownloadManagerTheme {

            }
        }
    }
}
