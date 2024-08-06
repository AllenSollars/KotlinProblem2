fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    val result = firstNumber + secondNumber
    val anotherResult = add(firstNumber, thirdNumber)
    val answer = subtract(firstNumber, secondNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println("$firstNumber + $secondNumber = $answer")
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
return firstNumber - secondNumber
}

fun add(firstNumber: Int, thirdNumber: Int): Int {
return firstNumber + thirdNumber
}
