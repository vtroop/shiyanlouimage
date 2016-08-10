package com.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Evilina on 2016/7/30.
 */
public class ParesHtml {
    private Document document;
    private String path;



    public ParesHtml parseHtml(String content) {
        this.document = Jsoup.parse(content);
        return this;
    }

    /**
     * 可以直接从文件中解析
     * @param path
     * @throws IOException
     */
    public ParesHtml parseFromFile(String path) throws IOException {
        File file = new File(path);
        this.path = path;
        this.document = Jsoup.parse(file, "utf-8");
        return this;
    }

    public void getImageUrl() {
        Elements elements = this.document.getElementsByTag("img");
        for (Element e : elements
                ) {
            //System.out.println("修改前");
            //System.out.println(e);
            //System.out.println("修改后");
            imageURLtrans(e);
            //System.out.println(e);
        }

    }

    public void imageURLtrans(Element element) {
        String url = element.attr("src2");
        System.out.println(url);
        Matcher matcher = Pattern.compile("[^/]*\\.jpg").matcher(url);
        if (matcher.find()) {
            element.attr("src", matcher.group());
            element.attr("src2", url);

        }
    }

    public void saveHtml() {
        BufferedWriter bufferedWriter = null;

        try {

//Construct the BufferedWriter object
            bufferedWriter = new BufferedWriter(new FileWriter(path));

//Start writing to the output stream

                bufferedWriter.write(document.html());





        }  catch (IOException ex) {
            ex.printStackTrace();
        } finally {
//Close the BufferedWriter
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}

