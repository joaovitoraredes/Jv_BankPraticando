package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Maria Carla"
    nomes[1] = "Luciana Claudia"
    nomes[2] = "Jorge Marcos"

    nomes.sort()
    for(nome in nomes){
        println(nome)
    }

    println("---------------")

    nomes.sort()
    nomes.forEach{
        println(it)
    }
}
