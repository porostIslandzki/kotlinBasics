
//po dwukropku deklarujesz wartość zwracaną
fun getGreeting(): String {
    return "Hello Kotlin"
}
//fun getGreeting() = "Hello Kotlin"

//Unit może być odpowiednikiem void
//jeśli funkcja nie zwraca żadnej wartości, domyślnie
//zwraca unit
fun sayHello() {
    println(getGreeting())
}

fun main() {
    println("Hello world")
    println(getGreeting())
    sayHello()
}
