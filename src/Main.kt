fun main() {
//    print("Enter text: ")
//    var input = kotlin.io.readlnOrNull()
//    print("You entered: $input")
 var running = true

    while (running){
        try {
            print("what would you like to do? add sub mult divi end ")
            var input = readlnOrNull()
            if (input.equals("add")){
                println("what do you want to add? ")
                var num1 = readln().toLong()
                var num2 = readln().toLong()
                addNum(num1,num2)
            }
            if (input.equals("sub")){
                println("what do you want to sub? ")
                var num1 = readln().toLong()
                var num2 = readln().toLong()
                subNum(num1,num2)
            }
            if (input.equals("mult")){
                println("what do you want to mult? ")
                var num1 = readln().toLong()
                var num2 = readln().toLong()
                multNum(num1,num2)
            }
            if (input.equals("divi")){
                println("what do you want to divi? ")
                var num1 = readln().toLong()
                var num2 = readln().toLong()
                diviNum(num1,num2)
            }
            if (input.equals("end")){
                running = false
            }
        }catch (e:Exception){
            println(e)
        }
    }
    println("bye")

}

fun addNum(num1:Long,num2:Long) {
    val res = num1 + num2
    println(res)
}

fun subNum(num1:Long,num2:Long) {
    val res = num1 - num2
    println(res)
}
fun multNum(num1:Long,num2:Long) {
    val res = num1 * num2
    println(res)
}
fun diviNum(num1:Long,num2:Long) {
    val res = num1 / num2
    println(res)
}
