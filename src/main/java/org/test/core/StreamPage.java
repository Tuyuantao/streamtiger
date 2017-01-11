package org.test.core;

import org.test.entity.Browser;

/**
 * Created by tuyuantao on 2017/1/11.
 */
public class StreamPage {

    private Browser browser;

    public StreamPage(Browser browser) {
        this.browser = browser;
    }

    public StreamPage start(String url) {
        browser.start(url);
        return this;
    }

}
