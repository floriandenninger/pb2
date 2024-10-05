package defpackage;

import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
final class almk implements Runnable {
    final /* synthetic */ EditText a;
    final /* synthetic */ alml b;

    public almk(alml almlVar, EditText editText) {
        this.b = almlVar;
        this.a = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.removeTextChangedListener(this.b.a.a);
    }
}
