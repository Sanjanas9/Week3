
class Append{
  public static void main(String args[]){
    
    int arr[] = {43,23,5,99,78,89};
      int n = arr.length;
    int [] a= new int[((n+1)%2)];
    int [] b= new int [n-a.length];
      for (int i = 0; i < n; i++)
        {
            if (i < a.length) {
                a[i] = arr[i];
            }
            else {
                b[i - a.length] = arr[i];
            }
        }
 System.out.print("b[i-a.length] + a[i]);
  
                  } 
  }
