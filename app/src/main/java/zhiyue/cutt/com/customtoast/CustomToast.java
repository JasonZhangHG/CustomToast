package zhiyue.cutt.com.customtoast;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToast extends Toast {

    private static CustomToast mCustomToast;

    public CustomToast(Context context) {
        super(context);
    }

    public static void show(Context context, String text) {
        if (TextUtils.isEmpty(text)) { return; }
        try {
            cancelToast();
            mCustomToast = new CustomToast(context);
            View layout = View.inflate(context, R.layout.toast_layout, null);
            RelativeLayout toastLayout = layout.findViewById(R.id.toast_layout);
            TextView toastText = layout.findViewById(R.id.toast_text);
            toastText.setText(text);
            mCustomToast.setView(layout);
            mCustomToast.setGravity(Gravity.FILL_HORIZONTAL, 0, 1);
            mCustomToast.setDuration(Toast.LENGTH_SHORT);
            ObjectAnimator animator = ObjectAnimator.ofFloat(toastLayout, "translationY", 200, 0);
            animator.setDuration(200);
            animator.start();
            mCustomToast.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void cancelToast() {
        if (mCustomToast != null) {
            mCustomToast.cancel();
        }
    }

    @Override
    public void cancel() {
        try {
            super.cancel();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void show() {
        try {
            super.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
