fun main() {
    val interestingThings = arrayOf(
        "Kotlin", "Programming",
        "Comic Books"
    )
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    /* for (interestingThing in interestingThings) {
        //po prostu iteruje po tablicy
        println(interestingThing)
    } */

    /* interestingThings.forEach { String
    println(it)
    } */
    //defines what to do over each iteration of this collection

    //interestingThings.forEach { interestingThings ->
    //println(interestingThings)
    //}

    //ogólna składnia funkcji lambda:
    // { parametry -> ciało_funkcji }
    //parametry: lista parametrów wejściowych (może być pusta)
    // operator -> oddziela parametry od ciała funkcji
    // ciało funkcji: kod wykonywany przez funkcję lambda

    interestingThings.forEachIndexed {index, interestingThing ->
        println("$interestingThing is at index $index")
   }
    //a ta funkcja tutaj wyświetli nam zarówno parametr,
    //jak i index

}