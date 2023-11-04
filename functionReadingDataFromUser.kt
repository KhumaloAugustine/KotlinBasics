fun main(){
    val myNumbers = readInputs()
    val sum = sumOfInputs(myNumbers)
    val difference = differenceOfInputs(myNumbers)
    println(" You have entered $myNumbers")
    println("The sum of your numbers is $sum")
    println("The difference of your inputs is $difference")
}

fun readInputs() : List<Double> {

    println("Enter the first numbers of your choice:")
    val num1 = readlnOrNull()?.toDouble() ?: 0.0
    println("Enter second number of your choice:")
    val num2 = readlnOrNull()?.toDouble() ?: 0.0
    println("Enter third number of your choice:")
    val num3 = readlnOrNull()?.toDouble() ?: 0.0
    return listOf(num1, num2, num3)
}

fun sumOfInputs(myNumbers : List<Double>) : Double {
    val num1 = myNumbers[0]
    val num2 = myNumbers[1]
    val num3 = myNumbers[2]
    return num1 + num2 + num3
}

fun differenceOfInputs(myNumbers : List<Double>) : Double {
    val num1 = myNumbers[0]
    val num2 = myNumbers[1]
    val num3 = myNumbers[2]
    return num1 - num2 - num3
}
