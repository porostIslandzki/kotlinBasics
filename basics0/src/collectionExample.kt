
fun sayHello4(greeting:String, /*itemsToGreet:List<String>*/ vararg itemsToGreet:String) {
    itemsToGreet.forEach{ itemToGreet ->
        println("$greeting $itemToGreet")
    }
}


fun main(){
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
    /*sayHello4("Hi", interestingThings)*/
    sayHello4("Hi", "Kotlin",
        "Programming", "Comic Books") //jeśli nie przekażemy za
    //Hi żadnych argumentów, będzie to traktowane jako pusta
    //lista

    //a tutaj jeśli w vararg chcemy po prostu przekazać
    //gotową tablicę interestingThing:
    //sayHello4("Hi", *interestingThings)

}

//vararg służy do deklarowania parametrów funkcji,
//które mogą przyjmować zmienną liczbę argumentów tego
//samego typu. Pozwala to na przekazywanie dowolnej
//liczby wartości do funkcji bez konieczności
//przekazywania ich jako tablica czy liczba