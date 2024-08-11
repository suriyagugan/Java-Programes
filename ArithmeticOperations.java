import java.util.*;

class ArithmeticOperations
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int add,sub,mul,div,rem;

        add=a+b;
        System.out.println("Addition Value : "+add);
        
        sub=a-b;
        System.out.println("Subtraction Value : "+sub);
        
        mul=a*b;
        System.out.println("Multiplication Value : "+mul);
        
        try{
            div=a/b;
            System.out.println("Division Value : "+div);
        }
        catch(ArithmeticException e){
            System.out.println("Error : Division by zero is not allowed");
        }
        
        try{
            rem=a%b;
            System.out.println("Remainder Value : "+rem);
        }
        catch(ArithmeticException e){
            System.out.println("Error : Division by zero is not allowed");
        }
    }
}