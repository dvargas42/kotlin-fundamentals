//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Entre com seu nome:")
    val name = readln()

    println("Hello, $name!")
    println("E qual a sua idade?")
    val age = readln().toInt()

    for (i in 1..age) {
        val ageText = if (i == age) "A sua idade eh $i!" else "$i"

        println(ageText)
    }
}