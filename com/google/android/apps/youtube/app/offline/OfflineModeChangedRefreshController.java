package com.google.android.apps.youtube.app.offline;

import android.view.View;
import com.google.android.apps.youtube.app.offline.OfflineModeChangedRefreshController;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import defpackage.aadw;
import defpackage.aaea;
import defpackage.ahej;
import defpackage.aigk;
import defpackage.ainy;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.apxf;
import defpackage.aswb;
import defpackage.atrs;
import defpackage.ayqr;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.ce;
import defpackage.evr;
import defpackage.faq;
import defpackage.fgq;
import defpackage.flh;
import defpackage.gir;
import defpackage.gje;
import defpackage.han;
import defpackage.hau;
import defpackage.ito;
import defpackage.its;
import defpackage.iur;
import defpackage.iya;
import defpackage.izw;
import defpackage.lkb;
import defpackage.ofa;
import defpackage.oja;
import defpackage.ojb;
import defpackage.oor;
import defpackage.ypa;
import defpackage.ypd;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OfflineModeChangedRefreshController implements any, faq, ypd {
    private static final Duration b = Duration.ofMillis(50);
    private final gje c;
    private final fgq d;
    private final flh e;
    private final aaea f;
    private final ainy g;
    private final oja h;
    private final oor i;
    private final ypa j;
    private final aioc k;
    private final its l;
    private final aadw o;
    private final lkb p;
    private final lkb q;
    private final ayqw m = new ayqw();
    private volatile int n = 0;
    public volatile aigk a = aigk.NEW;

    public OfflineModeChangedRefreshController(gje gjeVar, fgq fgqVar, flh flhVar, aadw aadwVar, aaea aaeaVar, ainy ainyVar, oja ojaVar, oor oorVar, ypa ypaVar, aioc aiocVar, lkb lkbVar, its itsVar, lkb lkbVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = gjeVar;
        this.d = fgqVar;
        this.e = flhVar;
        this.o = aadwVar;
        this.f = aaeaVar;
        this.g = ainyVar;
        this.h = ojaVar;
        this.i = oorVar;
        this.j = ypaVar;
        this.k = aiocVar;
        this.q = lkbVar;
        this.l = itsVar;
        this.p = lkbVar2;
    }

    @Override // defpackage.faq
    public final void a(boolean z) {
        ofa l;
        WatchNextResponseModel c;
        apxf apxfVar;
        if (z) {
            this.i.i(false);
            return;
        }
        this.i.i(true);
        if (this.c.d() == null) {
            return;
        }
        this.c.p();
        gir f = this.c.f();
        if (this.q.a.isInstance(f)) {
            f = (gir) f.mN().f("master_fragment_tag");
        }
        if (this.p.a.isInstance(f)) {
            ce ceVar = (ce) Optional.ofNullable(f).filter(new han(iya.class, 2)).map(new hau(iya.class, 2)).map(iur.i).orElse(null);
            if (ceVar instanceof gir) {
                f = (gir) ceVar;
            }
        }
        if (this.l.a.isInstance(f)) {
            Duration duration = b;
            if (f instanceof ito) {
                final ito itoVar = (ito) f;
                if (itoVar.ar() && itoVar.I() != null) {
                    View view = f.O;
                    itoVar.getClass();
                    view.postDelayed(new Runnable() { // from class: itr
                        @Override // java.lang.Runnable
                        public final void run() {
                            ito.this.l();
                        }
                    }, duration.toMillis());
                }
            }
        }
        if (this.d.g().h()) {
            boolean z2 = this.n == 8 || this.n == 4;
            if (this.d.g().h() && z2) {
                ojb ojbVar = this.h.a;
                if (ojbVar == null || ojbVar.k() != 2) {
                    if (this.g.N() && this.a != aigk.VIDEO_PLAYBACK_ERROR) {
                        aswb aswbVar = this.f.a().e;
                        if (aswbVar == null) {
                            aswbVar = aswb.a;
                        }
                        if (aswbVar.W) {
                            return;
                        }
                    }
                    this.e.a();
                    this.g.a();
                    return;
                }
                this.g.aa();
                this.g.a();
                return;
            }
            ojb ojbVar2 = this.h.a;
            if (ojbVar2 == null || (l = ojbVar2.l()) == null || (c = l.c()) == null || (apxfVar = c.c) == null || !apxfVar.pY(atrs.a)) {
                return;
            }
            this.g.Z();
        }
    }

    public final void g(ahej ahejVar) {
        this.n = ahejVar.a();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahej.class};
        }
        if (i == 0) {
            g((ahej) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        if (!evr.au(this.o)) {
            this.j.m(this);
        }
        this.m.c();
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (evr.au(this.o)) {
            final int i = 0;
            this.m.d(this.k.G().j.Y(new ayrs(this) { // from class: jhb
                public final /* synthetic */ OfflineModeChangedRefreshController a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i == 0) {
                        this.a.g((ahej) obj);
                    } else {
                        this.a.a = ((ahdv) obj).c();
                    }
                }
            }, izw.e));
        } else {
            this.j.g(this);
        }
        final int i2 = 1;
        this.m.d(this.k.ao().G().E(ayqr.a()).Y(new ayrs(this) { // from class: jhb
            public final /* synthetic */ OfflineModeChangedRefreshController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    this.a.g((ahej) obj);
                } else {
                    this.a.a = ((ahdv) obj).c();
                }
            }
        }, izw.e));
    }
}
