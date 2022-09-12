package com.example.activity0709;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Main_login extends AppCompatActivity {

    private Button login;
    private Button create;
    private TextInputEditText name_login;
    private TextInputEditText pass_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.login_btn);
        create = (Button) findViewById(R.id.create_btn);
        name_login = (TextInputEditText) findViewById(R.id.username_login);
        pass_login = (TextInputEditText) findViewById(R.id.password_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // kiểm tra điều kiện
                if(name_login.getText().length() !=0 && pass_login.getText().length() !=0){
                    if(name_login.getText().toString().equals("long") && pass_login.getText().toString().equals("123")){
                        Toast.makeText(Main_login.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Main_login.this, Main_profile.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(Main_login.this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                    }

                }else{
                    Toast.makeText(Main_login.this, "Vui lòng điền đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcreate = new Intent(Main_login.this, Main_signup.class);
                startActivity(intentcreate);
            }
        });
    }
}