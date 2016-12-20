package com.fanyafeng.codetopackage.main;

import android.content.Context;

import com.fanyafeng.codetopackage.R;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Author： fanyafeng
 * Data： 16/12/20 下午6:07
 * Email: fanyafeng@live.cn
 */
public class MainPresenter implements MainContract.Presenter {
    private String myPackage;
    private String myName;
    private String myGitHub;
    private String myCSDN;

    private Context context;
    private MainContract.View view;

    public MainPresenter(Context context, MainContract.View view) {
        this.context = context;
        this.view = view;
    }

    @Override
    public void start() {
        try {
            Properties properties = new Properties();
            InputStream inputStream = context.getAssets().open("config.properties");
            properties.load(inputStream);
            myPackage = properties.getProperty("mypackage");
            myName = properties.getProperty("myname");
            myGitHub = properties.getProperty("mygithub");
            myCSDN = properties.getProperty("mycsdn");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setMyPackageName() {
        view.setMyPackageName(myPackage);
    }

    @Override
    public void setMyPackageInfo() {
        view.setMyPackageInfo(myName);
    }

    @Override
    public void setName() {
        view.setName(context.getString(R.string.app_name));
    }
}
