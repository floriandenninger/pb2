package com.google.android.apps.youtube.app.extensions.appindexing;

import android.content.Context;
import com.google.android.apps.youtube.app.extensions.appindexing.WatchVideoIndexer;
import com.google.firebase.appindexing.internal.MutateRequest;
import defpackage.aadw;
import defpackage.afzk;
import defpackage.ahef;
import defpackage.aioa;
import defpackage.aioc;
import defpackage.anto;
import defpackage.antu;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqw;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.evr;
import defpackage.ggk;
import defpackage.gwv;
import defpackage.ypa;
import defpackage.ypd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WatchVideoIndexer implements any, aioa, ypd {
    private final gwv a;
    private final afzk b;
    private final antu c;
    private final anto d;
    private final ypa e;
    private final aioc f;
    private final ayqw g;
    private final aadw h;

    public WatchVideoIndexer(gwv gwvVar, afzk afzkVar, Context context, ypa ypaVar, aioc aiocVar, aadw aadwVar) {
        antu a = antu.a(context);
        anto a2 = anto.a(context);
        this.b = afzkVar;
        this.a = gwvVar;
        this.c = a;
        this.d = a2;
        this.e = ypaVar;
        this.f = aiocVar;
        this.h = aadwVar;
        this.g = new ayqw();
    }

    public final void g() {
        if (this.b.b()) {
            this.d.c(new MutateRequest(4, null, null, null, null, null, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.ahef r18) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.appindexing.WatchVideoIndexer.h(ahef):void");
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().b.Y(new ayrs() { // from class: gww
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                WatchVideoIndexer.this.h((ahef) obj);
            }
        }, ggk.m)};
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
        if (evr.au(this.h)) {
            this.g.c();
        } else {
            this.e.m(this);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (evr.au(this.h)) {
            this.g.c();
            this.g.g(kI(this.f));
        } else {
            this.e.g(this);
        }
    }
}
