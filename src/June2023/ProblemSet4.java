package June2023;

import java.util.Scanner;

public class ProblemSet4 {
    public static void main(String[] args) throws InterruptedException {

        String finalOut="";
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i = 0; i<t; i++){
            String out="1";

            int q = scanner.nextInt();
            int minA, maxA, maxB;

            int input = scanner.nextInt();
            minA = input; maxA = input;
            maxB=maxA;

            int j=1;
            while(j<q) {
                input = scanner.nextInt();

                if (input >= maxA) {
                    maxA = input;
                    out += "1";
                    j++;
                    continue;
                }

                if (input <= minA) {
                    maxB = input;
                    out += "1";
                    j++;
                    break;
                }
                out+="0"; j++;
            }
            while(j<q){
                input = scanner.nextInt();
                if(input<=minA && input>=maxB) {
                    maxB = input;
                    out += "1";
                    j++;
                    continue;
                }
                out+="0"; j++;
            }




                /*
                if(isPivot){
                    if(input>=pivot && input<=a.get(0)){
                        a.add(input);
                        out+="1";
                    }
                    else { out+="0"; }
                }

                else {
                    if(input>=a.get(a.size()-1)){
                        a.add(input);
                        out+="1";
                    }
                    else {
                        if(input<=a.get(0)){
                            pivot = input;
                            a.add(pivot);
                            isPivot=true;
                            out+="1";
                        }
                        else {
                            out+="0";
                        }

                    }
                }

            }

                 */

            finalOut+=out+"\n";
            }
        System.out.println(finalOut);

        }

}


