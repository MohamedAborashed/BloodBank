package com.example.bloodbank.ui.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.bloodbank.R;
import com.example.bloodbank.helper.HelperMethod;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {


    @BindView(R.id.image_view_logo)
    ImageView imageViewLogo;
    @BindView(R.id.Linear)
    LinearLayout Linear;
    @BindView(R.id.checkBox)
    CheckBox checkBox;
    @BindView(R.id.Tv_forget_password)
    TextView TvForgetPassword;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.Btn_create_new_account)
    Button BtnCreateNewAccount;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @OnClick({R.id.Tv_forget_password, R.id.btn_login, R.id.Btn_create_new_account})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Tv_forget_password:
                ForgetPasswordFragment forgetPassFrg = new ForgetPasswordFragment();
                HelperMethod.replaceFragment(getFragmentManager(),R.id.Auth_Activity_Frame,forgetPassFrg);
                break;
            case R.id.btn_login:
                break;
            case R.id.Btn_create_new_account:
                break;
        }
    }
}
