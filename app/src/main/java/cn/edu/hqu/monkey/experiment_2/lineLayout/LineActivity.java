package cn.edu.hqu.monkey.experiment_2.lineLayout;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import cn.edu.hqu.monkey.experiment_2.R;

public class LineActivity extends AppCompatActivity implements LineContract.View {

    private LineContract.Presenter mPresenter;

    private LinearLayout mLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line);
        mLinearLayout = (LinearLayout)findViewById(R.id.LineLayout);

        mPresenter = new LinePresenter(this);
    }

    @Override
    public void setPresenter(LineContract.Presenter presenter) {

    }

    @Override
    public void finishActivity() {
        finish();
    }

    @Override
    public void alignLeftLayout() {
        mLinearLayout.setGravity(Gravity.START);
    }

    @Override
    public void horizontalLayout() {
        mLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
    }

    @Override
    public void verticalLayout() {
        mLinearLayout.setOrientation(LinearLayout.VERTICAL);
    }

    /* 按钮监听 */
    public void buttonComeBackClick(View view){
        mPresenter.comeBack();
    }

    public void buttonAlignLeftClick(View view){
        mPresenter.alignLeft();
    }

    public void buttonHorizontalClick(View view){
        mPresenter.horizontal();
    }

    public void buttonVerticalClick(View view){
        mPresenter.vertical();
    }
}
