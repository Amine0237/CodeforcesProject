package July2023;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Airport {
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner scanner = new Scanner(new File("src/input"));
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), m = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();

        for(int i = 0; i<m; i++){
            array.add(scanner.nextInt());
        }

        Collections.sort(array);
        ArrayList<Integer> array2 = (ArrayList<Integer>) array.clone();
        Collections.reverse(array);

        int seats = 0, max, Max_earning=0;

        while(seats < n && array.get(0) !=0){
            max = array.get(0);
            for(int i = 0; i<array.size(); i++){
                if(array.get(i) == max && seats<n){
                    array.set(i, max-1);
                    seats++;
                    Max_earning +=max;
                } else { break; }
            }
        }

        seats = 0;
        int Min_earning = 0, min;

        while(seats < n){
            if (array2.get(0) ==0) array2.remove(0);
            else{
                min = array2.get(0);
                Min_earning+=min;
                array2.set(0, min-1);
                seats+=1;
            }
        }

        System.out.println(Max_earning+" "+ Min_earning);
    }
}
