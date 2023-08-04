//val a: Int? = try { input.toInt() } catch (e: NumberFormatException) { null }

fun main() {
    throw Exception("Hi There!")

    //val s = person.name ?: throw IllegalArgumentException("Name required")
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}