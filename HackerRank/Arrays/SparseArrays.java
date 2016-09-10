import java.io.*;
import java.util.*;

public class SparseArrays{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
       
        int N = s.nextInt();
        String [] str  = new String[N];
        for(int i=0;i<N;i++)
        {
           str[i] = s.next();
        }
        int Q = s.nextInt();
        String [] qstr = new String[Q];
        for(int i=0;i<Q;i++)
        {
            qstr[i] = s.next();
        }
    
        for(int i=0;i<Q;i++)
        {
            int count = 0;
            for(int j=0;j<N;j++)
            {
                 if(str[j].equals(qstr[i]))
                     count++;
            }
            System.out.println(count);
        }
    }
}
