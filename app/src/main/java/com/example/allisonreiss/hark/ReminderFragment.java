
package com.example.allisonreiss.hark;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ReminderFragment extends Fragment {
    FloatingActionButton addBtn;

    public static ReminderFragment newInstance() {
        ReminderFragment fragment = new ReminderFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_reminder, container, false);
        addBtn = (FloatingActionButton)view.findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v) {
                Fragment frag = AddMedicine.newInstance();

            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_layout, frag);
            transaction.commit();
            //    startActivity(new Intent(getActivity(), newMedScreen.class));
            }
        });
        return view;
    }
}
