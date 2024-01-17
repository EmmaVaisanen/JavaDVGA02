package kingdice;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        int[] dice = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] sumCounts = new int[11];
        Random rn = new Random();

        for(int i = 0; i < 100; i++){
            int d1 = rn.nextInt(6)+1;
            int d2 = rn.nextInt(6)+1;
            int sum = d1 + d2;
            sumCounts[sum - 2]++;
        }
        System.out.println("\n");
        for (int j = 0; j < sumCounts.length; j++) {
            System.out.println((j + 2) + ": " + sumCounts[j]);
        }
    }
}
