package org.example

//sentencias when
//fun main() {
//    val x = 3
//}
//fun main() {
//    val x = 3
//
//    when (x) {
//        2 -> println("x is a prime number between 1 and 10.")
//        3 -> println("x is a prime number between 1 and 10.")
//        5 -> println("x is a prime number between 1 and 10.")
//        7 -> println("x is a prime number between 1 and 10.")
//        else -> println("x isn't a prime number between 1 and 10.")
//    }
//}


// como usar una coma(,) para varias condiciones//
//fun main() {
//    val x = 3
//
//    when (x) {
//        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
//        else -> println("x isn't a prime number between 1 and 10.")
//    }
//}


//como usar la palabra clave (in) para condiciones//
//fun main() {
//    val x = 4
//
//    when (x) {
//        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
//        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
//        else -> println("x isn't a prime number between 1 and 10.")
//    }
//}

//palabra is para verificar//
//fun main() {
//    val x: Any = 4
//
//    when (x) {
//        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
//        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
//        else -> println("x isn't a prime number between 1 and 10.")
//    }
//}
//fun main() {
//    val x: Any = 4
//
//    when (x) {
//        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
//        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
//        is Int -> println("x is an integer number, but not between 1 and 10.")
//        else -> println("x isn't a prime number between 1 and 10.")
//    }
//}
//fun main() {
//    val x: Any = 4
//
//    when (x) {
//        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
//        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
//        is Int -> println("x is an integer number, but not between 1 and 10.")
//        else -> println("x isn't an integer number.")
//    }
//}
//fun main() {
//    val x: Any = 20
//
//    when (x) {
//        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
//        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
//        is Int -> println("x is an integer number, but not between 1 and 10.")
//        else -> println("x isn't an integer number.")
//    }
//}

//Cómo agregar una condición adicional con el mismo cuerpo//
//fun main() {
//    val trafficLightColor = "Yellow"
//
//    when (trafficLightColor) {
//        "Red" -> println("Stop")
//        "Yellow", "Amber" -> println("Slow")
//        "Green" -> println("Go")
//        else -> println("Invalid traffic-light color")
//    }
//}
//fun main() {
//    val trafficLightColor = "Amber"
//
//    when (trafficLightColor) {
//        "Red" -> println("Stop")
//        "Yellow", "Amber" -> println("Slow")
//        "Green" -> println("Go")
//        else -> println("Invalid traffic-light color")
//    }
//}
