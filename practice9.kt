var notNullVariable: String = "a"
var nullableVariable: String? = null

var `null 이 아닌 변수`: String = notNullVariable ?: ""
var `null 이 가능한 변수`: String = nullableVariable ?: "b"

fun main() {
    println(`null 이 아닌 변수`)
    println(`null 이 가능한 변수`)

    nullableVariable = "not null"
    `null 이 가능한 변수` = nullableVariable ?: "c"

    println(`null 이 가능한 변수`)
}