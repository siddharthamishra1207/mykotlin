package com.example.mykotlin


fun main(){
//var add:(Int , Int) -> Int ={ a,b -> a+b}
//
//fun sum(a:Int,b:Int):Int = a+b
//
//
//    var s = sum(2,4)
//    println(s)
      // println(add(2,4))
    ///println(Chechage(CatAge(3)))
 println(add(2,3))

    tl("hello"){
        add(2,5)
    }

}

//var CatAge:(Int)->Int= {a -> a*7 }
//var Chechage:(Int) -> Boolean = {a -> a>14}

fun add(a:Int,b:Int): Int{
    return a+b
}

fun tl(a:String,fp:()-> Int){
    println("$a ,${fp()}")
}