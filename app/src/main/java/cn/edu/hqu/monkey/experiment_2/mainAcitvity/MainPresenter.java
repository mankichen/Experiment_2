package cn.edu.hqu.monkey.experiment_2.mainAcitvity;

import android.support.annotation.NonNull;

import cn.edu.hqu.monkey.experiment_2.frameLayout.FrameActivity;
import cn.edu.hqu.monkey.experiment_2.gridLayout.GridActivity;
import cn.edu.hqu.monkey.experiment_2.lineLayout.LineActivity;
import cn.edu.hqu.monkey.experiment_2.relativeLayout.RelativeActivity;
import cn.edu.hqu.monkey.experiment_2.tableLayout.TableActivity;


/**
 * Created by monkey on 2018/3/31.
 */

public class MainPresenter implements MainContract.Presenter {

    @NonNull
    private final MainContract.View view;

    public MainPresenter(@NonNull MainContract.View view){
        this.view = view;

        view.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void showLineLayout() {
        view.loadLayout(LineActivity.class);
    }

    @Override
    public void showRelativeLayout() {
        view.loadLayout(RelativeActivity.class);
    }

    @Override
    public void showFrameLayout() {
        view.loadLayout(FrameActivity.class);
    }

    @Override
    public void showTableLayout() {
        view.loadLayout(TableActivity.class);
    }

    @Override
    public void showGridLayout() {
        view.loadLayout(GridActivity.class);
    }
}
