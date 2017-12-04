package com.example.allisonreiss.hark;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Create Screen to select daily feelings
 */
public class Feeling extends Fragment {
    private OnFragmentInteractionListener mListener;
    FloatingActionButton happy, sad, cry, veryUneasy, terrible, horrible;
    Button backBtn;

    /**
     * Empty Feeling constructor
     */
    public Feeling() {
        // Required empty public constructor
    }

    /**
     * Create new instance of Feeling Fragment
     * @return Feeling Fragment
     */
    public static Feeling newInstance() {
        Feeling fragment = new Feeling();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    /**
     * Create Bundle
     * @param savedInstanceState Bundle to create
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * Initialize elements onto Feeling Fragment
     * @param inflater LayoutInflater to inflate fragment
     * @param container ViewGroup Location of container
     * @param savedInstanceState Bundle
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_feeling, container, false);
        happy = view.findViewById(R.id.happy);
        sad = view.findViewById(R.id.sad);
        cry = view.findViewById(R.id.cry);
        veryUneasy = view.findViewById(R.id.very_uneasy);
        terrible = view.findViewById(R.id.terrible);
        horrible = view.findViewById(R.id.horrible);

        backBtn = view.findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                getFragmentManager().popBackStack();
            }
        });
        return view;
    }

    /**
     * Retrieve data on button press
     * @param uri Listener
     */
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }
/*
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }*/

    /**
     * Detach fragment
     */
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
