package com.example.mathjax

data class Question(
    val id: Int,
    val question_code: String,
    val locale: String,
    val version: Int,
    val category: String,
    val purpose: String,
    val body: String,
    val answers: Array<Answer>,
    val difficulty: Int,
    val ideal_time: Int,
    val pmarks: Int,
    val nmarks: Int,
    val hint: Array<Hint>,
    val tips: Array<Tips>,
    val explanation: String,
    val video_url: String,
    val chapter: String

)
