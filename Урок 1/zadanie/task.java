package zadanie;

//package zadanie;
/*
 * ������ ��������� ���� q + w = e, q, w, e >= 0. ��������� ����� ����� ���� �������� ������ �������,
 *  ��������, 2? + ?5 = 69. ��������� ������������ ��������� �� ������� ���������. 
 * ���������� ���� �� ���� ������� ��� ��������, ��� ��� ���. ��� ������� �������� - 
 * ���� � �� �� ����� ����: 2? + ?5 = 69 �����: 24 + 45 = 69
 */
import java.util.Scanner;
public class task {

   public static void main(String[] args) {
      System.out.println("������� ����� ���������, ������ 2? + ?5 = 69.");
      Scanner in = new Scanner(System.in);
      System.out.print("������ �����: ");
      int a = in.nextInt();
      System.out.print("������ �����: ");
      int b = in.nextInt();
      System.out.print("����� ����� �����: ");
      int c = in.nextInt();
      in.close();
      boolean res = false;
      int x;
      for (x = 0; x < 10; x++) {
         if (a*10 + x + x * 10 + b == c) {
               res = true;
               break;
         } 
      }
      if (res) {
         System.out.printf("������� �������: %d%d + %d%d = %d",a,x,x,b,c);
      } else {
         System.out.println("��� �������");
      }
   } 
}