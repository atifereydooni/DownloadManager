package com.frcoding.downloadmanager

interface Downloader {
    fun downloadFile(url: String): Long
}