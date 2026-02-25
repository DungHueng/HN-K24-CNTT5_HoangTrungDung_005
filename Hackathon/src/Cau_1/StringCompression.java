package Cau_1;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String arr = sc.next();
        for (int i = 0; i < arr.length(); i++) {
            System.out.println(arr.charAt(i));
        }
    }
}
