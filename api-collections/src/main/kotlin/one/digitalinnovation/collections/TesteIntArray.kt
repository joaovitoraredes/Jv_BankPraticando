package one.digitalinnovation.collections

fun main() {
    val values = IntArray(7)
    var soma = 0

    values[0] = 2
    values[1] = 6
    values[2] = 8
    values[3] = 12
    values[4] = 1
    values[5] = 5
    values[6] = 0
    println("------------")

    for (valor in values){
        println(valor)
    }
    println("------------")

/* Outras maneiras de mostrar a saída dos Array

    values.forEach {
        println(it)
    }
    println("------------")

    values.forEach { valor ->
        println(valor)
    }
    println("------------")

    for (index in values.indices){
        println(values[index])
    }
    println("------------")

*/

    values.sort()
    for (valor in values){
        println(valor)
    }
    println("------------")

    for (valor in values){
        soma += valor
    }
    println(soma)
    println("------------")
}
