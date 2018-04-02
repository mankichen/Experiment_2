package cn.edu.hqu.monkey.experiment_2.gridLayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;

import cn.edu.hqu.monkey.experiment_2.R;

public class GridActivity extends AppCompatActivity implements GridContract.View {

    private Button mBack;

    private GridContract.Presenter mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        mBack = (Button)findViewById(R.id.btn_back);

        mPresenter = new GridPresenter(this);

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.comeBack();
            }
        });
    }

    @Override
    public void setPresenter(GridContract.Presenter presenter) {

    }

    @Override
    public void finishActivity() {
        finish();
    }
}
