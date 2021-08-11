package Jv.DigiOneBank

abstract class Funcionario(
    nome: String,
    cpf: String,
    telefone: String,
    val salario: Double,
    val cargo: String
) : Pessoa(nome,cpf,telefone) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        cargo: $cargo
        nome: $nome
        cpf: $cpf
        telefone: $telefone
        Salário: $salario
        Auxilio: ${calculoAuxilio()}
        Valor Final: ${salario + calculoAuxilio()}
        """.trimIndent()
}
