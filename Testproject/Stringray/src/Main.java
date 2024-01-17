import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] input = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            input[i] = scanner.next();
        }
        for(int i= 0; i < 5; i++){
            for(int j=1; j < 5 - 1; j++){
                if(input[j].compareTo(input[j+1]) > 0){
                    String temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < 5; i++){
            System.out.print(input[i]);
            System.out.print("\n");
        }
    }
}