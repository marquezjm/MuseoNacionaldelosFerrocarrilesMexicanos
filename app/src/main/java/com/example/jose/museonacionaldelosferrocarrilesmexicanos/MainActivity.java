package com.example.jose.museonacionaldelosferrocarrilesmexicanos;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;
import com.facebook.FacebookSdk;

public class MainActivity extends AppCompatActivity {

    ViewFlipper vf1;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1= (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,MapsActivity.class);
                startActivity(i);
            }
        });
        final ViewFlipper vf1= (ViewFlipper) this.findViewById(R.id.vf1);
        vf1.setFlipInterval(6000);
        vf1.setInAnimation(AnimationUtils.loadAnimation(this,R.anim.fade_in));
        vf1.setOutAnimation(AnimationUtils.loadAnimation(this,R.anim.fade_out));
        vf1.startFlipping();
    }

    //public void map1(View v){
      //  Intent intent= new Intent(this,MapsActivity.class);
        //startActivity(intent);
    //}

    public void info(View view){
        Intent i= new Intent(this,Informacion.class);
        startActivity(i);
        finish();
    }


}
