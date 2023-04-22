import java.util.Scanner;

/**
Реализовать простой калькулятор
 */

public class calculator {

    public static void main(String[] args) {
        double ans = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scan.nextDouble();
        System.out.print("\nВведите операцию (+, -, *, /): ");
        char op = scan.next().charAt(0);
        System.out.print("Введите второе число: ");
        double num2 = scan.nextDouble();
        switch(op) {
           case '+': ans = num1 + num2;
              break;
           case '-': ans = num1 - num2;
              break;
           case '*': ans = num1 * num2;
              break;
           case '/': ans = num1 / num2;
              break;
           default:  System.out.printf("Неверно ввели операцию");
           break;
        }
        System.out.print("\nОтвет:\n");
        System.out.printf("%s %s %s = %s",num1, op, num2, ans);
        scan.close();
    }
}