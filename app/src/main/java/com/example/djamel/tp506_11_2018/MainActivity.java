package com.example.djamel.tp506_11_2018;

import    android.support.v4.app.FragmentManager;
import    android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements fragment3.fragment3listner,fragment2.fragment2listner{
     private LinearLayout fragmentE1, fragmentE2, fragmentE3  ;
    TextView textView1 ,textView2, textView3;

    private static FragmentManager mFragmentManager;
    FragmentTransaction transaction;
    public static TextView Elemant3;
    fragment1 f1;
    fragment2 f2;
    fragment3 f3 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         fragmentE1 = (LinearLayout) findViewById(R.id.fragment_E1);
         fragmentE2 = (LinearLayout) findViewById(R.id.fragment_E2);
         fragmentE3 = (LinearLayout) findViewById(R.id.fragment_E3);
f1=new fragment1();
f2=new fragment2();
        f3=new fragment3();

        textView1=(TextView)   findViewById(R.id.textViewF3_1);
        textView2=(TextView) findViewById(R.id.textViewF3_2);
        textView3=(TextView) findViewById(R.id.textViewF3_3);
        //Elemant3 = (TextView) findViewById(R.id.textViewF3);
         //fragmentE2.setVisibility(View.GONE);
          //
        fragmentE1.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        mFragmentManager = getSupportFragmentManager();
        transaction  = mFragmentManager.beginTransaction();
        transaction.add(fragmentE1.getId(),f1);
        transaction.add(fragmentE2.getId(),f2);
        transaction.add(fragmentE3.getId(),f3);
        transaction.hide(f2);
        transaction.hide(f3);
        transaction.commit();


    }


    public void addfragment(View view) {

        fragmentE1.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));
        fragmentE2.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        mFragmentManager = getSupportFragmentManager();
        transaction  = mFragmentManager.beginTransaction();
        transaction.show(f2);
        transaction.commit();


    }

    public void addfragment3(View view) {
        fragmentE2.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));
        fragmentE3.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        mFragmentManager = getSupportFragmentManager();
        transaction  = mFragmentManager.beginTransaction();
        transaction.show(f3);
        transaction.commit();
    }

/*    public void addfragment4(View view) {
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
    }*/

    @Override
    public void updatedata2(int s) {
       int i= f3.updateText(s);

        fragmentE2.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));
        fragmentE3.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        mFragmentManager = getSupportFragmentManager();
        transaction  = mFragmentManager.beginTransaction();
        transaction.show(f3);
        transaction.commit();
    }
    @Override
    public void updatedata3(int s) {
        f3.updateText(s);
    }
   /* public void updatfragment3(View view) {
        switch (view.getId()){

            case R.id.Elemant1:{ Toast.makeText(this,"Elemant1",Toast.LENGTH_LONG).show();
          //f3.updateText("E11\nE12");
          //  Elemant3.setText();
            }
            case R.id.Elemant2:{ Toast.makeText(this,"Elemant2",Toast.LENGTH_LONG).show();
            //Elemant3.setText("E21\nE22\nE23");
            }
             case R.id.Elemant3:{ Toast.makeText(this,"Elemant3",Toast.LENGTH_LONG).show();
           //  Elemant3.setText("E31\nE32");
             }

        }
    }*/
}