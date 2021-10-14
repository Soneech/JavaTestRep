package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; ++i) {
            numbers[i] = scan.nextInt();
        }
        int max_n = numbers[0];
        int max = 0, count;
        for (int i = 0; i < n; ++i) {
            count = 1;
            for (int j = i + 1; j < n; ++j) {
                if (numbers[i] == numbers[j]) {
                    count += 1;
                }
            }
            if (count > max) {
                max = count;
                max_n = numbers[i];
            }
        }
        System.out.println(max_n);
    }
}
