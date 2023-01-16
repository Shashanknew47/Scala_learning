// last of video:12 is pending. prefix and postfix

object MethodNotations extends  App {

    val p1 = new Person("USA")

    p1.callStatename("California")
    // same calling we can do with infix notation. when there is only one parameter
    p1 callStatename "NewMaxico"

    var x = 1 + 3;
    println(x)

    // In Scala all the operators are methods. and could be use like this
    var z = 1.+(2)
    println(z)

    var i = 1.+(3)
    println(i)


// here - is the p1 instance method. in Scala operators could be used as method names too.
    var sal = p1 - 3;   // this is equal to p1.-(3)
    println(sal)

// using custom urinary mehthos;
    println(p1.urinary_!)
    // println(!p1)

}

class Person(val name:String) {
    def callStatename(name:String) = {
        println(f"${this.name} is calling method name $name")

    }

    // operator as method

    def -(salary:Int) = {
        salary * 2
    }

    // urinary infix notation as method
    // urinary only works for + - ~ !
    def urinary_! : String = f"$name, What the hell"



}
