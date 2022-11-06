import java.util.Scanner;
class sum
{
    public static void main(String []args)
    {
        int num1,num2,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        num1=sc.nextInt();
        System.out.println("enter 2nd number");
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println("The sum of these two number is:"+ sum);

    }
}