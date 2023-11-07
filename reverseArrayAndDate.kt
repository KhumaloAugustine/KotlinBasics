import java.util.*

fun main(){
    val numbers = listOf(0,1,2,3,4,5,6,7,8,9,10)
    println("Today's date: " + getCurrentDate())
    println("Here is the reversed list: " + reverseList(numbers))
}

fun getCurrentDate(): Date {
    return Date()
}

fun reverseList(list: List<Int>): List<Int>{
    val result = arrayListOf<Int>()
    for(num in 0..list.size-1){
        result.add(list.get(list.size-1-num))
    }
    return result
}