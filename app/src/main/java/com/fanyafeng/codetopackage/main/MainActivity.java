package com.fanyafeng.codetopackage.main;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.fanyafeng.codetopackage.R;
import com.fanyafeng.codetopackage.BaseActivity;

//需要搭配Baseactivity，这里默认为Baseactivity,并且默认BaseActivity为包名的根目录
public class MainActivity extends BaseActivity implements MainContract.View {
    private MainContract.Presenter presenter;

    private Button btnMyPackageName;
    private TextView tvMyPackageName;
    private Button btnMyPackageInfo;
    private TextView tvMyPackageInfo;
    private Button btnGetName;
    private TextView tvGetName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //这里默认使用的是toolbar的左上角标题，如果需要使用的标题为中心的采用下方注释的代码，将此注释掉即可
        title = getString(R.string.title_activity_main);
        isSetNavigationIcon = false;
        presenter = new MainPresenter(this, this);
        initView();
        presenter.start();
        initData();
    }

    //初始化UI控件
    private void initView() {
        btnMyPackageName = (Button) findViewById(R.id.btnMyPackageName);
        btnMyPackageName.setOnClickListener(this);
        tvMyPackageName = (TextView) findViewById(R.id.tvMyPackageName);
        btnMyPackageInfo = (Button) findViewById(R.id.btnMyPackageInfo);
        btnMyPackageInfo.setOnClickListener(this);
        tvMyPackageInfo = (TextView) findViewById(R.id.tvMyPackageInfo);
        btnGetName = (Button) findViewById(R.id.btnGetName);
        btnGetName.setOnClickListener(this);
        tvGetName = (TextView) findViewById(R.id.tvGetName);
    }

    //初始化数据
    private void initData() {

    }

    @Override
    public void setMyPackageName(String packageName) {
        tvMyPackageName.setText(packageName);
    }

    @Override
    public void setMyPackageInfo(String packageInfo) {
        tvMyPackageInfo.setText(packageInfo);
    }

    @Override
    public void setName(String name) {
        tvGetName.setText(name);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.btnMyPackageName:
                presenter.setMyPackageName();
                break;
            case R.id.btnMyPackageInfo:
                presenter.setMyPackageInfo();
                break;
            case R.id.btnGetName:
                presenter.setName();
                break;
        }
    }
}
