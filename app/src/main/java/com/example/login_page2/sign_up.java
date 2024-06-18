package com.example.login_page2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class sign_up extends AppCompatActivity {


    TextView login_txt,top_text_sign,skip;
    ImageView top_image_sign;
    EditText sign_name,sign_email,sign_password,sign_phone;
    Button sign_Register;
    ConstraintLayout main_back;
    Animation am;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


//       sign_up_DataBase g = new sign_up_DataBase(this);


        login_txt = findViewById(R.id.login_txt);
        top_text_sign = findViewById(R.id.top_text_sign);
        top_image_sign = findViewById(R.id.top_imageView_sign);
        sign_name = findViewById(R.id.sign_name);
        sign_email = findViewById(R.id.sign_email);
        sign_password = findViewById(R.id.sign_password);
        sign_phone = findViewById(R.id.sign_phone);
        sign_Register = findViewById(R.id.sign_register);
        skip = findViewById(R.id.skip);
        main_back = findViewById(R.id.main_layout);



        am = AnimationUtils.loadAnimation(this, R.anim.animation);
        sign_Register.startAnimation(am);

        AnimationDrawable animationDrawable = (AnimationDrawable) main_back.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(2000);
        animationDrawable.start();




        top_text_sign.setTranslationY(300);
        top_image_sign.setTranslationY(300);
       sign_name.setTranslationY(300);
        sign_email.setTranslationY(300);
        sign_password.setTranslationY(300);
        sign_phone.setTranslationY(300);
        login_txt.setTranslationY(300);
        sign_Register.setTranslationY(300);

        top_text_sign.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        top_image_sign.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        sign_name.animate().translationY(10).alpha(1).setDuration(1000).setStartDelay(600).start();
        sign_email.animate().translationY(10).alpha(1).setDuration(1000).setStartDelay(700).start();
        sign_password.animate().translationY(10).alpha(1).setDuration(1000).setStartDelay(800).start();
        sign_phone.animate().translationY(10).alpha(1).setDuration(1000).setStartDelay(900).start();
        login_txt.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1500).start();
        sign_Register.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1000).start();


        login_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(sign_up.this,log_in.class);
                startActivity(i1);
            }
        });
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(sign_up.this,MainActivity.class);
                startActivity(i1);
            }

        });
    }
}