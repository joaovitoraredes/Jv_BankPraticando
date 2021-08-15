package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario ("João Carlos", 3000.0, "CLT")
    val henrique = Funcionario ("Henrique Junior", 4000.0, "PJ")
    val jorge = Funcionario ("Jorge Biel", 2000.0, "CLT")
    val carla = Funcionario ("Carla Gabriele", 2500.0, "CLT")


    val funcionario1 = setOf(joao, jorge, henrique)
    val funcionario2 = setOf(henrique, carla)

    val resultUnion = funcionario1.intersect(funcionario2)
    resultUnion.forEach{ println(it)}
}



