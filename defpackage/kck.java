package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kck implements kdc, fxi, fgk, aioa, ypd {
    private final flx a;
    private final azrw b;
    private final ypa c;
    private final fgq d;
    private final fgm e;
    private final aioc f;
    private final ayqw g = new ayqw();
    private boolean h;
    private boolean i;
    private aign j;
    private final aadw k;

    public kck(flx flxVar, azrw azrwVar, ypa ypaVar, fgq fgqVar, fgm fgmVar, aioc aiocVar, aadw aadwVar) {
        this.a = flxVar;
        this.b = azrwVar;
        this.c = ypaVar;
        this.d = fgqVar;
        this.e = fgmVar;
        this.f = aiocVar;
        this.k = aadwVar;
    }

    @Override // defpackage.fxi
    public final void a() {
        if (evr.au(this.k)) {
            this.g.c();
        } else {
            this.c.m(this);
        }
        i();
    }

    @Override // defpackage.fxi
    public final void b() {
        if (evr.au(this.k)) {
            this.g.g(kI(this.f));
        } else {
            this.c.g(this);
        }
    }

    public final void c(ahcx ahcxVar) {
        this.h = ahcxVar.d() == aigf.REMOTE;
    }

    public final void d(ahef ahefVar) {
        this.j = ahefVar.c();
        PlayerResponseModel b = ahefVar.b();
        boolean z = false;
        if (b != null && b.C()) {
            z = true;
        }
        this.i = z;
    }

    @Override // defpackage.fgk
    public final void g(fhf fhfVar) {
        if (fhfVar != null) {
            return;
        }
        this.i = false;
        this.j = null;
    }

    public final void h(ahej ahejVar) {
        if (ahejVar.e()) {
            i();
        }
    }

    @Override // defpackage.kdc
    public final void i() {
        fhf a = this.e.a();
        if (this.h || !this.d.g().c() || a == null || TextUtils.isEmpty(a.c()) || this.j == null) {
            return;
        }
        String c = a.c();
        flv b = this.a.b(c);
        if (this.j == aign.INTERSTITIAL_PLAYING) {
            this.a.d(c, b != null ? b.a : 0L);
            return;
        }
        aign aignVar = this.j;
        if (aignVar == null || !aignVar.c(aign.VIDEO_PLAYING)) {
            return;
        }
        long j = b != null ? b.a : 0L;
        long i = ((ainy) this.b.get()).i();
        long h = ((ainy) this.b.get()).h();
        if (Math.abs(j - i) < 500) {
            return;
        }
        if (this.i || i < h) {
            this.a.d(c, i);
            return;
        }
        flx flxVar = this.a;
        flxVar.b.remove(c);
        flxVar.c.remove(c);
        flxVar.a.f(new flw(c, null));
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 0;
        final int i2 = 2;
        final int i3 = 1;
        return new ayqx[]{aiocVar.G().b.Y(new ayrs(this) { // from class: kcj
            public final /* synthetic */ kck a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i;
                if (i4 == 0) {
                    this.a.d((ahef) obj);
                } else if (i4 != 1) {
                    this.a.h((ahej) obj);
                } else {
                    this.a.c((ahcx) obj);
                }
            }
        }, izw.o), aiocVar.G().j.Y(new ayrs(this) { // from class: kcj
            public final /* synthetic */ kck a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i2;
                if (i4 == 0) {
                    this.a.d((ahef) obj);
                } else if (i4 != 1) {
                    this.a.h((ahej) obj);
                } else {
                    this.a.c((ahcx) obj);
                }
            }
        }, izw.o), aiocVar.t().b.Y(new ayrs(this) { // from class: kcj
            public final /* synthetic */ kck a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i3;
                if (i4 == 0) {
                    this.a.d((ahef) obj);
                } else if (i4 != 1) {
                    this.a.h((ahej) obj);
                } else {
                    this.a.c((ahcx) obj);
                }
            }
        }, izw.o)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahcx.class, ahef.class, ahej.class};
        }
        if (i == 0) {
            c((ahcx) obj);
            return null;
        }
        if (i == 1) {
            d((ahef) obj);
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
}
