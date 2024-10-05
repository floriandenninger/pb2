package com.google.android.libraries.youtube.mdx.player;

import android.content.res.Resources;
import defpackage.adlm;
import defpackage.adlr;
import defpackage.adlt;
import defpackage.aeqq;
import defpackage.ahbn;
import defpackage.ahyu;
import defpackage.ahyw;
import defpackage.ainy;
import defpackage.any;
import defpackage.aok;
import defpackage.ypd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MdxVideoQualitySelectorPresenter extends ahyw implements adlr, any, ypd {
    private final adlt b;

    public MdxVideoQualitySelectorPresenter(Resources resources, ainy ainyVar, ahyu ahyuVar, adlt adltVar) {
        super(resources, ainyVar, ahyuVar);
        adltVar.getClass();
        this.b = adltVar;
    }

    @Override // defpackage.ahyw
    public final void g(aeqq aeqqVar) {
        if (this.b.f() == 1) {
            this.a.m(false);
        } else {
            super.g(aeqqVar);
        }
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
        this.a.m(false);
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        this.a.m(true);
    }

    @Override // defpackage.ahyw, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls != MdxVideoQualitySelectorPresenter.class) {
            return ahbn.b(this, obj, i);
        }
        if (i == -1) {
            return new Class[]{aeqq.class};
        }
        if (i == 0) {
            g((aeqq) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        this.b.i(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.b.k(this);
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
