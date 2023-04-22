/*
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */

package factr;

/**
 *
 * @author User
 */

import java.util.Scanner;
public class factr {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scan.nextInt();
        scan.close();
        System.out.printf("Треугольное число: %d\n", (a * (a + 1)) / 2);
        int fact =1;
        for (int i =1; i<=a; i++){
            fact*=i;
        }
        System.out.printf("Факториал числа: %d\n",fact);
    }
}