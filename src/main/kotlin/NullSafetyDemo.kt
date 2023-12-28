/*
1. Safe Call Operator (?.)
The safe call operator (?.) is used to safely call a method or access a property on a nullable object.
If the object is null, the expression evaluates to null instead of throwing a NullPointerException.

nullableVariable?.propertyOrMethod

2. Elvis Operator (?:)
The Elvis operator (?:) provides a way to provide a default value when dealing with nullable expressions.
It checks if the expression to its left is null. If it's not null, it uses that value;
otherwise, it uses the value provided to its right.

nullableExpression ?: defaultValue
*/
class NullSafetyDemo {

    //Non-nullable string
    val nonNullableName: String = "Shivani Hemnani"

    //Nullable String
    var nullableName: String? = null;

    fun demonstrateNullSafety(){

        //use of safe call operator
        val length1: Int? = nullableName?.length;
        println("Length of nullableName using safe call : $length1")

        //use of elvis operator
        val length2: Int = nullableName?.length ?: 0
        println("Length of nullableName using elvis operator : $length2")

        //default string value
        println("hello,  ${nullableName ?: "Guest"}")
    }

    //to update nullable varibale
    fun udpateName(newName: String?){
        nullableName = newName;
        println("Updated nullableName : $nullableName");
    }

}


fun main(){
     val demo = NullSafetyDemo()

    demo.demonstrateNullSafety();

    //update value
    demo.udpateName("Shivani Hemnani")
    demo.demonstrateNullSafety()

}
