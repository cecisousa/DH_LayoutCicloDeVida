package com.example.layoutciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("cicloDeVida", "método onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("cicloDeVida", "método onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("cicloDeVida", "método onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("cicloDeVida", "método onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("cicloDeVida","método onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("cicloDeVida", "método onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("cicloDeVida", "método onDestroy");
    }

}
