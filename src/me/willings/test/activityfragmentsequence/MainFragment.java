package me.willings.test.activityfragmentsequence;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {
	
	@Override
	public void onAttach(Activity activity) {
    	Log.d("TEST", "Fragment: Before super.onAttach");
		super.onAttach(activity);
    	Log.d("TEST", "Fragment: After  super.onAttach");
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d("TEST", "Fragment: Before super.onCreate");
		super.onCreate(savedInstanceState);
		Log.d("TEST", "Fragment: After  super.onCreate");
	}
	
	@Override
	public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_main, container, false);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.d("TEST", "Fragment: Before super.onActivityCreated");
		super.onActivityCreated(savedInstanceState);
		Log.d("TEST", "Fragment: After  super.onActivityCreated");
	}
	
	@Override
	public void onStart() {
		Log.d("TEST", "Fragment: Before super.onStart");
		super.onStart();
		Log.d("TEST", "Fragment: After  super.onStart");
	}
	
	@Override
	public void onResume() {
		Log.d("TEST", "Fragment: Before super.onResume");
		super.onResume();
		Log.d("TEST", "Fragment: After  super.onResume");
	}
	
	@Override
	public void onPause() {
		Log.d("TEST", "Fragment: Before super.onPause");
		super.onPause();
		Log.d("TEST", "Fragment: After  super.onPause");
	}
	
	@Override
	public void onStop() {
		Log.d("TEST", "Fragment: Before super.onStop");
		super.onStop();
		Log.d("TEST", "Fragment: After  super.onStop");
	}
	
	@Override
	public void onDestroyView() {
		Log.d("TEST", "Fragment: Before super.onDestroyView");
		super.onDestroyView();
		Log.d("TEST", "Fragment: After  super.onDestroyView");
	}
	
	@Override
	public void onDestroy() {
		Log.d("TEST", "Fragment: Before super.onDestroy");
		super.onDestroy();
		Log.d("TEST", "Fragment: After  super.onDestroy");
	}
	
	@Override
	public void onDetach() {
		Log.d("TEST", "Fragment: Before super.onDetach");
		super.onDetach();
		Log.d("TEST", "Fragment: After  super.onDetach");
	}

}
