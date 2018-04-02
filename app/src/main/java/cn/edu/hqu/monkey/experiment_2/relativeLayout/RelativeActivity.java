package cn.edu.hqu.monkey.experiment_2.relativeLayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.edu.hqu.monkey.experiment_2.R;

public class RelativeActivity extends AppCompatActivity implements RelativeContract.View {

    private Button mBack;
    private RelativeContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        mBack = (Button)findViewById(R.id.btn_back);

        mPresenter = new RelativePresenter(this);

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.comeBack();
            }
        });
    }

    @Override
    public void setPresenter(RelativeContract.Presenter presenter) {

    }

    @Override
    public void finishActivity() {
        finish();
    }
}
