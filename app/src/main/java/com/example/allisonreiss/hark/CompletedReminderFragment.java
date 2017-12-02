package com.example.allisonreiss.hark;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CompletedReminderFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CompletedReminderFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CompletedReminderFragment extends Fragment {
    private Button confirm, back;


    private OnFragmentInteractionListener mListener;

    public CompletedReminderFragment() {
        // Required empty public constructor
    }

    public static CompletedReminderFragment newInstance() {
        CompletedReminderFragment fragment = new CompletedReminderFragment();
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
        View view = inflater.inflate(R.layout.fragment_completed_reminder, container, false);
        confirm = view.findViewById(R.id.confirm);
        back = view.findViewById(R.id.back);
        confirm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v) {
                getActivity().onBackPressed();
            }
        });

        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v) {
                ((ReminderActivity)getActivity()).selectFragment(1);
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

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
