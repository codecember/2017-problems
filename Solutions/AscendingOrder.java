import java.util.*;
public class AscendingOrder{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < num; i++) {
            String line = scan.nextLine();
            if (line.length() < 2) {
                System.out.println(line);
                continue;
            }
            
            char[] numbers = line.toCharArray();
            int[] digits = new int[numbers.length];
            int index = digits.length-1;
            
            for (int j = 0; j < digits.length; j++) {
                digits[j] = (int)numbers[j] - 48;
                if (j > 0 && digits[j] < digits[j-1]) {
                    int a = j-1;
                    while (a >= 0 && digits[j-1] == digits[a]) {
                        a--;
                    }
                    index = a+1;
                    break;
                }
            }
            
            if (index != digits.length-1)
                digits[index]--;
            String output = "";
            for (int k = 0; k < digits.length; k++) {
                output += k > index ? "9" : digits[k];
            }
            System.out.println(Long.parseLong(output));
            
        }
    }
}
    