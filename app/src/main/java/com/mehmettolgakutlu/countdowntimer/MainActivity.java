package com.mehmettolgakutlu.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        new CountDownTimer(10000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                // Her saniyede bir ne yapayım ??
                textView.setText("Left : " + millisUntilFinished / 1000); // millisUntilFinished milisaniye olarak verdiği için dönüşüm yapıldı.
            }

            @Override
            public void onFinish() {
                // Bitince ne yapayım ??
                Toast.makeText(getApplicationContext(),"Done!",Toast.LENGTH_LONG).show(); // Done! mesajını uzun süre göster.
                textView.setText("Finished");

            }
        }.start(); // Timer'ı başlat.
    }
}