fun add(a: Int, b: Int): Int {
    return a + b
}

fun minus(a: Int, b: Int) = a - b

fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun divide(a: Int, b: Int): Int {
    return a / b
}

fun main() {
    println("${add(6, 2)} ${minus(6, 2)} ${multiply(6, 2)} ${divide(6, 2)}")
}