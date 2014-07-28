package com.example.foodbilling;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomViewFood extends ArrayAdapter<String>{
	
	  private final Context context;
	  private final String[] values;

	  public CustomViewFood(Context context, String[] values) {
	    super(context, R.layout.custom_list_food, values);
	    this.context = context;
	    this.values = values;
	  }

	  @Override
	  public View getView(int position, View convertView, ViewGroup parent) {
	    LayoutInflater inflater = (LayoutInflater) context
	        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View rowView = inflater.inflate(R.layout.custom_list_food, parent, false);
	    TextView textView = (TextView) rowView.findViewById(R.id.textView1);
	    
	    textView.setText(values[position]);

	    return rowView;
	  }

}
