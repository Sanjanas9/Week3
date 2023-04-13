import java.util.Scanner;
class Prog1{
  Scanner s=new Scanner(System.in);
  int arr[]={23,45,66,54,53,68,92};
  public void Prob(){
  System.out.println("Enter a number");
  int num=s.nextInt();
   for(int i=0;i<num;i++){
     int temp=arr[0];
     for(int j=0;j<arr.length-1;j++){
     arr[j]=arr[j+1];
     }
     arr[arr.length-1]=temp;
   }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+ " ");
    }
  
}
public static void main(String args[]){
  Prog1 obj=new Prog1();
  
  obj.Prob();
}
}