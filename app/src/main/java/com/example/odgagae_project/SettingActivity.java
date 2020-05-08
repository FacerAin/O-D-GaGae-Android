package com.example.odgagae_project;

;
import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

public class SettingActivity extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        setPreferencesFromResource(R.xml.settings_preference,s);
    }
}
