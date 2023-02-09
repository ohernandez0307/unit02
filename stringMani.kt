fun main() {
    println("Please enter the name of your favorite city: ")

    val city: String = readLine()!!

    println("Number of characters is: ${city.length}")

    println(city.uppercase())

    println(city.lowercase())

    println(city.first())

}
