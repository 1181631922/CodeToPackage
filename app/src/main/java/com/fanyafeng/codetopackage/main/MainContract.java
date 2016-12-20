package com.fanyafeng.codetopackage.main;

import com.fanyafeng.codetopackage.BasePresenter;

/**
 * Author： fanyafeng
 * Data： 16/12/20 下午6:06
 * Email: fanyafeng@live.cn
 */
public interface MainContract {
    interface View {
        void getMyPackageName();

        void getMyPackageInfo();

        void setName();
    }

    interface Presenter extends BasePresenter {

    }
}
