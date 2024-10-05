package com.google.android.apps.youtube.app.player.controls;

import android.app.Activity;
import com.google.android.apps.youtube.app.player.controls.ReportVideoController;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.youtube.R;
import defpackage.aadw;
import defpackage.afsy;
import defpackage.aftn;
import defpackage.ahdv;
import defpackage.aioc;
import defpackage.aivo;
import defpackage.aixh;
import defpackage.ammv;
import defpackage.any;
import defpackage.aok;
import defpackage.asew;
import defpackage.asfc;
import defpackage.atsx;
import defpackage.aumb;
import defpackage.ayqr;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azqb;
import defpackage.evr;
import defpackage.kez;
import defpackage.kfe;
import defpackage.kfg;
import defpackage.whu;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.ysy;
import defpackage.zaw;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReportVideoController implements any, ypd {
    public final Activity a;
    public final afsy b;
    public final zaw c;
    public final aftn d;
    public final aivo e;
    private final ysy g;
    private final kez h;
    private final kfg i;
    private final ypa j;
    private final aioc k;
    private final aadw m;
    private ayqx l = null;
    public asew f = null;

    public ReportVideoController(Activity activity, ysy ysyVar, afsy afsyVar, zaw zawVar, aftn aftnVar, aivo aivoVar, kez kezVar, kfg kfgVar, ypa ypaVar, aioc aiocVar, aadw aadwVar) {
        this.a = activity;
        this.g = ysyVar;
        this.b = afsyVar;
        this.c = zawVar;
        this.d = aftnVar;
        this.e = aivoVar;
        this.h = kezVar;
        this.i = kfgVar;
        this.j = ypaVar;
        this.k = aiocVar;
        this.m = aadwVar;
    }

    public final void g(ahdv ahdvVar) {
        WatchNextResponseModel a = ahdvVar.a();
        if (a != null) {
            asfc asfcVar = a.a;
            if ((asfcVar.b & 1024) != 0) {
                asew asewVar = asfcVar.k;
                if (asewVar == null) {
                    asewVar = asew.a;
                }
                this.f = asewVar;
                return;
            }
        }
        this.f = null;
    }

    public final void h(asew asewVar) {
        if (!this.g.p()) {
            whu.K(this.a, R.string.main_flagging_while_offline, 1);
            return;
        }
        int i = asewVar.b;
        if (i == 77875886) {
            this.h.a((atsx) asewVar.c);
            return;
        }
        if (i == 113762946) {
            kfg kfgVar = this.i;
            aumb aumbVar = (aumb) asewVar.c;
            aixh o = kfgVar.a.o();
            if (o != null) {
                kfgVar.c.a = ammv.j(Long.valueOf(o.b()));
            }
            kfgVar.b.c(aumbVar, kfgVar.c);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahdv.class};
        }
        if (i == 0) {
            g((ahdv) obj);
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
        if (!evr.au(this.m)) {
            this.j.m(this);
            return;
        }
        Object obj = this.l;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.l = null;
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (evr.au(this.m)) {
            this.l = this.k.ao().G().E(ayqr.a()).Y(new ayrs() { // from class: kfd
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    ReportVideoController.this.g((ahdv) obj);
                }
            }, kfe.a);
        } else {
            this.j.g(this);
        }
    }
}
