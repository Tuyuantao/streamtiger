package org.test.streamtiger;

import org.junit.Test;
import org.test.core.StreamPage;
import org.test.entity.BrowserEnum;
import org.test.entity.BrowserFactory;

/**
 * Created by tuyuantao on 2017/1/11.
 */
public class StartPageTest {

    @Test
    public void startChrome() {
        new StreamPage(BrowserFactory.createBrowser(BrowserEnum.CHROME)).start("http://www.baidu.com");
    }
}
