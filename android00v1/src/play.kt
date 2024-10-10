import kotlin.random.Random

fun play(game: Game, nRounds: Int) {
    println("Hi ${game.gamer.name}, let's play! $nRounds rounds")
    println("Best Player is ${game.bestPlayer}, with ${game.bestScore} points")

    val options = listOf("rock", "paper", "scissors")
    for (i in 1..nRounds) {
        println("Round $i: Choose rock, paper, or scissors:")
        val userChoice = readlnOrNull()?.lowercase() ?: ""
        if (userChoice !in options) {
            println("Invalid choice, try again")
            continue
        }

        val computerChoice = options[Random.nextInt(0, 3)]
        println("Computer chose: $computerChoice")

        when {
            userChoice == computerChoice -> {
                println("It's a draw!")
            }
            (userChoice == "rock" && computerChoice == "scissors") ||
                    (userChoice == "scissors" && computerChoice == "paper") ||
                    (userChoice == "paper" && computerChoice == "rock") -> {
                println("You win this round!")
                game.gamer.addPoint() //za wygraną dostajemy +1 pkt
            }
            else -> {
                println("You lose this round!")
                game.gamer.subtractPoint() //za przegraną -1
            }
        }
        println("Current score: ${game.gamer.points}")
    }

    println("Final score: ${game.gamer.points}")
    if (game.gamer.points > game.bestScore) {
        println("New highest score!")
        saveScore(game.filename, game.gamer)
    }
    //Po każdej rozgrywce wyświetlamy wynik
    //z wszystkich rozgrywek oraz aktualny wynik
}
