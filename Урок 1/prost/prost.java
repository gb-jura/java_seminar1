/*
 * ������� ��� ������� �����
 */

import java.util.Scanner;
public class prost {

   public static void main(String[] args) {
      System.out.print("������� ������������� �����: ");
      Scanner in = new Scanner(System.in);
      int input = in.nextInt();
      boolean b = true;
      System.out.print("������� �����:");
      for (int P = 2; P <= input; P++) {
         for (int i = 2; i < P; i++) {
            if (P % i == 0) {
                  b = false;
                  break;
            }
         }
         if (b) System.out.printf(" %d",P);
         else b = true;
      }
   } 
}