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
        	hideBetaPane();
        	
        	View foodListPane = findViewById(R.id.foodlist); 
        	foodListPane.setOnTouchListener(new OnSwipeTouchListener(this) {
        		@Override
        		public void onSwipeLeft() {
        			View alphaPane = findViewById(R.id.sidemenu);
        			View betaPane = findViewById(R.id.cart);
        			if (alphaPane.getVisibility() == View.VISIBLE) {
        				hideAlphaPane();
        	    	} else if (betaPane.getVisibility() == View.GONE) {
        	    		showBetaPane();
        	    	}
        			super.onSwipeLeft();
        		}
        		
        		@Override
        		public void onSwipeRight() {
        			View alphaPane = findViewById(R.id.sidemenu);
        			View betaPane = findViewById(R.id.cart);
        			if (alphaPane.getVisibility() == View.GONE) {
        				showAlphaPane();
        	    	} else if (betaPane.getVisibility() == View.VISIBLE) {
        	    		hideBetaPane();
        	    	}
        			super.onSwipeRight();
        		}
        		
        		@Override
        		public boolean onTouch(View v, MotionEvent event) {
        			showAlphaPane();
        			showBetaPane();
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
    
    private void hideBetaPane() {
    	View betaPane = findViewById(R.id.cart);
    	if (betaPane.getVisibility() == View.VISIBLE) {
    		betaPane.setVisibility(View.GONE);
    	}		
    }

    private void showBetaPane() {
    	View betaPane = findViewById(R.id.cart);
    	if (betaPane.getVisibility() == View.GONE) {
    		betaPane.setVisibility(View.VISIBLE);
    	}
    }
}