package com.example.marketplace;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.marketplace.Retrofit.ClientApi;
import com.example.marketplace.Retrofit.FournisseurApi;
import com.example.marketplace.Retrofit.RetrofitService;
import com.example.marketplace.models.Client;
import com.example.marketplace.models.Fournisseur;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUpFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    public TextView textSignIn;

    public EditText email1, password1, username1;
    public Button btnsignUp;

    public RadioGroup radioGroup;
    int selectedOption = -1;
    public String nom, email, password;
    private ClientApi clientApi = RetrofitService.getInstance().getClientApi();
    private FournisseurApi fournisseurApi = RetrofitService.getInstance().getFournisseurApi();

    public SignUpFragment() {
        // Required empty public constructor
    }

    public static SignUpFragment newInstance(String param1, String param2) {
        SignUpFragment fragment = new SignUpFragment();
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
        View view = inflater.inflate(R.layout.fragment_sign_up, container, false);
        textSignIn = view.findViewById(R.id.IdsignIn);
        username1 = view.findViewById(R.id.name);
        email1 = view.findViewById(R.id.Email);
        password1 = view.findViewById(R.id.Password);
        btnsignUp = view.findViewById(R.id.botton);
        radioGroup = view.findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                if (checkedId == R.id.option1) {
                    selectedOption = 1;
                } else if (checkedId == R.id.option2) {
                    selectedOption = 2;
                } else {
                    selectedOption = -1;
                }
            }
        });
        btnsignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddUser();
            }
        });

        textSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new LogInFragment()).commit();
            }
        });

        return view;
    }

    private void AddUser() {
        nom = username1.getText().toString().trim();
        email = email1.getText().toString().trim();
        password = password1.getText().toString().trim();


        if(selectedOption==1){
            if (!nom.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
                // Create a new Client object
                Client newClient = new Client(null, nom, email, password);

                // Call the API to add the client
                Call<Client> call = clientApi.createClient(newClient);
                call.enqueue(new Callback<Client>() {
                    @Override
                    public void onResponse(Call<Client> call, Response<Client> response) {
                        if (response.isSuccessful()) {
                            Toast.makeText(getContext(), "Customer added successfully", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getContext(), "Error adding customer", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<Client> call, Throwable t) {
                        Toast.makeText(getContext(), "please complete all fields", Toast.LENGTH_SHORT).show();
                    }
                });
            } else {
                Toast.makeText(getContext(), "Please select Customer or Supplier", Toast.LENGTH_SHORT).show();
            }

        }else if(selectedOption==2){

            if (!nom.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
                // Create a new Client object
                Fournisseur newFournisseur = new Fournisseur(null, nom, email, password);

                // Call the API to add the client
                Call<Fournisseur> call = fournisseurApi.createFournisseur(newFournisseur);
                call.enqueue(new Callback<Fournisseur>() {
                    @Override
                    public void onResponse(Call<Fournisseur> call, Response<Fournisseur> response) {
                        if (response.isSuccessful()) {
                            Toast.makeText(getContext(), "Spplier added successfully", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getContext(), "Error adding spplier", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<Fournisseur> call, Throwable t) {
                        Toast.makeText(getContext(), "Erreur de communication avec le serveur", Toast.LENGTH_SHORT).show();
                    }
                });
            } else {
                Toast.makeText(getContext(), "please complete all fields", Toast.LENGTH_SHORT).show();
            }

        }else {
            Toast.makeText(getContext(), "Please select Customer or Supplier", Toast.LENGTH_SHORT).show();

        }


    }
}
