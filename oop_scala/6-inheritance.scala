// private method or variables can be used within the class
// protected methods can be used only main class and subclasses.


object `3-inheritance` extends App {

    class Animal() {
        def eat = println(f"animal eat food ")
        // private method or variables can be used within the class
        private var num_legs = 4
        def num_of_legs() = println(f"animals have $num_legs legs ")

        // protected methods can be used only main class and subclasses.
        protected def num_of_eyes(name:String) = println(f"$name have 2 eyes")


    }

    class Cat extends Animal

    var cat = new Cat()
    cat.eat
    cat.num_of_legs()


    class Dog extends Animal {
        def eyes = {num_of_eyes("dog")}
    }

    var dog = new Dog()
    dog.eyes



}
