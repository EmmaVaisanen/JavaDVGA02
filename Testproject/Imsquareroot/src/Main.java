import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        double Alf;
        double Bert;
        Scanner Alfred = new Scanner(System.in);
        Scanner Bertil = new Scanner(System.in);
        System.out.print("Ange variabel a: \n");
        Alf = Alfred.nextDouble();
        System.out.print("Ange vairabel b: \n");
        Bert = Bertil.nextDouble();
        Double square = Math.pow(Bert, Alf);
        Double root = Math.sqrt(Alf);

        System.out.println(root);
        System.out.println(square);
    }
}