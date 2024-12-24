import java.util.Scanner;

public class calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Calculator");
       
       
        int res=0;
        System.out.println("Enter numbers a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("1.Add\n 2.subtract\n 3.multiply \n 4.divide \n");
        int choice = sc.nextInt();
        System.out.println("Enter your choice(1-4) : "+choice);
        

      
        switch(choice){
            case 1:
               res= a+b;
                break;
            case 2:
               res= a-b;
                break;
            case 3:
                res =a*b;
                break;
            case 4:
                res=a/b;
                break;
            default :
            System.out.println("Invalid operator");
            
        }
        System.out.println(" result is: " + res);
    }
}


