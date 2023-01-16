
// in inheritance constructors first parent class get called so with parent class name you need
// to varify their parameter too in child class defination.

// If you want to change or override the parent method then use 'override'


object constuctors extends App {

    class Animal(var name:String) {
        creatureType =  "wild"
        def legs = println(f"$name have 4 legs")
    }

    // in inheritance constructors first parent class get called so with parent class name you need
    // to varify their parameter too in child class defination.

    class Cat(name:String) extends Animal(name) {
            def vareity = println("cat comes in 2 vareity big and small")

    }

    var cat = new Cat("cat")

    cat.legs
    cat.vareity

    class Human(name:String) extends  Animal(name) {
        // If you want to change or overide the parent method then use 'override'
        override def legs: Unit = println(f"$name have 2 legs")
    }

    var h = new Human("human")
    h.legs

    class Person {
        def run = println("person can run")

    }

    class Employee(val name:String) extends Person {
        override def run = println(f"hi $name")
    }

    var e1 = new Employee("Shashank")
    e1.run


}