package com.rocketechit.loginactivitydesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private android.widget.EditText usernameET;
    private android.widget.EditText passET;
    private android.widget.CheckBox remindmecheckbox;
    private Button forgotpasswordbtn;
    private Button buttonsignin;
    private ImageView facebookiconbtn;
    private ImageView twittericonbtn;
    private ImageView googleiconbtn;
    private TextView signup_TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.googleiconbtn = (ImageView) findViewById(R.id.google_icon_btn);
        this.twittericonbtn = (ImageView) findViewById(R.id.twitter_icon_btn);
        this.facebookiconbtn = (ImageView) findViewById(R.id.facebook_icon_btn);
        this.buttonsignin = (Button) findViewById(R.id.button_signin);
        this.forgotpasswordbtn = (Button) findViewById(R.id.forgot_password_btn);
        this.remindmecheckbox = (CheckBox) findViewById(R.id.remind_me_check_box);
        this.passET = (EditText) findViewById(R.id.pass_ET);
        this.usernameET = (EditText) findViewById(R.id.username_ET);
        this.signup_TV = (TextView) findViewById(R.id.signup_btn);

        googleiconbtn.setOnClickListener(this);
        twittericonbtn.setOnClickListener(this);
        facebookiconbtn.setOnClickListener(this);
        buttonsignin.setOnClickListener(this);
        forgotpasswordbtn.setOnClickListener(this);
        passET.setOnClickListener(this);
        usernameET.setOnClickListener(this);
        signup_TV.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.remind_me_check_box:

                break;
            case R.id.forgot_password_btn:
                break;
            case R.id.button_signin:

                String user_name=usernameET.getText().toString();
                String pass_=passET.getText().toString();
                if (user_name.isEmpty()){
                    usernameET.setError("Enter User Name");
                    usernameET.requestFocus();
                    return;
                }
                if (pass_.isEmpty()){
                    passET.setError("Enter password");
                    passET.requestFocus();
                    return;
                }
                Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show();

                break;
            case R.id.facebook_icon_btn:
                break;
            case R.id.twitter_icon_btn:
                break;
            case R.id.google_icon_btn:
                break;
            case R.id.signup_btn:
                break;
        }

    }
}
