package defpackage;

import android.net.TrafficStats;
import org.chromium.net.ThreadStatsUid;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bahf implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ bahj b;

    public bahf(bahj bahjVar, Runnable runnable) {
        this.b = bahjVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        TrafficStats.setThreadStatsTag(this.b.b);
        bahj bahjVar = this.b;
        if (bahjVar.c) {
            ThreadStatsUid.set(bahjVar.d);
        }
        try {
            this.a.run();
            if (this.b.c) {
                ThreadStatsUid.clear();
            }
            TrafficStats.setThreadStatsTag(threadStatsTag);
        } catch (Throwable th) {
            if (this.b.c) {
                ThreadStatsUid.clear();
            }
            TrafficStats.setThreadStatsTag(threadStatsTag);
            throw th;
        }
    }
}
