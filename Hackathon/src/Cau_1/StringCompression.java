package Cau_1;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String arr = sc.next();
        int count = 0;
        String compressed = "";
        for (int i = 0; i < arr.length(); i++) {
            for (int j = 0; j < arr.length(); j++) {
                if (arr.charAt(i) == arr.charAt(j)) {
                    System.out.println(arr.charAt(i) + " " + arr.charAt(j));
                    count++;
                }
            }
        }
    }
}
