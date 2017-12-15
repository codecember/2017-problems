import java.util.*;
public class FastFibonacci{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        long[] fib = new long[101];
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i < fib.length; i++)
            fib[i] = fib[i-1] + fib[i-2];
            
        int num = scan.nextInt();
            
        for (int j = 0; j < num; j++) {
            System.out.println(fib[scan.nextInt()]);
        }
    }
}
    