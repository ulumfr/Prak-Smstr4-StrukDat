package Kegiatan1;

import java.util.Scanner;

public class Keg1 {
    
    public static String balik(String str){
        Stack stack = new Stack(str.length());

        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            stack.push(tmp);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return reversed;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Kegiatan 1 (Reversed) =====");
        System.out.print("Masukkan Input\t: ");

        String str = input.nextLine();
        String reversed = balik(str);

        System.out.println("Reversed\t: " + reversed);
        input.close();
    }
}