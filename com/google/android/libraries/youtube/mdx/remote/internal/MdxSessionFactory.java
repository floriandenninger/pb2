package com.google.android.libraries.youtube.mdx.remote.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.mdx.remote.internal.MdxSessionFactory;
import defpackage.acsx;
import defpackage.acun;
import defpackage.acwr;
import defpackage.acxi;
import defpackage.acyg;
import defpackage.acys;
import defpackage.aczg;
import defpackage.aczh;
import defpackage.adfu;
import defpackage.adfw;
import defpackage.adfy;
import defpackage.adga;
import defpackage.adgb;
import defpackage.adhv;
import defpackage.adie;
import defpackage.adkv;
import defpackage.adkz;
import defpackage.adln;
import defpackage.admf;
import defpackage.adms;
import defpackage.admt;
import defpackage.adnd;
import defpackage.adob;
import defpackage.adol;
import defpackage.adot;
import defpackage.adpf;
import defpackage.adpl;
import defpackage.adqp;
import defpackage.adqq;
import defpackage.adrp;
import defpackage.adtv;
import defpackage.afsy;
import defpackage.aiuy;
import defpackage.aksl;
import defpackage.anhy;
import defpackage.anic;
import defpackage.any;
import defpackage.aok;
import defpackage.atbj;
import defpackage.axpg;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.ayrz;
import defpackage.shf;
import defpackage.xle;
import defpackage.ypa;
import defpackage.ysy;
import defpackage.zaw;
import defpackage.zga;
import defpackage.zgj;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MdxSessionFactory implements any {
    private final axpg A;
    private final anhy B;
    private final acun C;
    private final adkz D;
    private final anic E;
    private final aksl F;
    private ayqx G;
    private final adkv H;
    private final adpl I;
    public atbj a = atbj.MDX_SESSION_SOURCE_UNKNOWN;
    private final Context b;
    private final String c;
    private final aiuy d;
    private final SharedPreferences e;
    private final aczh f;
    private final acyg g;
    private final adhv h;
    private final adie i;
    private final acys j;
    private final ypa k;
    private final shf l;
    private final zgj m;
    private final zaw n;
    private final ysy o;
    private final admt p;
    private final adqq q;
    private final xle r;
    private final adrp s;
    private final adtv t;
    private final afsy u;
    private final Handler v;
    private final acxi w;
    private final acwr x;
    private final boolean y;
    private final int z;

    static {
        zga.a("MDX.SessionFactory");
    }

    public MdxSessionFactory(Context context, String str, aiuy aiuyVar, SharedPreferences sharedPreferences, aczh aczhVar, acyg acygVar, adhv adhvVar, adie adieVar, acys acysVar, ypa ypaVar, shf shfVar, zgj zgjVar, zaw zawVar, ysy ysyVar, admt admtVar, adqq adqqVar, xle xleVar, adrp adrpVar, adtv adtvVar, afsy afsyVar, Handler handler, adkv adkvVar, acxi acxiVar, acwr acwrVar, boolean z, int i, axpg axpgVar, anhy anhyVar, acun acunVar, adkz adkzVar, anic anicVar, adpl adplVar, aksl akslVar) {
        this.b = context;
        this.c = str;
        this.d = aiuyVar;
        this.e = sharedPreferences;
        this.f = aczhVar;
        this.g = acygVar;
        this.h = adhvVar;
        this.i = adieVar;
        this.j = acysVar;
        this.k = ypaVar;
        this.l = shfVar;
        this.m = zgjVar;
        this.n = zawVar;
        this.o = ysyVar;
        this.p = admtVar;
        this.q = adqqVar;
        this.r = xleVar;
        this.s = adrpVar;
        this.t = adtvVar;
        this.u = afsyVar;
        this.v = handler;
        this.H = adkvVar;
        this.w = acxiVar;
        this.x = acwrVar;
        this.y = z;
        this.z = i;
        this.A = axpgVar;
        this.B = anhyVar;
        this.C = acunVar;
        this.D = adkzVar;
        this.E = anicVar;
        this.I = adplVar;
        this.F = akslVar;
    }

    public final adot g(adgb adgbVar, adpf adpfVar, adln adlnVar, acsx acsxVar, acsx acsxVar2, int i, Optional optional) {
        if (adgbVar instanceof adfu) {
            return new adms((adfu) adgbVar, this, this.b, adpfVar, adlnVar, this.n, this.k, acsxVar, acsxVar2, i, optional, this.x, this.w, this.v, this.C, this.E, this.a, this.H);
        }
        if (adgbVar instanceof adfy) {
            return new adob((adfy) adgbVar, this, this.b, adpfVar, adlnVar, this.n, this.e, this.f, this.g, this.h, this.i, this.j, this.c, acsxVar, acsxVar2, (aczg) this.A.get(), this.z, this.s, i, optional, this.H, this.C, this.a);
        }
        if (adgbVar instanceof adga) {
            return new adol((adga) adgbVar, this, this.b, adpfVar, adlnVar, this.n, acsxVar, acsxVar2, i, optional, this.C, this.a);
        }
        throw new IllegalArgumentException("Screen type not supported");
    }

    public final adot h(adfw adfwVar, adpf adpfVar, adln adlnVar, adot adotVar, acsx acsxVar, acsx acsxVar2, admf admfVar) {
        adqp adqpVar;
        Context context = this.b;
        ypa ypaVar = this.k;
        zgj zgjVar = this.m;
        shf shfVar = this.l;
        zaw zawVar = this.n;
        ysy ysyVar = this.o;
        aiuy aiuyVar = this.d;
        Handler handler = new Handler(Looper.getMainLooper());
        adhv adhvVar = this.h;
        if (adotVar.aw()) {
            adqpVar = this.q.a();
        } else {
            adqpVar = this.p.a;
        }
        return new adnd(context, adpfVar, adlnVar, ypaVar, zgjVar, shfVar, zawVar, ysyVar, aiuyVar, handler, adhvVar, adfwVar, adotVar, adqpVar, this.r, this.B, acsxVar, acsxVar2, this.s, this.z, this.t, this.u, this.D, this.y, this.C, Optional.ofNullable(admfVar), this.E, this.c, this.a, this.F);
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
        Object obj = this.G;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        ayqx ayqxVar = this.G;
        if (ayqxVar == null || ayqxVar.e()) {
            this.G = this.I.a.ax(new ayrs() { // from class: adop
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    MdxSessionFactory.this.a = (atbj) obj;
                }
            });
        }
    }
}
