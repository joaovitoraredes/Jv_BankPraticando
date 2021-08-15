package one.digitalinnovation.collections

fun main() {
    val map1 = mapOf(
        "João Henrique" to 1000.0,
        "Carla Adriele" to 2000.0
    )
    map1.forEach { k, v -> println("Chave: $k - Valor: $v")  }
}
