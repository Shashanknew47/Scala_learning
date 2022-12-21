// Java specific functions in Scala
// str.substring(6,11)
// str.charAt()
//str.startsWith()
//str.replace(" ", "-")
// str.toLowercase()
// str.toUppercase()
// str.length

// Scala specific string functions 
// toint 
// reverse



object stringOps extends App {
    val str:String = "Hello, World";
    println(str.substring(7));
    println(str.split(" ").toList);
    

    //Scala specific string functions.
    var snumber:String = "45";
    var nnumber:Int = snumber.toInt;  // String to number conversion
    println(nnumber)

    println("a " + snumber + " concatination")
    println(str.reverse) 

    // s-interpolators 
    val name = "Shashank"
    println(s"My name is ${name.toUpperCase()} and age is $nnumber")

    //f-interpolators
    val speed = 121.25f
    println(f"speed of ${name.substring(0,3)} car is $speed%.4f ")


    //raw-interpolators => They do not escape special character directly
    println(raw"this is the new line \n and then this happens.");
    // In case you will pass a string inside raw interpolators then they will escape
    var myName = "Shashank \n Jain"
    println(raw"name is $myName")    

}



