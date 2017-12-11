package com.example.allisonreiss.hark;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SecondStoryFragment.OnSecondFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SecondStoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondStoryFragment extends Fragment {
    private Button nextBtn, backBtn;

    private SecondStoryFragment.OnSecondFragmentInteractionListener mListener;

    /**
     * Empty public constructor
     */
    public SecondStoryFragment() {
        // Required empty public constructor
    }

    /**
     * Create new instance of FirstStoryFragment
     * @return PickTimeFragment
     */
    public static SecondStoryFragment newInstance() {
        SecondStoryFragment fragment = new SecondStoryFragment();
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
        View view = inflater.inflate(R.layout.fragment_second_story, container, false);
        nextBtn = view.findViewById(R.id.nextButton);
        backBtn = (Button) view.findViewById(R.id.backButton);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = ThirdStoryFragment.newInstance();
                replaceFragment(frag);
            }
        });

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
     * @param uri Uri
     */


    /**
     * Listen to interaction
     */
    public interface OnSecondFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public void replaceFragment(Fragment someFrag) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout7, someFrag );
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
