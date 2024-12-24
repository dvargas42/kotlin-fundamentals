package lesson_04_logic_operators

fun main() {

    val a = true
    val b = false
    val c = true

    // operador E (&&)
    val result = a && b
    val result2 = a && c

    println("Operador E")
    println(result)
    println(result2)

    // operador OU (||)
    val result3 = a || b
    val result4 = a || c

    println("Operador OU")
    println(result3)
    println(result4)

    // operador NOT (!)
    val e = true
    val f = !e

    println("Operador Not")
    println(f)

    // operador de igualdade (==)
    val num1 = 10
    val num2 = 5

    println("Operador de igualdade e diferente de")
    println(num1 == num2)

    // operador de desigualdade, diferente de (!=)
    println(num1 != num2)

    //operadores é do tipo e não é do tipo
    val num: Any = 1
    val numText: Any = "1"

    println("Operadores eh do tipo e nao eh do tipo")
    println(num is String)
    println(numText is String)

    // operadores pertence e nao pertence (in e !in)
    val range = 1..10

    val x = 5
    val y = 16

    println("Operadores PERTENCE")
    println(x in range)
    println(y in range)

    println("Operadores de NAO PERTENCE")
    println(x !in range)
    println(y !in range)
}