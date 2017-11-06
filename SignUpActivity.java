package com.sabdakosh.san.onetimeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by san on 11/5/2017.
 */

public class SignUpActivity extends AppCompatActivity {
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private View mProgressView;
    private View mLoginFormView;
    Button mSignup;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);
        mEmailView = (AutoCompleteTextView) findViewById(R.id.email);
        mPasswordView =(EditText) findViewById(R.id.password);
        mProgressView = (View) findViewById(R.id.login_progress);

    }
}
