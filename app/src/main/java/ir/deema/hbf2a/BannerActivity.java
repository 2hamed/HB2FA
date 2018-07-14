package ir.deema.hbf2a;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.deema.adcontainer.BannerContainer;
import com.deema.adcontainer.listener.BannerOnLoadListener;

public class BannerActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "BannerActivity";

    BannerContainer banner1;
    BannerContainer banner2;
    BannerContainer banner3;
    BannerContainer banner4;
    BannerContainer banner5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);

        banner1 = findViewById(R.id.banner1);
        banner2 = findViewById(R.id.banner2);
        banner3 = findViewById(R.id.banner3);
        banner4 = findViewById(R.id.banner4);
        banner5 = findViewById(R.id.banner5);

        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);
        findViewById(R.id.btn1).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                banner1.loadAd(new BannerOnLoadListener() {
                    @Override
                    public void onSuccess() {
                        Log.d(TAG, "onSuccess: Banner 1");
                        banner1.showAd(null);
                    }

                    @Override
                    public void onFailure(Exception e) {
                        Log.e(TAG, "onFailure: Banner 1", e);
                    }
                });
                break;
            case R.id.btn2:
                banner2.loadAd(new BannerOnLoadListener() {
                    @Override
                    public void onSuccess() {
                        Log.d(TAG, "onSuccess: Banner 2");
                        banner2.showAd(null);
                    }

                    @Override
                    public void onFailure(Exception e) {
                        Log.e(TAG, "onFailure: Banner 2", e);
                    }
                });
                break;
            case R.id.btn3:
                banner3.loadAd(new BannerOnLoadListener() {
                    @Override
                    public void onSuccess() {
                        Log.d(TAG, "onSuccess: Banner 3");
                        banner3.showAd(null);
                    }

                    @Override
                    public void onFailure(Exception e) {
                        Log.e(TAG, "onFailure: Banner 3", e);
                    }
                });
                break;
            case R.id.btn4:
                banner4.loadAd(new BannerOnLoadListener() {
                    @Override
                    public void onSuccess() {
                        Log.d(TAG, "onSuccess: Banner 4");
                        banner4.showAd(null);
                    }

                    @Override
                    public void onFailure(Exception e) {
                        Log.e(TAG, "onFailure: Banner 4", e);
                    }
                });
                break;
            case R.id.btn5:
                banner1.loadAd(new BannerOnLoadListener() {
                    @Override
                    public void onSuccess() {
                        Log.d(TAG, "onSuccess: Banner 5");
                        banner5.showAd(null);
                    }

                    @Override
                    public void onFailure(Exception e) {
                        Log.e(TAG, "onFailure: Banner 5", e);
                    }
                });
                break;
        }
    }
}
