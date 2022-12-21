// class by name parameter we use when don't want to hardcore the value. T
// we use call by name instead of using variable declation x:Long (which is call by value) we will declare it x: => Long


object CBVCBN extends App {
    def callByvalue(x:Long):Unit = {
        println("by value " + x)
        println("by value " + x)
    }

    def callByName(x: =>Long):Unit = {
        println("by name " + x)
        println("by name" + x)
    }

    // In by val which is by default. First System.nanoTime() will result into a value then will be passed
    callByvalue(System.nanoTime())

    println("================================")

    // In by name System.nanoTime() will be passed directly.
    callByName(System.nanoTime())



    def infinite():Int = 1 + infinite() // Call of this function will raise an error
    def PrintFirst(x:Int,y: => Int):Unit = {
        print(x);
    }
    PrintFirst(33,infinite())  // This operation does not raise error bez call by name. here we never evaluated infinite()
    println("================================")
    // PrintFirst(infinite(),33) 

}


