object OopBasics extends App {

    val person = new Person("Shashank",30)
    person.greeting("Stephan")
   
}
/*
  here this act just like js
*/

class Person(name:String,val age:Int) {
  
    def greeting(name:String):Unit = println(s"$name says, hello ${this.name}.")

}
