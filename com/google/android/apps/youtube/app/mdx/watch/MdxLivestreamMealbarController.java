package com.google.android.apps.youtube.app.mdx.watch;

import android.app.Activity;
import android.content.SharedPreferences;
import defpackage.aadw;
import defpackage.acqz;
import defpackage.adeg;
import defpackage.adfa;
import defpackage.adlt;
import defpackage.afsy;
import defpackage.aioc;
import defpackage.akbw;
import defpackage.any;
import defpackage.aok;
import defpackage.atax;
import defpackage.ayqw;
import defpackage.azrw;
import defpackage.bph;
import defpackage.dd;
import defpackage.fgq;
import defpackage.jew;
import defpackage.shf;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdxLivestreamMealbarController implements any {
    public final Activity a;
    public final akbw b;
    public final adlt c;
    public final dd d;
    public final SharedPreferences e;
    public final atax f;
    public final bph g;
    public final adfa h;
    public final shf i;
    public final afsy j;
    public final adeg k;
    public final acqz l;
    public final fgq m;
    private final aioc n;
    private final ayqw o = new ayqw();
    private final jew p = new jew(this);

    public MdxLivestreamMealbarController(Activity activity, akbw akbwVar, adlt adltVar, dd ddVar, SharedPreferences sharedPreferences, aioc aiocVar, bph bphVar, adfa adfaVar, azrw azrwVar, shf shfVar, afsy afsyVar, adeg adegVar, acqz acqzVar, fgq fgqVar) {
        this.a = activity;
        this.b = akbwVar;
        this.c = adltVar;
        this.d = ddVar;
        this.e = sharedPreferences;
        this.n = aiocVar;
        this.g = bphVar;
        this.h = adfaVar;
        atax ataxVar = ((aadw) azrwVar.get()).b().n;
        this.f = ataxVar == null ? atax.a : ataxVar;
        this.i = shfVar;
        this.j = afsyVar;
        this.k = adegVar;
        this.l = acqzVar;
        this.m = fgqVar;
        Optional.empty();
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
        this.o.c();
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        atax ataxVar = this.f;
        int i = ataxVar.b;
        if ((1048576 & i) == 0 || !ataxVar.f || (2097152 & i) == 0) {
            return;
        }
        this.o.g(this.p.kI(this.n));
    }
}
