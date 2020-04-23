package com.ptreitler.preferencestest

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class MessagesPreferencesFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences_messages, rootKey)
    }
}