public class BothPyramids 
{
    public static void main (String [] args) 
    {
        System.out.print("Input height of pyramid: ");
        int h = IO.readInt();
        
        // Normal pyramid
        for (int i = 1; i <= h; i++) 
        {
            for (int j = h - i; j > 0; j--) 
            {
                System.out.print(" ");
            }

            for (int k = 2*i - 1; k > 0; k--) 
            {
                System.out.print("*");
            } 
            System.out.println();
        }

        System.out.println("--------");

        // Side pyramid

        // Generate first half of the side pyramid
        // including the peak.
        for (int i = 1; i <= h; i++) 
        {
            for (int j = i; j > 0; j--) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        // Generate the second half of the pyramid
        // starting after the peak row.
        for (int i = h-1; i > 0; i--) 
        {
            for (int j = i; j > 0; j--) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
