package com.example.foodbilling;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FoodlistFragment extends Fragment { 
	
	@Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) { 
		
		View view = inflater.inflate(R.layout.fragment_foodlist, container, false); 
		return view;
		}
	}
