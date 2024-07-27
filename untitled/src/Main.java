import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int ans;
        while (true) {

            out.print(" Please enter the operator");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '*' || op == '-' || op == '/') {

                out.print(" Please enter the first number is ");
                int num1 = input.nextInt();
                out.println(" The entered num1 is " + num1);
                out.print(" Please enter the second number is ");
                int num2 = input.nextInt();
                out.println(" The entered num1 is " + num2);
                if (op == '+') {
                    ans = num2 + num1;
                    out.println(" The sum is " + ans);
                } else if (op == '-') {
                    ans = num2 - num1;
                    out.println(" The sub is " + ans);
                } else if (op == '*') {
                    ans = num2 * num1;
                    out.println(" The multiply is " + ans);
                } else {
                    ans = num2 / num1;
                    out.println(" The div is " + ans);
                }}
                else if ( op =='x'|| op == 'X'){
                    break;}
                else
                out.println(" invalid input ");



            }


        }


    }
