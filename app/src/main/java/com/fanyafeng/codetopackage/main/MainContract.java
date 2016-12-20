package com.fanyafeng.codetopackage.main;

import com.fanyafeng.codetopackage.BasePresenter;

/**
 * Author： fanyafeng
 * Data： 16/12/20 下午6:06
 * Email: fanyafeng@live.cn
 */
public interface MainContract {
    interface View {
        void setMyPackageName(String packageName);

        void setMyPackageInfo(String packageInfo);

        void setName(String name);
    }

    interface Presenter extends BasePresenter {
        void setMyPackageName();

        void setMyPackageInfo();

        void setName();
    }
}
