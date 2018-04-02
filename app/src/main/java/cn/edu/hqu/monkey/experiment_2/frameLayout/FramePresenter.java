package cn.edu.hqu.monkey.experiment_2.frameLayout;

import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;

import java.util.Timer;
import java.util.TimerTask;

import static cn.edu.hqu.monkey.experiment_2.frameLayout.FrameActivity.ImageCount;


/**
 * Created by monkey on 2018/3/31.
 */

public class FramePresenter implements FrameContract.Presenter {

    public static final int EventChangeImage = 0xffff;

    @NonNull
    private final FrameContract.View view;

    private Timer mTimer;

    private byte mShowImageCnt = 0;

    private Handler mHandle = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case EventChangeImage:
                    view.showImage(mShowImageCnt++);
                    mShowImageCnt%=ImageCount;
                    break;
            }
        }
    };

    public FramePresenter(@NonNull FrameContract.View view){
        this.view = view;

        this.mTimer = new Timer();

        view.setPresenter(this);
    }

    @Override
    public void start() {
        /* 不显示所有图像 */
        view.unShowAllImage();

        /* 定时器 */
        if (null != mTimer){
            mTimer.schedule(new TimerTask() {
                @Override
                public void run() {
                    mHandle.sendEmptyMessage(EventChangeImage);
                }
            },100, 1000);
        }
    }

    @Override
    public void comeBack() {
        view.finishActivity();

    }

    @Override
    public void destroyPresenter() {
        mTimer.cancel();
        mHandle = null;
        mTimer = null;
    }
}
