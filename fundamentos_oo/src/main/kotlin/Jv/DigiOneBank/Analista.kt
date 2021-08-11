package Jv.DigiOneBank

class Analista(
    nome: String,
    cpf: String,
    telefone: String,
    salario: Double,
    cargo: String
) : Funcionario(nome, cpf, telefone, salario, cargo) {
    override fun calculoAuxilio() = salario * 0.1
}