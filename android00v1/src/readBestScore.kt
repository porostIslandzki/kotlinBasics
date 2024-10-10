import java.io.File

fun readBestScore(filename: String): Pair<String, Int>? {
    return try {
        val file = File(filename)
        if (!file.exists()) {
            file.createNewFile()
            return null
        }
        val linia = file.readText().trim()
        if (linia.isNotEmpty()) {
            val data = linia.split(",")
            if (data.size >= 2) {
                val name = data[0]
                val score = data[1].toIntOrNull() ?: 0
                Pair(name, score)
            } else {
                println("not enough data")
                null
            }
        } else {
            println("empty file")
            null
        }
    } catch (e: Exception) {
        println("error: ${e.message}")
        null
    }
}

//klasa Pair skłąda się z dwóch elementów,
//jest niemutowalna
//first - pierwszy element pary
//second - drugi element pary