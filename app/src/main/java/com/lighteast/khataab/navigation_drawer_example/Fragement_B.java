package com.lighteast.khataab.navigation_drawer_example;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragement_B extends Fragment {

    Button button;

    // here I also  have a button and implmented to go the second
    // Here I also create a NavController

    NavController navController;




    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragement__b, container, false);
           button=view.findViewById(R.id.go_to_third);
           navController=Navigation.findNavController(requireActivity(),R.id.navHostFragment);

           button.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   navController.navigate(R.id.go_from_second_to_third);


               }
           });
        return view;
    }
}