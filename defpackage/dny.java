package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dny implements Runnable {
    final /* synthetic */ dnz a;

    public dny(dnz dnzVar) {
        this.a = dnzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c = Choreographer.getInstance();
    }
}
