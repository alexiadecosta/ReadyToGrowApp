package com.example.treegame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
Button b;
int trials=0;
int hearts=2;
int cash =2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introlayout);
        b = (Button)findViewById(R.id.button);




    }
    public void onClickOne(View view) {
       // Intent intent = new Intent(MainActivity.this, SeedActivity.class);
        setContentView(R.layout.seedstage);
    }
    public void onClickTwo(View view) {
        //Intent intent = new Intent(MainActivity.this, SeedActivity.class);
        setContentView(R.layout.cloudstage);
    }
    public void onClickThree(View view) {

        setContentView(R.layout.sunnystage);
    }
    public void onClickFour(View view) {

        setContentView(R.layout.treeone);

    }


    public void onClickT1Good(View view) {  //good

        setContentView(R.layout.treezero);
    }



    public void onClickT1Bad(View view) { //good

        setContentView(R.layout.treezerobad);


    }
    public void onClickT2Good(View view) {
        setContentView(R.layout.treetwo);

    }
    public void onClickT2Bad(View view) {
        setContentView(R.layout.treetwo);

    }
    public void BADENDING(View view){
        setContentView(R.layout.badend);
    }
    public void GOODENDING(View view){
        setContentView(R.layout.goodend);
    }
}