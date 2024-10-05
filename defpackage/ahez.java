package defpackage;

import android.animation.Animator;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Property;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahez implements ahep, ahfc, ahfa, aioa, ypd {
    private static final aheu a = new aheu(0);
    private static final Property i = new ahes(Long.class);
    public final aheq b;
    public final ahey c;
    public final ypa d;
    public final Set e;
    public int f;
    public atzm g;
    public Animator h;
    private final ahfd j;
    private final aahd k;
    private final acra l;
    private final ainl m;
    private final zbw n;
    private final ysy o;
    private final Handler p;
    private final Runnable q;
    private final Set r;
    private final azrw s;
    private String t;
    private boolean u;
    private int v;
    private boolean w;
    private final ahet x;
    private aigf y;
    private final fma z;

    public ahez(aheq aheqVar, ahfd ahfdVar, fma fmaVar, aahd aahdVar, acra acraVar, ainl ainlVar, zbw zbwVar, ysy ysyVar, ypa ypaVar, azrw azrwVar) {
        aheqVar.getClass();
        this.b = aheqVar;
        ahfdVar.getClass();
        this.j = ahfdVar;
        fmaVar.getClass();
        this.z = fmaVar;
        aahdVar.getClass();
        this.k = aahdVar;
        acraVar.getClass();
        this.l = acraVar;
        this.m = ainlVar;
        zbwVar.getClass();
        this.n = zbwVar;
        ysyVar.getClass();
        this.o = ysyVar;
        ypaVar.getClass();
        this.d = ypaVar;
        this.c = new ahey();
        ahfdVar.d(this);
        fmaVar.a.add(this);
        this.x = new ahet(this);
        this.p = new Handler(Looper.getMainLooper());
        this.f = 0;
        this.v = 0;
        this.q = new gkq(this, 2);
        this.e = Collections.newSetFromMap(new WeakHashMap());
        this.r = Collections.newSetFromMap(new WeakHashMap());
        azrwVar.getClass();
        this.s = azrwVar;
    }

    private final void a() {
        this.b.kV();
        this.c.a(false);
    }

    private final void d() {
        this.p.removeCallbacks(this.q);
    }

    private final void g(boolean z) {
        this.u = z;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((ahev) it.next()).G(this.u);
        }
    }

    private final void h(boolean z) {
        this.b.m(this.g, z);
        this.l.u(new acqx(this.g.q.I()), null);
        this.c.a(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b() {
        atzm atzmVar = this.g;
        if (atzmVar != null) {
            return atzmVar.l;
        }
        return 0;
    }

    public void c(ahef ahefVar) {
        String y = ahefVar.b() != null ? ahefVar.b().y() : null;
        if (!TextUtils.equals(y, this.t)) {
            this.t = null;
            this.g = null;
            this.f = 0;
            y();
            this.t = y;
            g(false);
        }
        aign c = ahefVar.c();
        if (c == aign.ENDED) {
            k();
        }
        if (this.f == 0 || c != aign.ENDED) {
            this.f = c.a(aign.READY, aign.PLAYBACK_LOADED, aign.VIDEO_PLAYING, aign.PLAYBACK_INTERRUPTED, aign.INTERSTITIAL_PLAYING) ? 1 : 0;
            g(false);
        } else if (this.f == 1) {
            this.f = 2;
        }
        y();
    }

    protected void i(WatchNextResponseModel watchNextResponseModel) {
    }

    protected void j() {
    }

    protected void k() {
    }

    @Override // defpackage.aioa
    public ayqx[] kI(aioc aiocVar) {
        final int i2 = 1;
        final int i3 = 2;
        ayqx Y = aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 2L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: aher
            public final /* synthetic */ ahez a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i3;
                if (i4 == 0) {
                    this.a.u((ahdv) obj);
                    return;
                }
                if (i4 == 1) {
                    this.a.s((ahcx) obj);
                } else if (i4 != 2) {
                    this.a.v((ahel) obj);
                } else {
                    this.a.c((ahef) obj);
                }
            }
        }, zxi.o);
        final int i4 = 0;
        final int i5 = 3;
        return new ayqx[]{Y, aiocVar.ao().h(ahbw.g(aiocVar.aC(), 2L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: aher
            public final /* synthetic */ ahez a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i42 = i4;
                if (i42 == 0) {
                    this.a.u((ahdv) obj);
                    return;
                }
                if (i42 == 1) {
                    this.a.s((ahcx) obj);
                } else if (i42 != 2) {
                    this.a.v((ahel) obj);
                } else {
                    this.a.c((ahef) obj);
                }
            }
        }, zxi.o), aiocVar.t().b.h(ahbw.g(aiocVar.aC(), 2L)).h(ahbw.e(0)).Y(new ayrs(this) { // from class: aher
            public final /* synthetic */ ahez a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i42 = i2;
                if (i42 == 0) {
                    this.a.u((ahdv) obj);
                    return;
                }
                if (i42 == 1) {
                    this.a.s((ahcx) obj);
                } else if (i42 != 2) {
                    this.a.v((ahel) obj);
                } else {
                    this.a.c((ahef) obj);
                }
            }
        }, zxi.o), aiocVar.ab().h(ahbw.g(aiocVar.aC(), 2L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: aher
            public final /* synthetic */ ahez a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i42 = i5;
                if (i42 == 0) {
                    this.a.u((ahdv) obj);
                    return;
                }
                if (i42 == 1) {
                    this.a.s((ahcx) obj);
                } else if (i42 != 2) {
                    this.a.v((ahel) obj);
                } else {
                    this.a.c((ahef) obj);
                }
            }
        }, zxi.o), aiocVar.V().h(ahbw.g(aiocVar.aC(), 2L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: aher
            public final /* synthetic */ ahez a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i42 = i5;
                if (i42 == 0) {
                    this.a.u((ahdv) obj);
                    return;
                }
                if (i42 == 1) {
                    this.a.s((ahcx) obj);
                } else if (i42 != 2) {
                    this.a.v((ahel) obj);
                } else {
                    this.a.c((ahef) obj);
                }
            }
        }, zxi.o)};
    }

    @Override // defpackage.ypd
    public Class[] kz(Class cls, Object obj, int i2) {
        return ahbl.a(this, obj, i2);
    }

    protected boolean l() {
        return true;
    }

    protected boolean m() {
        return true;
    }

    @Override // defpackage.ahep
    public final void p() {
        apmg a2 = ahbj.a(this.g);
        if (a2 != null) {
            this.l.I(3, new acqx(a2.t), null);
        }
        g(true);
        y();
    }

    @Override // defpackage.ahep
    public final void q(boolean z) {
        if (z) {
            if (m()) {
                Iterator it = this.r.iterator();
                while (it.hasNext()) {
                    ((ahex) it.next()).a();
                }
                j();
                acsx acsxVar = (acsx) this.s.get();
                aimr aimrVar = aimr.AUTONAV;
                aigc a2 = aigd.a();
                a2.a = acsxVar;
                this.m.a(new aims(aimrVar, null, a2.a()));
                return;
            }
            return;
        }
        apmg b = ahbj.b(this.g);
        if (b != null) {
            this.l.I(3, new acqx(b.t), null);
            apxf apxfVar = b.o;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            w(apxfVar);
        }
    }

    public final void r(ahew ahewVar) {
        this.c.a.add(ahewVar);
    }

    public final void s(ahcx ahcxVar) {
        this.y = ahcxVar.d();
        y();
    }

    @Override // defpackage.ahfc
    public final void t(boolean z) {
        y();
    }

    public final void u(ahdv ahdvVar) {
        atzr atzrVar;
        if (ahdvVar.a() == null) {
            return;
        }
        i(ahdvVar.a());
        asfc asfcVar = ahdvVar.a().a;
        aseo aseoVar = asfcVar.f;
        if (aseoVar == null) {
            aseoVar = aseo.a;
        }
        atzm atzmVar = null;
        if (aseoVar.b == 78882851) {
            aseo aseoVar2 = asfcVar.f;
            if (aseoVar2 == null) {
                aseoVar2 = aseo.a;
            }
            if (aseoVar2.b == 78882851) {
                atzrVar = (atzr) aseoVar2.c;
            } else {
                atzrVar = atzr.a;
            }
        } else {
            atzrVar = null;
        }
        if (atzrVar == null) {
            return;
        }
        atzn atznVar = atzrVar.h;
        if (atznVar == null) {
            atznVar = atzn.a;
        }
        if ((atznVar.b & 1) != 0) {
            atzn atznVar2 = atzrVar.h;
            if (atznVar2 == null) {
                atznVar2 = atzn.a;
            }
            atzmVar = atznVar2.c;
            if (atzmVar == null) {
                atzmVar = atzm.a;
            }
        }
        x(atzmVar);
    }

    public final void v(ahel ahelVar) {
        this.w = ahelVar.a().a() == 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(apxf apxfVar) {
        this.k.a(this.l.h(apxfVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(atzm atzmVar) {
        if (atzmVar == null || ahbj.b(atzmVar) == null || ahbj.a(atzmVar) == null) {
            return;
        }
        this.g = atzmVar;
        y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
    
        if (r10.n.a() >= java.util.concurrent.TimeUnit.MINUTES.toMillis(r0)) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahez.y():void");
    }

    @Override // defpackage.ahfa
    public final void z() {
        y();
    }
}
