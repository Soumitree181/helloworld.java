import java.util.*;
class calculater
{
    public static void main(String []args)
    {
      char choice;
      int num1,num2,sum,result,quotient,remainder,product;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter your choice");
      choice = sc.next().charAt(0);

    System.out.println("enter first number");
    num1 = sc.nextInt();
    System.out.println("enter second number");
    num2 = sc.nextInt();
      if(choice == '+')
      {
        sum = num1 + num2;
        System.out.println("addition of: "+num1+" and "+num2+" is "+ sum);
      }
       else if(choice == '-')
      {
        result = num1 - num2;
        System.out.println("subtraction result of: "+num1+" and "+num2+" is "+ result);
      }
        else if(choice == '*')
      {
        product = num1 * num2;
        System.out.println("product of: "+num1+" and "+num2+" is "+ product);
      }
        else if(choice == '/')
      {
        quotient = num1 / num2;
        System.out.println("quotient of: "+num1+" and "+num2+" is "+ quotient);
      }
        else if(choice == '%')
      {
        remainder = num1 % num2;
        System.out.println("remainder of: "+num1+" and "+num2+" is "+ remainder);
      }
        else{
        System.out.println("not a valid operation");
      }
    }
    }
