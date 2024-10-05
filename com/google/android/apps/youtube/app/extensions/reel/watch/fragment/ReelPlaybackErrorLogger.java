package com.google.android.apps.youtube.app.extensions.reel.watch.fragment;

import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelPlaybackErrorLogger;
import defpackage.aadw;
import defpackage.acpl;
import defpackage.aemv;
import defpackage.afqu;
import defpackage.ahef;
import defpackage.aign;
import defpackage.ainy;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.evr;
import defpackage.ggk;
import defpackage.ypa;
import defpackage.ypd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReelPlaybackErrorLogger implements any, ypd {
    private final ainy a;
    private final acpl b;
    private final aemv c;
    private final ypa d;
    private final aioc e;
    private final ayqw f = new ayqw();
    private String g;
    private String h;
    private final aadw i;

    public ReelPlaybackErrorLogger(ainy ainyVar, acpl acplVar, aemv aemvVar, ypa ypaVar, aioc aiocVar, aadw aadwVar) {
        this.a = ainyVar;
        this.b = acplVar;
        this.c = aemvVar;
        this.d = ypaVar;
        this.e = aiocVar;
        this.i = aadwVar;
    }

    public final void g(ahef ahefVar) {
        aign aignVar = aign.NEW;
        afqu afquVar = afqu.NATIVE_MEDIA_PLAYER;
        if (ahefVar.c().ordinal() != 7) {
            return;
        }
        this.h = ahefVar.b().y();
        this.g = ahefVar.e();
    }

    public final void h(int i) {
        String str = this.h;
        i((str == null || this.g == null || !str.equals(this.a.q())) ? "" : this.g, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.String r6, int r7) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelPlaybackErrorLogger.i(java.lang.String, int):void");
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
    public final void lc(aok aokVar) {
        if (evr.au(this.i)) {
            this.f.c();
        } else {
            this.d.m(this);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void nu(aok aokVar) {
        if (evr.au(this.i)) {
            this.f.d(this.e.G().b.Y(new ayrs() { // from class: iho
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    ReelPlaybackErrorLogger.this.g((ahef) obj);
                }
            }, ggk.s));
        } else {
            this.d.g(this);
        }
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
