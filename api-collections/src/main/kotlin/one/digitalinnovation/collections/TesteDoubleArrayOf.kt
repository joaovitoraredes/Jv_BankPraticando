package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(2750.0, 1250.0, 3000.0, 2500.0, 1000.0)

    salarios.forEach { println(it) }

    println("---------------")

    salarios.sort()
    salarios.forEach { println(it) }

}
