package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class QuickSeekListPreference extends ProtoDataStoreListPreference {
    public QuickSeekListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.preference.ListPreference, androidx.preference.Preference
    public final CharSequence m() {
        CharSequence l = l();
        if (TextUtils.isEmpty(l)) {
            return super.m();
        }
        int parseInt = Integer.parseInt(l.toString());
        return this.j.getResources().getQuantityString(R.plurals.quick_seek_x_second, parseInt, Integer.valueOf(parseInt));
    }
}
