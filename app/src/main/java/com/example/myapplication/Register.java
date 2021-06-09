package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity
{
    Button btnLogin, btnRegister;
    EditText txtNameReg, txtPasswordReg;
    public LoginDetails log = new LoginDetails();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnRegister = findViewById(R.id.btnRegister);
        txtNameReg = findViewById(R.id.txtNameReg);
        txtPasswordReg = findViewById(R.id.txtPasswordReg);
        log.setArray(50);

        btnRegister.setOnClickListener(new View.OnClickListener()
        {
                public void onClick(View v)
                {
                String strName = txtNameReg.getText().toString();
                String strPassword = txtPasswordReg.getText().toString();

                if ((strName.length() > 0) && (strPassword.length() >0))
                {
                    log.add(strName,strPassword);
                    Toast.makeText(Register.this, "New User Added Successfully!", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(getApplicationContext(), "You did not fill in all the fields",Toast.LENGTH_LONG).show();
                    txtNameReg.setError("Enter the value here");
                    txtPasswordReg.setError("Enter the value here");
                }
            }
        });
    }
    //for users who log in correctly
    public void LoginPage(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
