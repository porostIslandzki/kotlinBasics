
class Game(val gamer: Gamer) {
    var bestPlayer: String = ""
    var bestScore: Int = 0
    var filename: String = "rps_scores.txt"

    init {
        val bestData = readBestScore(filename)
        bestPlayer = bestData?.first ?: "empty"
        bestScore = bestData?.second ?: 0
    }
}