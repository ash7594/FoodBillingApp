package com.example.foodbilling;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomViewGroups extends ArrayAdapter<String>{
	
	  private final Context context;
	  private final String[] values;

	  public CustomViewGroups(Context context, String[] values) {
	    super(context, R.layout.custom_list_groups, values);
	    this.context = context;
	    this.values = values;
	  }

	  @Override
	  public View getView(int position, View convertView, ViewGroup parent) {
	    LayoutInflater inflater = (LayoutInflater) context
	        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View rowView = inflater.inflate(R.layout.custom_list_groups, parent, false);
	    TextView textView = (TextView) rowView.findViewById(R.id.textView1);
	    
	    textView.setText(values[position]);

	    return rowView;
	  }

}
