package defpackage;

import android.os.Build;
import android.os.Process;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class usw {
    public static final usw a = new usw();
    public volatile boolean b;
    public volatile long c;
    public volatile long d;
    public volatile long e;
    public volatile long f;
    public volatile long g;
    public volatile long h;
    public volatile long i;
    public volatile long j;
    public volatile long k;
    public volatile und l;
    public final usv m = new usv();
    public final uso n = new uso();
    public final uso o = new uso();

    public static void a(String str, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j - Process.getStartElapsedRealtime());
            Trace.setCounter(str, 0L);
        }
    }
}
