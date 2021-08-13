package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario ("João Carlos", 3000.0, "CLT")
    val henrique = Funcionario ("Henrique Junior", 4000.0, "PJ")
    val jorge = Funcionario ("Jorge Biel", 2000.0, "CLT")

    val funcionario = listOf(joao, henrique, jorge)

    println("------------------ \n")
    funcionario.forEach { println(it) }

    println("------------------ \n")
    funcionario.groupBy { it.tipocontratacao }
        .forEach{println(it)}

    println("------------------")
}


data class  Funcionario(
    val nome: String,
    val salario: Double,
    val tipocontratacao: String
){
    override fun toString(): String =
        """
        Nome= $nome
        Salario= $salario

        """.trimIndent()
}