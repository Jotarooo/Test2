package com.example.test2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.play = findViewById(R.id.button3);
        play.setOnClickListener(view -> {
            Intent otheractivity = new Intent (getApplicationContext(),NombreActivity.class);
            startActivity(otheractivity);
            finish();
        });
    }


    public void goToAct(View view) {
        Intent intent = new Intent(getApplicationContext(), ChiffreAct.class);
        startActivity(intent);
        finish();
    }
}
