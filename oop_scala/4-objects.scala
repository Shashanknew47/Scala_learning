// Scala objects are like 'class methods in combination of private of Java' or in 'static in Java'.
// They are written Separately from Classes with same class name.
// They are singleton objects. means they will create only the same instance.
// They don't take parameters.
// Combination of object and class is called companions.


object func extends App{

    object Person {
        val increment = .2f

        def rFalse = false;
        // factory method
        def apply(mother:Person,salary:Int) =  {
            new Person("s","j",salary)

        }
    }

    class Person(val first_name:String, val last_name:String, var salary:Int){

        def full_name() = {first_name + " " + last_name}
        def salaryinc = { salary *  Person.increment}

    }

    val p1 = new Person("shashank","Jain",1000)
    val p2 = new Person("Corey","Shafer",100)

    println(p1.full_name)
    println(p1.salary)
    println(p1.salaryinc)

    var intances = p1 == p2
    println(intances)

    val po1 = Person
    val po2 = Person


    // You will notice that po1 and po2 2 objects generated form Person are exactly same.
    var objects = po1 == po2
    println(objects)

    println(po1.rFalse)

    var p3 = po1(p1,100)
    println(p3.first_name)
    println(p3.salary)

}
