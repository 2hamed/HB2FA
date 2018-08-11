package ir.deema.hbf2a;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.deema.adcontainer.NativeAdContainer;
import com.deema.adcontainer.listener.NativeOnLoadListener;
import com.deema.adcontainer.listener.OnCacheListener;

public class NativeAdActivity extends AppCompatActivity {
    private static final String TAG = "NativeAdActivity";

    ImageView imageView;
    TextView titleView, descView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native_ad);
        imageView = findViewById(R.id.imageView);
        titleView = findViewById(R.id.titleView);
        descView = findViewById(R.id.descView);

        NativeAdContainer nativeAdContainer = NativeAdContainer.Builder(new NativeAdContainer(this, "84"))
                .setImageView(imageView)
                .setTitleView(titleView)
                .setDescriptionView(descView)
                .build();
        nativeAdContainer.showAd(new OnCacheListener() {
            @Override
            public void noAdCache() {
                Log.d(TAG, "noAdCache: ");
            }
        });
    }
}
