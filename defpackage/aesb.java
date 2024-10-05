package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aesb {
    final aesa a;
    private Object b = null;
    private long c = -1000;

    public aesb(aesa aesaVar) {
        this.a = aesaVar;
    }

    public final synchronized void a(Object obj, String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b != obj || elapsedRealtime - this.c >= 1000) {
            this.a.j("lcdi", str);
            this.b = obj;
            this.c = elapsedRealtime;
        }
    }
}
