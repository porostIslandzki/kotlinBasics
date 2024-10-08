
//po usunięciu napisu string w name kotlin wciąż wie
//że jest to string
val name = "Nate"
//użycie ? po zadeklarowaniu typu zmiennej oznacza
//że ta zmienna może przyjmować wartość null
//jest to sposób na deklarowanie typów pustowalnych

var greeting: String? = "hello"
//top-level variables: dostępne w całym pliku
//w którym zostały zadeklarowane
//a przy użyciu odpowiednich modyfikatorów dostępu
//mogą być dostępne również w innych plikach czy modułach

fun main() {
    println(greeting)
    println(name)

    greeting = null

    println(greeting)
    println(name)

    if(greeting != null){
        println(greeting)
    } else {
        println("hi")
    }

    when(greeting){
        //jeśli chcemy wskazać czynność,
        //którą kotlin ma zrobić, musimy użyć ->
        null -> println("Hi")
        else -> println(greeting)
    }

    val greetingToPrint = if(greeting != null) greeting else "Hi"
    println(greetingToPrint)
    val greetingToPrint2 = when(greeting){
        null -> "Hi"
        else -> greeting
    }
}

//var - zmienne mutowalne
//używane do deklaracji zmiennych, których
//wartość może być zmieniana po przypisaniu
//zastosowanie: gdy potrzebujesz zmiennej,
//której wartość będzie się zmieniać w trakcie
//działania programu

//val-zmienne niemutowalne -
//używane do deklaracji zmiennych, których wartość
//nie może być zmieniona po przypisaniu