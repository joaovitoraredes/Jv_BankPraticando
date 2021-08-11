package one.digitalinnovation.collections

fun main() {
     val values = arrayListOf(1,5,3,9,17,2)

    values.forEach{
        println(it)
    }

    println("--------------")

    values.sort()
    values.forEach{
        println(it)
    }
}