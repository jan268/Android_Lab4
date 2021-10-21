package com.example.myfrags;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

    private FragmentManager fragmentManager;
    private Fragment fragment1, fragment2, fragment3, fragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.frame1, fragment1);
        transaction.add(R.id.frame2, fragment2);
        transaction.add(R.id.frame3, fragment3);
        transaction.add(R.id.frame4, fragment4);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}