public class Largest
{
    public static void main(int num1, int num2)
    {
        System.out.println("Enter the first number: " + num1);
        System.out.println("Enter the second number: " + num2);
        if(num1>num2)
        {
            System.out.println("First number is greater");
        } else if(num1<num2)
        {
            System.out.println("Second number is greater");
        } else {
            System.out.println("Both are equal");
        }
    }
}
