import kotlin.math.max

fun main(){
    var car =Car("kf24","benz","grey",256)
    println(car.make)
    println(car.capacity)
    println(car.model)
    car.carryPeople(200)
    car.carryPeople(300)
    car.identity()
    println(car.parking(12))
  var bus=Bus("kdd56","matatu","black",56)
    println(bus.matrixfare(56.9))
    println(bus.parking(16))
    var animal=Animal("Sammy",33)
    println(animal.makeSound())

    var dog = Dog("kaa",1,"kejud")
    dog.makeSound()



}

//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy” (1 point)
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20 (1 point)


open class Car(var make:String,var model:String, var color:String,var capacity:Int){
    fun carryPeople(people:Int){
        var x =people-capacity
        if (people<=capacity) {
            println("Carrying $people passangers")
        }
        else{
            println("Over capacity by $x people")
        }


    }
    fun identity(){
        println("I am a $color $model $make")

    }
  open  fun parking(hours:Int):Int{
        var y =hours*20
        return y
    }

}

//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
 class Bus( make:String, model:String, color:String,capacity:Int):Car( make, model,color,capacity){
     fun matrixfare(fare:Double):Double{
       return  fare * capacity

     }


//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus (3 points)
//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
//and call each of the functions on the objects.
    override fun parking(hours: Int): Int {
        return hours*capacity
    }
}

 open class Animal(val name: String, val age: Int) {
    open fun makeSound() {
        println("The animal makes a sound")
    }
}

class Dog(name: String, age: Int, var breed: String) :Animal( name, age){
    override fun makeSound() {
        println("The dog barks")
    }
}














