package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.protos.youtube.api.innertube.LogStreamEventsCommandOuterClass$LogStreamEventsCommand;
import com.google.protos.youtube.api.innertube.RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand;
import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abtk implements absq {
    public final acab A;
    public abwa B;
    private final Handler C;
    private final HandlerThread D;
    private abrd E;
    private final acaa F;
    public final boolean a;
    public final Context b;
    public final Handler c;
    public final ScheduledExecutorService d;
    public final shf e;
    public final abrn f;
    public final absp g;
    public boolean h;
    public boolean i;
    public acac j;
    public acac k;
    public abzo l;
    public abzz m;
    public absn n;
    public acaf o;
    public boolean p;
    public acap q;
    public final boolean r;
    public volatile absi s;
    public abqt t;
    public abru u;
    public abqv v;
    public int w;
    public boolean x;
    public final Runnable y;
    public final Runnable z;

    public abtk(boolean z, Context context, shf shfVar, abrn abrnVar, absp abspVar) {
        adyu dE = adyu.dE();
        adyu.cH();
        adyu.cJ();
        adyu.cE();
        adyu.cG();
        if (adyu.b == null) {
            adyu.b = new adyu();
        }
        this.C = new Handler(Looper.getMainLooper());
        this.w = 0;
        this.F = new abte(this);
        this.y = new absz(this, 1);
        this.z = new absz(this, 0);
        this.A = new abth(this);
        this.a = z;
        this.b = context.getApplicationContext();
        this.e = shfVar;
        this.f = abrnVar;
        this.g = abspVar;
        dE.getClass();
        this.r = context.getPackageManager().hasSystemFeature("android.hardware.microphone");
        HandlerThread handlerThread = new HandlerThread("CodecThread", 0);
        this.D = handlerThread;
        handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: absx
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                abtk abtkVar = abtk.this;
                zga.f("MediaMuxCapturePipelineMgr", "Codec thread died unexpectedly", th);
                abtkVar.v(1);
            }
        });
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
        this.d = Executors.newSingleThreadScheduledExecutor(new yna(0, "AbrThread"));
        if (z) {
            this.u = new abru();
            this.v = new abqv(this.u);
            this.E = new abrd(this.v);
        }
    }

    private final boolean B() {
        acaf acafVar = this.o;
        return acafVar != null && acafVar.m();
    }

    public final void A(int i) {
        this.w = 0;
        this.C.post(new abta(this, i, 0));
    }

    @Override // defpackage.absq
    public final abrd a() {
        return this.E;
    }

    @Override // defpackage.absq
    public final absi b() {
        return this.s;
    }

    @Override // defpackage.absq
    public final void c(LogStreamEventsCommandOuterClass$LogStreamEventsCommand logStreamEventsCommandOuterClass$LogStreamEventsCommand) {
    }

    @Override // defpackage.absq
    public final void d(RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand recordStreamEventsCommandOuterClass$RecordStreamEventsCommand) {
    }

    @Override // defpackage.absq
    public final void e() {
    }

    @Override // defpackage.absq
    public final synchronized void f(abso absoVar) {
        this.c.post(new abst(this, absoVar, 1));
    }

    protected final void finalize() {
        HandlerThread handlerThread = this.D;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        super.finalize();
    }

    @Override // defpackage.absq
    public final synchronized void g(abso absoVar) {
        this.c.post(new abst(this, absoVar, 0));
    }

    @Override // defpackage.absq
    public final void h(abtl abtlVar) {
    }

    @Override // defpackage.absq
    public final synchronized void i(final absn absnVar, final abso absoVar) {
        this.c.post(new Runnable() { // from class: abtc
            @Override // java.lang.Runnable
            public final void run() {
                abtk abtkVar = abtk.this;
                absn absnVar2 = absnVar;
                abso absoVar2 = absoVar;
                yjk.e();
                if (abtkVar.w != 1) {
                    zga.c("MediaMuxCapturePipelineMgr", "Start capture requested when not prepared");
                    abtkVar.s(8, absoVar2);
                    return;
                }
                int i = 7;
                if (!abtkVar.y()) {
                    i = 2;
                } else if (abtkVar.j.d() && abtkVar.k.d() && abtkVar.q.h()) {
                    if (abtkVar.s != null && !abtkVar.x) {
                        abtkVar.s.d(true);
                    }
                    i = 0;
                }
                if (i != 0) {
                    abtkVar.s(i, absoVar2);
                    return;
                }
                abtkVar.n = absnVar2;
                abtkVar.w = 2;
                abtkVar.u(0, absoVar2);
            }
        });
        abvt.b().f(asrx.class, abtj.class, new abtj(this));
    }

    @Override // defpackage.absq
    public final boolean j() {
        return this.h;
    }

    @Override // defpackage.absq
    public final boolean k() {
        return ((acai) this.l).d;
    }

    @Override // defpackage.absq
    public final boolean l() {
        return this.i;
    }

    @Override // defpackage.absq
    public final abru m() {
        return this.u;
    }

    @Override // defpackage.absq
    public final synchronized void n(final boolean z, final abwf abwfVar) {
        this.c.post(new Runnable() { // from class: absw
            @Override // java.lang.Runnable
            public final void run() {
                abtk abtkVar = abtk.this;
                boolean z2 = z;
                abwf abwfVar2 = abwfVar;
                if (abtkVar.w == 0) {
                    abtkVar.z(2, abwfVar2);
                    return;
                }
                if (abtkVar.r || !z2) {
                    abtkVar.h = z2;
                    abtkVar.x();
                    abtkVar.z(0, abwfVar2);
                    return;
                }
                abtkVar.z(3, abwfVar2);
            }
        });
    }

    @Override // defpackage.absq
    public final void o(final abwa abwaVar) {
        this.n = null;
        this.c.post(new Runnable() { // from class: absu
            @Override // java.lang.Runnable
            public final void run() {
                abtk abtkVar = abtk.this;
                abwa abwaVar2 = abwaVar;
                yjk.e();
                abtkVar.B = abwaVar2;
                abtkVar.w();
                abtkVar.c.postDelayed(abtkVar.z, 250L);
            }
        });
        abvt.b().f(asrx.class, abtj.class, null);
    }

    @Override // defpackage.absq
    public final synchronized void p(abso absoVar) {
        this.c.post(new abst(this, absoVar, 2));
    }

    @Override // defpackage.absq
    public final synchronized void q(final boolean z, boolean z2, Integer num, Integer num2, final MediaFormat mediaFormat, final MediaFormat mediaFormat2, final String str, final String str2, final acap acapVar, final Bundle bundle, final abso absoVar) {
        this.c.post(new Runnable() { // from class: abtb
            /* JADX WARN: Removed duplicated region for block: B:111:0x01a3  */
            /* JADX WARN: Removed duplicated region for block: B:112:0x017e  */
            /* JADX WARN: Removed duplicated region for block: B:113:0x0156  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x011c  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0126  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0153  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x017c  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x01a1  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x01b3  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x01b7  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 794
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.abtb.run():void");
            }
        });
    }

    public final void r(boolean z) {
        yjk.e();
        this.c.removeCallbacks(this.y);
        this.c.removeCallbacks(this.z);
        if (!this.p) {
            zga.c("MediaMuxCapturePipelineMgr", "Re-entered codec pipeline stop handler.  Skipping");
            A(2);
        } else if (B()) {
            this.p = false;
            this.o.g(this.b, new abtf(this));
        } else {
            boolean y = y();
            t();
            this.p = false;
            A(y ? 1 : 0);
        }
    }

    public final void s(int i, abso absoVar) {
        yjk.e();
        amkq.N(true);
        t();
        u(i, absoVar);
    }

    public final void t() {
        acaf acafVar;
        yjk.e();
        w();
        B();
        if (this.p && (acafVar = this.o) != null) {
            acafVar.f();
        }
        if (this.o != null) {
            B();
            this.o.o();
            this.o = null;
        }
        acac acacVar = this.j;
        if (acacVar != null) {
            ((abzy) acacVar).e = null;
            acacVar.e();
            this.j.c();
            this.j = null;
        }
        acac acacVar2 = this.k;
        if (acacVar2 != null) {
            ((abzp) acacVar2).d = null;
            acacVar2.e();
            this.k.c();
            this.k = null;
        }
        this.w = 0;
        this.x = false;
    }

    public final void u(int i, abso absoVar) {
        this.C.post(new acnz(absoVar, i, 1));
    }

    public final void v(int i) {
        this.C.post(new abta(this, i, 1));
        if (adyu.cP(i)) {
            this.c.post(new absz(this, 2));
        }
    }

    public final void w() {
        if (this.s != null) {
            this.s.d(false);
        }
        acac acacVar = this.j;
        if (acacVar != null) {
            acacVar.l(this.F);
        }
        acac acacVar2 = this.k;
        if (acacVar2 != null) {
            acacVar2.l(this.F);
        }
        if (this.s != null) {
            this.s.d(false);
            this.s = null;
        }
        acap acapVar = this.q;
        if (acapVar != null) {
            acapVar.c(null, null);
            this.q.b(null, null);
            this.q.j();
            this.q.i();
            this.q = null;
        }
    }

    public final void x() {
        abzo abzoVar = this.l;
        if (abzoVar != null) {
            boolean z = false;
            if (this.h && !this.i) {
                z = true;
            }
            ((acai) abzoVar).d = z;
        }
    }

    public final boolean y() {
        return (this.q == null || this.j == null || this.k == null || this.l == null || this.o == null) ? false : true;
    }

    public final void z(final int i, final abwf abwfVar) {
        this.C.post(new Runnable() { // from class: abss
            @Override // java.lang.Runnable
            public final void run() {
                abwfVar.a(i, abtk.this.h);
            }
        });
    }
}
