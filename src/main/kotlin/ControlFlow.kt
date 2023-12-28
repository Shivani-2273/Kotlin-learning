fun main() {
    // Using if as an expression
    val number = 10
    val result = if (number > 5) {
        "Number is greater than 5"
    } else {
        "Number is not greater than 5"
    }
    println(result)

    // Using when with string
    val fruit = "Apple"
    when (fruit) {
        "Apple" -> println("The fruit is an Apple.")
        "Banana" -> println("The fruit is a Banana.")
        "Cherry" -> println("The fruit is a Cherry.")
        else -> println("Unknown fruit.")
    }

    // Using 'when' as an expression based on string length
    val fruitType = when (fruit.length) {
        in 0..3 -> "Short name"
        in 4..6 -> "Medium name"
        else -> "Long name"
    }
    println("Fruit type based on name length: $fruitType")

    // Using when with age
    val age = 25
    when (age) {
        in 0..12 -> println("Child")
        in 13..19 -> println("Teenager")
        in 20..59 -> println("Adult")
        else -> println("Senior Citizen")
    }

    // Using when based on season
    val season = 5
    val seasonMessage = when (season) {
        in 3..5 -> "Spring"
        in 6..8 -> "Summer"
        in 9..11 -> "Autumn"
        12, 1, 2 -> "Winter"
        else -> "Invalid season"
    }
    println("Season based on month: $seasonMessage")
}
