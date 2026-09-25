package com.example.toasty

abstract class Shape (
    val x: Int,
    val y: Int
)

class Star (
    x: Int,
    y: Int
) : Shape(x, y)