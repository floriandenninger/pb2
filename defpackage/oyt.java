package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class oyt implements oxp {
    public boolean a;
    public long b;
    public long c;

    public static final long d(long j) {
        return (SystemClock.elapsedRealtime() * 1000) - j;
    }

    @Override // defpackage.oxp
    public final long a() {
        return this.a ? d(this.c) : this.b;
    }

    public final void b(long j) {
        this.b = j;
        this.c = d(j);
    }

    public final void c() {
        if (this.a) {
            this.b = d(this.c);
            this.a = false;
        }
    }
}
