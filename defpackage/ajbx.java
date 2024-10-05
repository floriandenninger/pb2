package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajbx {
    public final avzn a;
    public long b;
    final long c;
    final long d;
    final long e;
    final /* synthetic */ ajby i;
    long f = 0;
    long g = 0;
    long h = 0;
    int j = 8;
    private final Runnable k = new Runnable() { // from class: ajbw
        @Override // java.lang.Runnable
        public final void run() {
            ajbx ajbxVar = ajbx.this;
            ajbxVar.d(ajbxVar.j);
            if (ajbxVar.g > ajbxVar.e || (ajbxVar.f <= ajbxVar.c && ajbxVar.h <= ajbxVar.d)) {
                zga.b("VideoQualityPromoRenderer triggered when criteria not met.");
                return;
            }
            ajbxVar.b();
            ajbxVar.i.setChanged();
            ajbxVar.i.notifyObservers(ajbxVar.a);
        }
    };

    public ajbx(ajby ajbyVar, avzq avzqVar, avzn avznVar) {
        this.i = ajbyVar;
        this.a = avznVar;
        this.c = TimeUnit.SECONDS.toMillis(avzqVar.d);
        this.d = TimeUnit.SECONDS.toMillis(avzqVar.e);
        this.e = TimeUnit.SECONDS.toMillis(avzqVar.f);
    }

    private final long e(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.b;
        this.j = i;
        this.b = elapsedRealtime;
        return elapsedRealtime - j;
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.i.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void b() {
        a();
        d(8);
    }

    public final void c(long j) {
        ScheduledFuture scheduledFuture = this.i.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ajby ajbyVar = this.i;
        ajbyVar.b = ajbyVar.a.schedule(this.k, j, TimeUnit.MILLISECONDS);
    }

    public final void d(int i) {
        aign aignVar = aign.NEW;
        int i2 = this.j;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        switch (i3) {
            case 0:
            case 1:
                this.f += e(i);
                return;
            case 2:
                this.g += e(i);
                return;
            case 3:
                this.h += e(i);
                return;
            case 4:
            case 5:
            case 6:
                e(i);
                return;
            default:
                return;
        }
    }
}
