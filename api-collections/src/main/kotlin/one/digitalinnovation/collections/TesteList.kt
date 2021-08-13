package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario ("João Carlos", 3000.0)
    val henrique = Funcionario ("Henrique Junior", 4000.0)
    val jorge = Funcionario ("Jorge Biel", 2000.0)

    val funcionario = listOf(joao, henrique, jorge)

    println("------------------ \n")
    funcionario.forEach { println(it) }

    println("------------------ \n")
    funcionario.sortedBy { it.nome }
        .forEach{println(it)}

    println("------------------")
}


data class  Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
        Nome= $nome
        Salario= $salario

        """.trimIndent()
}