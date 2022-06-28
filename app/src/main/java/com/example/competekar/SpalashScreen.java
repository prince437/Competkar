package com.example.competekar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SpalashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalash_screen);
        getSupportActionBar().hide();
        Thread thread= new Thread() {
            public void run (){
                try {
                    Thread.sleep(3000);
                }
                catch ( Exception exception){
                    exception.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(SpalashScreen.this , Register.class);
                    startActivity(intent);
                    finish();


                }
            }
        };thread.start();
    }
}