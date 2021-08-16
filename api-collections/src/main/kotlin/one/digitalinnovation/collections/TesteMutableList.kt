package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario ("João Carlos", 3000.0, "CLT")
    val henrique = Funcionario ("Henrique Junior", 4000.0, "PJ")
    val jorge = Funcionario ("Jorge Biel", 2000.0, "CLT")

    println("-------------------------- \n")
    val funcionario = mutableListOf(joao,henrique,jorge)
    funcionario.forEach { println(it) }

    println("-------------------------- \n")
    funcionario.remove( jorge )
    funcionario.forEach { println(it) }

    println("--------------------------")
}



