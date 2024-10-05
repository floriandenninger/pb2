package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class addu {
    public static final String a = zga.a("MDX.MediaRouteLogger");
    static final long b = TimeUnit.MINUTES.toMillis(1);
    public final Handler c;
    public final acpl d;
    public final adch e;
    public final ypa f;
    public final Executor g;
    public final acun h;
    public final anib i;
    final addt j;
    final adds k;
    long l;
    public final adyu m;
    private final ysy n;

    public addu(adch adchVar, acpl acplVar, ysy ysyVar, ypa ypaVar, Executor executor, acun acunVar, anib anibVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        adyu adyuVar = new adyu();
        this.l = 0L;
        this.e = adchVar;
        acplVar.getClass();
        this.d = acplVar;
        this.c = handler;
        ysyVar.getClass();
        this.n = ysyVar;
        ypaVar.getClass();
        this.f = ypaVar;
        this.g = executor;
        this.h = acunVar;
        this.i = anibVar;
        this.m = adyuVar;
        this.j = new addt(this);
        this.k = new adds(this);
    }

    public final void a() {
        this.l = 0L;
        this.c.removeCallbacks(this.k);
        if (this.n.p() && this.n.r()) {
            this.c.postDelayed(this.k, b);
        }
    }
}
