package July2023;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner scanner = new Scanner(new File("src/input"));
        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.nextLine().toLowerCase();
        String string2 = scanner.nextLine().toLowerCase();
        boolean equal = true;
        int a;
        for (int i=0; i<string1.length(); i++){
            a = string1.charAt(i)-string2.charAt(i);
            
            if(a<0) {
                System.out.println(-1);
                equal = false;
                break;
            } else if (a>0) {
                System.out.println(1);
                equal = false;
                break;
            }
        }

        if(equal) System.out.println(0);
    }
}
