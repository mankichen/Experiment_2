package cn.edu.hqu.monkey.experiment_2.mainAcitvity;

import android.content.Intent;
import android.support.v4.util.Preconditions;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.edu.hqu.monkey.experiment_2.R;
import cn.edu.hqu.monkey.experiment_2.lineLayout.LineActivity;

public class MainActivity extends AppCompatActivity implements MainContract.View {


    private MainContract.Presenter mPresenter;

    private Button btnLineLayout;

    private Button btnRelativeLayout;

    private Button btnFrameLayout;

    private Button btnTableLayout;

    private Button btnGridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLineLayout = (Button)findViewById(R.id.LineLayout);

        btnRelativeLayout = (Button)findViewById(R.id.RelativeLayout);

        btnFrameLayout = (Button)findViewById(R.id.FrameLayout);

        btnTableLayout = (Button)findViewById(R.id.TableLayout);

        btnGridLayout = (Button)findViewById(R.id.GridLayout);

        mPresenter = new MainPresenter(this);

    }

    public MainActivity() {
        super();
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {

    }

    @Override
    public void loadLayout(Class<?> cls) {
        Intent intent = new Intent(MainActivity.this, cls);
        startActivity(intent);
    }

    /* 案件监听事件 */

    public void buttonLineLayoutClick(View view) {
        mPresenter.showLineLayout();
    }

    public void buttonRelativeLayoutClick(View view) {
        mPresenter.showRelativeLayout();
    }

    public void buttonFrameLayoutClick(View view) {
        mPresenter.showFrameLayout();
    }

    public void buttonTableLayoutClick(View view){
        mPresenter.showTableLayout();
    }

    public void buttonGridLayoutClick(View view){
        mPresenter.showGridLayout();
    }
}
