
class Gamer(val name: String) {
    var points: Int = 0

    fun addPoint() {
        points++
    }

    fun subtractPoint() {
        points--
    }
}

//posiada konstruktor główny, który ustawia name
//posiada cechę z points ustawioną na 0
//posiada funkcję addPoint() zwiększającą ilość punktów o 1

