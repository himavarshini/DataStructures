import java.io.*;
import java.util.*;

public class ArrayDS{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int N,i;
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        int [] a = new int[N];
        for(i=0;i<N;i++)
        {
            a[i] = s.nextInt();
        }
        for(i = N-1 ; i >= 0 ;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}
