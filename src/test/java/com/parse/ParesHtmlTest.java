package com.parse;

import com.util.ParesHtml;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Evilina on 2016/7/30.
 */
public class ParesHtmlTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getImageUrl() throws Exception {
        new ParesHtml().parseFromFile("D:\\我的笔记\\马列\\美女\\4\\1.md").getImageUrl();
    }
}