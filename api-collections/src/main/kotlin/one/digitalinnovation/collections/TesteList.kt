package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario ("João Carlos", 2000.0)
    val henrique = Funcionario ("Henrique Junior", 2000.0)
    val jorge = Funcionario ("Jorge Biel", 2000.0)

    val funcionario = listOf(joao, henrique, jorge)

    funcionario.forEach { println(it) }

    println("------------------ \n")
    println(funcionario.find{it.nome == "Jorge Biel"})
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

