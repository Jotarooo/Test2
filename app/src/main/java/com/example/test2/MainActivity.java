package com.example.test2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToAct(View view) {
        Intent intent = new Intent(getApplicationContext(), ChiffreAct.class);
        startActivity(intent);
        finish();
    }
}
