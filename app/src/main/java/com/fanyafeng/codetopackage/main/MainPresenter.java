package com.fanyafeng.codetopackage.main;

import android.content.Context;

import com.fanyafeng.codetopackage.R;

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

    @Override
    public void setMyPackageName() {
        String myPackageName = "我的";
        view.setMyPackageName(myPackageName);
    }

    @Override
    public void setMyPackageInfo() {
        view.setMyPackageInfo("");
    }

    @Override
    public void setName() {
        view.setName(context.getString(R.string.app_name));
    }
}
