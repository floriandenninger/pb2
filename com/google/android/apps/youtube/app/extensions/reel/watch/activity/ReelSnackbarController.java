package com.google.android.apps.youtube.app.extensions.reel.watch.activity;

import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.youtube.R;
import defpackage.aaci;
import defpackage.acqz;
import defpackage.acra;
import defpackage.ajcq;
import defpackage.akbl;
import defpackage.akbz;
import defpackage.akcb;
import defpackage.ammv;
import defpackage.any;
import defpackage.aok;
import defpackage.aqyg;
import defpackage.atnc;
import defpackage.atnz;
import defpackage.ci;
import defpackage.gbh;
import defpackage.gcm;
import defpackage.gcp;
import defpackage.lrs;
import defpackage.whu;
import defpackage.ypa;
import defpackage.ypd;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReelSnackbarController implements any, akbl, ypd {
    public final ci a;
    public final gcp b;
    private final ypa c;
    private final akbz d;
    private final acqz e;
    private final gbh f;
    private final Set g = new HashSet();

    public ReelSnackbarController(ci ciVar, ypa ypaVar, akbz akbzVar, gcp gcpVar, acqz acqzVar, gbh gbhVar, byte[] bArr) {
        this.a = ciVar;
        this.c = ypaVar;
        this.d = akbzVar;
        this.b = gcpVar;
        this.e = acqzVar;
        this.f = gbhVar;
    }

    public final void g() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            this.d.n((akcb) it.next());
        }
    }

    public final void h(byte[] bArr, gcm gcmVar) {
        acra mM = this.e.mM();
        if (bArr.length > 0 && mM != null) {
            gcmVar.b = new lrs(mM, bArr, 1);
        }
        gcmVar.f(true);
        this.d.o(gcmVar.b());
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aaci.class};
        }
        if (i == 0) {
            aaci aaciVar = (aaci) obj;
            ammv e = aaciVar.e();
            ammv f = aaciVar.f();
            if (e.h()) {
                h(((atnc) e.c()).e.I(), this.b.a((atnc) e.c(), aaciVar.g()));
                return null;
            }
            if (!f.h()) {
                return null;
            }
            atnz atnzVar = (atnz) f.c();
            ci ciVar = this.a;
            aqyg aqygVar = atnzVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            whu.L(ciVar, ajcq.b(aqygVar), 0);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aoa
    public final void lc(aok aokVar) {
        this.c.m(this);
        this.d.i(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        this.f.d((BottomUiContainer) this.a.findViewById(R.id.bottom_ui_container));
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
        this.g.remove((akcb) obj);
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void lj(Object obj) {
        this.g.add((akcb) obj);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void nu(aok aokVar) {
        this.c.g(this);
        this.d.e(this);
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
