
/* fun sayHello2(itemToGreet:String){
    //przekazujemy string value
    val msg = "Hello " + itemToGreet
    println(msg)
} */

fun sayHello2(greeting:String, itemToGreet:String) =
    println("$greeting $itemToGreet")

fun main() {
    sayHello2("Hey","Kotlin")
    sayHello2("Hello","World")
}