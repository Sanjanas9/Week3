class Vehicle{
  String make, model;
}

class Car extends Vehicle{
  int num_doors;
}

class SportsCar extends Car{
  int top_speed;

  void rev_engine(){
    System.out.println("-----Vrooom!-----");
  }
}

class Vehicle22{
public static void main(String args[]){
  SportsCar s=new SportsCar();
  s.make="Z1";
  s.model="Supra";
  s.num_doors=2;
  s.top_speed=360;
  s.rev_engine();
}
}