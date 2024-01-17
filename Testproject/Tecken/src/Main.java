package Tecken;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    int x = 0;
    Scanner tecken = new Scanner(System.in);
    char input;
    while((input = tecken.next().charAt(0)) != '?'){
        if(input >= 'A' && input <= 'Z'){
            x++;
        }
    }

System.out.print(x);
    }

}