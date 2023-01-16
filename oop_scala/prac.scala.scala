
object prac extends App {


    val e1:Writer = new Writer("Shashank","Jain",1975)
    println(e1.full_name())

    val n1:Novel = new Novel("Revolution",2020,e1)
    println(n1.release_year)

    val n2:Novel = n1.new_year_release()
    println(n2.release_year)

    print(n1.author_age())

    

}


class Writer(val first_name:String, val last_name:String,  val year:Int) {
    def full_name() = f"$first_name $last_name"
}

class Novel(val name:String,val release_year:Int, val author:Writer) {

    import java.time._
    val cDate = LocalDate.now
    val cYear = cDate.getYear



    def author_age():Int = release_year - author.year
    def isWrittenby():String = author.full_name()
    def new_year_release():Novel = {
        new Novel(name,cYear,author)
    }

}


class Counter(val value:Int) {
    def curr_value() = value;

    def inc()= {
        new Counter(value + 1)
    }

    def dec() = {
        new Counter(value - 1)
    }

    def inc(i:Int) = {

    }

}
