fun main() {

    //domyślnie nie możesz dodawać albo odejmować elementów
    //kolekcji jak już zostanie utworzona
    /*val interestingThings = listOf(
        "Kotlin", "Programming",
        "Comic Books"
    )*/
    //można dostać się do elementów używając get, []

    //jeśli chcemy utworzyć listę, na której można działać
    //postępujemy w ten sposób:

    val interestingThings = mutableListOf(
        "Kotlin", "Programming",
        "Comic Books"
    )
    interestingThings.add("Dogs")

    interestingThings.forEach {
        interestingThing -> println(interestingThing)
    }

    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c") //klucz wartość
    map.put(4, "d")
    
    map.forEach {key, value -> println("$key -> $value") }
    //map pobiera parę
}
