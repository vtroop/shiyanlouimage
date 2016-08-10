package com.service;

import java.util.Scanner;

/**
 * Created by Evilina on 2016/8/6.
 */
public class Main {
    public static void main(String[] args) {
        int f0 = 0;
        int f1 = 1;
        int ftotal;
        int fget;
        Scanner scanner = new Scanner(System.in);
        fget = scanner.nextInt();
        do {
            ftotal = f0 + f1;
            f0 = f1;
            f1 = ftotal;
        } while (ftotal < fget);
        f1 = f0;
        f0 = ftotal -f0;
        if (ftotal == fget)
        {
            System.out.println(0);
        }
        else
        {
            int x,y;
            x= fget - f1;
            y = ftotal -fget;
            if (x<y)
            {
                System.out.println(x);
            }
            else
            {
                System.out.println(y);
            }
        }
    }
}
