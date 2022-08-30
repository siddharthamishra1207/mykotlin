package com.example.ap

fun main() {

    // Part-1
    // var - mutable (can be change )
    //val - immutable
    val n: String // kotlin is like expacit type
    n = "sidd"

    val age: Int
    age = 18
    var name = "siddhartha"
    name = "mishra"
    // println("hello name is $name and age is $age")

    //part-2
    /*
    what is bit?
      -smallest unit of data or information
    Int - 32 bits
    Byte - 8 bits
    Shorts - 16 bits
    Long - 64 bits

    float and Double
    Float- decimal no. upto 32 bits
    Double- upto 64 bits
     */

    //Part -3
    /*
    kotlin operation
    +
    -
    *
    /
    %

     */

//    val a = 12.0
//    val b = 5.0
//    println(a/b)

    //Part-4 (looping and Branch)

    val a1 = 1
//    if(a1==10){
//        println("equal to 10")
//    }
//    else{
//        println("not equale to")
//    }

//    when (a1) {
//        in 1..10 -> println("no. is between 1 to 10")
//        !in 1..10 -> println("not in 1 to 100")
//       // 10 -> println(" you have 10")
//        100 -> println(" you have 100")
//        1000 -> println(" you have 1000")
//        else -> {
//            println("$a1 amount is")
//        }
//
//    }

    //for loop
//    for (i in 1..100){
//        if(i%2==0){
//            println(i)
//        }
//    }
//  calc(2,5)
//    calc(67,89090)
//    PrintString(3,"error 404",9)


//fun calc(a:Int,b:Int){
//    println(a*b)
//}
//
//fun PrintString(a:Int,b:String,c:Int){
//
//    for (i in a..c){
//       println(b)
//    }
//}

//Catage(7)
// println(Catage1(7) )


// function
// fun Catage(a:Int){
//     val age = a*7
//     println("The cat age is $age year old ")
// }

// function with object passing
//fun Catage1(a:Int): Int
//{
//    val age = a*3
//    return age
//}
//  var ca = Catage(3)
//   // println(CheckAge(ca))
//    if(CheckAge(ca))// kotlin assume that it is true
//         println("This cat is $ca old")
//    else
//         println("This cat is not so old")
//
//}
//
//fun Catage(a:Int) : Int = a*7
//
//fun CheckAge(a:Int) : Boolean{
//    return a>14
//}

    //Lambda function (a function without name)
var sum: (Int, Int) -> Int = { a,b -> a+b}
}