package com.example.allisonreiss.hark;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;

/**
 * Implement AddMedicine page, user can add Medicinal information
 */
public class AddMedicine extends Fragment {
    private OnFragmentInteractionListener mListener;
    private FloatingActionButton addBtn;
    private Button nextBtn, cancel;
    private ImageView pill;
    private EditText medName;
    private NumberPicker numPicker;
    private TextView dosage;

    /**
     * Empty AddMedicine Constructor
     */
    public AddMedicine() {
        // Required empty public constructor
    }

    /**
     * AddMedicine Constructor
     * @return AddMedicine Fragment
     */
    public static AddMedicine newInstance() {
        AddMedicine fragment = new AddMedicine();
        return fragment;
    }

    /**
     * Create saved instance
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * Create Add New Medicine Page
     * @param inflater Inflater to inflate layout
     * @param container Container location
     * @param savedInstanceState false
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_medicine, container, false);
        // create pill icon
        pill = (ImageView)view.findViewById(R.id.pill);

        // create dosage selector
        numPicker = (NumberPicker) view.findViewById(R.id.numPicker);
        numPicker.setMinValue(1);
        numPicker.setMaxValue(50);

        // create label
        dosage = (TextView) view.findViewById(R.id.dosage);

        // create input medicine text field
        medName = (EditText) view.findViewById(R.id.medicineName);
        nextBtn = view.findViewById(R.id.nextBtn);

        // next button , pick time
        nextBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v) {
                ((ReminderActivity)getActivity()).selectFragment(1);
            }
        });

        // Cancel button, return to reminder's fragment
        cancel = view.findViewById(R.id.back);
        cancel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v) {
                getActivity().onBackPressed();
            }
        });
        return view;
    }

    /**
     * Go back to last page just visited (Reminder's Page)
     */
    public void onBackPressed()
    {
        FragmentManager fm = getActivity().getSupportFragmentManager();
        fm.popBackStack();
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
