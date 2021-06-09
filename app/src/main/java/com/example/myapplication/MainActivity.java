package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText txtName, txtPassword;
    //String[] users = {"grandma", "grandpa", "grandson", "granddaughter"};
    //String[] passwords = {"1234", "4321", "1245", "0000"};
    public LoginDetails log = new LoginDetails();

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.btnLogin);
        txtName = findViewById(R.id.txtName);
        txtPassword = findViewById(R.id.txtPassword);
        log.setArray(10);//Setting array size for 10 users.


        btnLogin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String strName = txtName.getText().toString();
                String strPassword = txtPassword.getText().toString();

                if (log.Valid(strName, strPassword)) {
                    Toast.makeText(getApplicationContext(), "You are the real " + strName,
                            Toast.LENGTH_LONG).show();

                }
                else {
                    Toast.makeText(getApplicationContext(), "You are not the real " + strName +
                            " .....", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
    public void RegisterPage(View view)
    {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

}