fun main() {
   println(getEven(listOf("Marie","Louise","Geraldine","Divine","Valentin","Olive","Kevine","Stiven","Isaac","Daniel")))
    var personHeight=averageTotal(listOf(1.6,5.777,8.66,3.566,))
    println(personHeight.average)
    println(personHeight.total)
    var person= mutableListOf(
        Person("Geraldine",20,7,89.7),
        Person("Olive",32,2,67.3),
        Person("Steven",17,5,34.5)
    )
    getPerson(person)
    var people= mutableListOf(
        Person("Geraldine",20,7,89.7),
        Person("Olive",32,2,67.3),
        Person("Steven",17,5,34.5)
    )
    human(people)

var carsList= listOf(
    Car("RC34567",677,),
    Car("RW56766",765)
)
    println(car(carsList))


}
fun getEven(people:List<String>):List<String>{
    var a= mutableListOf<String>()
    for (person in people)
        if (people.indexOf(person)%2==0){
            a.add(person)
        }
    return a

}
data class peopleAvgHeight(var average:Double ,var total:Double)
fun averageTotal(height:List<Double>): peopleAvgHeight{
    var  sum=height.sum()
    var avr=height.average()
    var averagesum=peopleAvgHeight(average =avr,total = sum)
    return averagesum

}
data class Person(var name:String,var age:Int,var height:Int,var weight:Double)
fun getPerson(people: List<Person>){


    var descendingAge=people.sortedByDescending { people->people.age}
    println(descendingAge)

}
fun human(person:MutableList<Person>){
    person.addAll(listOf(
        Person("Mary",39,24,34.5)
    ))
    println(person)
}
data class Car(var registration:String,var mileage:Int)
fun car(cars:List<Car>):Double{
    var totalMilleage=0.0
    cars.forEach{ car->
        totalMilleage+=car.mileage
    }
    var avg=totalMilleage/cars.count()
    return  avg

}







