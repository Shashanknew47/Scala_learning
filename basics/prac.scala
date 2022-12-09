import scala.annotation.tailrec.apply

object prac extends App{

    def isPrime(i:Int):Boolean = {
        @tailrec
        def helper(i:Int,acc:Int):Boolean = {
            if (i == acc){
                return true
            }

            else if(i % acc == 0){
                return false
            }

            else {
                return helper(i,acc + 1)
            }
        }

        return helper(i,2)

    }

    println(isPrime(7918))


    def Fib(ndex:Int):BigInt = {

        def helper(i:BigInt,j:BigInt,index:Int):BigInt = {
            if (index == ndex) {
                return i + j
            }

            else {
                return helper(j,i+j,index+1)
            }

        } 

        return helper(1,1,3)
    }

    println(Fib(400))
  
  
}

