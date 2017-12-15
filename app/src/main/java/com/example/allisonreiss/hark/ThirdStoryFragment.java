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
 * Use the {@link ThirdStoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ThirdStoryFragment extends Fragment {
    private Button nextBtn, backBtn;



    /**
     * Create new instance of FirstStoryFragment
     * @return PickTimeFragment
     */
    public static ThirdStoryFragment newInstance() {
        ThirdStoryFragment fragment = new ThirdStoryFragment();
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
        View view = inflater.inflate(R.layout.fragment_third_story, container, false);
        nextBtn = view.findViewById(R.id.nextButton);
        backBtn = (Button) view.findViewById(R.id.backButton);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = fourthStory.newInstance();
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
        transaction.replace(R.id.frame_layout8, someFrag );
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
