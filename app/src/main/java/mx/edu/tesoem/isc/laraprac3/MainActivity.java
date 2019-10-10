package mx.edu.tesoem.isc.laraprac3;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent principal = new Intent(MainActivity.this, FRAME_ACTIVITY2.class);
                startActivity(principal);
                finish();
            }
        }, 4000);
    }
}
