/*
To make Recursion work effectively you would need to use this tail recursive approach
As per this approach we don't use a stack memory as there is no relation in prior outputs 
to the new output.
*/


object Recursion extends App {
    def factorial(i:Int, acc:BigInt = 1):BigInt = {

        if (i <= 1) {
            return acc
        }

        else {
              factorial(i - 1, acc * i)
        }
    }


    println(factorial(40))

    var a:String = "abc";
    println(a*2);

     def isPrime(n:Int):Boolean = {
        def isPrimeTail(t:Int,isStillPrime:Boolean):Boolean = 
            if (!isStillPrime) false
            else if(t <=1) true
            else isPrimeTail(t-1, n%t !=0 && isStillPrime)

        isPrimeTail(n-1,true)
    }

    println(isPrime(97))

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

    println(Fib(8))

    
}