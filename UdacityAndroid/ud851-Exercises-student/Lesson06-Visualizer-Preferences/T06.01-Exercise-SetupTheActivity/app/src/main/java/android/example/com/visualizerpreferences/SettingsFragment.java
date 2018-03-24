package android.example.com.visualizerpreferences;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;
/**
 * Created by lundquism on 3/24/18.
 */

public class SettingsFragment extends PreferenceFragmentCompat{
    @Override
    public void onCreatePreferences(Bundle savedinstanceState, String rootKey){
        addPreferencesFromResource(R.xml.pref_visualizer);

    }

}
