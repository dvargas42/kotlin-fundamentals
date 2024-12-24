package lesson_03_data_type_details

fun main() {

    val age: Int = 20
    var ageDouble: Double = age.toDouble()
    var monthPercent = 1.0 / 12

    println("ageDouble = $ageDouble monthPercent = $monthPercent")

    // 2 months later
    //ageDouble = ageDouble + 2 * monthPercent
    ageDouble += 2 * monthPercent

    println("ageDouble updated = $ageDouble")

    // show age in string format with standard "A idade e X anos"
    val ageText: String = "A idade e " + ageDouble.toString().plus(" anos.")
    println(ageText)

    println(ageText.uppercase())
    println(ageText.lowercase())
}