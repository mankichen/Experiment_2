package cn.edu.hqu.monkey.experiment_2.lineLayout;

import android.support.annotation.NonNull;

/**
 * Created by monkey on 2018/3/31.
 */

public class LinePresenter implements LineContract.Presenter {

    @NonNull
    private final LineContract.View view;

    public LinePresenter(@NonNull LineContract.View view){
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

    @Override
    public void alignLeft() {
        view.alignLeftLayout();
    }

    @Override
    public void horizontal() {
        view.horizontalLayout();
    }

    @Override
    public void vertical() {
        view.verticalLayout();
    }
}
