object OopBasics extends App {
    // whenever you will instantiate the class. whole class block will be executed.
    // bez of that we got 13 in output.
    val person = new Person("Shashank",30)
    println(person)
    println(person.age)
    println(person.full_name("Shashank"))
}
/*
    Here name and age are the constructors of Person class
    but to make correct property of object we need to use
    val prefix.
*/

class Person(name:String,val age:Int) {
    var x:Int = 13;
    var last_name = "Jain";
    println(x);
    def full_name(first_name:String,last_name:String=last_name):String = {
        return first_name + " " + last_name
    }

}
