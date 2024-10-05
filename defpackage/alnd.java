package defpackage;

import android.widget.AutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alnd implements AutoCompleteTextView.OnDismissListener {
    final /* synthetic */ alnf a;

    public alnd(alnf alnfVar) {
        this.a = alnfVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        alnf alnfVar = this.a;
        alnfVar.d = true;
        alnfVar.f = System.currentTimeMillis();
        this.a.d(false);
    }
}
