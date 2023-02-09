fun main(args: Array<String>) {
    println("Please enter the number of cookies eaten: ")
    var numOfCookies = readln()!!.toInt()

    //each cookie is 75 calories (300/4 = 75)

    var numCalories = ((numOfCookies *300)/4)
    println("Your calorie intake was: $numCalories calories.")
    //therefore if they eat 40 cookies then they have consumed 3000 calories
}