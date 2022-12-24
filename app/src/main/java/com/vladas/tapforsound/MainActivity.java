package com.vladas.tapforsound;

import android.app.Activity;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity {

    MediaPlayer mp = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Typeface font = Typeface.createFromAsset(getAssets(), "ostrich-black.ttf");

        Button b1 = (Button) findViewById(R.id.button1);
        b1.setTypeface(font);
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setTypeface(font);
        Button b3 = (Button) findViewById(R.id.button3);
        b3.setTypeface(font);
        Button b4 = (Button) findViewById(R.id.button4);
        b4.setTypeface(font);
        Button b5 = (Button) findViewById(R.id.button5);
        b5.setTypeface(font);
        Button b6 = (Button) findViewById(R.id.button6);
        b6.setTypeface(font);
        Button b7 = (Button) findViewById(R.id.button7);
        b7.setTypeface(font);
        Button b8 = (Button) findViewById(R.id.button8);
        b8.setTypeface(font);
        Button b9 = (Button) findViewById(R.id.button9);
        b9.setTypeface(font);
        Button b10 = (Button) findViewById(R.id.button10);
        b10.setTypeface(font);
        Button b11 = (Button) findViewById(R.id.button11);
        b11.setTypeface(font);
        Button b12 = (Button) findViewById(R.id.button12);
        b12.setTypeface(font);
        Button b13 = (Button) findViewById(R.id.button13);
        b13.setTypeface(font);
        Button b14 = (Button) findViewById(R.id.button14);
        b14.setTypeface(font);
        Button b15 = (Button) findViewById(R.id.button15);
        b15.setTypeface(font);
        Button b16 = (Button) findViewById(R.id.button16);
        b16.setTypeface(font);
        Button b17 = (Button) findViewById(R.id.button17);
        b17.setTypeface(font);
        Button b18 = (Button) findViewById(R.id.button18);
        b18.setTypeface(font);
        Button b19 = (Button) findViewById(R.id.button19);
        b19.setTypeface(font);
        Button b20 = (Button) findViewById(R.id.button20);
        b20.setTypeface(font);
        Button b21 = (Button) findViewById(R.id.button21);
        b21.setTypeface(font);
        Button b22 = (Button) findViewById(R.id.button22);
        b22.setTypeface(font);
        Button b23 = (Button) findViewById(R.id.button23);
        b23.setTypeface(font);
        Button b24 = (Button) findViewById(R.id.button24);
        b24.setTypeface(font);

        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    @Override
    public void onPause() {
        super.onStop();
        mp.release();
    }

    @Override
    public void onStop() {
        super.onStop();
        mp.release();
    }

    public void mPlayer(int id) {
        if(mp.isPlaying())
            mp.pause();
        else {
            mp = MediaPlayer.create(MainActivity.this, id);
            mp.start();
        }
    }

    public void playSound(View v) {
        switch(v.getId()) {
            case R.id.button1:
                mPlayer(R.raw.sound01);
                break;
            case R.id.button2:
                mPlayer(R.raw.sound02);
                break;
            case R.id.button3:
                mPlayer(R.raw.sound03);
                break;
            case R.id.button4:
                mPlayer(R.raw.sound04);
                break;
            case R.id.button5:
                mPlayer(R.raw.sound05);
                break;
            case R.id.button6:
                mPlayer(R.raw.sound06);
                break;
            case R.id.button7:
                mPlayer(R.raw.sound07);
                break;
            case R.id.button8:
                mPlayer(R.raw.sound08);
                break;
            case R.id.button9:
                mPlayer(R.raw.sound09);
                break;
            case R.id.button10:
                mPlayer(R.raw.sound10);
                break;
            case R.id.button11:
                mPlayer(R.raw.sound11);
                break;
            case R.id.button12:
                mPlayer(R.raw.sound12);
                break;
            case R.id.button13:
                mPlayer(R.raw.sound13);
                break;
            case R.id.button14:
                mPlayer(R.raw.sound14);
                break;
            case R.id.button15:
                mPlayer(R.raw.sound15);
                break;
            case R.id.button16:
                mPlayer(R.raw.sound16);
                break;
            case R.id.button17:
                mPlayer(R.raw.sound17);
                break;
            case R.id.button18:
                mPlayer(R.raw.sound18);
                break;
            case R.id.button19:
                mPlayer(R.raw.sound19);
                break;
            case R.id.button20:
                mPlayer(R.raw.sound20);
                break;
            case R.id.button21:
                mPlayer(R.raw.sound21);
                break;
            case R.id.button22:
                mPlayer(R.raw.sound22);
                break;
            case R.id.button23:
                mPlayer(R.raw.sound23);
                break;
            case R.id.button24:
                mPlayer(R.raw.sound24);
                break;
            default:
                break;
        }
    }
}