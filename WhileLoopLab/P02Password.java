package WhileLoopLab;

import java.util.Scanner;

public class P02Password {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        String username = scaner.nextLine();
        String passReg = scaner.nextLine();

        String passwd = scaner.nextLine();

        while(!passwd.equals(passReg)){
            passwd = scaner.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}
