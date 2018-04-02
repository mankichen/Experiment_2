package cn.edu.hqu.monkey.experiment_2.tableLayout;

import android.support.annotation.NonNull;

/**
 * Created by monkey on 2018/3/31.
 */

public class TablePresenter implements TableContract.Presenter {


    @NonNull
    private final TableContract.View view;

    public TablePresenter(@NonNull TableContract.View view){
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
