// Ceiling of a number

import java.util.Scanner;

public class BSP1
  {
    public static void main(String[] args)
     {
      int c =0;
      int[] arr = {2,3,4,5,6,9,11,27};
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the target");
      int a = sc.nextInt();
      int s = 0, e=arr.length-1;
      while(s<=e)
      {
        int m =( s+e)/2;
        if(arr[m]==a)
        {
          c= arr[m];
          break;
        }
        if(arr[m]>a )
        {
          if(arr[m-1]<a)
          {
            c=arr[m];
            break;
          }
          else
          {
            e = m-1;

          }
        }
        else
        {
          if(arr[m+1]>a)
          {
            c = arr[m+1];
            break;
          }
          else
          {
            s=m+1;
          }

        }
      }
      System.out.println(c);
      sc.close();
    }
  }

   