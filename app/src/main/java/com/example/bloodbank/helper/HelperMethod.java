package com.example.bloodbank.helper;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class HelperMethod {
    // FragmentManager = getSupportFragmentManager       in id = id of blankFrame     Fragment = Target fragment

    public static void replaceFragment(FragmentManager supportFragmentManager, int id, Fragment fragment) {

        FragmentTransaction transaction = supportFragmentManager.beginTransaction();

        transaction.replace(id, fragment);

        transaction.addToBackStack(null);

        transaction.commit();

    }
}
