//object Vehicle extends App {
//  val res = new VehicleCar
//  res.move
//  res.move
//  res.move
//  res.refuel
//  res.move
//}
// class vehicleCar which contain all methods
class VehicleCar {
  private val capacity = 50
  var fuel = 50
// move method used to move the vehicle, when vehicle has sufficient fuel
  def move(): String = {
    if (fuel >= 20) {
      fuel -= 20
      s"Vehicle is moving current fuel is : $fuel"

    } else
      s"Not enough fuel to move refuel it current fuel is : $fuel"
  }
// refuel method is used to check if fuel is less than refuel it and return the remaining fuel
  def refuel(): Int = {
    if (fuel <= 10) {
      fuel += capacity - fuel
    }
    fuel
  }
}