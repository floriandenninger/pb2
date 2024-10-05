package com.google.android.apps.youtube.app.extensions.lens;

import defpackage.aadw;
import defpackage.aahd;
import defpackage.ahdv;
import defpackage.ahef;
import defpackage.ahej;
import defpackage.aign;
import defpackage.ainy;
import defpackage.aixh;
import defpackage.amrz;
import defpackage.amvf;
import defpackage.amxa;
import defpackage.any;
import defpackage.aok;
import defpackage.apxf;
import defpackage.aset;
import defpackage.aseu;
import defpackage.asfc;
import defpackage.asfd;
import defpackage.asmy;
import defpackage.asmz;
import defpackage.auov;
import defpackage.auoy;
import defpackage.auwd;
import defpackage.azrw;
import defpackage.evr;
import defpackage.gzg;
import defpackage.ypa;
import defpackage.ypd;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LensController implements any, ypd {
    public final azrw a;
    public final boolean b;
    public final aahd c;
    public final azrw d;
    public byte[] f;
    private final ypa h;
    public final LinkedHashMap e = new gzg();
    public final amxa g = amxa.a();

    public LensController(ypa ypaVar, azrw azrwVar, aadw aadwVar, aahd aahdVar, azrw azrwVar2) {
        this.h = ypaVar;
        this.a = azrwVar;
        this.b = evr.aK(aadwVar);
        this.c = aahdVar;
        this.d = azrwVar2;
    }

    public final void g() {
        apxf apxfVar = (apxf) this.e.get(((ainy) this.a.get()).q());
        if (apxfVar != null) {
            this.c.c(apxfVar, null);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        aseu aseuVar;
        auov auovVar;
        aseu aseuVar2;
        auov auovVar2;
        if (i == -1) {
            return new Class[]{ahdv.class, ahef.class, ahej.class};
        }
        if (i != 0) {
            if (i == 1) {
                ahef ahefVar = (ahef) obj;
                if (!this.b || ahefVar.c() != aign.NEW) {
                    return null;
                }
                g();
                this.g.d();
                return null;
            }
            if (i == 2) {
                ahej ahejVar = (ahej) obj;
                ainy ainyVar = (ainy) this.a.get();
                if (!this.b || ainyVar.Q()) {
                    return null;
                }
                if (ahejVar.a() == 3) {
                    g();
                    aixh o = ainyVar.o();
                    if (o == null) {
                        return null;
                    }
                    long b = o.b();
                    amxa amxaVar = this.g;
                    Long valueOf = Long.valueOf(b);
                    apxf apxfVar = (apxf) amxaVar.b(valueOf);
                    if (apxfVar == null) {
                        return null;
                    }
                    this.c.c(apxfVar, amrz.k("player_timestamp_ms", valueOf));
                    return null;
                }
                if (ahejVar.a() != 2) {
                    return null;
                }
                g();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        ahdv ahdvVar = (ahdv) obj;
        if (!this.b || ahdvVar.a() == null) {
            return null;
        }
        asfc asfcVar = ahdvVar.a().a;
        asfd asfdVar = asfcVar.d;
        if (asfdVar == null) {
            asfdVar = asfd.a;
        }
        if (asfdVar.b == 51779735) {
            aseuVar = (aseu) asfdVar.c;
        } else {
            aseuVar = aseu.a;
        }
        aset asetVar = aseuVar.c;
        if (asetVar == null) {
            asetVar = aset.a;
        }
        if (asetVar.b == 49399797) {
            auovVar = (auov) asetVar.c;
        } else {
            auovVar = auov.a;
        }
        Iterator it = auovVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            auwd auwdVar = ((auoy) it.next()).bm;
            if (auwdVar == null) {
                auwdVar = auwd.a;
            }
            if ((auwdVar.b & 16) != 0) {
                this.f = auwdVar.g.I();
                break;
            }
        }
        asfd asfdVar2 = asfcVar.d;
        if (asfdVar2 == null) {
            asfdVar2 = asfd.a;
        }
        if (asfdVar2.b == 51779735) {
            aseuVar2 = (aseu) asfdVar2.c;
        } else {
            aseuVar2 = aseu.a;
        }
        aset asetVar2 = aseuVar2.c;
        if (asetVar2 == null) {
            asetVar2 = aset.a;
        }
        if (asetVar2.b == 49399797) {
            auovVar2 = (auov) asetVar2.c;
        } else {
            auovVar2 = auov.a;
        }
        for (auoy auoyVar : auovVar2.d) {
            if ((auoyVar.e & 33554432) != 0) {
                asmz asmzVar = auoyVar.bw;
                if (asmzVar == null) {
                    asmzVar = asmz.a;
                }
                Iterator it2 = asmzVar.b.iterator();
                while (it2.hasNext()) {
                    apxf apxfVar2 = ((asmy) it2.next()).d;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    this.g.e(amvf.e(Long.valueOf(r8.b), Long.valueOf(r8.c)), apxfVar2);
                }
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.aoa
    public final void lc(aok aokVar) {
        if (this.b) {
            this.h.m(this);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        g();
    }

    @Override // defpackage.any, defpackage.aoa
    public final void nu(aok aokVar) {
        if (this.b) {
            this.h.g(this);
        }
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
