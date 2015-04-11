/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

/**
 *
 * @author charles
 */
//import java.util.Scanner;
public class Ex {

    public static void check(int[] a) {
        int avg=0;
        int new_avg = 0;
        int adnormal_data = 0;
        boolean checksta=false;
        while (checksta=false) {
            if (avg * 0.7 <= a[4] && a[4] <= avg * 1.3) {
                avg = cal_avg(a);
                System.out.println("avg:" + avg);//新平均
            } else {
                adnormal_data = a[4];
                System.out.println("first adnormal:" + adnormal_data);
                checksta = true;
            }
        }
        while(checksta=true){
            if (a[3] * 0.7 <= a[4] && a[4] <= a[3] * 1.3) {
                avg = (a[3] + a[4]) / 2;
                System.out.println("新avg:"+avg);
                break;
            } else {
                adnormal_data = a[4];
                avg = cal_avg(a);
                System.out.println("avg:" + avg);//新平均
                System.out.println("second adnormaldata:" + adnormal_data);
                //第二筆輸入
                checksta=false;
                break;
            }
        }

        
    }

    public static void updr(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (i != a.length - 1) {
                a[i] = a[i + 1];
            } else {
                a[i] = n;
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static int cal_avg(int[] arr) {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            avg = sum / arr.length;
        }
        System.out.println("avg=" + avg);
        return avg;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int avg=0;
        int new_avg = 0;
        int sum = 0;
        int adnormal_data = 0;
        int tep = 0;

        //cal avg
        avg = cal_avg(arr);

        //s1
        updr(arr, 60);//第一次更改
        check(arr);


        //s2  new at arr[4]
        updr(arr, 150);
        check(arr);



    }

}
