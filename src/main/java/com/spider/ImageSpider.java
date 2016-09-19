package com.spider;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.io.UnsupportedEncodingException;

/**
 * Created by Evilina on 2016/9/9.
 * 爬取t66y的图片，并进行持久化到数据库，或本地
 */
public class ImageSpider implements PageProcessor {
    // 部分一：抓取网站的相关配置，包括编码、抓取间隔、重试次数、userAgent等
    private Site site = Site.me()
            .setRetryTimes(3)
            .setSleepTime(1000)
            .setCharset("gbk")
            .setUserAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.75 Safari/537.36");

    @Override
    public void process(Page page) {
   /*     // 部分二：定义如何抽取页面信息，并保存下来
        page.putField("author", page.getUrl().regex("https://github\\.com/(\\w+)/.*").toString());
        page.putField("name", page.getHtml().xpath("//h1[@class='entry-title public']/strong/a/text()").toString());
        if (page.getResultItems().get("name") == null) {
            //skip this page
            page.setSkip(true);
        }
        page.putField("readme", page.getHtml().xpath("//div[@id='readme']/tidyText()"));

        // 部分三：从页面发现后续的url地址来抓取
        page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/\\w+/\\w+)").all());
*/
/*        try {
            String str2 = new String(page.getRawText().getBytes("gb2312"), "utf-8");
            System.out.println(str2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/

        System.out.println(page.getHtml());

    }

    @Override
    public Site getSite() {
        return site;
    }
}
