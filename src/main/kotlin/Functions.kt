fun main() {
    // 1. Named Arguments
    greetUser(name = "John", message = "Hello")

    // 2. Default Parameter Values
    displayMessage() // Using default values
    displayMessage("Welcome", 3)

    // 3. Functions without Return
    printMessage("This is a message printed from a function without return type.")

    // 4. Single-expression Functions
    val result = addNumbers(10, 20)
    println("|| Single-expression Functions ||")
    println("Sum of numbers: $result")

    val squareValue = squareNumber(5)
    println("Square of 5 is: $squareValue")
}

// 1. Named Arguments
fun greetUser(message: String, name: String) {
    println("|| Named arguments functions || \n$message, $name!")
}

// 2. Default Parameter Values
fun displayMessage(message: String = "Hello", times: Int = 2) {
    println("|| Default Parameter Values ||")
    repeat(times) {
        println(message)
    }
}

// 3. Functions without Return
fun printMessage(message: String): Unit {
    println("|| Functions without Return ||\n$message")
}

// 4. Single-expression Functions
fun addNumbers(a: Int, b: Int): Int = a + b

fun squareNumber(num: Int): Int = num * num
