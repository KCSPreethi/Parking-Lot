import location.Stadium

enum class VehicleType{
    motorcycle,car,bus
}
fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    val stadium= Stadium()


    println("Program arguments: ${args.joinToString()}")
}