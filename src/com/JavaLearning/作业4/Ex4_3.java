package com.JavaLearning;

public class Ex4_3 {
    public static void main(String[] args) {
        Date date = new Date(2017, 9, 20);
        System.out.println(date.isRun());
        System.out.println(date.whichDay());
        date.getDate();
    }
}
class Date {
    private int year = 0;
    private int month = 0;
    private int day = 0;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date() {
        year = 1900;
        month = 1;
        day = 1;
    }

    //是否闰年
    public boolean isRun() {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //判断一年中第几天
    public int whichDay() {
        int days = 0;
        int[] a = new int[13];
        for (int i = 1; i <= 12; i++) {
            if (i == 1 || i ==3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                a[i] = 31;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                a[i] = 30;
            }else {
                if (isRun()) {
                    a[i] = 29;
                } else {
                    a[i] = 28;
                }
            }
        }

        if (month == 1) {
            days += day;
        } else {
            for (int i = 1; i < month; i++) {
                days += a[i];
            }
            days += day;
        }
        return days;
    }

    public void getDate() {
        System.out.println(year + "年" + month + "月" + day + "日");
    }
}