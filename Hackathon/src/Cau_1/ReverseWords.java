package Cau_1;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String input = sc.nextLine();

        String[] words = input.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != words.length - 1) {}
        }
        System.out.println("Chuỗi sau khi xử lý");
        System.out.println(sb.toString());
    }
}
