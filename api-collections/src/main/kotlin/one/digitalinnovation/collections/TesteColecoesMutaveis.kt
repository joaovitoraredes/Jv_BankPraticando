package one.digitalinnovation.collectio

import one.digitalinnovation.collections.Funcionario

fun main() {
    val joao = Funcionario ("João Carlos", 3000.0, "CLT")
    val henrique = Funcionario ("Henrique Junior", 4000.0, "PJ")
    val jorge = Funcionario ("Jorge Biel", 2000.0, "CLT")

    val funcionario = mutableSetOf(joao, henrique, jorge)
    funcionario.forEach{ println(it) }

    println("------------------------")

    funcionario.remove(henrique)
    funcionario.remove(jorge)
    funcionario.forEach{ println(it) }
}