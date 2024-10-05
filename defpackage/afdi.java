package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afdi implements afdk {
    private long a;

    @Override // defpackage.afdk
    public final void a() {
        this.a = SystemClock.elapsedRealtimeNanos();
    }

    @Override // defpackage.afdk
    public final void b() {
        if (this.a != 0) {
            afic aficVar = afic.ABR;
            SystemClock.elapsedRealtimeNanos();
            this.a = 0L;
        }
    }
}
