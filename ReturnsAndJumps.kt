// val s = person.name ?: return

fun main() {
    loop@ for (i in 1..100) {
        // ...
    }

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            //if (...) break@loop
        }
    }
}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return
        println(it)
    }
    println("this point is unreachable")
}

fun foo2() {
    listOf(1, 2, 3, 4, 5).forEach lit@ {
        if (it == 3) return@lit
        println(it)
    }
    println("done with explicit label")
}

fun foo3() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach
        println(it)
    }
    println("done with implicit label")
}

fun foo4() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return
        println(value)
    })
    println("done with anonymous function")
}