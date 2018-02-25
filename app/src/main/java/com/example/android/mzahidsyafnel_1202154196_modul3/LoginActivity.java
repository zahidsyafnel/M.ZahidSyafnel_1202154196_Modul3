package com.example.android.mzahidsyafnel_1202154196_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    //method overide untuk menset activity login
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    //method untuk menampilkan userrname dan password
    public void login(View view) {
        EditText username = findViewById(R.id.username_edit);
        EditText password = findViewById(R.id.password_edit);
        String message;
        if (username.getText().toString().equals("EAD") && password.getText().toString().equals("MOBILE")) {
            message = "Berhasil login Bosku";
            startActivity(new Intent(this, MainActivity.class)); //kondisi benar jika login
        } else {
            message = "Gagal login Bosku,Coba Lagi!";
            finish();
            startActivity(getIntent()); //kondisi salah jika login
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show(); //toast untuk login
    }
}
