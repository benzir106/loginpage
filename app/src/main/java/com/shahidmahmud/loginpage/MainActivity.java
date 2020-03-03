package com.shahidmahmud.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private TextInputEditText pass;
    private Button login, creat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.EmailId);
        pass = findViewById(R.id.passId);
        login = findViewById(R.id.logID);

        creat = findViewById(R.id.creatId);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if ((!email.getText().toString().isEmpty() && email.getText().toString().equals("example@gmail.com")
                        && !pass.getText().toString().isEmpty() && pass.getText().toString().equals("123456"))) {

                    Intent intent = new Intent(MainActivity.this, Welcome.class);
                    startActivity(intent);
                    finish();


                }
            }
        });


        creat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this, RegistrationForm.class);
                startActivity(intent);
            }
        });


    }
}
