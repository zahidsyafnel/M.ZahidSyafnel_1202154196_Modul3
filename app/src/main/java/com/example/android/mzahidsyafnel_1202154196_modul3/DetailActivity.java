package com.example.android.mzahidsyafnel_1202154196_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    //menggambarkan baterai yang ada di detail activity
    ImageView battery;
    int container = 1;

    //method override untuk activity detail
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView textView = findViewById(R.id.titleDetail);
        ImageView imageView = findViewById(R.id.header);
        TextView lorem = findViewById(R.id.detail);
        textView.setText(getIntent().getStringExtra("title"));
        imageView.setImageResource(getIntent().getIntExtra("image", 0));
        lorem.setText(getIntent().getStringExtra("detail"));
        battery = findViewById(R.id.imageView3);
        battery.setImageResource(R.drawable.ic_battery_20);

    }
    //method untuk mensetting baterai disaat decrease
    public void decrease(View view) {
        if (between(container--, 1, 3))
            level(container);
    }
    //method untuk mensetting baterai disaat increase
    public void increase(View view) {
        if (between(container++, 1, 3))
            level(container);
    }
    //method untuk nilai dari suatu baterai
    public boolean between(int i, int minValueInclusive, int maxValueInclusive) {
        if (i >= minValueInclusive && i <= maxValueInclusive)
            return true;
        else
            return false;
    }
    //method untuk menentukan level baterai
    public void level(int lvl) {
        switch (lvl) {
            case 1:
                battery.setImageResource(R.drawable.ic_battery_20);
                Toast.makeText(this, "Air Sedikit Bosku", Toast.LENGTH_SHORT).show(); //menampilkan toast di baterai sedikit
                break;
            case 2:
                battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                break;
            case 3:
                battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                Toast.makeText(this, "Air 100% Full", Toast.LENGTH_SHORT).show();
                break;
            default:
                if (lvl > 3) { //kondisi di saat baterai sedikit,setengah dan penuh
                    container = 3;
                } else if(lvl < 1) {
                    container = 1;
                }
        }
    }

}
