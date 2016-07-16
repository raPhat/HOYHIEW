package th.co.hoyhiew.hoyhiewapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends Activity {

    private Handler myHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        myHandler = new Handler();

        myHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                Intent goMain = new Intent(getApplicationContext(),IntroApp.class);
                startActivity(goMain);
                overridePendingTransition(R.transition.activity_fade, R.transition.fade_out);
            }
        }, 3000);
    }
}
