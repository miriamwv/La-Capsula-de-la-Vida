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

/**
 * Screen to select Alarm time
 */
public class PickTimeFragment extends Fragment {
    private Button nextBtn, back;
    private TimePicker timePicker;

    private OnFragmentInteractionListener mListener;

    /**
     * Empty public constructor
     */
    public PickTimeFragment() {
        // Required empty public constructor
    }

    /**
     * Create new instance of PickTimeFragment
     * @return PickTimeFragment
     */
    public static PickTimeFragment newInstance() {
        PickTimeFragment fragment = new PickTimeFragment();
        return fragment;
    }

    /**
     * Create passed in Bundle
     * @param savedInstanceState Bundle to create
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * Initialize elements on PickTimeFragment
     * @param inflater LayoutInflater to inflate Fragment
     * @param container Location of ViewGroup
     * @param savedInstanceState Bundle
     * @return View of fragment
     */
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

    /**
     * Retrieve data on button press
     * @param uri Uri
     */
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }


    /**
     * Detach fragment
     */
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * Listen to interaction
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
