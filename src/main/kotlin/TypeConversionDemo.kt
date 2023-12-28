class TypeConversionDemo {

    // Method to demonstrate type conversion
    fun demonstrateTypeConversion() {
        // 1. String to Integer
        val strNumber = "123"
        val intNumber = strNumber.toInt()
        println("String to Integer: $intNumber")

        // 2. String to Double
        val strDouble = "123.45"
        val doubleValue = strDouble.toDouble()
        println("String to Double: $doubleValue")

        // 3. Integer to String
        val number = 456
        val strResult = number.toString()
        println("Integer to String: $strResult")

        // 4. Double to Integer
        val dblValue = 123.789
        val intValue = dblValue.toInt()
        println("Double to Integer: $intValue")

        // 5. Character to String
        val charValue = 'A'
        val strChar = charValue.toString()
        println("Character to String: $strChar")

        // 6. Integer to Double
        val value = 789
        val doubleResult = value.toDouble()
        println("Integer to Double: $doubleResult")

        // 7. Double to String
        val piValue = 3.14159
        val strPi = piValue.toString()
        println("Double to String: $strPi")
    }
}

fun main() {
    // Create an instance of TypeConversionDemo class
    val demo = TypeConversionDemo()

    // Call the method to demonstrate type conversion
    demo.demonstrateTypeConversion()
}
