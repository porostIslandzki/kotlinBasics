import java.io.File

fun readAllScores(filename: String): List<Pair<String, Int>> {
    return try {
        val file = File(filename)
        if (!file.exists()) {
            file.createNewFile()
            return emptyList()
        }
        val lines = file.readLines()
        lines.mapNotNull { line ->
            val data = line.split(",")
            if (data.size >= 2) {
                val name = data[0]
                val score = data[1].toIntOrNull() ?: 0
                Pair(name, score)
            } else {
                null
            }
        }
    } catch (e: Exception) {
        println("Error: ${e.message}")
        emptyList()
    }
}

//odczytuje wszystkie wyniki z pliku i wyświetla je po zakończeniu gry