// functions in Kotlin starts with "fun". "fun main() {}" is used to display on screen like in C#
fun main(){
    var num1 : Int
    var num2 : Int
    println("Enter the first number")
    num1 = readln().toInt()
    println("Enter the second number")
    num2 = readln().toInt()
    if(mod(num1,num2) == 1){
        println("odd number")
    }
    else{
        println("even number")
    }
    println(mod(num1, num2))
    println("but the sum of the first and second numbers is " + sum(num1, num2)) 
    println("and the result of the division is " + div(num1, num2).toFloat())
    
}

fun sum(a: Int, b: Int): Int{
    return a + b
}
fun mod(a: Int, b: Int): Int {
    return a % b
}
fun div(a: Int, b: Int): Int{
    return a / b
}