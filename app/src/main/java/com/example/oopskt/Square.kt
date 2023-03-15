package com.example.oopskt

class Square (private val side:Double) : Shape() {
    override fun calculateArea() {
        area = 2 * side
    }

    override fun calculatePerimeter() {
        perimeter = 4 * side
    }
}