package com.ptreitler.preferencestest

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class SyncPreferencesFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences_sync, rootKey)
    }
}