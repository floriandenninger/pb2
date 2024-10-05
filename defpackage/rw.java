package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rw implements Runnable {
    final /* synthetic */ sb a;
    private final rz b;

    public rw(sb sbVar, rz rzVar) {
        this.a = sbVar;
        this.b = rzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qo qoVar;
        qq qqVar = this.a.c;
        if (qqVar != null && (qoVar = qqVar.b) != null) {
            qoVar.O(qqVar);
        }
        View view = (View) this.a.f;
        if (view != null && view.getWindowToken() != null && this.b.i()) {
            this.a.k = this.b;
        }
        this.a.m = null;
    }
}
