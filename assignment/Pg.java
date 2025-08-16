/*import java.util.Scanner;

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
    */
import java.util.Scanner;

public class Pg{
    public static void main(String[] args){
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=next.Int();
        int i;
        int flag=0;
        for(i=2;i>=num/2;i++){
            if(num%i!=0){
                flag=0;
            }
            else{
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.print("not a prime number")
        }
        else{
             System.out.print(" a prime number")

        }
    }
}
