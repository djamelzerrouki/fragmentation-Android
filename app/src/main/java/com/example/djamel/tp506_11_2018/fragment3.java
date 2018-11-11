package com.example.djamel.tp506_11_2018;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class fragment3 extends Fragment {
 fragment3listner listner;
     public interface fragment3listner{
        void updatedata3(String s);
    }

    TextView textView;
    Button button;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment3_layout,container,false);
          textView=(TextView) v.findViewById(R.id.textViewF3);
        button=(Button) v.findViewById(R.id.buttonE3);

        return v;
    }

    public void updateText(String text){
        textView.setText(text);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof fragment2.fragment2listner) listner= (fragment3listner) context;
        else throw new RuntimeException(context.toString()+" implement fragment2listner");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        listner=null;
    }
}
