import java.util.*;
public class Star3
{
    public static void main(String[] args) {
        int i,j,n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        for(i=n-1;i>0;i--)
        {
            for(j=i-1;j>=0;j--)
                System.out.print("* ");
            System.out.println();
        }
    }
}

