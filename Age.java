import java.util.Scanner;
class Person{
  int age;
  static int year=2023;
  String name,gender;
  int bYear;
  Person(int a,String n,String g){
    name=n;
    age=a;
    gender=g;
    
  }

  void Birthdate(){
    bYear=year-age;
    display();
  }
  void display(){
    System.out.println("Name of the person is "+name+" and gender is "+gender+" and his age is "+age+" born in the year "+bYear);
  }
}

class PersonEx{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the name of the person");
    String n=s.nextLine();
    System.out.println("Enter the gender of the person");
    String g=s.nextLine();
    System.out.println("Enter the age of the person");
    int a=s.nextInt();
    Person obj=new Person(a,n,g);
    obj.Birthdate();
  }
}