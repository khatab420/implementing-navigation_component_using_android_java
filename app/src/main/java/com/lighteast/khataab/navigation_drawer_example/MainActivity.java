package com.lighteast.khataab.navigation_drawer_example;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class MainActivity extends AppCompatActivity {

    NavController navController;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navController=Navigation.findNavController(this,R.id.navHostFragment);
        // navHostFragment is the fragment Container in mainActivity

        // Retrieve the NavController associated with the NavHostFragment



    }

    public void goto_second(View view) {
        navController.navigate(R.id.go_from_first_to_second);

    }
}
