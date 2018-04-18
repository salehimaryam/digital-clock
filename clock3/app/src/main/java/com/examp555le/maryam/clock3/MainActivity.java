package com.examp555le.maryam.clock3;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int hour;
    public int minute;
    public int second;
    public String AP;
    public String bt1;


@Override
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


    final MediaPlayer yek=MediaPlayer.create(this , R.id._1);
    final MediaPlayer yekO= MediaPlayer.create(this , R.id._1_o);
    final MediaPlayer Do=MediaPlayer.create(this , R.id._2);
    final MediaPlayer DoO=MediaPlayer.create(this , R.id._2_o);
    final MediaPlayer se=MediaPlayer.create(this , R.id._3);
    final MediaPlayer seO=MediaPlayer.create(this , R.id._3_o);
    final MediaPlayer chahr=MediaPlayer.create(this , R.id._4);
    final MediaPlayer chaharO=MediaPlayer.create(this , R.id._4_o);
    final MediaPlayer panj=MediaPlayer.create(this , R.id._5);
    final MediaPlayer panjO=MediaPlayer.create(this , R.id._5_o);
    final MediaPlayer shish=MediaPlayer.create(this , R.id._6);
    final MediaPlayer shishO=MediaPlayer.create(this , R.id._6_o);
    final MediaPlayer haft=MediaPlayer.create(this , R.id._7);
    final MediaPlayer hafvO=MediaPlayer.create(this , R.id._7_o);
    final MediaPlayer hasht=MediaPlayer.create(this , R.id._8);
    final MediaPlayer hashtO=MediaPlayer.create(this , R.id._8_o);
    final MediaPlayer noh=MediaPlayer.create(this , R.id._9);
    final MediaPlayer nohO=MediaPlayer.create(this , R.id._9_o);
    final MediaPlayer dah=MediaPlayer.create(this , R.id._10);
    final MediaPlayer dahO=MediaPlayer.create(this , R.id._10_o);
    final MediaPlayer yazdah=MediaPlayer.create(this , R.id._11);
    final MediaPlayer davazdah=MediaPlayer.create(this , R.id._12);
    final MediaPlayer sizdah=MediaPlayer.create(this , R.id._13);
    final MediaPlayer chahardah=MediaPlayer.create(this , R.id._14);
    final MediaPlayer panzdah=MediaPlayer.create(this , R.id._15);
    final MediaPlayer shanzdah=MediaPlayer.create(this , R.id._16);
    final MediaPlayer hefdah=MediaPlayer.create(this , R.id._17);
    final MediaPlayer hejdah=MediaPlayer.create(this , R.id._18);
    final MediaPlayer nuzdah=MediaPlayer.create(this , R.id._19);
    final MediaPlayer bist=MediaPlayer.create(this , R.id._20);
    final MediaPlayer bistO=MediaPlayer.create(this , R.id._20_o);
    final MediaPlayer si=MediaPlayer.create(this , R.id._30);
    final MediaPlayer siO=MediaPlayer.create(this , R.id._30_o);
    final MediaPlayer chehl=MediaPlayer.create(this , R.id._40);
    final MediaPlayer chehelO=MediaPlayer.create(this , R.id._40_o);
    final MediaPlayer panjah=MediaPlayer.create(this , R.id._50);
    final MediaPlayer panjahO=MediaPlayer.create(this , R.id._50_o);
    final MediaPlayer saat=MediaPlayer.create(this , R.id._saat);
    final MediaPlayer Daghighe=MediaPlayer.create(this , R.id.Daghighe);
    final MediaPlayer DaghigheO=MediaPlayer.create(this , R.id.DaghigheO);
    final MediaPlayer saniye = MediaPlayer.create(this , R.id.saniye);

    final TextView hour = (TextView)findViewById(R.id.text1);
    final TextView minute = (TextView)findViewById(R.id.text3);
    final TextView second = (TextView)findViewById(R.id.text5);
    final TextView ap = (TextView)findViewById(R.id.text6);
    final Button bt = (TextView)findViewById(R.id.Button1);
}
sclock.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("WrongConstant")
        @Override
        public void onClick (View v){
            Calendar clock = Calendar.getInstance();
            second = clock.get(Calendar.SECOND);
            minute = clock.get(Calendar.MINUTE);
            hour = clock.get(Calendar.HOUR_OF_DAY);
        }
        if (second < 10)
            second.setText("0" + String.valueOf(second));
        else
            second.setText(String.valueOf(second));
        if ( minute < 10)
            minute.setText("0" + String.valueOf( minute));
        else
            minute.setText(String.valueOf( minute));
        if (hour < 10)
        {
            hour.setText("0" + String.valueOf(hour));
            AP = "AM";
        }
        else
        {
            if (hour < 12)
            {
                hour.setText(String.valueOf(hour));
                AP = "AM";
            }
            else if (hour == 12)
            {
                hour.setText("12");
                AP = "PM";
            }
            else
            {
                hour.setText("0" + String.valueOf(hour-12));
                AP = "PM";
            }
        }
        ap.setText(AP);
    }