import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер задачи (1 - 5): ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number){
        case 1:
            task1();
            break;
        case 2:
            task2();
            break;
        case 3:
            task3();
            break;
        case 4:
            task4();
            break;
        case 5:
            task5();
            break;
        }

    }
    /* 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n) */
    static void task1(){
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Треугольное число от " + number + " = " + (int)(0.5 * number * (number + 1)));
    }
    /* 2. Вычислить n! (произведение чисел от 1 до n) */
    static void task2(){
        System.out.println("Введите число от 1: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int temp = 1;
        for (int i = 1; i <= number; i++) {
            temp *= i;
        }
        System.out.println("Факториал от числа " + number + " = " + temp);

    }
    /* 3. Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка) */
    static void task3(){
        System.out.println("простые числа от 1 до 1000: ");        
        boolean temp = true;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    temp = false;
                    break;
                }                
            }
            if (temp == true){
                System.out.print(i + " ");
            }
            temp = true;            
        }
    }
    /* 4. Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ) */
    static void task4(){
        System.out.print("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();
        System.out.print("Введите действие над числами (+ - / *): ");
        char c = scanner.next().charAt(0);
        System.out.println(c);
        switch(c){
            case '+':
            System.out.print(number1 + " " + c + " " + number2 + " = " + (number1 + number2));
                break;
            case '-':
            System.out.print(number1 + " " + c + " " + number2 + " = " + (number1 - number2));
                break;
            case '/':
            System.out.print(number1 + " " + c + " " + number2 + " = " + (1.0 * number1 / number2));
                break;
            case '*':
            System.out.print(number1 + " " + c + " " + number2 + " = " + (number1 * number2));
                break;
        }
    }
    /* 5. Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
    Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет. */
    static void task5(){        
        System.out.println("Задано уравнение вида q? + ?w = e");
        System.out.print("Введите первое число q: ");
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        System.out.print("Введите второе число w: ");
        int w = scanner.nextInt();
        System.out.print("Введите третье число e: ");
        int e = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int temp = q * 10 + i + 10 * j + w;
                if (temp == e){
                    System.out.println((q * 10 + i) + " + " + (10 * j + w) + " = " + e);
                }                
            }            
        }   
    }
}