/*Write a program to print the multiplication table of any number entered by the user.

Check whether a number is prime or not.

Reverse a given number without using string conversion.

Find the sum of digits of a number (e.g., 123 → 6).

Check whether a string is a palindrome.

Print the Fibonacci series up to n terms.

Find the largest and smallest numbers in an array.

Count how many vowels and consonants are in a string.




import java.util.Scanner;

public class Pg {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = o.nextInt();

        // declare i and r properly
        int i;

        for (i = 1; i <= 10; i++) {  
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
    
import java.util.Scanner;

public class j{
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=ob.nextInt();
        int i;
        int flag=0;
        for(i=2;i<=num/2;i++){
            if(num%i!=0){
                flag=0;
            }
            else{
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("not a prime number");
        }
        else{
             System.out.print(" a prime number");

        }
    }
}


import java.util.Scanner;

public class j{
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=ob.nextInt();
        int temp=n;
        int r=0,rs=0;
        while(temp>10){
            r=temp%10;
            temp=temp/10;
            rs=rs*10+r;
        }
    rs=rs*10+temp;
    System.out.println(rs);
    }
}

import java.util.Scanner;
public class j{
    public static void main(String[] args){
    Scanner o=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=o.nextInt();
    int sum=0,r=0;
    while(n>0){
        r=n%10;
        n=n/10;
        sum=sum+r;
    }
    System.out.println("sum= "+sum);
    }
}

import java.util.Scanner;

public class j{
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=ob.nextInt();
        int temp=n;
        int r=0,rs=0;
        while(temp>10){
            r=temp%10;
            temp=temp/10;
            rs=rs*10+r;
        }
    rs=rs*10+temp;
    if(n==rs){
    System.out.println("palindom");}
    else{
        System.out.println("not a palindom");
    }
    }
}
 */
//ARRAY
/* 

Input and Output
Write a program to take n numbers into an array and print them back.

Sum and Average
Find the sum and average of elements in an array.

Largest and Smallest
Find the largest and smallest numbers in an array.

Even and Odd Count
Count how many even and odd numbers are in the array.

Reverse an Array
Print the array elements in reverse order


 import java.util.Scanner;
  public class j{
 public static void main(String[] args){
  int[] a=new int[5];
  int i;
  Scanner o=new Scanner(System.in);
  System.out.println("Enter the array");
  for(i=0;i<a.length;i++){
    a[i]=o.nextInt();
  }
  for(i=0;i<a.length;i++){
    System.out.print(" "+a[i]);
  }
 }
}


import java.util.Scanner;
public class j{
    public static void main(String[] args){
        int[] a=new int[5];
  int i,sum=0,avg=0;
  Scanner o=new Scanner(System.in);
  System.out.println("Enter the array");
  for(i=0;i<a.length;i++){
    a[i]=o.nextInt();
  }
  for(i=0;i<a.length;i++){
    sum=sum+a[i];
  }
  avg=sum/a.length;
  System.out.println("sum : "+sum+" avg:"+avg );
    }
}
  */  
import java.util.Scanner;
public class j{
    public static void main(String[] args){
        int[] a=new int[5];
  int i,even=0,odd=0;
  Scanner o=new Scanner(System.in);
  System.out.println("Enter the array");
  for(i=0;i<a.length;i++){
    a[i]=o.nextInt();
  }
  int min=10000;
  int max=0;
  for(i=0;i<a.length;i++){
    if(min>a[i]){
        min=a[i];
    }
    if(max<a[i]){
        max=a[i];
    }
    if(a[i]%2==0){
        even++;
    }
    else{
        odd++;
    }
  }
   for(i=a.length-1;i>=0;i--){
    System.out.print(" "+a[i]);
  }
  System.out.println("largest: "+max+" smallest: "+min+" oddc"+odd+" evenc"+even);
}
}
