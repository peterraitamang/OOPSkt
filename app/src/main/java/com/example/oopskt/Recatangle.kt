package com.example.oopskt

class Recatangle (private val length:Double , private  val breadth:Double) : Shape(){
    override fun calculateArea(){
        area = length * breadth
    }

    override fun calculatePerimeter() {
        perimeter = 2*(length + breadth)
    }
}