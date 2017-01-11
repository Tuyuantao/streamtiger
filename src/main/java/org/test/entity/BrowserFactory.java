package org.test.entity;

/**
 * Created by tuyuantao on 2017/1/11.
 */
public class BrowserFactory {

    public static Browser createBrowser(BrowserEnum browserEnum) {
        switch (browserEnum) {
            case CHROME:
                return new Chrome();
            default:
                return null;
        }
    }
}
