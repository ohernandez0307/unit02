fun main() {
    println("Input number of friends user has:  ")
    var friendsCount = readln()!!.toInt()
    if (friendsCount >= 500)
        println("Adopt a Dog Today!")
    else {
        println("Buy Cat Food at 20% Off.")
    }

}