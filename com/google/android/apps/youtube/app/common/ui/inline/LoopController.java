package com.google.android.apps.youtube.app.common.ui.inline;

import com.google.android.apps.youtube.app.common.ui.inline.LoopController;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import defpackage.ahbw;
import defpackage.ahsq;
import defpackage.amkq;
import defpackage.any;
import defpackage.aok;
import defpackage.apwo;
import defpackage.awdg;
import defpackage.awdp;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azqb;
import defpackage.azrw;
import defpackage.gbr;
import defpackage.gfq;
import defpackage.gge;
import defpackage.ggk;
import defpackage.kvl;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LoopController implements any, gge {
    public final azrw a;
    public apwo b;
    public boolean c;
    private final azrw d;
    private ayqx e;

    public LoopController(azrw azrwVar, azrw azrwVar2, InlinePlaybackLifecycleController inlinePlaybackLifecycleController) {
        this.a = azrwVar;
        this.d = azrwVar2;
        inlinePlaybackLifecycleController.l(this);
    }

    private final void g() {
        if (this.b == null) {
            return;
        }
        this.c = false;
        ((ahsq) this.a.get()).a();
        this.b = null;
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

    @Override // defpackage.gge
    public final void m(gfq gfqVar, int i, int i2) {
        if (i2 == 0) {
            g();
            return;
        }
        if (i2 == 1) {
            apwo apwoVar = null;
            if (gfqVar.b.b() != null && gfqVar.b.b().pY(WatchEndpointOuterClass.watchEndpoint)) {
                awdp awdpVar = (awdp) gfqVar.b.b().pX(WatchEndpointOuterClass.watchEndpoint);
                awdg awdgVar = awdpVar.t;
                if (awdgVar == null) {
                    awdgVar = awdg.a;
                }
                apwo apwoVar2 = awdgVar.b;
                if (apwoVar2 == null) {
                    apwoVar2 = apwo.a;
                }
                int da = amkq.da(apwoVar2.c);
                if (da != 0 && da == 3) {
                    awdg awdgVar2 = awdpVar.t;
                    if (awdgVar2 == null) {
                        awdgVar2 = awdg.a;
                    }
                    apwoVar = awdgVar2.b;
                    if (apwoVar == null) {
                        apwoVar = apwo.a;
                    }
                }
            }
            this.b = apwoVar;
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        azqb.f((AtomicReference) this.e);
        g();
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.e = ((kvl) this.d.get()).ae(gbr.c, gbr.d).h(ahbw.e(1)).Y(new ayrs() { // from class: ggq
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int da;
                LoopController loopController = LoopController.this;
                apwo apwoVar = loopController.b;
                if (apwoVar == null || (da = amkq.da(apwoVar.c)) == 0 || da != 3) {
                    return;
                }
                loopController.c = true;
                ahsq ahsqVar = (ahsq) loopController.a.get();
                apwo apwoVar2 = loopController.b;
                ahsqVar.b(apwoVar2.e, apwoVar2.f);
            }
        }, ggk.c);
    }
}
