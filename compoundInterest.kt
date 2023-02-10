fun main(args: Array<String>) {

    println("Enter the principal amount: ")
    val principleAmount = readln()!!.toInt()

    println("Enter the annual interest rate: ")
    val interestRate = readln()!!.toInt()

    println("Enter the number of times per year the interest is compounded: ")
    val numberOfYears = readln()!!.toInt()

    println("Enter the amount of years: ")
    val timeInYears = readln()!!.toInt()

    val compoundInterest = principleAmount * Math.pow((1 + interestRate.toDouble() / 100.0 / numberOfYears.toDouble()), numberOfYears.toDouble() * timeInYears)

    println("Amount earned: $$compoundInterest")

}