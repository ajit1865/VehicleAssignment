import org.scalatest.flatspec.AnyFlatSpec

class VehicleCarTest extends AnyFlatSpec {

  // creating object of VehicleCar class

  val objOfVehicle = new VehicleCar()
  // checking the first condition to fuel capacity
  it should "move the vehicle and consume the fuel" in {
    objOfVehicle.move()
    assert(objOfVehicle.fuel == 30)
    objOfVehicle.move()
    assert(objOfVehicle.fuel == 10)
    assert(objOfVehicle.move() == s"Not enough fuel to move refuel it current fuel is : ${objOfVehicle.fuel}")
  }
  // checking fuel capacity to refill that
  it should "refill the vehicle and fill the fuel in vehicle" in {
    objOfVehicle.refuel()
    assert(objOfVehicle.fuel == 50)
    objOfVehicle.move()
    assert(objOfVehicle.fuel == 30)
  }
}
