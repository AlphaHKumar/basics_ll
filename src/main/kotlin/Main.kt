import java.lang.Math.pow
import java.util.*
import kotlin.math.pow
import kotlin.math.roundToInt

fun main(/*args: Array<String>*/) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")

    val inputTaker = Scanner(System.`in`)
    print("Enter a number of your choice : ")
    val userInputNumber = inputTaker.nextInt()
    var k = userInputNumber
    var sum = 0
    var product = 1
    var rem : Int
    while(k > 0){
        rem = k % 10
        sum += rem
        product *= rem
        k /= 10
    }
    println("The number you have given as input is $userInputNumber, the sum and product of it's digits are $sum and $product respectively")

    var evenSum = 0
    var oddSum = 0
    var isEven = false
    k = userInputNumber
    while (k>0){
        rem = k%10
        when {
            isEven -> evenSum += rem
            !isEven -> oddSum += rem
        }
        isEven = !isEven
        k /= 10
    }
    println("The sum of even position digits is $evenSum and odd position digits is $oddSum")

    var sqSum = 0.0
    var cubeSum = 0.0
    k = userInputNumber
    while(k > 0){
        rem = k % 10
        sqSum += rem.toDouble().pow(2.0)
        cubeSum += rem.toDouble().pow(3.0)
        k /= 10
    }
    println("The number you have given as input is $userInputNumber, the square sum and cube sum of it's digits are " +
            "$sqSum " + "and $cubeSum respectively")

    var evenDSum = 0
    var oddDSum = 0
    k = userInputNumber
    while (k>0){
        rem = k%10
        when {
            rem%2 == 0 -> evenDSum += rem
            rem%2 == 1 -> oddDSum += rem
        }
        k /= 10
    }
    println("The sum of even digits is $evenDSum and odd digits is $oddDSum")

    var reverseOfK = 0
    k = userInputNumber
    while (k>0){
        rem = k%10
        reverseOfK = reverseOfK*10 + rem
        k /= 10
    }
    if (reverseOfK == userInputNumber)
        println("You entered a palindrome number")

    var armstrongSum = 0
    k = userInputNumber
    while (k>0){
        rem = k%10
        armstrongSum = (armstrongSum.toDouble() + rem.toDouble().pow(3.0)).roundToInt()
        k /= 10
    }
    if (armstrongSum == userInputNumber)
        println("You entered an Armstrong number")

    var divider = userInputNumber/2
    var count = 0
    while(divider>0){
        if (userInputNumber%divider == 0) {
            count += 1
            println("Factor number $count : $divider")
        }
        divider -= 1
    }
    println("Total number of factors is $count")
}