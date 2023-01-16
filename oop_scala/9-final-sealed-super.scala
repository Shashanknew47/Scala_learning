// final variables, methods or class can not be override
// sealed class, variable, method can be override in the same module but not when they are imported


object `6-final-sealed-super` extends  App{
    
    sealed class Animal {
        final val creatureType:String = "wild"

        final def eats = println("Animal eats food")
        def legs = println("Animal have 4 legs")

    }

     class Dog extends Animal {
        // This below statement will raise an error bez creatrueType is a final member
        // ! override val creatureType:String = "domestic"

    }

    final class Person {

        def eyes = println("Person have 2 eyes")
    }

    class Employee {

        def salary(salary:Int) = salary
        // This below is not permitted bez Person variable or methods can not be override bez Person is final
        //! protected def eyes = println("employee have 3 eyes")

    }

    val e1 = new Employee
    println(e1.salary(100))

}
