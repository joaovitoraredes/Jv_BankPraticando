package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(5)
    salarios[0] = 2750.0
    salarios[1] = 1250.0
    salarios[2] = 3000.0
    salarios[3] = 2500.0
    salarios[4] = 1000.0

    salarios.sort()
    salarios.forEach { println(it) }

    println("---------------")

    salarios.sort()
    salarios.forEachIndexed { index, salario ->     //caso queira que fossse adicionado um aumento nesses salários
        salarios[index] = salario * 1.5
        }

        salarios.forEach { println(it) }
}