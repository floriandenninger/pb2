package defpackage;

import android.widget.CompoundButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wfq implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ wed a;
    private final /* synthetic */ int b;

    public wfq(wed wedVar, int i) {
        this.b = i;
        this.a = wedVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.b != 0) {
            if (compoundButton.isChecked()) {
                this.a.m();
            }
        } else if (compoundButton.isChecked()) {
            this.a.m();
        }
    }
}
