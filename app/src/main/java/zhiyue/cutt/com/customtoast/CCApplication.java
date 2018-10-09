package zhiyue.cutt.com.customtoast;

import android.app.Application;

public class CCApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ToastHelper.init(this);
    }
}
