fun main() {
    for (i in 0..10) {
        print("$i ")
    }
    println()

    (0..10).forEach { i ->
        print("$i ")
    }
    println()

    for (i in 0 until 11) {
        print("$i ")
    }
    println()

    for (i in 1..9) {
        for (j in 1..9) {
            println("$i * $j = ${i * j}")
        }
    }
}