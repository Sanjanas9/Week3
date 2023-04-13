class Person{
  String name;
  int age;
}

class Employee extends Person{
  int salary;
  String position;
}

class Manager{
  int num_reports;

  void hire_Employee(){
    num_reports++;
  }
}

class Engineer{
  String specialization;

  void solve_Problem(){
    System.out.println("Problem solved");
  }
}

class Hybrid{
  public static void main(String args[]){
    Engineer e=new Engineer();
    e.solve_Problem();
  }
}