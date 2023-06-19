
fun main() {
    //This program reverse a string without using any built-in function
    println("Please enter a string: ")
    val str = readlnOrNull()
    var reversedStr = ""

    if (str != null) {
        for (i in (str.length - 1) downTo 0) {
            reversedStr += str[i]
        }
        println("The reverse is: $reversedStr")
    }
    else {
        println("Please enter a valid input.")
    }
}