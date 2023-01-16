// * https://aws.plainenglish.io/simple-tutorial-for-handling-date-and-time-in-scala-apache-spark-481d1e49763d


object date_time extends App {

import java.time._
    //Get current Date
    val cDate = LocalDate.now
    // Get Current Time
    val cTime = LocalTime.now
    // Get Current Date and Time
    val cDateTime = LocalDateTime.now
    // Get Current UTC Date and time
    val cUTCTime = Instant.now
    // Get Date Time with Time Zone information
    val cDateTimeWithZone = ZonedDateTime.now

println(cDateTime)
println(cDateTime.getYear)

// Split the Date into Year, Month and Day
val cDate = LocalDate.now
val cMonth = cDate.getMonthValue()
val cYear = cDate.getYear()
val cDay = cDate.getDayOfMonth()


// Split the Time into Hour, Min, Sec
val cTime = LocalTime.now
val cHour = cTime.getHour()
val cMin = cTime.getMinute()
val cSec = cTime.getSecond()

// Convert String to Date
val strDate = "2021-05-13"
val dt = LocalDate.parse(strDate)
// Get data type
strDate.getClass
// Get data type
dt.getClass


// Convert Day to Epoch
LocalDate.now.toEpochDay()
//DateTime to EpochMilli
Instant.now.toEpochMilli()
//DateTime to EpochSecond
Instant.now.toEpochMilli()/1000


// Using ChronoUnit .between will return the absolute difference between the two dates. See the example below.
import java.time.temporal.ChronoUnit._

val dt1 = LocalDate.parse("2021-05-13")
val dt2 = LocalDate.parse("2020-04-01")
val years: Long  = YEARS.between(dt1, dt2)
val years: Long  = YEARS.between(dt2, dt1)
val months: Long = MONTHS.between(dt1, dt2)
val months: Long = MONTHS.between(dt2, dt1)
val days: Long   = DAYS.between(dt1, dt2)
val days: Long   = DAYS.between(dt2, dt1)


//Using Period.between, will give compare the Year to Year or Month to Month or Day to Day and return the difference.
import java.time.Period
val dt1 = LocalDate.parse("2021-05-13")
val dt2 = LocalDate.parse("2020-04-01")
val diff = Period.between(dt1, dt2)
diff.getYears
diff.getMonths
diff.getDays
// 2020 - 2021 = -1
// 04 - 05 = -1
// 01 - 13 = -12



//How to Change the date format in Scala
import java.time.format.DateTimeFormatter
// Convert Date to BASIC_ISO_DATE
val f = DateTimeFormatter.BASIC_ISO_DATE
f.format(LocalDate.now) // 20210513
val f = DateTimeFormatter.ofPattern("MM/dd/yyyy")
f.format(LocalDate.now)
val f = DateTimeFormatter.ofPattern("dd-MM-yyyy")
f.format(LocalDate.now)



//How to build Date Object from Constants
// Date object from constants
val newDt = LocalDate.of(2021,5,10)
// Datetime object from constants
val newDttime = LocalDateTime.of(2021,5,10,14,30,49)
// Datetime from variables
val anotherDttime = LocalDateTime.of(LocalDate.now, LocalTime.of(3,59))
val zdt = ZonedDateTime.of(
    LocalDate.now,
    LocalTime.now,
    ZoneId.of("Asia/Calcutta")
)


// How to loop through two dates in Scala
val dt1 = LocalDate.parse("2021-05-01")
val dt2 = LocalDate.parse("2021-05-07")
val dateRange = Iterator.iterate(dt1) { _.plusDays(1) }.takeWhile(_.isBefore(dt2))
while(dateRange.hasNext){
    val dt = dateRange.next
    val yy = dt.getYear()
    val mm = dt.getMonthValue()
    val dd = dt.getDayOfMonth()
println(s" Parsing ${yy} - ${mm} - ${dd} now")
}





















}
