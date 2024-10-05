package com.google.android.apps.youtube.app.watchwhile;

import defpackage.aadw;
import defpackage.adpl;
import defpackage.any;
import defpackage.aok;
import defpackage.asvu;
import defpackage.auxs;
import defpackage.ayph;
import defpackage.aypy;
import defpackage.ayrm;
import defpackage.eni;
import defpackage.olg;
import defpackage.oli;
import defpackage.oll;
import defpackage.ond;
import defpackage.ypa;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StartupSignalStream implements any {
    private final oli a;

    public StartupSignalStream(ypa ypaVar, eni eniVar, adpl adplVar, oll ollVar, aadw aadwVar, ond ondVar, byte[] bArr) {
        ayph b;
        final oli oliVar = new oli(ypaVar, eniVar, adplVar, ollVar, aadwVar, ondVar, null);
        this.a = oliVar;
        oliVar.d.b();
        olg olgVar = oliVar.a;
        olgVar.c.h(olgVar, olg.class);
        asvu asvuVar = oliVar.f.b().e;
        if ((asvuVar == null ? asvu.a : asvuVar).cR) {
            b = oliVar.e.a.x();
        } else {
            b = oliVar.b.b();
        }
        final int i = 1;
        oliVar.c.d(b.F(300L, TimeUnit.SECONDS).g(oliVar.d.a(auxs.STARTUP_SIGNAL_FIRST_THUMBNAIL_LOADED)).C().R(new ayrm() { // from class: olh
            @Override // defpackage.ayrm
            public final void a() {
                if (i != 0) {
                    oliVar.b(auxs.STARTUP_SIGNAL_FIRST_THUMBNAIL_LOADED);
                } else {
                    oliVar.b(auxs.STARTUP_SIGNAL_BROWSE_FEED_LOADED);
                }
            }
        }));
        final int i2 = 0;
        oliVar.c.d(oliVar.a.b.R(new ayrm() { // from class: olh
            @Override // defpackage.ayrm
            public final void a() {
                if (i2 != 0) {
                    oliVar.b(auxs.STARTUP_SIGNAL_FIRST_THUMBNAIL_LOADED);
                } else {
                    oliVar.b(auxs.STARTUP_SIGNAL_BROWSE_FEED_LOADED);
                }
            }
        }));
    }

    public final aypy g() {
        return this.a.a();
    }

    public final void h(auxs auxsVar) {
        this.a.b(auxsVar);
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        oli oliVar = this.a;
        oliVar.c.c();
        oliVar.d.d();
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
