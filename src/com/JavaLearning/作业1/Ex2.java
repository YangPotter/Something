package com.JavaLearning;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 1990;
        int month = 0;
        System.out.println("年：");
        year = sc.nextInt();
        System.out.println("月：");
        month = sc.nextInt();
        ShowDays sd = new ShowDays(year, month);
        sd.setDays();
        sd.getDays();
    }
}
class ShowDays {
   private int year = 1990;
   private int month = 0;
   private int days = 0;
   private int flag = 1;

    public ShowDays(int year, int month) {
        this.year = year;
        this.month = month;
    }
    public void setDays() {
        //闰年
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12 :
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days = 29;
                }
                days = 28;
                break;
            default:
                System.out.println("请输入正确月份！");
                break;
        }
    }
    public void getDays() {
        if (year < 1900) {
            System.out.println("悠久的历史就不要再追溯了！");
        } else if (year >= 2200) {
            System.out.println("不知未来的世界还会用Java吗^_^");
        }else {
            System.out.println(year + "年" +  month + "月有：" + days + "天");
        }
    }
}