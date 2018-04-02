package cn.edu.hqu.monkey.experiment_2.frameLayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import cn.edu.hqu.monkey.experiment_2.R;
import cn.edu.hqu.monkey.experiment_2.lineLayout.LinePresenter;

public class FrameActivity extends AppCompatActivity implements FrameContract.View {

    public static final byte ImageCount = 5;

    private Button mBack;

    private FrameContract.Presenter mPresenter;

    private ImageView[] imageViews = new ImageView[ImageCount];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        mBack = (Button)findViewById(R.id.btn_back);

        imageViews[0] = (ImageView)findViewById(R.id.igV_1);
        imageViews[1] = (ImageView)findViewById(R.id.igV_2);
        imageViews[2] = (ImageView)findViewById(R.id.igV_3);
        imageViews[3] = (ImageView)findViewById(R.id.igV_4);
        imageViews[4] = (ImageView)findViewById(R.id.igV_5);

        mPresenter = new FramePresenter(this);

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.comeBack();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        mPresenter.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mPresenter.destroyPresenter();
    }

    @Override
    public void setPresenter(FrameContract.Presenter presenter) {

    }

    @Override
    public void finishActivity() {
        finish();
    }

    @Override
    public void showImage(byte cnt) {
        imageViews[cnt%ImageCount].setVisibility(View.INVISIBLE);
        imageViews[(cnt+1)%ImageCount].setVisibility(View.VISIBLE);
    }

    @Override
    public void unShowAllImage() {
        for (byte i = 0; i < ImageCount; i++){
            imageViews[i].setVisibility(View.INVISIBLE);
        }
    }
}
