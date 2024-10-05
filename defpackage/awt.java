package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class awt {
    private Exception a;
    private long b;

    public final void a() {
        this.a = null;
    }

    public final void b(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.a == null) {
            this.a = exc;
            this.b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime < this.b) {
            return;
        }
        Exception exc2 = this.a;
        a();
        throw exc2;
    }
}
