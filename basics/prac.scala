object prac extends App{

    def Factorial(n:Int):Int = {
        if (n<=1) 1
        else n * Factorial(n-1)
    }

    println(Factorial(5))

    
  
}
