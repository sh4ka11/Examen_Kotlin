//punto 1
fun sumarPares (numeros: Array<Int>): Int {
    return numeros.filter { it % 2 == 0 }.sum()
}

fun main() {
    val numeros = arrayOf(1, 2, 3, 4, 5, 6)
    println("el resultado de la suma de numeros pares es igual a: ")
    println(sumarPares(numeros))
}


//fun main() {
//
//
//    for (i in 1..6) {
//        if (i % 2 == 0) {
//            println("$i es par")
//        } else {
//            println("$i es impar")
//        }
//    }
//}
