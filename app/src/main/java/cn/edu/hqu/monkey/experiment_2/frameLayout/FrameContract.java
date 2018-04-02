package cn.edu.hqu.monkey.experiment_2.frameLayout;

import cn.edu.hqu.monkey.experiment_2.BasePresenter;
import cn.edu.hqu.monkey.experiment_2.BaseView;

/**
 * Created by monkey on 2018/3/31.
 */

public interface FrameContract {

    interface View extends BaseView<Presenter>{
        void finishActivity();

        void showImage(byte cnt);

        void unShowAllImage();
    }

    interface Presenter extends BasePresenter{
        void comeBack();

        void destroyPresenter();
    }
}
