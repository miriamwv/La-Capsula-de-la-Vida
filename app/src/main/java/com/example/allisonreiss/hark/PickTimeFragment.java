package com.example.allisonreiss.hark;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;

public class PickTimeFragment extends Fragment {
    private Button nextBtn, back;
    private TimePicker timePicker;

    private OnFragmentInteractionListener mListener;

    public PickTimeFragment() {
        // Required empty public constructor
    }

    public static PickTimeFragment newInstance() {
        PickTimeFragment fragment = new PickTimeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pick_time, container, false);
        nextBtn = view.findViewById(R.id.nextBtn);
        timePicker = (TimePicker) view.findViewById(R.id.timePicker2);
        back = (Button) view.findViewById(R.id.backBtn);
        nextBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v) {
                ((ReminderActivity)getActivity()).selectFragment(2);
            }
        });

        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v) {
                ((ReminderActivity)getActivity()).selectFragment(0);
            }
        });

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
