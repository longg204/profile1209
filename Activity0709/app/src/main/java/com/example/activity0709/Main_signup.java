package com.example.activity0709;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main_signup extends AppCompatActivity {

    private Button signup;
    private ImageView back_signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signup = (Button) findViewById(R.id.signup_btn);
        back_signup = (ImageView) findViewById(R.id.signup_back_button);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_signup.this, Main_login.class );
                startActivity(intent);
            }
        });

        back_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_back = new Intent(Main_signup.this, Main_login.class);
                startActivity(intent_back);
            }
        });
    }
}