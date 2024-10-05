package defpackage;

import android.os.Process;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bads {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final int d = Process.myTid();
    public final long e = SystemClock.elapsedRealtimeNanos();
    public final long f = SystemClock.currentThreadTimeMillis();

    public bads(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }
}
