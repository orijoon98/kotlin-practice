fun main() {
    var a = Class("a", 12)
    var b = Class("b")
    var c = Class()
}

class Class(name: String, age: Int) {
    init {
        println("$name $age 기본 생성자 실행")
    }

    constructor(name: String) : this(name, 20) {
        println("$name 보조 생성자 실행")
    }

    constructor() : this("name", 0) {
        println("입력값 없이 초기화하는 생성자 실행")
    }
}