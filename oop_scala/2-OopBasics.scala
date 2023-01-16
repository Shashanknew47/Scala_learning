object OopBasics extends App {

    val person = new Person("Shashank",30)
    person.greeting("Stephan")
    person.greeting()
    person.apply()

    //calling apply with without its name. that's the default behavior in Scala.
    // that apply could be called without calling it directly.
    person()

}
/*
  !here this act just like js
  ! 2 greeting methods are example of method overloading here
*/

class Person(name:String,val age:Int) {

    def greeting(name:String):Unit = println(s"$name says, hello ${this.name}.")
    def greeting():Unit = println(f"hi $name")

  // apply is special method name, which will be called without calling it's name by instance.

    def apply():Unit = println("applying for the new job")

}
