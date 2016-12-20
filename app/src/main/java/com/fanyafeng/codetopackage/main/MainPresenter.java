package com.fanyafeng.codetopackage.main;

import android.content.Context;

/**
 * Author： fanyafeng
 * Data： 16/12/20 下午6:07
 * Email: fanyafeng@live.cn
 */
public class MainPresenter implements MainContract.Presenter {

    private Context context;
    private MainContract.View view;

    public MainPresenter(Context context, MainContract.View view) {
        this.context = context;
        this.view = view;
    }

    @Override
    public void start() {

    }
}
