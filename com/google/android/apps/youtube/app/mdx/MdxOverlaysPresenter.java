package com.google.android.apps.youtube.app.mdx;

import android.text.TextUtils;
import com.google.android.apps.youtube.app.mdx.MdxOverlaysPresenter;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import defpackage.adlm;
import defpackage.adlt;
import defpackage.adlu;
import defpackage.adue;
import defpackage.adul;
import defpackage.ahef;
import defpackage.aign;
import defpackage.any;
import defpackage.aok;
import defpackage.jca;
import defpackage.jcc;
import defpackage.jci;
import defpackage.kdy;
import defpackage.whu;
import defpackage.ypd;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdxOverlaysPresenter implements any, ypd {
    public final adlt a;
    public final jci b;
    public final jca c;
    public final kdy d;
    final adue e;
    Optional f;
    public boolean g;
    private final adul h;

    public MdxOverlaysPresenter(adlt adltVar, jci jciVar, jca jcaVar, final kdy kdyVar, adul adulVar) {
        adltVar.getClass();
        this.a = adltVar;
        jciVar.getClass();
        this.b = jciVar;
        jcaVar.getClass();
        this.c = jcaVar;
        kdyVar.getClass();
        this.d = kdyVar;
        this.f = Optional.empty();
        this.h = adulVar;
        this.e = new adue() { // from class: jcb
            @Override // defpackage.adue
            public final void oZ(int i, adub adubVar) {
                PlayerResponseModel playerResponseModel;
                MdxOverlaysPresenter mdxOverlaysPresenter = MdxOverlaysPresenter.this;
                kdy kdyVar2 = kdyVar;
                mdxOverlaysPresenter.g = false;
                if (adubVar.a == 4 && (playerResponseModel = adubVar.k.a) != null && !ammx.e(playerResponseModel.y())) {
                    mdxOverlaysPresenter.g = true;
                    kdyVar2.c = playerResponseModel.y();
                }
                mdxOverlaysPresenter.i();
            }
        };
        h(jcc.HIDDEN);
    }

    public static final String j(adlm adlmVar) {
        return adlmVar.k().c();
    }

    public final void g(adlm adlmVar) {
        if (adlmVar == null) {
            h(jcc.HIDDEN);
            return;
        }
        int a = adlmVar.a();
        if (a != 0) {
            if (a != 1) {
                h(jcc.HIDDEN);
                return;
            } else {
                this.c.d(j(adlmVar));
                h(jcc.HEADER);
                return;
            }
        }
        String c = adlmVar.k() != null ? adlmVar.k().c() : null;
        jci jciVar = this.b;
        boolean aj = adlmVar.aj();
        int i = TextUtils.isEmpty(c) ? true != aj ? R.string.connecting : R.string.reconnecting : true != aj ? R.string.connecting_to_screen : R.string.reconnecting_to_screen;
        if (i != jciVar.b || jciVar.a != 2 || !TextUtils.equals(jciVar.c, c)) {
            jciVar.c = c;
            jciVar.b = i;
            jciVar.a = 2;
            jciVar.Y();
        }
        h(jcc.STATUS);
    }

    public final void h(jcc jccVar) {
        if (this.f.isPresent() && this.f.get() == jccVar) {
            return;
        }
        this.f = Optional.of(jccVar);
        i();
    }

    public final void i() {
        boolean z = false;
        if (this.g) {
            this.d.kX();
            whu.I(this.c, false);
            this.b.kV();
            return;
        }
        this.d.kV();
        jca jcaVar = this.c;
        if (this.f.isPresent() && this.f.get() == jcc.HEADER) {
            z = true;
        }
        whu.I(jcaVar, z);
        if (!this.f.isPresent() || this.f.get() != jcc.STATUS) {
            this.b.kV();
        } else {
            this.b.kX();
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adlu.class, ahef.class};
        }
        if (i == 0) {
            g(((adlu) obj).a());
            return null;
        }
        if (i == 1) {
            ahef ahefVar = (ahef) obj;
            adlm g = this.a.g();
            if (g == null || g.a() != 1) {
                return null;
            }
            if (g.ab()) {
                h(jcc.HIDDEN);
                return null;
            }
            aign aignVar = aign.NEW;
            int ordinal = ahefVar.c().ordinal();
            if (ordinal == 0) {
                this.d.g(false);
            } else {
                if (ordinal == 5) {
                    if (ahefVar.k() != null) {
                        return null;
                    }
                    jci jciVar = this.b;
                    if (jciVar.a != 1) {
                        jciVar.b = R.string.advertisement;
                        jciVar.c = null;
                        jciVar.a = 1;
                        jciVar.Y();
                    }
                    h(jcc.STATUS);
                    return null;
                }
                if (ordinal == 8) {
                    jca jcaVar = this.c;
                    jcaVar.a.setText(jcaVar.a(R.string.playing_on_tv, j(g)));
                    h(jcc.HEADER);
                    return null;
                }
                if (ordinal != 9) {
                    return null;
                }
            }
            this.c.d(j(g));
            h(jcc.HEADER);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aoa
    public final void lc(aok aokVar) {
        this.h.c(this.e);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void nu(aok aokVar) {
        this.h.a(this.e);
        g(this.a.g());
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
