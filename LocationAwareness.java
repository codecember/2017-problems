import java.io.*;
import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.lang.System.*;
/*
* This problem was only finished by one team: Waco Has Hope (Aaron Lamoreaux and Victoria Nguyen from Richardson High School)
* Below is their solution
*/

public class LocationAwareness {
    static Scanner in, sc;

    public static void main(String[] args) {
        in = sc = new Scanner(System.in);

        while (true) {
            double s1 = in.nextDouble(), s2 = in.nextDouble(), s3 = in.nextDouble();
            if (s1 == 0 && s2 == 0 && s3 == 0) break;
            
            int x = 1000, y = 1000;
            for (int i = -100; i <= 100; i++) {
                for (int j = -100; j <= 100; j++) {
                    double d1 = Math.hypot(i, j - 100), d2 = Math.hypot(i + 100, j + 100), d3 = Math.hypot(i - 100, j + 100);
                    double P1 = d1 * d1 * s1, P2 = d2 * d2 * s2, P3 = d3 * d3 * s3;
                    if (Math.abs(Math.max(P1, Math.max(P2, P3)) - Math.min(P1, Math.min(P2, P3))) < 100) {
                        x = i;
                        y = j;
                    }
                }
            }
            out.printf("%d %d\n", x, y);
        }

    }
}
