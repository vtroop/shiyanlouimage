package com.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Evilina on 2016/8/5.
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        while (s.hasNextInt()) {
////            String string = s.next();
////            System.out.println(string);
//            String a = s.next();
//
//            System.out.println(a.toString());
//            //if (a.trim().length() == 0) break;
//        }

//        String x=null;
//        while((x = s.next()) != null)
//        {
//            System.out.println(x);
//        }

/*      可以使用空格结束
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = null;
        try {
            while ((string = bufferedReader.readLine()) != null && string.length()!=0) {
                System.out.println(string);

            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        while (s.hasNext("[\\d\\w]+")) {
            System.out.println(s.next());
        }

        System.out.println("7");
    }
}
