package com.google.android.libraries.youtube.player.features.onesie;

import com.google.android.libraries.youtube.player.features.onesie.BandaidConnectionOpenerController;
import defpackage.aadw;
import defpackage.aeie;
import defpackage.ahef;
import defpackage.ahfo;
import defpackage.aign;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.atej;
import defpackage.atyg;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.ypa;
import defpackage.ypd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BandaidConnectionOpenerController implements any, ypd {
    private final aeie a;
    private final ypa d;
    private final aioc e;
    private final aadw g;
    private final ayqw f = new ayqw();
    private boolean b = false;
    private aign c = aign.NEW;

    public BandaidConnectionOpenerController(aeie aeieVar, ypa ypaVar, aioc aiocVar, aadw aadwVar) {
        this.a = aeieVar;
        this.d = ypaVar;
        this.e = aiocVar;
        this.g = aadwVar;
    }

    private final void k(long j) {
        aeie aeieVar = this.a;
        if (aeieVar != null) {
            aeieVar.g(j);
        }
    }

    private final void l(String str) {
        aeie aeieVar = this.a;
        if (aeieVar != null) {
            aeieVar.h(str);
        }
    }

    private static final boolean m(aadw aadwVar) {
        if (aadwVar == null || aadwVar.b() == null) {
            return false;
        }
        atyg atygVar = aadwVar.b().v;
        if (atygVar == null) {
            atygVar = atyg.a;
        }
        return atygVar.e;
    }

    public final void g(ahef ahefVar) {
        aign c = ahefVar.c();
        aign aignVar = aign.NEW;
        int ordinal = c.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                atej atejVar = this.g.b().k;
                if (atejVar == null) {
                    atejVar = atej.a;
                }
                if ((atejVar.b & 1073741824) == 0) {
                    l("vl");
                }
                this.c = c;
                return;
            }
            if (ordinal != 9) {
                return;
            }
        }
        if (!this.b) {
            k(1500L);
        }
        this.c = c;
    }

    public final void h() {
        l("as");
        this.b = true;
    }

    public final void i() {
        if (this.c != aign.PLAYBACK_LOADED) {
            k(1500L);
        }
        this.b = false;
    }

    public final void j() {
        k(0L);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahef.class};
        }
        if (i == 0) {
            g((ahef) obj);
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
        if (m(this.g)) {
            this.f.c();
        } else {
            this.d.m(this);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (m(this.g)) {
            this.f.c();
            this.f.g(this.e.G().b.Y(new ayrs() { // from class: ahuf
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    BandaidConnectionOpenerController.this.g((ahef) obj);
                }
            }, ahfo.n));
        } else {
            this.d.g(this);
        }
    }
}
