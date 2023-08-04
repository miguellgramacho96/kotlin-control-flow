import kotlin.random.Random

val a = 2
val b = 1

fun main() {
    var max = 0
    if (a < b) max = b

    if (a > b) {
        max = a
    } else {
        max = b
    }

    max = if (a > b) a else b
    val maxLimit = 1
    val maxOrLimit = if (maxLimit > a) maxLimit else if (a > b) a else b

    val max2 = if (a > b) {
        println("choose a")
        a
    } else {
        println("choose b")
        b
    }

    val x = 1

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 or 2")
        }
    }

    val numericValue = when (getRandomBit()) {
        Bit.ZERO -> 0
        Bit.ONE -> 1
    }

    when (getRandomColor()) {
        Color.RED -> println("Red")
        Color.BLUE -> println("Blue")
        Color.GREEN -> println("Green")
    }

    when (getRandomColor()) {
        Color.RED -> println("Red")
        else -> println("Not red")
    }

    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    when (x) {
        in 1..10 -> println("x is in the range")
        !in 10..20 -> println("x outside of range 10..20")
        else -> println("none of the above")
    }

    for (i in 1..3) {
        println(i)
    }

    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    /*
    while (x > 0) {
    x--
}

do {
    val y = retrieveData()
} while (y != null)
     */
}

fun hasPrefix(x: Any) = when (x) {
    is String -> x.startsWith("prefix")
    else -> false
}

fun getRandomColor(): Color {
    val enumValues = Color.values()
    val randomColorIndex = Random.nextInt(enumValues.size)

    return enumValues[randomColorIndex]
}

fun getRandomBit(): Bit {
    val enumValues = Bit.values()
    val randomIndex = Random.nextInt(enumValues.size)
    return enumValues[randomIndex]
}

enum class Bit {
    ZERO, ONE
}

enum class Color {
    RED, GREEN, BLUE
}