package th.co.hoyhiew.hoyhiewapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends Activity {

    private Handler myHandler;
    private SingletonFoods singleton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        singleton = SingletonFoods.getInstance();

        myHandler = new Handler();

        myHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
<<<<<<< HEAD
                Intent goMain = new Intent(getApplicationContext(),IntroApp.class);
=======
                Intent goMain = new Intent(getApplicationContext(),MenuActivity.class);
>>>>>>> 9f6260fbe4725d67b019b568aa5fe42a0b3e235c
                startActivity(goMain);
                overridePendingTransition(R.transition.activity_fade, R.transition.fade_out);
            }
        }, 3000);
    }
}
