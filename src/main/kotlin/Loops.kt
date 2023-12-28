fun main() {
    // Using for loop to iterate over numbers from 1 to 5
    println("Using For Loop:")
    for (i in 1..5) {
        println("Number: $i")
    }

    // Using while loop to execute a code block while a conditional expression is true
    println("\nUsing While Loop:")
    var counter = 5
    while (counter >= 1) {
        println("Number: $counter")
        counter--
    }

    // Using do-while loop to execute the code block first and then check the conditional expression
    println("\nUsing Do-While Loop:")
    var doWhileCounter = 10
    do {
        println("Number: $doWhileCounter")
        doWhileCounter--
    } while (doWhileCounter > 5)


        var pizzaSlices = 0
        while ( pizzaSlices < 7 ) {
            pizzaSlices++
            println("There's only $pizzaSlices slice/s of pizza ")
        }
        pizzaSlices++
        println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! ")

}
