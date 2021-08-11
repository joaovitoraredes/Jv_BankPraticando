package Jv.DigiOneBank.Testes

import Jv.DigiOneBank.Banco

fun main() {
    val santander = Banco(
        nome = "Santander",
        numero = "34"
    )

    println("Banco: ${santander.nome}")
    println("Número do Banco: ${santander.numero}")
}