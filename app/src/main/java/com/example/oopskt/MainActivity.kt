package com.example.oopskt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.jar.Attributes.Name
import javax.net.ssl.SSLEngineResult.Status


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        var obj = Vehicle()
//        obj.carName()
//        var obj = Education()
//        obj.display()

//        var obj1 = Status()
//        obj1.myStatus()
//        obj1.display()
//
//
//    }
//
//    open class Education{
//        var level ="Bachelor"
//        fun display(){
//            println(level)
//        }
//    }
//    class Status : Education(){
//        fun myStatus(){
//            println("Ram is pursuing a degree.")
//        }
//
//    }
// Hierarchical Inheritance
//        var hello = Pet()
//        hello.petName()
//        hello.myName()
//
//        var obj = status()
//        obj.myStatus()
//        obj.myName()
//
//    }
//    open class Name{
//        open fun myName(){
//            println("My Name is Amar.")
//        }
//    }
//    class Pet : Name(){
//         fun petName(){
//            println("I have a Cat.")
//        }
//    }
//    class status : Name(){
//        fun myStatus(){
//            println("I am currently employed.")
//        }
        val test: Shape = Square(5.0)
        val test1 :Shape = Recatangle(2.0,2.0)

        test.calculateArea()
        test.calculatePerimeter()

        test1.calculateArea()
        test1.calculatePerimeter()

        println("Area of Square: ${test.area}")
        println("Area of Rectangle: ${test1.area}")

        println("Perimeter of Square : ${test1.perimeter}")
        println("Perimeter of rectangle: ${test1.perimeter}")



    }





}