package com.example.mathjax

data class Answer(
    val correct: Boolean,
    val body: String,
    val expression: String,
    val position: Int,
    val code: String
)
