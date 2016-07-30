package com.parse;

import java.io.*;

/**
 * Created by Evilina on 2016/7/30.
 */
public class MainParese {
    public static final String baseUrl = "D:\\我的笔记\\马列\\Carib\\1\\1.md";
    public static void main(String[] args) throws IOException {

        System.out.println(new MainParese().pathReader(baseUrl));
    }

    /**
     * 最原始的System.in来读取控制端数据
     * @return
     * @throws IOException
     */
    public String bufferedReaderTest() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while ((s = bufferedReader.readLine()) != null && s.length() != 0) {
            System.out.println(s);
        }
        return s;
    }

    public String pathReader(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        StringBuilder stringBuilder = new StringBuilder();
        String s = null;
        while ((s = bufferedReader.readLine()) != null) {
            stringBuilder.append(s+"\n");
        }
        bufferedReader.close();

        return stringBuilder.toString();
    }
}
