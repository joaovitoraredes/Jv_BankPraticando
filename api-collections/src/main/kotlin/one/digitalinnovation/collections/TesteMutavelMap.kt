package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario ("João Carlos", 3000.0, "CLT")
    val henrique = Funcionario ("Henrique Junior", 4000.0, "PJ")
    val jorge = Funcionario ("Jorge Biel", 2000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(henrique.nome, henrique)
    repositorio.create(jorge.nome, jorge)

    println("----------------- \n")
    repositorio.findAll().forEach{println(it)}

    println("----------------- \n")
    println(repositorio.findById(jorge.nome))

    println("----------------- \n")
    repositorio.remove(jorge.nome)
    repositorio.findAll().forEach{println(it)}

    println("-----------------")
}