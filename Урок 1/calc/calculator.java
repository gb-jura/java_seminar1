import java.util.Scanner;

/**
����������� ������� �����������
 */

public class calculator {

    public static void main(String[] args) {
        double ans = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("������� ������ �����: ");
        double num1 = scan.nextDouble();
        System.out.print("\n������� �������� (+, -, *, /): ");
        char op = scan.next().charAt(0);
        System.out.print("������� ������ �����: ");
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
           default:  System.out.printf("������� ����� ��������");
           break;
        }
        System.out.print("\n�����:\n");
        System.out.printf("%s %s %s = %s",num1, op, num2, ans);
        scan.close();
    }
}