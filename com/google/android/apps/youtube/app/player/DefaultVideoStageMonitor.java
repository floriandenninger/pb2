package com.google.android.apps.youtube.app.player;

import com.google.android.apps.youtube.app.player.DefaultVideoStageMonitor;
import defpackage.aadw;
import defpackage.ahef;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.evr;
import defpackage.izw;
import defpackage.kdd;
import defpackage.kde;
import defpackage.ypa;
import defpackage.ypd;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DefaultVideoStageMonitor implements any, kde, ypd {
    private ahef b;
    private final ypa c;
    private final aioc d;
    private final aadw f;
    private final ayqw e = new ayqw();
    private final Set a = new HashSet();

    public DefaultVideoStageMonitor(ypa ypaVar, aioc aiocVar, aadw aadwVar) {
        this.c = ypaVar;
        this.d = aiocVar;
        this.f = aadwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // defpackage.kde
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String g() {
        /*
            r3 = this;
            ahef r0 = r3.b
            r1 = 0
            if (r0 == 0) goto L29
            aign r2 = r0.c()
            boolean r2 = r2.h()
            if (r2 == 0) goto L1a
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r2 = r0.a()
            if (r2 == 0) goto L1a
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r0.a()
            goto L2a
        L1a:
            aign r2 = r0.c()
            boolean r2 = r2.h()
            if (r2 != 0) goto L29
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r0.b()
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 == 0) goto L31
            java.lang.String r0 = r0.y()
            return r0
        L31:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.player.DefaultVideoStageMonitor.g():java.lang.String");
    }

    public final void h(ahef ahefVar) {
        this.b = ahefVar;
        if (this.a.isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((kdd) it.next()).a();
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahef.class};
        }
        if (i == 0) {
            h((ahef) obj);
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
        if (evr.au(this.f)) {
            this.e.c();
        } else {
            this.c.m(this);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (evr.au(this.f)) {
            this.e.c();
            this.e.g(this.d.G().b.Y(new ayrs() { // from class: kcl
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    DefaultVideoStageMonitor.this.h((ahef) obj);
                }
            }, izw.p));
        } else {
            this.c.g(this);
        }
    }
}
