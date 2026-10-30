/*  ARRAY
fun main(){
   val rockPlanets= arrayOf<String>("Earth","Mars","Mercury","venus")
   val gaspPlanet= arrayOf("Jupiter","saturn","uranus","neptune")
   val solarSystem=rockPlanets+gaspPlanet // ye ek new array ban gya jisme dono array k value honge ek sth
   solarSystem[3]="Little Earth"
  println(solarSystem[0])
   println(solarSystem[1])
   println(solarSystem[2])
   println(solarSystem[3])
   println(solarSystem[4])
   println(solarSystem[5])
   println(solarSystem[6])
   println(solarSystem[7])

}
 */


/*
// LIST
fun main(){
val solarSystem= listOf("Mercury","Venus","Jupiter","Earth","Mars")
println(solarSystem.size) // .size ek property hai jo batati hai ki size kitna hai list ka
    println(solarSystem[2]) // subscript syntax
    print(solarSystem.get(3)) // .get method se bhi  nikal skte hai
    println(solarSystem.indexOf("Mercury")) // .indexof method se index search kr skte hai
    println(solarSystem.indexOf("Mars"))

    for(planet in solarSystem){
        println(planet)
    }
}
*/


/*
//MutableList
fun main() {
    val solarSystem = mutableListOf("merucry", "venus", "earth","mars")
    solarSystem.add("pluto") // ye single parameter hai h ye element  ko last me jodta hai list k
    solarSystem.add(3,"jupiter") //Index 3 par "jupiter" ko zabardasti daal dega, aur baaki aage khisak jayenge
 // update k liye
    solarSystem[4]="little earth"

    // remove k liye do hote hai ek .removeAt(index) and dusra .remove(element name) dono se remove kr skte hai
    solarSystem.removeAt(0)

    //the contains() method that returns a Boolean if an element exists in a list.
    println(solarSystem.contains("pluto"))

    println(solarSystem)


}
 */

/*
// Set
fun main(){
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem.add("Pluto")
    println(solarSystem.size) // Output: 9 (Size badh gaya)

    println(solarSystem.contains("Pluto")) // Output: false
}
 */

// MAP
fun main(){
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
    solarSystem["Pluto"] = 5
    println(solarSystem.size) // Output: 9 (Naya pair jud gaya)
    println(solarSystem["Theia"]) // Output: null (Kyunki Theia map me nahi hai)

}