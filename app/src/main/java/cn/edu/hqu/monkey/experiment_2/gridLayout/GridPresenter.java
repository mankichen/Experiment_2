package cn.edu.hqu.monkey.experiment_2.gridLayout;

import android.support.annotation.NonNull;

/**
 * Created by monkey on 2018/3/31.
 */

public class GridPresenter implements GridContract.Presenter {


    @NonNull
    private final GridContract.View view;

    public GridPresenter(@NonNull GridContract.View view){
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
