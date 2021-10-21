package com.company;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
	    System.out.println ("Имеется n итоговых оценок студента. Определить  является ли студент неуспевающим (имеются оценки ниже 4).");
        int N = 0;
        boolean PosMarks;
        boolean isIncorrect;
        final int MIN_AMOUNT = 0;
        final int MAX_AMOUNT = 20;
        final int MIN_MARK = 4;
        final int MAX_MARK = 10;
        System.out.println ("Введите количество итоговых оценок студента.");
        do {
            isIncorrect = false;
            try {
                N = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.err.print ("Ошибка. Введите натуральное число до ");
                System.err.println(MAX_AMOUNT);
                isIncorrect = true;
            }
            if ((!isIncorrect && N < MIN_AMOUNT) | (!isIncorrect && N > MAX_AMOUNT)) {
                System.err.print ("Ошибка. Введите натуральное число до ");
                System.err.println(MAX_AMOUNT);
                isIncorrect = true;
            }
        } while (isIncorrect);
        int Marks [] = new int [N];
        System.out.println("Введите итоговые оценки студента.");
        PosMarks = true;
        for (int i = 0; i < N; i ++) {
            do {
                isIncorrect = false;
                try {
                    Marks[i] = Integer.parseInt (scan.nextLine());
                } catch (NumberFormatException e) {
                    System.err.print ("Ошибка. Введите натуральное число до ");
                    System.err.println(MAX_MARK);
                            isIncorrect = true;
                }
                if ((!isIncorrect && Marks[i] < MIN_AMOUNT) | (!isIncorrect
                        && Marks[i] > MAX_MARK))  {
                    System.err.print ("Ошибка. Введите натуральное число до ");
                    System.err.println(MAX_MARK);
                            isIncorrect = true;

                }
            } while (isIncorrect);
            if (Marks[i] < MIN_MARK) {
                PosMarks = false;
            }
        }
        if (PosMarks) {
            System.out.println ("Студент является успевающим.");
        } else {
            System.out.println ("Студент является неуспевающим.");
        }
    }
}
