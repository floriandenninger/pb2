package defpackage;

import android.widget.Button;
import android.widget.CompoundButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zyo implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ mi a;

    public zyo(mi miVar) {
        this.a = miVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Button b = this.a.b(-1);
        if (b != null) {
            b.setEnabled(!z);
        }
    }
}
