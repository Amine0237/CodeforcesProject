package July2023;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner scanner = new Scanner(new File("src/input"));
        Scanner scanner = new Scanner(System.in);

        int input, m=0, n=0, out;
        boolean set = false;

        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++) {
                input = scanner.nextInt();
                if(input == 1) {
                    m = i;
                    n = j;
                    set = true;
                    break;
                }
            }
            if(set) break;
        }
        out = Math.abs(m-2)+Math.abs(n-2);
        System.out.println(out);

    }
}
