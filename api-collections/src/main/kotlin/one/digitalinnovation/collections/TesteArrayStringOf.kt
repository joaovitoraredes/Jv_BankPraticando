package one.digitalinnovation.collections

fun main() {
    val nomes = arrayListOf("Maria Carla","Luciana Claudia","Jorge Marcos")

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