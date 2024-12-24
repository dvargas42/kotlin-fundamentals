package lesson_02_data_types

fun main() {
    val byteMin: Byte = -128
    val byteMax: Byte = 127
    val shortMin: Short = -32_768
    val shortMax: Short = 32_767
    val intMin: Int = 1_000_000
    val long: Long = 31829831931289123
    val float: Float = 3f
    val double: Double = 3.0

    // text

    val char: Char = 'A'
    val string: String = "word"
    val string2: String ="""
        test 1
        test 2
        test 3
    """.trimIndent()

    val string3: String = "$char $byteMin $shortMin"

    // boolean

    val boolean: Boolean = false
}