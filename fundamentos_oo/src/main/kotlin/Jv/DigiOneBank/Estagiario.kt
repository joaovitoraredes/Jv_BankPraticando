package Jv.DigiOneBank

class Estagiario(
    nome: String,
    cpf: String,
    telefone: String,
    salario: Double,
    cargo: String
) : Funcionario(nome, cpf, telefone, salario, cargo) {
    override fun calculoAuxilio() = salario * 0
}