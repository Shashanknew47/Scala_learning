object Functions extends App {

    def concatFunc(a:String,b:String):String = {a + " " +  b}
    println(concatFunc("Shashank","Jain"));

    var i = 12;

    // In Scala whenever you will run a parameterless function without paranthesies it will run 
    // like a normal function call which is different than normal functional programming.
    def parameterLessFunction():Int = 2 * i;
    var fvalue = parameterLessFunction;
    println(fvalue)
    
    
    // Instead of applying loops always use recursive functionality in Scala
    def threeTimes(s:String,i:Int):String = {
        if(i <= 1) s
        else s + "-" +  threeTimes(s,i-1) 
    }

    var result:String = threeTimes("abc",3)
    println(result)


    // For None return type use Unit (void of Scala) as returtype
    def doubleP(i:Int) : Unit = {println(i*2)}
    doubleP(4)

    // Nested Functions

    def OuterFunc(n:Int) : Int = {
        var v:Int = 10;
        def innerFunc(a:Int,b:Int): Int = a + b + v 

        innerFunc(n,n-1)
    }

    println(OuterFunc(5))
    

}