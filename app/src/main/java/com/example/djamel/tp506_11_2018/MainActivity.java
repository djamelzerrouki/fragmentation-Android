package com.example.djamel.tp506_11_2018;

import    android.support.v4.app.FragmentManager;
import    android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     private LinearLayout fragmentE1, fragmentE2, fragmentE3  ;
    private static FragmentManager mFragmentManager;
    FragmentTransaction transaction;

    fragment3 f3 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         fragmentE1 = (LinearLayout) findViewById(R.id.fragment_E1);
         fragmentE2 = (LinearLayout) findViewById(R.id.fragment_E2);
         fragmentE3 = (LinearLayout) findViewById(R.id.fragment_E3);
//fragmentE2.setVisibility(View.GONE);
          //
        fragmentE1.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        fragment1  f1 = new  fragment1();
   mFragmentManager = getSupportFragmentManager();
         transaction  = mFragmentManager.beginTransaction();
        transaction.add(fragmentE1.getId(),new  fragment1() );

        transaction.commit();


    }


    public void addfragment(View view) {
        int vesib=fragmentE3.getVisibility();
    if ( vesib==4){
        fragmentE1.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));
        mFragmentManager = getSupportFragmentManager();
        transaction  = mFragmentManager.beginTransaction();
        fragment3 f3 = new  fragment3();
        transaction.add(fragmentE3.getId(),f3 );

        transaction.commit();

        fragmentE3.setVisibility(View.VISIBLE);

    }

    }

    public void addfragment3(View view) {
        int vesib=fragmentE2.getVisibility();

        if ( vesib==4){

            mFragmentManager = getSupportFragmentManager();
        transaction  = mFragmentManager.beginTransaction();
        transaction.add(fragmentE2.getId(),new  fragment2() );
         transaction.commit();
        fragmentE2.setVisibility(View.VISIBLE);

    }
    }

    public void addfragment4(View view) {
        int vesib=fragmentE3.getVisibility();

        if (vesib==0){
Toast.makeText(this,"1",Toast.LENGTH_LONG).show();
            transaction.remove(f3);
            fragmentE3.setLayoutParams(new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));

            mFragmentManager = getSupportFragmentManager();

            transaction  = mFragmentManager.beginTransaction();
             transaction.add(fragmentE3.getId(),new  fragment1());
transaction.commit();
        }
    }
}