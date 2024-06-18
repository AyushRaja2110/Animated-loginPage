package com.example.login_page2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class log_in extends AppCompatActivity {

    FloatingActionButton google,fb;
    View top_text,top_logo;
    EditText log_email,log_password;
    Button login;
    TextView forget,or,register,help;
    ConstraintLayout top_main;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        google = findViewById(R.id.google);
        fb = findViewById(R.id.facebook);
        top_text = findViewById(R.id.top_text);
        top_logo = findViewById(R.id.top_imageView);
        log_email = findViewById(R.id.log_email);
        log_password = findViewById(R.id.log_password);
        login = findViewById(R.id.log_btn);
        forget = findViewById(R.id.log_ForgetPassword);
        or = findViewById(R.id.or);
        register = findViewById(R.id.register_txt);
        help = findViewById(R.id.help);
        top_main = findViewById(R.id.log_main);
        

        AnimationDrawable animationDrawable = (AnimationDrawable) top_main.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();

        google.setTranslationY(300);
        fb.setTranslationY(300);
        top_text.setTranslationY(300);
        top_logo.setTranslationY(300);
        log_email.setTranslationY(300);
         log_password.setTranslationY(300);
        login.setTranslationY(300);
           forget.setTranslationY(300);
          or.setTranslationY(300);
         register.setTranslationY(300);
         help.setTranslationY(300);

          google.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
         fb.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
          top_text.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
          top_logo.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
          log_email.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(700).start();
          log_password.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(700).start();
          login.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
          forget.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(900).start();
          or.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(900).start();
          register.animate().translationY(0).alpha(1).setDuration(2000).setStartDelay(1000).start();
          help.animate().translationY(0).alpha(1).setDuration(2000).setStartDelay(1000).start();


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(log_in.this,sign_up.class);
                startActivity(i1);
            }
        });

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://accounts.google.com/o/oauth2/auth/oauthchooseaccount?access_type=offline&client_id=686307615229-upe5nrmlgjpk1jepunl19tio0eu6s1tk.apps.googleusercontent.com&redirect_uri=https%3A%2F%2Fwww.amitree.com%2Fusers%2Fauth%2Fgoogle_oauth2%2Fcallback&response_type=code&scope=email%20profile%20https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fgmail.modify%20https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fgmail.settings.basic%20https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fcalendar&state=b4da15d2d300bd4b9800c47cdd420b107f495eb7aa9e7692&flowName=GeneralOAuthFlow";
                Intent i1 = new Intent(Intent.ACTION_VIEW);
                i1.setData(Uri.parse(url));
                startActivity(i1);

            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.facebook.com/login";
                Intent i1 = new Intent(Intent.ACTION_VIEW);
                i1.setData(Uri.parse(url));
                startActivity(i1);
            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://support.google.com/accounts/answer/6361026?hl=en&co=GENIE.Platform%3DAndroid";
                Intent i1 = new Intent(Intent.ACTION_VIEW);
                i1.setData(Uri.parse(url));
                startActivity(i1);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String eml = log_email.getText().toString();
                String pas = log_password.getText().toString();

                if(eml.isEmpty() || pas.isEmpty()){
                    Toast.makeText(log_in.this,"Please Enter All the fields",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}