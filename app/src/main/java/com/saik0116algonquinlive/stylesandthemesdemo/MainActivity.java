package com.saik0116algonquinlive.stylesandthemesdemo;

import android.app.Activity;
import android.app.ActivityOptions;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txvGradient = (TextView) findViewById(R.id.txvGradient);
        LinearGradient linearGradient = new LinearGradient(0, 0, 0, txvGradient.getTextSize(),
                 Color.GREEN, Color.RED, Shader.TileMode.MIRROR );


        txvGradient.getPaint().setShader(linearGradient);
    }

    public void moveToSecondActivity(View view) {

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
            startActivity(intent, options.toBundle());
        } else {
            startActivity(intent);
        }


    }
}
