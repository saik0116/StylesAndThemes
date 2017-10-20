package com.saik0116algonquinlive.stylesandthemesdemo;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.view.View;


/**
 * Created by joshsaikaly on 2017-10-20.
 */

public class SecondActivity extends AppCompatActivity{

    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState){
        super .onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
        Explode explode = new Explode();
        explode.setDuration(1000);
        getWindow().setEnterTransition(explode);

    }
}


    public void moveToFirstActivity(View view) {

        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
            startActivity(intent, options.toBundle());
        } else {
            startActivity(intent);
        }


    }
}
