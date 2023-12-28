class DataTypeDemo {

    //numbers datatype
    val byteValue: Byte = 127;
    val shortValue: Short = 32767
    val intValue: Int = 2147483647
    val longValue: Long = 9223372036854775807L
    val floatValue: Float = 3.14F
    val doubleValue: Double = 3.141592653589793

    //boolean datatype
    val isKotlinFun: Boolean = true;
    var isJavaFun: Boolean = false; //Mutable variable

    //String datatype
    val greeting: String = "Hello kotlin";

    //characters
    val firstLetter: Char = 'A'

    //Arrays
    val numbersArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    // Function to demonstrate data types and operations
    fun demonstrateDataTypes() {

        // 1. Print number values
        println("Byte value: $byteValue")
        println("Short value: $shortValue")
        println("Int value: $intValue")
        println("Long value: $longValue")
        println("Float value: $floatValue")
        println("Double value: $doubleValue")

        // 2. Print boolean values
        println("Is Kotlin fun? $isKotlinFun")
        println("Is Java fun? $isJavaFun")

        // 3. Print string value
        println(greeting)

        // 4. Print character value
        println("First letter: $firstLetter")

        // 5. Print array elements
        println("Numbers array: ${numbersArray.joinToString(", ")}")
    }

    // Function to update mutable variables
    fun updateVariables() {

        // Update mutable variable
        isJavaFun = true
        println("Updated isJavaFun value: $isJavaFun")
    }
}

fun main(){

    // Create an instance of DataTypeDemo class
    val demo = DataTypeDemo()

    //call functions to print and update variables
    demo.demonstrateDataTypes()
    demo.updateVariables()
}
