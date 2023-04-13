class Vehicle{
  int year;
  String make,model;
  
}

class Car extends Vehicle{
  String colour;
  int num_doors;
  void get_info(){
    System.out.println("The make of the vehicle is "+make);
    System.out.println("The manufatured year of the vehicle "+year);
    System.out.println("The model of the vehicle "+model);   
    System.out.println("The colour of the car is "+colour);
    System.out.println("The number of doors in the Car is "+num_doors);
  }
}

class VehicleDetails{
  public static void main(String args[]){
    Car obj=new Car();
    obj.make="Benz";
    obj.model="m1";
    obj.year=2020;
    obj.colour="White";
    obj.num_doors=4;
    obj.get_info();
  }
}