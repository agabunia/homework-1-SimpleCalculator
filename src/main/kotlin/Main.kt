fun main() {
    do {
        calculator()
        print("Do you want to restart program <Y/N>? ")
        val answer: String = readln()
    } while(answer == "y")

    println("The end of the program")
}

fun calculator() {
    println("The start of the program")
    print("Enter the X: ")
    val xString: String = readln()
    val x: Int = xString.toInt()

    print("Enter the Y: ")
    val yString: String = readln()
    val y: Int = yString.toInt()

    val z: Int = x + y
    println("The sum of X and Y is: $z")
}