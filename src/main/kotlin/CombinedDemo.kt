class CombinedDemo {
    val stringProperty: String = "Hello, Kotlin!"
    val intProperty: Int = 123
    val doubleProperty: Double = 123.456
    val nullableString: String? = null

    // Function to check type using 'is' operator
    fun checkType(variable: Any) {
        when (variable) {
            is String -> println("It's a String.")
            is Int -> println("It's an Int.")
            is Double -> println("It's a Double.")
            is List<*> -> println("It's a List.")
            else -> println("Unknown type.")
        }
    }

    // Function to print the runtime type of an object using reflection
    fun printRuntimeType(obj: Any)  {
        println("Runtime type of ${obj::class.simpleName}: ${obj::class.java.canonicalName}")
    }
}

fun main() {
    // Create an instance of CombinedDemo class
    val demo = CombinedDemo()

    // Call functions to demonstrate the concepts
    demo.checkType(demo.stringProperty)
    demo.checkType(demo.intProperty)
    demo.checkType(demo.doubleProperty)
    demo.checkType(demo.nullableString ?: 0)

    demo.printRuntimeType(demo.stringProperty)
    demo.printRuntimeType(demo.intProperty)
    demo.printRuntimeType(demo.doubleProperty)
    demo.printRuntimeType(demo.nullableString ?: "Default Value")

}
