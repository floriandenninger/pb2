package defpackage;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class brl implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ CheckBoxPreference a;

    public brl(CheckBoxPreference checkBoxPreference) {
        this.a = checkBoxPreference;
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
