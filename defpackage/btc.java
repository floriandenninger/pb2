package defpackage;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreferenceCompat;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class btc implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ SwitchPreferenceCompat a;

    public btc(SwitchPreferenceCompat switchPreferenceCompat) {
        this.a = switchPreferenceCompat;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.a.Q(Boolean.valueOf(z))) {
            compoundButton.setChecked(!z);
        } else {
            this.a.k(z);
        }
    }
}
