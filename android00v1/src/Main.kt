
fun main() {
    println("Your name:") //na początku rozgrywki podajemy login
    val gname: String = readlnOrNull() ?: ""
    val gamer = Gamer(gname)
    println("How many rounds:") //określam liczbę rund
    val nrounds = readlnOrNull()?.toIntOrNull() ?: 1
    val game = Game(gamer)

    play(game, nrounds)

    println("All scores:") //Gra wczytuje dane na temat punktów gracza z pliku i
    // wyświetla mu je na konsoli.
    val allScores = readAllScores(game.filename)
    for ((name, score) in allScores) {
        println("Player: $name, Score: $score")
    }
}
