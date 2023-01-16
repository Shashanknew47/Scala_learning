object prac extends  App {

    class Animal {
        val creatureType = "wild"
        protected  def eat = println("nomnom")
    }

    class Dog(override val creatureType)




}