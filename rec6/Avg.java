public class Avg 
{
    public static void main(String [] args) 
    {
        System.out.print("Enter breaking value: ");
        int breakingValue = IO.readInt();

        int sum = 0;
        int count = 0;

        System.out.print("Input number: ");
        int num = IO.readInt();

        while (num != breakingValue) 
        {
            sum = sum + num;
            count = count + 1;
            System.out.print("Input number: ");
            num = IO.readInt();
        }

        System.out.println("My average is: " + ((double)sum/count));
    }
}
