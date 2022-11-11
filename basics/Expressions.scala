
object Expressions extends App {

    // all things remains same like Python numeric operator expressions including a += 1
    // && , || just like Js or Java
    
    // In Scala everthing is an expression. like if statment and all ex.
    var g = 65;
    val grade:String = if( g > 60)  "Good" else "bad"
    println(grade)

    // Unit = () is like a void in java. As everything is returned a unit 
     // Do not write loop in this way in Java we will learn later how to do. this kind of loop gives side effects in Scala
    
    var u_val =   while (g < 68) {
                                 g += 1
                                println(g)
                                }
        
    println(u_val)

  
}
