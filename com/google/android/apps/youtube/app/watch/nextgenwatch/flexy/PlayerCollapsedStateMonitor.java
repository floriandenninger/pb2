package com.google.android.apps.youtube.app.watch.nextgenwatch.flexy;

import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.PlayerCollapsedStateMonitor;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import defpackage.aadw;
import defpackage.ahef;
import defpackage.ahvc;
import defpackage.aign;
import defpackage.aioa;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqw;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azrw;
import defpackage.evr;
import defpackage.nua;
import defpackage.nza;
import defpackage.nzc;
import defpackage.ypa;
import defpackage.ypd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayerCollapsedStateMonitor implements aioa, nza, any, ypd {
    private final azrw a;
    private final CreatorEndscreenOverlayPresenter b;
    private final ahvc c;
    private final ypa d;
    private final aioc e;
    private final ayqw f = new ayqw();
    private volatile boolean g;
    private final aadw h;

    public PlayerCollapsedStateMonitor(azrw azrwVar, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, ahvc ahvcVar, ypa ypaVar, aioc aiocVar, aadw aadwVar) {
        this.a = azrwVar;
        this.b = creatorEndscreenOverlayPresenter;
        this.c = ahvcVar;
        this.d = ypaVar;
        this.e = aiocVar;
        this.h = aadwVar;
    }

    @Override // defpackage.nza
    public final void g(boolean z) {
        CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter = this.b;
        creatorEndscreenOverlayPresenter.k = z;
        if (creatorEndscreenOverlayPresenter.i) {
            creatorEndscreenOverlayPresenter.s();
        }
        if (!z || this.g) {
            return;
        }
        this.c.y();
    }

    public final void h(ahef ahefVar) {
        aign c = ahefVar.c();
        if (c == null) {
            return;
        }
        this.g = c == aign.ENDED;
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().b.Y(new ayrs() { // from class: nzn
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                PlayerCollapsedStateMonitor.this.h((ahef) obj);
            }
        }, nua.i)};
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
        ((nzc) this.a.get()).k(this);
        if (evr.au(this.h)) {
            this.f.c();
        } else {
            this.d.m(this);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        ((nzc) this.a.get()).i(this);
        if (evr.au(this.h)) {
            this.f.c();
            this.f.g(kI(this.e));
        } else {
            this.d.g(this);
        }
    }
}
