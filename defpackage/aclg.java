package defpackage;

import android.widget.CompoundButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aclg implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ int a;

    public aclg(int i) {
        this.a = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.a != 0) {
            compoundButton.setChecked(false);
        } else {
            compoundButton.setChecked(false);
        }
    }
}
