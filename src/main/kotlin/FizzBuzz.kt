/*
1. Write a program that simulates the Fizz buzz game.
Your task is to print numbers from 1 to 100 incrementally, replacing any number divisible by
three with the word "fizz", and any number divisible by five with the word "buzz". Any number divisible
by both 3 and 5 must be replaced with the word "fizzbuzz".

2.You have a list of words. Use for and if to print only the words that start with the letter l.
*/

fun main(){

    for(number in 1..100){
        println(
            when{
                number % 3 == 0 -> "fizz"
                number % 5 == 0 -> "buzz"
                number % 15 == 0 -> "fizzbuzz"
                else -> number.toString()
            }
        )
    }

    println("--------")

    val words = listOf("dinosaur", "limousine", "magazine", "language")

    for(word in words){
        if(word.startsWith("l")){
            println(word);
        }
    }


}
