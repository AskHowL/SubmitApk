package com.example.submitapk;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class IntentDetail extends AppCompatActivity {
    public static final String Array_Num = "0";
    public static final String Title = "title";
    public static final String Pic = "pic";
    private Context context;
    TextView tvCPU;
    TextView tvDisplay;
    TextView tvRAM;
    TextView tvScreen;
    ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        String num = getIntent().getStringExtra(Array_Num);
        String title = getIntent().getStringExtra(Title);
        String pic = getIntent().getStringExtra(Pic);
        setMode(num,title,pic);

    }

    public void setMode(String num, String title, String img) {
        tvCPU = findViewById(R.id.cpu);
        tvDisplay = findViewById(R.id.display);
        tvRAM = findViewById(R.id.ram);
        tvScreen = findViewById(R.id.screen);
        imgPhoto = findViewById(R.id.IVDetail);

        switch (num) {
            case "0":
                tvCPU.setText(getString(R.string.cpu0));
                tvDisplay.setText(getString(R.string.vga0));
                tvRAM.setText(getString(R.string.ram0));
                tvScreen.setText(getString(R.string.screen0));
                break;

            case "1":
                tvCPU.setText(getString(R.string.cpu1));
                tvDisplay.setText(getString(R.string.vga1));
                tvRAM.setText(getString(R.string.ram1));
                tvScreen.setText(getString(R.string.screen1));
                break;

            case "2":
                tvCPU.setText(getString(R.string.cpu2));
                tvDisplay.setText(getString(R.string.vga2));
                tvRAM.setText(getString(R.string.ram2));
                tvScreen.setText(getString(R.string.screen2));
                break;

            case "3":
                tvCPU.setText(getString(R.string.cpu3));
                tvDisplay.setText(getString(R.string.vga3));
                tvRAM.setText(getString(R.string.ram3));
                tvScreen.setText(getString(R.string.screen3));
                break;

            case "4":
                tvCPU.setText(getString(R.string.cpu4));
                tvDisplay.setText(getString(R.string.vga4));
                tvRAM.setText(getString(R.string.ram4));
                tvScreen.setText(getString(R.string.screen4));
                break;

            case "5":
                tvCPU.setText(getString(R.string.cpu5));
                tvDisplay.setText(getString(R.string.vga5));
                tvRAM.setText(getString(R.string.ram5));
                tvScreen.setText(getString(R.string.screen5));
                break;
        }


        Glide.with(this)
                .load(img)
                .apply(new RequestOptions().override(500, 500))
                .into(imgPhoto);

        setActionBarTitle(title);

    }

    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }


}