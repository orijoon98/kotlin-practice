val add: (Int, Int) -> Int = { a, b -> a + b }

val minus: (Int, Int) -> Int = { a, b -> a - b }

val multiply = { a: Int, b: Int -> a * b }

val divide = { a: Int, b: Int -> a / b }

fun main() {
    println("${add(6, 2)} ${minus(6, 2)} ${multiply(6, 2)} ${divide(6, 2)}")
}