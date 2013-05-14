package me.willings.test.activityfragmentsequence;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	Log.d("TEST", "Activity: Before super.onCreate");
        super.onCreate(savedInstanceState);
        Log.d("TEST", "Activity: After  super.onCreate");
        setContentView(R.layout.activity_main);
        
		FragmentManager fm = getSupportFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
		MainFragment fragment = new MainFragment();
		ft.replace(R.id.main_container, fragment);
		ft.commit();
    }
    
    @Override
    public void onStart() {
    	Log.d("TEST", "Activity: Before super.onStart");
    	super.onStart();
    	Log.d("TEST", "Activity: After  super.onStart");
    }
    
    @Override
    public void onResume() {
    	Log.d("TEST", "Activity: Before super.onResume");
    	super.onResume();
    	Log.d("TEST", "Activity: After  super.onResume");
    }
    
    @Override
    public void onPause() {
    	Log.d("TEST", "Activity: Before super.onPause");
    	super.onPause();
    	Log.d("TEST", "Activity: After  super.onPause");
    }
    
    @Override
    public void onStop() {
    	Log.d("TEST", "Activity: Before super.onStop");
    	super.onStop();
    	Log.d("TEST", "Activity: After  super.onStop");
    }

    @Override
    public void onDestroy() {
    	Log.d("TEST", "Activity: Before super.onDestroy");
    	super.onDestroy();
    	Log.d("TEST", "Activity: After  super.onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
