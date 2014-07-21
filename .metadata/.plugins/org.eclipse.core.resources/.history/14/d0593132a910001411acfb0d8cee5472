package com.example.foodbilling;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.MotionEvent;
import com.example.foodbilling.OnSwipeTouchListener;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        int screenOrientation = getResources().getConfiguration().orientation;
        if (screenOrientation == Configuration.ORIENTATION_PORTRAIT) {
        	hideAlphaPane();
        	
        	View omegaPane = findViewById(R.id.foodlist); 
        	omegaPane.setOnTouchListener(new OnSwipeTouchListener(this) {
        		@Override
        		public void onSwipeLeft(){
        			hideAlphaPane();
        			super.onSwipeLeft();
        		}
        		
        		@Override
        		public void onSwipeRight(){
        			showAlphaPane();
        			super.onSwipeRight();
        		}
        		
        		@Override
        		public boolean onTouch(View v, MotionEvent event) {
        			hideAlphaPane();
        			return super.onTouch(v, event);
        		}
        		
        	});
        }
    }
    
    private void hideAlphaPane() {
    	View alphaPane = findViewById(R.id.sidemenu);
    	if (alphaPane.getVisibility() == View.VISIBLE) {
    		alphaPane.setVisibility(View.GONE);
    	}		
    }

    private void showAlphaPane() {
    	View alphaPane = findViewById(R.id.sidemenu);
    	if (alphaPane.getVisibility() == View.GONE) {
    		alphaPane.setVisibility(View.VISIBLE);
    	}
    }
}
