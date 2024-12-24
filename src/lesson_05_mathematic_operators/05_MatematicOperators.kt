package lesson_05_mathematic_operators

fun main() {
    val num = 4
    val num2 = 2

    // basicos
    println(num + num2)
    println(num - num2)
    println(num * num2)
    println(num / num2)
    println(num % num2)

    // incremento
    var num3 = 10
    var num4 = 20

    num3++
    num4--

    println(num3)
    println(num4)

    // atribuicao composta

    var num5 = 1

    num5 += num
    println(num5)

    num5 -= num
    println(num5)

    num5 *= num
    println(num5)

    num5 /= num
    println(num5)

    num5 %= num
    println(num5)

    // biblioteca math
    println()
    println("biblioteca math")

    val value = 2.499999
    val valueRounded = Math.round(value)
    println(valueRounded)

    val value2 = 2.999999
    val valueRounded2 = Math.floor(value2)
    println(valueRounded2)

    val value3 = 3.1111
    val valueRounded3 = Math.ceil(value3)
    println(valueRounded3)

    val base = 2.0
    val exponent = 3.0
    val valuePow = Math.pow(base, exponent)

    println(valuePow)

    val logValue = Math.log10(100.0)
    println(logValue)
}