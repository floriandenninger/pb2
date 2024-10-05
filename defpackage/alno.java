package defpackage;

import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alno implements Runnable {
    final /* synthetic */ EditText a;
    final /* synthetic */ alnp b;

    public alno(alnp alnpVar, EditText editText) {
        this.b = alnpVar;
        this.a = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.removeTextChangedListener(this.b.a.a);
    }
}
