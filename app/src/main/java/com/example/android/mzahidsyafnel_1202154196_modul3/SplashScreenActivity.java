package com.example.android.mzahidsyafnel_1202154196_modul3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //mensetiingan agar splashscreen dapat muncul dengan fullscreen
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        //menampilkan pesan berisikan Nama_NIM
        Toast.makeText(SplashScreenActivity.this,"M.ZahidSyafnel_1202154196_Modul3",Toast.LENGTH_LONG).show();

        //melakukan intent ke menu selanjutnya setelah splash screen sudah muncul
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreenActivity.this, LoginActivity.class));
            }
        }, 3000); //menjalankan timer yang splash screen yang sudah di setting di atas
    }
}
