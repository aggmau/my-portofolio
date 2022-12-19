/*
Polymorphism

Vehicles can be classified according to what energy source powers them.
The program you are given has 3 vehicle classes: Vehicle, ElectricVehicle and HybridVehicle.
ElectricVehicle and HybridVehicle classes are inherited from Vehicle class.
Complete the program by reimplementing method resource() in inherited classes, so that the given calls work correctly.
*/

class Main {
   public static void main(String[] args) {
       
       Vehicle vehicle = new Vehicle();
       Vehicle electric = new ElectricVehicle();
       Vehicle hybrid = new HybridVehicle();
       
       //calls
       vehicle.start();
       vehicle.resource();
       electric.start();
       electric.resource();
       hybrid.start();
       hybrid.resource();
   }
}
class Vehicle{
    public void start(){
        System.out.println("Starting");
    }
    public void resource(){
        System.out.println("I use petrol");
    }
}

class ElectricVehicle extends Vehicle{
    /*reimplement resource() method 
    to output "I use electricity"*/
    public void resource(){
        System.out.println("I use electricity");
    }
}

class HybridVehicle extends Vehicle{
    /*reimplement resource() method 
    to output "I use both petrol and electricity"*/
    public void resource(){
        System.out.println("I use both petrol and electricity");
    }
}
