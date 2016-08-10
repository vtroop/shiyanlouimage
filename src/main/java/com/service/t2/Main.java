package com.service.t2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Evilina on 2016/8/6.
 */
public class Main {
    public static List<Integer> list = new ArrayList<Integer>();
    public static List<Integer> sum = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            list.add(x);
        }
        for(int n2 = 0; n2<list.size(); n2++) {
            int tempTotal = list.get(n2);
            sum.add(list.get(n2));
            int temp = n2;
            goOn(temp++, list.size(), tempTotal);
        }
        System.out.println(list);
    }

     static void goOn(int start,int end,int tempTotal) {
        for (int i = start;i<end;i++) {
            int temp = tempTotal + list.get(i);
            sum.add(temp);
            int tempno = i;
            goOn(tempno++, end, temp);
        }
    }
}
