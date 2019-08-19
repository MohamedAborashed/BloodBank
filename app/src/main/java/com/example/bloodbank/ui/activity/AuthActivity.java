package com.example.bloodbank.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bloodbank.R;
import com.example.bloodbank.ui.fragment.LoginFragment;

import static com.example.bloodbank.helper.HelperMethod.replaceFragment;

public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        if (savedInstanceState == null) {
            LoginFragment loginFragment = new LoginFragment();
            replaceFragment(getSupportFragmentManager() , R.id.Auth_Activity_Frame , loginFragment);
        }
    }
}
