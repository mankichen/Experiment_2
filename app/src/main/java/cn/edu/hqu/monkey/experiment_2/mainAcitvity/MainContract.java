package cn.edu.hqu.monkey.experiment_2.mainAcitvity;

import cn.edu.hqu.monkey.experiment_2.BasePresenter;
import cn.edu.hqu.monkey.experiment_2.BaseView;

/**
 * Created by monkey on 2018/3/31.
 */

public interface MainContract {

    interface View extends BaseView<Presenter> {


        void loadLayout(Class<?> cls);

    }

    interface Presenter extends BasePresenter {

        void showLineLayout();

        void showRelativeLayout();

        void showFrameLayout();

        void showTableLayout();

        void showGridLayout();
    }
}
