package com.example.allisonreiss.hark;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CreateAccountFragment extends Fragment {
    TextView header, firstNameTitle, lastNameTitle, username, password;
    EditText name, lastName, usernameInput, passwordInput;

    /**
     * Create Bundle
     * @param savedInstanceState Bundle to create
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public static CreateAccountFragment newInstance() {
        CreateAccountFragment fragment = new CreateAccountFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_create_account, container, false);
        /*header = view.findViewById(R.id.header);
        firstNameTitle = view.findViewById(R.id.firstNameTitle);
        lastNameTitle = view.findViewById(R.id.lastNameTitle);
        username = view.findViewById(R.id.username);
        password = view.findViewById(R.id.password);

        name = view.findViewById(R.id.name);
        lastName = view.findViewById(R.id.lastName);
        usernameInput = view.findViewById(R.id.usernameInput);
        passwordInput = view.findViewById(R.id.passwordInput);*/
        return view;

    }

}
