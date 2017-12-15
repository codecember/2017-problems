import java.util.*;
public class AutomaticBallMachine{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        while (scan.hasNext()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a == 0 && b == 0) break;
            System.out.printf("%.2f",(double)Math.round(Math.sqrt(Math.pow(a,2) + Math.pow(b,2)) * 100) / 100);
            System.out.println();
        }
    }
}
    