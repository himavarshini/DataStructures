import java.io.*;
import java.util.*;

public class LeftRotation{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int N = s.nextInt() , D = s.nextInt();
        int [] a = new int[N];
        for(int i=0;i<N;i++)
        {
            a[i] = s.nextInt();
        }
        for(int i=0;i<D;i++)
        {
            int tmp = a[0] , j = 0;
            for(j = 0;j<N-1;j++)
            {
                a[j] = a[j+1];
            }
            a[j] = tmp;
        }
        for(int i=0;i<N;i++)
            {
            System.out.print(a[i]+" ");
        }
    }
}
