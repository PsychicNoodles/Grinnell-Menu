package edu.grinnell.glicious.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import edu.grinnell.glicious.R;

public class PrefFrag extends PreferenceFragment {

	@Override
	public void onCreate(Bundle ofJoy) {
		super.onCreate(ofJoy);
		
		addPreferencesFromResource(R.xml.preferences);
	}
	
}
