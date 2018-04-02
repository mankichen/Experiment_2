package cn.edu.hqu.monkey.experiment_2.relativeLayout;

import android.support.annotation.NonNull;

/**
 * Created by monkey on 2018/3/31.
 */

public class RelativePresenter implements RelativeContract.Presenter {

    @NonNull
    private final RelativeContract.View view;

    public RelativePresenter(@NonNull RelativeContract.View view){
        this.view = view;

        view.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void comeBack() {
        view.finishActivity();

    }
}
