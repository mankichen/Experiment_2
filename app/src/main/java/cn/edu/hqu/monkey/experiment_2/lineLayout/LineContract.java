package cn.edu.hqu.monkey.experiment_2.lineLayout;

import cn.edu.hqu.monkey.experiment_2.BasePresenter;
import cn.edu.hqu.monkey.experiment_2.BaseView;

/**
 * Created by monkey on 2018/3/31.
 */

public interface LineContract {

    interface View extends BaseView<Presenter>{
        void finishActivity();

        void alignLeftLayout();

        void horizontalLayout();

        void verticalLayout();
    }

    interface Presenter extends BasePresenter{
        void comeBack();

        void alignLeft();

        void horizontal();

        void vertical();
    }
}
