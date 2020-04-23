package com.ptreitler.preferencestest

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

@Suppress("unused")
class PreferencesFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences_main, rootKey)
    }
}