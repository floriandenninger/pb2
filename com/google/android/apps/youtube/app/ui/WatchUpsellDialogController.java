package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.ui.WatchUpsellDialogController;
import defpackage.aadw;
import defpackage.aahd;
import defpackage.acqx;
import defpackage.acra;
import defpackage.agxh;
import defpackage.ahef;
import defpackage.ainy;
import defpackage.aioc;
import defpackage.ajzf;
import defpackage.any;
import defpackage.aok;
import defpackage.apxf;
import defpackage.apxi;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.evr;
import defpackage.fma;
import defpackage.ktf;
import defpackage.lyu;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.zgd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WatchUpsellDialogController implements any, ypd {
    public final ainy a;
    public boolean b;
    public String c;
    private final agxh d;
    private final acra e;
    private final fma f;
    private final zgd g;
    private final ypa h;
    private final aioc i;
    private final ayqw j = new ayqw();
    private final aahd k;
    private final ajzf l;
    private boolean m;
    private final aadw n;

    public WatchUpsellDialogController(ainy ainyVar, agxh agxhVar, acra acraVar, fma fmaVar, ypa ypaVar, aioc aiocVar, aadw aadwVar, aahd aahdVar, ajzf ajzfVar) {
        this.a = ainyVar;
        this.d = agxhVar;
        this.e = acraVar;
        this.f = fmaVar;
        this.h = ypaVar;
        this.i = aiocVar;
        this.n = aadwVar;
        this.k = aahdVar;
        this.l = ajzfVar;
        this.g = new lyu(this, fmaVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x015c, code lost:
    
        if (r0 == 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a7, code lost:
    
        if (r2 == 0) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.ahef r11) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.ui.WatchUpsellDialogController.g(ahef):void");
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
        if (evr.au(this.n)) {
            this.j.c();
        } else {
            this.h.m(this);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (evr.au(this.n)) {
            this.j.d(this.i.G().b.Y(new ayrs() { // from class: lys
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    WatchUpsellDialogController.this.g((ahef) obj);
                }
            }, ktf.i));
        } else {
            this.h.g(this);
        }
    }

    private final void h(apxi apxiVar) {
        int i = apxiVar.b;
        if ((i & 1) != 0) {
            this.a.a();
            aahd aahdVar = this.k;
            apxf apxfVar = apxiVar.c;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.a(apxfVar);
        } else if ((i & 2) != 0) {
            aahd aahdVar2 = this.k;
            apxf apxfVar2 = apxiVar.d;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar2.a(apxfVar2);
            this.e.u(new acqx(apxiVar.f), null);
        }
        this.m = true;
    }
}
