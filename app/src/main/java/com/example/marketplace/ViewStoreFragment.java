package com.example.marketplace;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ViewStoreFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ViewStoreFragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Button AddProductStore;

    public ViewStoreFragment() {
        // Required empty public constructor
    }


    public static ViewStoreFragment newInstance(String param1, String param2) {
        ViewStoreFragment fragment = new ViewStoreFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     View view=inflater.inflate(R.layout.fragment_view_store, container, false);


        AddProductStore=view.findViewById(R.id.AddProductStore);
        AddProductStore.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new AddProductFragment()).commit();
            }});

        return view;
    }
}