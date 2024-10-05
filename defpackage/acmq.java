package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acmq implements acmd {
    public final Context a;
    public final Handler b;
    public final abru c;
    public final abqv d;
    public final abrn e;
    public abqt f;
    public boolean g;
    public String h;
    public abzu i;
    public abzz j;
    public acap k;
    public acaf l;
    public acac m;
    public acac n;
    public acas o;
    public final absp p;
    public final Runnable q;
    public final Runnable r;
    public final acab s;
    public final acaa t;
    public abwa u;
    private final Handler v;
    private boolean w;
    private boolean x;

    public acmq(Context context, abrn abrnVar, absp abspVar, abru abruVar, abqv abqvVar) {
        adyu.cH();
        adyu.dE();
        adyu.cJ();
        adyu.cE();
        adyu.cG();
        this.v = new Handler(Looper.getMainLooper());
        this.q = new acmg(this, 1);
        this.r = new acmg(this, 0);
        this.s = new acmk(this);
        this.t = new acml(this);
        this.a = context;
        this.e = abrnVar;
        this.p = abspVar;
        this.c = abruVar;
        this.d = abqvVar;
        this.g = false;
        HandlerThread handlerThread = new HandlerThread("LocalRecordingManagerThread", 0);
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
        handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: acmf
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                acmq acmqVar = acmq.this;
                zga.f("LocalRecordingManagerImpl", "Local Recording Manager thread has encounter an exception.", th);
                acmqVar.g();
            }
        });
    }

    @Override // defpackage.acmd
    public final void a(boolean z) {
        this.w = z;
        d();
    }

    @Override // defpackage.acmd
    public final void b(boolean z) {
        this.x = z;
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void c(boolean z) {
        final ?? r4;
        yjk.e();
        if (f()) {
            this.l.g(this.a, new acmm());
            r4 = 0;
        } else {
            zga.c("LocalRecordingManagerImpl", "Not able to stop muxer.");
            r4 = e();
        }
        this.g = false;
        this.v.post(new Runnable() { // from class: acmh
            @Override // java.lang.Runnable
            public final void run() {
                acmq acmqVar = acmq.this;
                int i = r4;
                abwa abwaVar = acmqVar.u;
                if (abwaVar != null) {
                    abwaVar.a(i);
                    acmqVar.u = null;
                }
            }
        });
    }

    public final void d() {
        abzu abzuVar = this.i;
        if (abzuVar != null) {
            boolean z = false;
            if (this.w && !this.x) {
                z = true;
            }
            abzuVar.d = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return (this.k == null || this.i == null || this.l == null || this.m == null || this.n == null) ? false : true;
    }

    public final boolean f() {
        acaf acafVar = this.l;
        return acafVar != null && acafVar.m();
    }

    public final void g() {
        this.v.post(new omm(19));
    }
}
