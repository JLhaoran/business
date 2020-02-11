package com.rrcc.example;

import android.app.Application;

import fastec.com.rrcc.latte.core.app.Latte;

/**
 * @ProjectName: Latte
 * @Package: fastec.com.rrcc.latte
 * @ClassName: ExampleApp
 * @Description: java类作用描述
 * @Author: haoran.li
 * @CreateDate: 2020/2/9 下午10:29
 * @UpdateUser: haoran.li
 * @UpdateDate: 2020/2/9 下午10:29
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withApiHost("http://127.0.0.1/")
                .configure();

    }
}
