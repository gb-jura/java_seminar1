/*
 * ��������� n-�� ������������ ����� (����� ����� �� 1 �� n), n! (������������ ����� �� 1 �� n)
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
        System.out.print("������� �����: ");
        int a = scan.nextInt();
        scan.close();
        System.out.printf("����������� �����: %d\n", (a * (a + 1)) / 2);
        int fact =1;
        for (int i =1; i<=a; i++){
            fact*=i;
        }
        System.out.printf("��������� �����: %d\n",fact);
    }
}