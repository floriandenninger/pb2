package defpackage;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class btb implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ SwitchPreference a;

    public btb(SwitchPreference switchPreference) {
        this.a = switchPreference;
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
