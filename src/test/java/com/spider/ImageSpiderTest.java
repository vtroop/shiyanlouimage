package com.spider;

import com.BaseJunit4Test;
import org.apache.log4j.Logger;
import org.junit.Test;
import us.codecraft.webmagic.Spider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.Assert.*;

/**
 * Created by Evilina on 2016/9/9.
 */
public class ImageSpiderTest {
    private static final Logger LOGGER = Logger.getLogger(ImageSpiderTest.class);
    @Test
    public void start() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Spider spider = new Spider(new ImageSpider());
        spider.run();
        String url;
        while ((url = bufferedReader.readLine()) != null) {
            LOGGER.info(url);
            spider.addUrl(url);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Spider spider = new Spider(new ImageSpider());
        //spider.run();
        String url;
        while ((url = bufferedReader.readLine()) != null) {
            LOGGER.info(url);
            spider.addUrl(url);
            spider.run();
        }
    }

}