import java.io.File

fun saveScore(filename: String, gamer: Gamer) {
    try {
        val file = File(filename)
        file.appendText("${gamer.name},${gamer.points}")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
//zapisuję wynik do pliku po zakończeniu rozgrywki