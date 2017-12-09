package com.example.allisonreiss.hark;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class ProfileFragment extends Fragment {

    private Button calendarBtn;
    private Button feelingBtn;
    private Button journalBtn;

    public static ProfileFragment newInstance() {
        ProfileFragment fragment = new ProfileFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        calendarBtn = (Button) view.findViewById(R.id.calendarButton);
        feelingBtn = (Button) view.findViewById(R.id.feelingsLogButton);
        journalBtn = (Button) view.findViewById(R.id.journalButton);

        feelingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = Feeling.newInstance();
                replaceFragment(frag);
            }
        });

        calendarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = CalendarFragment.newInstance();
                replaceFragment(fragment);
            }
        });

        journalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = JournalFragment.newInstance();
                replaceFragment(fragment);
            }
        });

        return view;
    }
    public void replaceFragment(Fragment someFrag) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, someFrag );
        transaction.addToBackStack(null);
        transaction.commit();
    }


/*
    // Set up profile selected listener
    OnProfileSelectedListener mCallback;

    // Container Activity must implement this interface
    public interface OnProfileSelectedListener {
        public void onArticleSelected(int position);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            mCallback = (OnProfileSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // Send the event to the host activity
        mCallback.onArticleSelected(position);
    }
*/
}
