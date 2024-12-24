import java.util.Scanner;
public class calc{
     static Scanner sc=new Scanner(System.in);
    public static void Addition(){
        int add=0;
        int a=sc.nextInt();
        add=a+add;
        char choice;
        do{
            System.out.println(" enter another number ");
            int b=sc.nextInt();
            add=add+b;
            System.out.println("Do you want to coninue Y/N :?");
            choice=sc.next().charAt(0);
        }while(choice== 'Y' || choice =='y');
        System.out.println("result: " +add);

    }
    public static void main(String args[]){
        System.out.println("Calculator");
        System.out.println("1.Add\n 2.subtract\n 3.multiply \n 4.divide \n");
        System.out.println("Enter your choice(1-4) : ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
               Addition();
                break;
            // case 2:
            //    Subtraction();
            //     break;
            // case 3:
            //      Multiply();
            //     break;
            // case 4:
            //     Divide();
            //    break;
            default :
            System.out.println("Invalid operator");
            
        }
       
    }
}


