fun main() {
    // 1. Inclusive Range (..)
    println("Inclusive Range:")
    for (i in 1..5) {
        print("$i ")
    }
    println() // New line for separation

    // 2. Exclusive Range (..>)
    println("\nExclusive Range:")
    for (i in 1 until 5) {
        print("$i ")
    }
    println() // New line for separation

    // 3. Reverse Order Range (downTo)
    println("\nReverse Order Range:")
    for (i in 5 downTo 1) {
        print("$i ")
    }
    println() // New line for separation

    // 4. Stepped Range (step)
    println("\nStepped Range:")
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println() // New line for separation

    // Char Ranges
    println("\nChar Ranges:")
    for (char in 'a'..'e') {
        print("$char ")
    }
    println() // New line for separation

    // Reverse Char Range with step 2
    println("\nReverse Char Range with step 2:")
    for (char in 'e' downTo 'a' step 2) {
        print("$char ")
    }
}
