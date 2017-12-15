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
 * create an instance of this fragment.
 */
public class fourthStory extends Fragment {
    private Button nextBtn, backBtn;



    /**
     * Create new instance of FirstStoryFragment
     * @return PickTimeFragment
     */
    public static fourthStory newInstance() {
        fourthStory fragment = new fourthStory();
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
        View view = inflater.inflate(R.layout.fragment_fourth_story, container, false);
        nextBtn = view.findViewById(R.id.nextButton);
        backBtn = (Button) view.findViewById(R.id.backButton);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = HomeFragment.newInstance();
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


    public void replaceFragment(Fragment someFrag) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout10, someFrag );
        transaction.addToBackStack(null);
        transaction.commit();
    }
}