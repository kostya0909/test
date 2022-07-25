import java.util.Scanner;

public class main {
    public static void main (String args[]) {
        int num1, num2;
        char op;

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        op = sc.next().charAt(0);
        num2 = sc.nextInt();



        if (op == '+'){
            System.out.println(num1+num2);
        } else if (op == '-') {
            System.out.println(num1-num2);
        } else if (op == '*') {
            System.out.println(num1*num2);
        } else if (op == '/') {
            System.out.println(num1/num2);
        }
    }
}
