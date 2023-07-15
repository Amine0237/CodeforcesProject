package July2023;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Team {
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner scanner = new Scanner(new File("src/input"));
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(), out=0;
        byte a, b, c;

        for(int i = 0; i<n; i++){
            a = scanner.nextByte();
            b = scanner.nextByte();
            c = scanner.nextByte();

            if(a+b+c > 1) out+=1;
        }

        System.out.println(out);

    }
}
