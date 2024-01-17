package com.example.listfrombybitapi.model

data class AnnouncementResponse(
    val retCode: Int,
    val retMsg: String,
    val result: Result,
    val retExtInfo: Any?,
    val time: Long
)

data class Result(
    val total: Int,
    val list: List<Item>
)

data class Item(
    val title: String,
    val description: String,
    val type: ItemType,
    val tags: List<String>,
    val url: String,
    val dateTimestamp: Long,
    val startDateTimestamp: Long,
    val endDateTimestamp: Long
)

data class ItemType(
    val title: String,
    val key: String
)