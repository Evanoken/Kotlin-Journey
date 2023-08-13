// kotlin extension functions
fun main(){
//    val name = readLine()
//    println("hey there am $name")
    println("Please enter a number?")
    val input = readLine()?.toInt()

    if (input != null){
       if( input.isPrime()){
           println("$input is a prime number")
       }
        else{
            println("$input is not a prime number")
       }
    }

}

fun Int.isPrime(): Boolean{
    for(i in 2 until this-1){
        if(this % i ==0){
            return false
        }
    }
    return true

}
