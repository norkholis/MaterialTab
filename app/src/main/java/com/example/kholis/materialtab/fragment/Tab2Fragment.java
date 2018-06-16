package com.example.kholis.materialtab.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.kholis.materialtab.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2Fragment extends Fragment {

    private Button btnClickMe;

    public Tab2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_tab2, container, false);

        View view = inflater.inflate(R.layout.fragment_tab2, container, false);

        btnClickMe = (Button)view.findViewById(R.id.btn_click_me);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        btnClickMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View j){
                Toast.makeText(getActivity(), "Holla", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
