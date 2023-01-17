object `11-case-classes` extends App {

    // - 1 In case class we don't need to val in constructor to make them class fields.
    /* - 2
     Case class provide a awesome string representation something like data class in Python
     Ex. if you will print a instance of case class it will print It's class name name and
     arguments in parenthesis */
     // -3 case class provide equal and hash code are implemented out of the box
     // -4 case class have copy method
     // -5 case class have companion objects
     // -6 case classes are serializable which makes them good fit for       distributed framework like Spark.
     // -7 Case class can be used in pattern matching


    case class Person(name:String,age:Int)

    val jim = new Person ("Jim",34)
    println(jim)

    val newjim = new Person("Jim",34)

    // equal and hash code are implemented out of the box
    val t = jim == newjim
    println(t)

    // -4 case class have copy method
    val j = jim.copy(age = 45)
    println(j)

    // -5 case class have companion objects
    val theperson = Person
    val mary = Person("mary",45)  // here we have created a new Person instance with the help of companion

    // There can be Case objects also like case classes. They have same properties like case classes only difference is they can't be companion as they are itself companion.

    case object UnitedKingdom {
        def name: String = "The England is in UK"
    }






}
