package com.basiccode;
import java.util.Scanner;
public class SwitchDemo2 {
    public static void main(String[] args) {
        //目标：switch
        //需求：下周计划；
        Scanner sc = new Scanner(System.in);
        System.out.println("今天周几？");
        int num = sc.nextInt();
        String weekday = " ";
        if (num == 1) {
            weekday = "周一";
        } else if (num == 2) {
            weekday = "周二";
        } else if (num == 3) {
            weekday = "周三";
        } else if (num == 4) {
            weekday = "周四";
        } else if (num == 5) {
            weekday = "周五";
        } else if (num == 6) {
            weekday = "周六";
        } else if (num == 7) {
             weekday = "周日";
        } else {
            System.out.println("输入不合法。");
        }
        switch (weekday) {
            case "周一":
                System.out.println("埋头苦干。");
                break;
            case "周二":
                System.out.println("帮忙解决bug。");
                break;
            case"周三":
                System.out.println("今晚约饭。");
                break;
            case"周四":
                System.out.println("帮助同事。");
                break;
            case"周五":
                System.out.println("今晚吃鸡。");
                break;
            case"周六":
                System.out.println("相亲。");
                break;
            case"周日":
                System.out.println("准备上班。");
                break;
            default:
                System.out.println("数据有误！");
        }

    }
}
