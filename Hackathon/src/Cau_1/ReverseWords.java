package Cau_1;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String input = sc.nextLine();

        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversed = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reversed += word.charAt(j);
            }
            sb.append(reversed);
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println("Chuỗi sau khi xử lý: ");
        System.out.println(sb.toString());
    }
}
