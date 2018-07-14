package ir.deema.hbf2a;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.deema.adcontainer.InterstitialAdContainer;
import com.deema.adcontainer.VideoContainer;
import com.deema.adcontainer.listener.InterstitialListener;
import com.deema.adcontainer.listener.OnCacheListener;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    InterstitialAdContainer preCachedIntersAd;

    VideoContainer videoContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bannerBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BannerActivity.class));
            }
        });


        preCachedIntersAd = new InterstitialAdContainer(this, "74");
        preCachedIntersAd.loadAd(new InterstitialListener() {
            @Override
            public void closed() {

            }

            @Override
            public void onSuccess() {
                Log.d(TAG, "onSuccess: Ad loaded");
            }

            @Override
            public void onFailure(Exception e) {
                Log.e(TAG, "onFailure: Loading Ad", e);
            }
        });

        findViewById(R.id.preCacheIntersBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preCachedIntersAd.showAd(new OnCacheListener() {
                    @Override
                    public void noAdCache() {
                        Toast.makeText(MainActivity.this, "No Ad in Cache!", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });


        videoContainer = new VideoContainer(this, "75");
        videoContainer.loadAd(new InterstitialListener() {
            @Override
            public void closed() {

            }

            @Override
            public void onSuccess() {
                Log.d(TAG, "onSuccess: Video Ad loaded");
            }

            @Override
            public void onFailure(Exception e) {
                Log.e(TAG, "onFailure: Failed loading video", e);
            }
        });

        findViewById(R.id.videoBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoContainer.showAd(new OnCacheListener() {
                    @Override
                    public void noAdCache() {
                        Toast.makeText(MainActivity.this, "No Video Ad in Cache!", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
