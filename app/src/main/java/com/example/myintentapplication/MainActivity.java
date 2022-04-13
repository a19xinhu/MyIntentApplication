package com.example.myintentapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonClick();
            }
        });
    }

    private void onButtonClick(){
        Log.d("MainActivity","I clicked the button.");
        Toast.makeText(this,"The button I clicked",Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("Name","daniel");
        startActivity(intent);
    }
}
