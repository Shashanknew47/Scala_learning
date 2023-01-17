object ObjectDataType extends App {
    //Abstract class don't get instantiated
    // we provide values and core methods in subclass of abstract class

    // trait are like abstract class but they can be extended with abstract class as well as with
    // one or more traits.

    // Abstract classes and trait both have can abstract and non-abstract type


    // * Abstract vs trait
    // Abstract class can have only 1 inheritance where as trait can more than one inheritance.
    // Abstract class can have constructor parameters where trait can not have constructors
    // trait = behavior | abstract class = thing

    abstract class Animal {
        val creatureType :String
        def eat : Unit
        def eyes =  println("Animal have 2 eyes")
    }

    class Dog extends Animal {
        val creatureType:String = "Canine"
        def eat: Unit = println("crunch crunch")

    }

    trait Carnivore {
        def eat (animal:Animal):Unit
    }

    trait Coldblooded {
        def cold :Unit
        def hibernation = println("they can go in hibernaiton too")
    }

    class Crocodile extends Animal with Carnivore with Coldblooded {
        val creatureType:String = "croc"
        def eat: Unit = println("nonnom")
        def eat(animal:Animal):Unit = println(s"Animal is ${creatureType}")

        def cold:Unit = println("Corcs can live in extreme cold too")

    }

    var c1 = new Crocodile
    c1.eat
    c1.cold
    c1.eyes
    c1.hibernation








}