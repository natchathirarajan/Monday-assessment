import java.util.*;
public class Star2
{
    public static void main(String[] args) {
        int i,j,n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n=s.nextInt();
        for(i=n;i>0;i--)
        {
            for(j=0;j<n-i;j++)
                System.out.print(" ");
            for(j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

