/*
 * Приложение выводит обои, число полос задается пользователем 
 */
package ua.jvlab.smlnk;

import java.util.Scanner;

/**
 * @author: $.m.lnk
 * @version: 1.0.0
 * @date: 09.01.2018
 */
public class RunS {

    public static void main(String[] args) {
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число полос:");
        rows = sc.nextInt();
        sc.close();
        for (int i = 1; i <= rows; i += 1) {
            System.out.println("***+++***+++***+++***");
        }
        System.out.println();

    }

}
