package cn.edu.hqu.monkey.experiment_2.relativeLayout;

import cn.edu.hqu.monkey.experiment_2.BasePresenter;
import cn.edu.hqu.monkey.experiment_2.BaseView;

/**
 * Created by monkey on 2018/3/31.
 */

public interface RelativeContract {

    interface View extends BaseView<Presenter>{
        void finishActivity();
    }

    interface Presenter extends BasePresenter{
        void comeBack();

    }
}
