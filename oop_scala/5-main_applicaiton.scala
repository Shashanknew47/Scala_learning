// you have to define either 'extends App' or 'main method' to run the module.


object Employee {

    def main(args: Array[String]):Unit = {

        val p1 = new Person("shashank","jains")
        println(p1.full_name())
    }

}



class Person(val first:String,val last:String) {
            def full_name() = {first + " " + last}
        }
