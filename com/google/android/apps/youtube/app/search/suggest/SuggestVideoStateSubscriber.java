package com.google.android.apps.youtube.app.search.suggest;

import com.google.android.apps.youtube.app.search.suggest.SuggestVideoStateSubscriber;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import defpackage.aadw;
import defpackage.ahef;
import defpackage.aign;
import defpackage.aioc;
import defpackage.amkq;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.evr;
import defpackage.ktf;
import defpackage.shf;
import defpackage.ypa;
import defpackage.ypd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SuggestVideoStateSubscriber implements any, ypd {
    public String a;
    public String b;
    public final shf d;
    private final ypa e;
    private final aioc f;
    private final aadw h;
    public long c = -1;
    private final ayqw g = new ayqw();

    public SuggestVideoStateSubscriber(shf shfVar, ypa ypaVar, aioc aiocVar, aadw aadwVar) {
        this.d = shfVar;
        this.e = ypaVar;
        this.f = aiocVar;
        this.h = aadwVar;
    }

    public final void g(ahef ahefVar) {
        aign c = ahefVar.c();
        PlayerResponseModel b = ahefVar.b();
        if (!c.a(aign.PLAYBACK_LOADED) || b == null) {
            if (!c.a(aign.NEW, aign.ENDED) || this.b == null) {
                return;
            }
            this.b = null;
            this.c = this.d.c();
            return;
        }
        String y = b.y();
        if (amkq.b(this.b, y)) {
            return;
        }
        this.b = y;
        this.a = y;
        this.c = -1L;
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
            this.g.g(this.f.G().b.Y(new ayrs() { // from class: lhf
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    SuggestVideoStateSubscriber.this.g((ahef) obj);
                }
            }, ktf.g));
        } else {
            this.e.g(this);
        }
    }
}
