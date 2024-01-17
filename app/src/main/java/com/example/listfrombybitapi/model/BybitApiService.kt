package com.example.listfrombybitapi.model

import retrofit2.http.GET
import retrofit2.http.Query

interface BybitApiService {
    @GET("v5/announcements/index")
    suspend fun getAnnouncements(
        @Query("locale") locale: String = "en-US",
        @Query("limit") limit: Int = 10
    ): AnnouncementResponse
}