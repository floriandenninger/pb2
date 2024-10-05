package defpackage;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class brr implements bsb {
    public static brr a;
    public static brr b;
    private final /* synthetic */ int c;

    public brr(int i) {
        this.c = i;
    }

    @Override // defpackage.bsb
    public final /* synthetic */ CharSequence a(Preference preference) {
        if (this.c != 0) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            return TextUtils.isEmpty(editTextPreference.g) ? editTextPreference.j.getString(R.string.not_set) : editTextPreference.g;
        }
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(listPreference.l())) {
            return listPreference.j.getString(R.string.not_set);
        }
        return listPreference.l();
    }
}
