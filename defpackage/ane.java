package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ane implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ann b;

    public ane(String str, ann annVar) {
        this.a = str;
        this.b = annVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Log.e("FragmentStrictMode", azul.a("Policy violation with PENALTY_DEATH in ", this.a), this.b);
        throw this.b;
    }
}
