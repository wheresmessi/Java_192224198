import java.util.*;
public class righttri {
    public static void main(String args[]){
        int i,j,n=5;
        for(i=0;i<n;i++)
        {
            for(j=2*(n-1);j>=0;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
