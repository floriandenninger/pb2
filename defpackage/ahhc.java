package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahhc implements ahfy, ahkw, aioa, ypd {
    public boolean A;
    public int B;
    public int C;
    public final afgr D;
    private final ypa E;
    private final Handler F;
    private volatile boolean G;
    private String H;
    private String I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f52J;
    private boolean K;
    private volatile int L;
    private volatile boolean M;
    private volatile boolean N;
    private volatile float O;
    private volatile float P;
    public final Context a;
    public final aifs b;
    public final afgr c;
    public final azrw d;
    public final axfg e;
    public final List f;
    public final ahod g;
    public final ahhh h;
    public ahix i;
    public ahgs j;
    public ahfz k;
    public ahhm l;
    public ahkm m;
    public ahja n;
    public ahki o;
    public ahjt p;
    public Runnable q;
    public afld r;
    public Handler s;
    public ahkw t;
    public boolean u;
    public volatile boolean v;
    public volatile int w;
    public volatile int x;
    public aapb y;
    public boolean z;

    public ahhc(Context context, ypa ypaVar, aifs aifsVar, afgr afgrVar, afgr afgrVar2, azrw azrwVar, axfg axfgVar, byte[] bArr) {
        Handler handler = new Handler(context.getMainLooper());
        this.f = new ArrayList();
        this.B = 3;
        this.y = aapb.NOOP;
        this.C = 1;
        this.H = "";
        context.getClass();
        this.a = context;
        ypaVar.getClass();
        this.E = ypaVar;
        this.F = handler;
        aifsVar.getClass();
        this.b = aifsVar;
        afgrVar.getClass();
        this.D = afgrVar;
        afgrVar2.getClass();
        this.c = afgrVar2;
        azrwVar.getClass();
        this.d = azrwVar;
        axfgVar.getClass();
        this.e = axfgVar;
        this.g = new ahod(context);
        this.h = new ahhh(context);
    }

    private final void t(PlayerResponseModel playerResponseModel) {
        ahki ahkiVar;
        this.H = playerResponseModel.x();
        this.I = playerResponseModel.w();
        if (!u() || (ahkiVar = this.o) == null) {
            return;
        }
        ahkiVar.m(this.H, this.I);
    }

    private final boolean u() {
        return (this.k == null || this.j == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ahla a() {
        ahkz ahkzVar = ahkz.DISABLED;
        if (((this.M && !this.v) || (this.N && this.v)) && Math.min(this.w, this.x) <= this.L && this.O > 0.0f) {
            ahkzVar = this.G ? ahkz.PAUSED : ahkz.ENABLED;
        }
        return new ahla(ahkzVar, this.O, this.P);
    }

    public final void b(final ahhb ahhbVar) {
        ahhbVar.getClass();
        this.f.add(ahhbVar);
        n(new Runnable() { // from class: ahha
            @Override // java.lang.Runnable
            public final void run() {
                ahki ahkiVar;
                ahhc ahhcVar = ahhc.this;
                ahhb ahhbVar2 = ahhbVar;
                ahkm ahkmVar = ahhcVar.m;
                if (ahkmVar == null || (ahkiVar = ahhcVar.o) == null) {
                    return;
                }
                ahhbVar2.qF(ahkmVar, ahkiVar);
            }
        });
    }

    public final void c() {
        ahkm ahkmVar = this.m;
        if (ahkmVar == null) {
            return;
        }
        if (this.p == null) {
            try {
                ahjt ahjtVar = new ahjt(this.a, ahkmVar);
                this.p = ahjtVar;
                this.m.o(0, ahjtVar);
            } catch (ahkr e) {
                i(e);
                return;
            }
        }
        if (this.o == null) {
            try {
                ahki ahkiVar = new ahki(this.a, this.j.a(), this.m);
                this.o = ahkiVar;
                ahkiVar.t(this.f52J, this.K);
                this.o.j(this.v);
                this.m.n(this.o);
                if (this.m != null && this.o != null) {
                    Iterator it = this.f.iterator();
                    while (it.hasNext()) {
                        ((ahhb) it.next()).qF(this.m, this.o);
                    }
                }
                this.o.m(this.H, this.I);
            } catch (ahkr e2) {
                i(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.ahef r7) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahhc.d(ahef):void");
    }

    public final void g(aheg ahegVar) {
        ahix ahixVar = this.i;
        if (ahixVar != null) {
            long e = ahegVar.e();
            if (ahixVar.e) {
                ahiw ahiwVar = ahixVar.b;
                ahiwVar.j = e;
                ahiwVar.k = System.currentTimeMillis();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(ahej ahejVar) {
        long j;
        ahix ahixVar = this.i;
        if (ahixVar != null && ahixVar.e) {
            ahiw ahiwVar = ahixVar.b;
            if (ahejVar.a() == 2 && ahiwVar.g) {
                ahiwVar.g = false;
                j = 30000;
            } else if (ahejVar.a() != 2 && !ahiwVar.g) {
                ahiwVar.g = true;
                Handler handler = ahiwVar.a;
                if (handler != null) {
                    handler.removeCallbacks(ahiwVar.h);
                }
                j = 0;
            }
            ahiwVar.c(j);
        }
        this.G = ahejVar.e();
        r(a());
    }

    public final void i(ahkr ahkrVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(ahkrVar.getMessage());
        sb.append("\n");
        for (StackTraceElement stackTraceElement : ahkrVar.getStackTrace()) {
            sb.append(stackTraceElement);
            sb.append("\n");
        }
        zga.b(sb.toString());
        this.F.post(new ahgx(this, 1));
    }

    public final void j() {
        if (u()) {
            ahhi ahhiVar = this.k.g;
            if (ahhiVar != null) {
                ahhiVar.d = true;
            }
            this.E.d(new aheh());
        }
    }

    public final void k() {
        if (u()) {
            this.j.d();
            this.k.a();
        }
        this.u = false;
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        ayqx Y = aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 32L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahgv
            public final /* synthetic */ ahhc a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i2 = i;
                if (i2 == 0) {
                    this.a.g((aheg) obj);
                } else if (i2 != 1) {
                    this.a.h((ahej) obj);
                } else {
                    this.a.d((ahef) obj);
                }
            }
        }, ahfo.c);
        final int i2 = 0;
        final int i3 = 2;
        return new ayqx[]{Y, aiocVar.G().d.h(ahbw.g(aiocVar.aC(), 32L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahgv
            public final /* synthetic */ ahhc a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i2;
                if (i22 == 0) {
                    this.a.g((aheg) obj);
                } else if (i22 != 1) {
                    this.a.h((ahej) obj);
                } else {
                    this.a.d((ahef) obj);
                }
            }
        }, ahfo.c), aiocVar.G().i.h(ahbw.g(aiocVar.aC(), 32L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahgv
            public final /* synthetic */ ahhc a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i3;
                if (i22 == 0) {
                    this.a.g((aheg) obj);
                } else if (i22 != 1) {
                    this.a.h((ahej) obj);
                } else {
                    this.a.d((ahef) obj);
                }
            }
        }, ahfo.c)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahef.class, aheg.class, ahej.class};
        }
        if (i == 0) {
            d((ahef) obj);
            return null;
        }
        if (i == 1) {
            g((aheg) obj);
            return null;
        }
        if (i == 2) {
            h((ahej) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void l() {
        p();
        this.u = true;
    }

    public final void m() {
        if (u()) {
            this.k.c(this.v);
            this.k.h = this.l;
            this.b.p(this.v);
            boolean z = this.v;
            int i = 2;
            int i2 = 0;
            if (u()) {
                if (z) {
                    this.j.g(new ahgx(this, i));
                    this.j.a().setClickable(true);
                } else {
                    this.j.g(null);
                    this.j.a().setClickable(false);
                }
            }
            n(new ahgx(this, i2));
            r(a());
            this.s.obtainMessage(2, this.v ? 1 : 0, 0).sendToTarget();
        }
    }

    public final void n(Runnable runnable) {
        ahfz ahfzVar = this.k;
        if (ahfzVar != null) {
            ahfzVar.c.add(runnable);
        }
    }

    public final void o(final aapb aapbVar, final boolean z) {
        if (!u() || this.m == null) {
            return;
        }
        String.valueOf(String.valueOf(aapbVar)).length();
        n(new Runnable() { // from class: ahgz
            @Override // java.lang.Runnable
            public final void run() {
                ahkm ahkmVar;
                ahhc ahhcVar = ahhc.this;
                aapb aapbVar2 = aapbVar;
                boolean z2 = z;
                if (aapbVar2 == null || ahhcVar.k == null || (ahkmVar = ahhcVar.m) == null) {
                    String valueOf = String.valueOf(aapbVar2);
                    String valueOf2 = String.valueOf(ahhcVar.k);
                    String valueOf3 = String.valueOf(ahhcVar.m);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
                    sb.append("Null rendering mode. RM: ");
                    sb.append(valueOf);
                    sb.append(", CR: ");
                    sb.append(valueOf2);
                    sb.append(", SG: ");
                    sb.append(valueOf3);
                    zga.b(sb.toString());
                    return;
                }
                try {
                    int i = aapbVar2.a() ? z2 ? 2 : 3 : 1;
                    ahkmVar.b.k(aapbVar2, i);
                    ahkmVar.k = i;
                    Iterator it = ahkmVar.e.iterator();
                    while (it.hasNext()) {
                        ((ahkk) it.next()).z(i);
                    }
                    ahfz ahfzVar = ahhcVar.k;
                    int i2 = ahhcVar.m.k;
                    if (i2 == 0) {
                        throw null;
                    }
                    ahfzVar.l = i2;
                    ahfzVar.d();
                    if (ahhcVar.m.k == 1) {
                        ahix ahixVar = ahhcVar.i;
                        if (ahixVar != null) {
                            ahixVar.a();
                        }
                        ahhcVar.i = null;
                        ahhcVar.m.m = null;
                        return;
                    }
                    if (ahhcVar.i == null) {
                        ahhcVar.i = new ahix(ahhcVar.D, ahhcVar.c, ahhcVar.A, null);
                        ahix ahixVar2 = ahhcVar.i;
                        if (ahixVar2.e) {
                            ahixVar2.b.start();
                        }
                        ahhcVar.m.m = ahhcVar.i;
                    }
                } catch (ahkr e) {
                    ahhcVar.i(e);
                }
            }
        });
    }

    public final void p() {
        if (u()) {
            this.j.e();
            m();
        }
    }

    public final void q(ahhm ahhmVar, boolean z) {
        this.l = ahhmVar;
        this.v = z;
        m();
        if (z && this.u) {
            this.E.d(new aheh());
        }
    }

    public final void r(final ahla ahlaVar) {
        n(new Runnable() { // from class: ahgt
            @Override // java.lang.Runnable
            public final void run() {
                ahhc ahhcVar = ahhc.this;
                ahla ahlaVar2 = ahlaVar;
                ahkm ahkmVar = ahhcVar.m;
                if (ahkmVar != null) {
                    try {
                        ahkmVar.b.a(ahlaVar2);
                        ahnw ahnwVar = ahkmVar.a;
                        ahla ahlaVar3 = ahnwVar.a;
                        ahnwVar.a = ahlaVar2;
                        if (ahlaVar3.a() == ahlaVar2.a()) {
                            return;
                        }
                        ahnwVar.e();
                        ahnwVar.d();
                    } catch (ahkr e) {
                        ahhcVar.i(e);
                    }
                }
            }
        });
    }

    public final boolean s() {
        return (this.v || this.y.a()) ? false : true;
    }
}
