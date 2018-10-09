package zhiyue.cutt.com.customtoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_ordinary_toast) Button mOrdinaryToast;
    @BindView(R.id.btn_custom_toast) Button mCustomToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_ordinary_toast)
    public void ordinaryToastClick() {
        ToastHelper.showShortMessage("I am ordinary toast");
    }

    @OnClick(R.id.btn_custom_toast)
    public void customToastClick() {
        CustomToast.show(this, "I am custom toast");
    }
}
