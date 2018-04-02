package cn.edu.hqu.monkey.experiment_2.tableLayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.edu.hqu.monkey.experiment_2.R;

public class TableActivity extends AppCompatActivity implements TableContract.View {

    private Button mBack;

    private TableContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        mBack = (Button)findViewById(R.id.btn_back);

        mPresenter = new TablePresenter(this);

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.comeBack();
            }
        });
    }

    @Override
    public void setPresenter(TableContract.Presenter presenter) {

    }

    @Override
    public void finishActivity() {
        finish();
    }
}
