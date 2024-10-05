package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ufm {
    public static final ufm a = new ufm();
    public boolean b = false;
    public long c = -1;

    private ufm() {
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        if (z) {
            return;
        }
        this.c = SystemClock.elapsedRealtime();
    }
}
