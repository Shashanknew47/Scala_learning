// We use override when we use a parent and have to override variable value or method
// a variable could be override directly or in a constructor.

object `5-inheritance_override` extends App {

    class Animal {
        val creatureType:String = "wild"

        def eats = println("Animal eats food")
        def legs = println("Animal have 4 legs")

    }

    class Dog extends Animal {
        // to override a variable it must val not the var
        override val creatureType:String = "domestic"

    }

    val dog:Dog = new Dog()
    println(dog.creatureType)

    class Snake extends Animal {
        override def legs = println("snake don't have legs")
    }

    val snake = new Snake()
    snake.legs

    // override creaturetype variable in constructor
    class Human(override val creatureType:String)extends Animal {
        override def legs = println("humans have 2 legs")
    }

    val human = new Human("human")
    println(human.creatureType)

    


}
