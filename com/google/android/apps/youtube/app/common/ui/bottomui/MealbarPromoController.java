package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import com.google.android.youtube.R;
import defpackage.aadw;
import defpackage.acra;
import defpackage.aioc;
import defpackage.ajyg;
import defpackage.ajyw;
import defpackage.ajzf;
import defpackage.akbw;
import defpackage.akbx;
import defpackage.akby;
import defpackage.amkq;
import defpackage.any;
import defpackage.aok;
import defpackage.atcf;
import defpackage.ayqw;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.ayrz;
import defpackage.evr;
import defpackage.fgq;
import defpackage.fhg;
import defpackage.gbw;
import defpackage.gby;
import defpackage.gbz;
import defpackage.gcg;
import defpackage.gch;
import defpackage.gcj;
import defpackage.gck;
import defpackage.mjf;
import defpackage.ypa;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MealbarPromoController implements any {
    public final gck a;
    public final acra b;
    public atcf c;
    public akby d;
    public atcf e;
    public fhg f;
    public final gbz g;
    public final mjf h;
    public final gck i;
    private final Context j;
    private final akbw k;
    private final gby l;
    private ayqx m;
    private final ypa n;
    private final aioc o;
    private final ayqw p;
    private final fgq q;
    private final ajzf r;
    private final gcj s = new gcj(this);
    private final gch t = new gch(this);
    private final aadw u;
    private final ajyw v;

    public MealbarPromoController(Context context, acra acraVar, akbw akbwVar, ajyw ajywVar, gby gbyVar, ypa ypaVar, aioc aiocVar, aadw aadwVar, ajyg ajygVar, fgq fgqVar, ajzf ajzfVar, mjf mjfVar, gbz gbzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.j = context;
        acraVar.getClass();
        this.b = acraVar;
        akbwVar.getClass();
        this.k = akbwVar;
        if (akbwVar instanceof gbw) {
            ((gbw) akbwVar).b = ajygVar;
        }
        this.v = ajywVar;
        this.l = gbyVar;
        this.n = ypaVar;
        this.o = aiocVar;
        this.u = aadwVar;
        this.p = new ayqw();
        this.q = fgqVar;
        this.r = ajzfVar;
        this.h = mjfVar;
        this.g = gbzVar;
        this.i = new gck();
        this.a = new gck();
    }

    private final akby j(akbx akbxVar) {
        Boolean bool = akbxVar.b;
        if (bool == null) {
            throw new IllegalStateException("Property \"counterfactual\" has not been set");
        }
        if (bool.booleanValue()) {
            if (TextUtils.isEmpty(akbxVar.c)) {
                akbxVar.c = this.j.getString(R.string.common_error_generic);
            }
            if (TextUtils.isEmpty(akbxVar.e)) {
                akbxVar.b(this.j.getString(R.string.dismiss), null, null);
            }
        }
        return akbxVar.f();
    }

    public final void g(atcf atcfVar) {
        if (atcfVar == null || this.d == null || !atcfVar.equals(this.c)) {
            return;
        }
        this.k.n(this.d);
    }

    public final void h(atcf atcfVar, acra acraVar) {
        this.a.b(null);
        this.e = null;
        if (atcfVar == null) {
            if (this.d != null) {
                g(this.c);
                return;
            }
            return;
        }
        int cL = amkq.cL(atcfVar.h);
        if (cL == 0 || cL != 2) {
            int cL2 = amkq.cL(atcfVar.h);
            if (cL2 != 0 && cL2 == 6) {
                this.e = atcfVar;
                return;
            } else {
                this.a.b(atcfVar);
                return;
            }
        }
        i(atcfVar, acraVar);
    }

    public final void i(atcf atcfVar, acra acraVar) {
        if (atcfVar == null || atcfVar.equals(this.c)) {
            return;
        }
        gcg gcgVar = new gcg(this, atcfVar);
        akbx b = this.l.b(atcfVar, null);
        if (atcfVar.p.size() == 0) {
            b.m = this.v.q(atcfVar, acraVar, gcgVar);
            this.k.o(j(b));
        } else if (this.r.c(atcfVar.p)) {
            b.m = this.v.q(atcfVar, acraVar, gcgVar);
            this.k.o(j(b));
            this.r.a(atcfVar.p);
        }
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
        if (evr.au(this.u)) {
            this.p.c();
        } else {
            this.n.m(this.s);
        }
        this.n.m(this.t);
        Object obj = this.m;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.m = null;
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (evr.au(this.u)) {
            this.p.c();
            this.p.g(this.s.kI(this.o));
        } else {
            this.n.g(this.s);
        }
        this.n.g(this.t);
        this.f = this.q.g();
        this.m = this.q.h().B().ax(new ayrs() { // from class: gcf
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                MealbarPromoController mealbarPromoController = MealbarPromoController.this;
                fhg fhgVar = (fhg) obj;
                if (mealbarPromoController.f == fhg.WATCH_WHILE_PICTURE_IN_PICTURE) {
                    atcf atcfVar = mealbarPromoController.e;
                    mealbarPromoController.e = null;
                    mealbarPromoController.i(atcfVar, mealbarPromoController.b);
                }
                mealbarPromoController.f = fhgVar;
            }
        });
    }
}
