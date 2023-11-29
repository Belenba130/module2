package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        String result = "";
        System.out.println("Nhập số: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        if (0 > num || num > 999) {
            System.out.println("Nhập lại số từ 0 đến 999");
        } else {
            int hundred = num / 100;
            int ten = (num / 10) % 10;
            int digit = num % 10;

            if (num > 99) {
                switch (hundred) {
                    case 1:
                        result += "Một trăm ";
                        break;
                    case 2:
                        result += "Hai trăm ";
                        break;
                    case 3:
                        result += "Ba trăm ";
                        break;
                    case 4:
                        result += "Bốn trăm ";
                        break;
                    case 5:
                        result += "Năm trăm ";
                        break;
                    case 6:
                        result += "Sáu trăm ";
                        break;
                    case 7:
                        result += "Bảy trăm ";
                        break;
                    case 8:
                        result += "Tám trăm ";
                        break;
                    case 9:
                        result += "Chín trăm ";
                        break;
                }
            }

            if (num > 9) {
                switch (ten) {
                    case 1:
                        result += "mười ";
                        break;
                    case 2:
                        result += "hai mươi ";
                        break;
                    case 3:
                        result += "ba mươi ";
                        break;
                    case 4:
                        result += "bốn mươi ";
                        break;
                    case 5:
                        result += "năm mươi ";
                        break;
                    case 6:
                        result += "sáu mươi ";
                        break;
                    case 7:
                        result += "bảy mươi ";
                        break;
                    case 8:
                        result += "tám mươi ";
                        break;
                    case 9:
                        result += "chín mươi ";
                        break;
                }
            }

            if (num > 0) {
                switch (digit) {
                    case 1:
                        result += "một";
                        break;
                    case 2:
                        result += "hai";
                        break;
                    case 3:
                        result += "ba";
                        break;
                    case 4:
                        result += "bốn";
                        break;
                    case 5:
                        result += "năm";
                        break;
                    case 6:
                        result += "sáu";
                        break;
                    case 7:
                        result += "bảy";
                        break;
                    case 8:
                        result += "tám";
                        break;
                    case 9:
                        result += "chín";
                        break;
                }
            }

            System.out.println(result);
            scanner.close();
        }
    }
}
