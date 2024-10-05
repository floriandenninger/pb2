package com.google.android.apps.youtube.app.settings;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import java.util.Map;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class IntListPreference extends ListPreference {
    public Map G;

    public IntListPreference(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void Y(String str) {
        aa(Integer.parseInt(str));
    }

    @Override // androidx.preference.ListPreference, androidx.preference.Preference
    public final CharSequence m() {
        Map map;
        int p = p(-1);
        if (p < 0 || (map = this.G) == null || !map.containsKey(String.valueOf(p))) {
            return super.m();
        }
        return (CharSequence) this.G.get(String.valueOf(p));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final String s(String str) {
        int p = p(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        return p != Integer.MIN_VALUE ? String.valueOf(p) : str;
    }

    public IntListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
