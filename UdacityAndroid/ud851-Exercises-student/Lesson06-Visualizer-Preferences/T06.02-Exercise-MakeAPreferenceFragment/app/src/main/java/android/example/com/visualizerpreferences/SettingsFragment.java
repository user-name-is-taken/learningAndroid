package android.example.com.visualizerpreferences;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by michael on 8/8/17.
 */
// TODO (2) Create a class called SettingsFragment that extends PreferenceFragmentCompat
public class SettingsFragment extends PreferenceFragmentCompat{

    // TODO (5) In SettingsFragment's onCreatePreferences method add the preference file using the
    // addPreferencesFromResource method
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.pref_visualizer);

    }
}
