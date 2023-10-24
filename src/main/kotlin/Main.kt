fun main() {
    do {
        calculator()
        print("Do you want to restart program <Yes/No>? ")
        val answer: String = readln()
    } while(answer == "Yes")

    println("The end of the program")
}

fun calculator() {
    println("The start of the program")
    print("Enter the X: ")
    val xString: String = readln()
    val x: Double? = xString.toDoubleOrNull()

    print("Enter the Y: ")
    val yString: String = readln()
    val y: Double? = yString.toDoubleOrNull()

    if(x == null || y == null){
        println("The arguments you entered are not numbers!")
    } else {
        val z: Double = x + y
        println("The sum of X and Y is: $z")
    }
}