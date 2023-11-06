import java.util.*

fun main() {
    val random = Random().nextInt(50) +1

    val result = when(random) {
        in 1..10 -> " lies between 1 and 10"
        in 11..20 -> "lies between 11 and 20"
        in 21..30 -> "lies between 21 and 30"
        in 31..40 -> "lies between 31 and 40"
        else -> {
            "is above 40"
        }
    }
    println("The generated random number is $random, and it $result ")
}