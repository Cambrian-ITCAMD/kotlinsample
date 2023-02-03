fun main() {
    println("Hello World!")
    //int myInt = 5
    //Kotlin has datatype, but defines variables with var and val
    var myInt = 5
    val myChar = "sugar"
    var myDouble : Double = 3.14
    println(myInt)
    println(myDouble)
    println(myChar)

    var num1 : Int
    var num2 : Int
    println("Enter the first number")
    num1 = readln().toInt()
    println("Enter the second number")
    num2 = readln().toInt()
    var result = num1 * num2
    println("My new int: " + result)
    //println("My new int is $myNewInt")
    var myBool = true
    if (myBool) {
        println("Must be heads")
    }
    else if (!myBool) {
        println("Guess it's tails")
    }
    else {
        println("The coin landed on its side")
    }
    //This is hw switch is done in Kotlin
    when(result % 2 ){
        0 -> {
            println("even")
        }
        1 -> println("odd")
        else -> println("Quantum")
    }
    for (i in 1..10){
        println(i)
    }
    /*for (i in 0..9){
        for(j in 0..9){
            if (j==5){
                break
            }
            println(i.toString() + " | " + j)
        }
    }
    */
    var myCounter = 0
    while (myCounter < 10){
        println("My counter: " + myCounter)
        ++myCounter
    }
    var array = arrayOf("water", "fire", "sand")
    println("The pillars of life are...")
    for (item in array) {
        println(item)
    }
}