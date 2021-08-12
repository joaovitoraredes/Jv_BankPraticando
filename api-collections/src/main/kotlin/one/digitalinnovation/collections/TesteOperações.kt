package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0,2500.0,4000.0,4500.0)

    salarios.forEach { println(it) }

    println("-----------------------")

    println("O maior salário é de: ${salarios.maxOrNull()}")
    println("O menor salário é de: ${salarios.minOrNull()}")
    println("O média dos salários é de: ${salarios.average()}")

    println("-----------------------")

    val salarioMaiorQue2500 = salarios.filter { it > 2500 }
    salarioMaiorQue2500.forEach{ println(it)}

}