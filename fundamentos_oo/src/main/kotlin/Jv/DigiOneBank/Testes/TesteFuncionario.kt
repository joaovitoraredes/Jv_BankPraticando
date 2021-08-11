package Jv.DigiOneBank.Testes

import Jv.DigiOneBank.Analista
import Jv.DigiOneBank.Estagiario
import Jv.DigiOneBank.Gerente

fun main() {

    val jose = Estagiario("Jose Augusto","745.245.777.885","3214-6464",1500.0,"Estagiário")
    val jean = Estagiario("Jean Carlos","646.523.066.411","5235-3945",1500.0,"Estagiário")
    val alberto = Estagiario("Alberto Junior","444.222.000.111","6346-9868",1500.0,"Estagiário")

    val carlos = Analista("Carlos José","111.222.333.444","4553-6346",2500.0,"Analista")
    val lucas = Analista("lucas Henrique","493.839.146.99","7234-3534",2500.0,"Analista")

    val ricardo = Gerente("Ricardo Maia","520.5366.423.75","4275-7760",4000.0,"Gerente")

    println("------------------------------")

    ImprimirRelatorio.imprime(jose)
    ImprimirRelatorio.imprime(alberto)
    ImprimirRelatorio.imprime(jean)

    ImprimirRelatorio.imprime(carlos)
    ImprimirRelatorio.imprime(lucas)

    ImprimirRelatorio.imprime(ricardo)
}