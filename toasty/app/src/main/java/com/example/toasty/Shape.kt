package com.example.toasty

abstract class Shape (
    val x: Int,
    val y: Int
)

class Circle(
    x: Int,
    y: Int,
    radius : Int
) : Shape(x, y)