package ir.deema.hbf2a;

import android.app.Application;

import com.deema.Ads;
import com.deema.config.SdkConfig;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SdkConfig.GDPRconsentflag(true);
        Ads.init(getApplicationContext());
    }
}
