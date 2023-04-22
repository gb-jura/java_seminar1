package zadanie;

//package zadanie;
/*
 * Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
 *  например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
 * Предложить хотя бы одно решение или сообщить, что его нет. Под знаками вопросов - 
 * одна и та же цифра Ввод: 2? + ?5 = 69 Вывод: 24 + 45 = 69
 */
import java.util.Scanner;
public class task {

   public static void main(String[] args) {
      System.out.println("Введите числа уравнения, пример 2? + ?5 = 69.");
      Scanner in = new Scanner(System.in);
      System.out.print("Первое число: ");
      int a = in.nextInt();
      System.out.print("Второе число: ");
      int b = in.nextInt();
      System.out.print("сумма чисел равна: ");
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
         System.out.printf("Найдено решение: %d%d + %d%d = %d",a,x,x,b,c);
      } else {
         System.out.println("Нет решения");
      }
   } 
}