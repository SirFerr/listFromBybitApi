package com.example.listfrombybitapi.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.listfrombybitapi.model.AnnouncementResponse

import com.example.listfrombybitapi.model.Result
import com.example.listfrombybitapi.model.RetrofitInstance

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch


class BybitViewModel : ViewModel() {
    private val apiService = RetrofitInstance.api
    var announcement: MutableStateFlow<AnnouncementResponse> = MutableStateFlow(
        AnnouncementResponse(
            1, "", Result(
                1,
                emptyList()
            ), 1, 1
        )
    )

    fun getAnnouncements() {
        viewModelScope.launch {
            try {
                val response = apiService.getAnnouncements()
                if (response != null) {
                    announcement.value = response
                }


            } catch (e: Exception) {
                // Handle errors here
            }
        }
    }
}
