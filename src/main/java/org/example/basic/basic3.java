package org.example.basic;

import java.util.Scanner;

public class basic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }

        sc.close();
    }
}
