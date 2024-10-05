package com.google.android.apps.youtube.embeddedplayer.service.prewarm.service;

import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.l;
import defpackage.aadw;
import defpackage.aaea;
import defpackage.aahd;
import defpackage.aahx;
import defpackage.aals;
import defpackage.aazq;
import defpackage.abds;
import defpackage.abdt;
import defpackage.abdv;
import defpackage.acpa;
import defpackage.acpm;
import defpackage.acpr;
import defpackage.afqa;
import defpackage.afqd;
import defpackage.afrw;
import defpackage.afsy;
import defpackage.afxf;
import defpackage.ahao;
import defpackage.aian;
import defpackage.aife;
import defpackage.aifv;
import defpackage.aifw;
import defpackage.aiih;
import defpackage.aikd;
import defpackage.aiki;
import defpackage.aikl;
import defpackage.aikp;
import defpackage.aimx;
import defpackage.aioc;
import defpackage.aipn;
import defpackage.aivo;
import defpackage.aivq;
import defpackage.ajjm;
import defpackage.ajkk;
import defpackage.ajoy;
import defpackage.amlr;
import defpackage.ammv;
import defpackage.amsx;
import defpackage.axqq;
import defpackage.axqr;
import defpackage.axqs;
import defpackage.axze;
import defpackage.aypn;
import defpackage.azrw;
import defpackage.ots;
import defpackage.shf;
import defpackage.whu;
import defpackage.wmt;
import defpackage.wnz;
import defpackage.wwb;
import defpackage.xbq;
import defpackage.xcl;
import defpackage.xlu;
import defpackage.ynn;
import defpackage.ypa;
import defpackage.yrw;
import defpackage.zfm;
import defpackage.zgj;
import defpackage.zgk;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;
    private final azrw h;
    private final /* synthetic */ int i;

    public d(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, int i) {
        this.i = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
        this.f = azrwVar6;
        this.g = azrwVar7;
        this.h = azrwVar8;
    }

    public d(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, int i, byte[] bArr) {
        this.i = i;
        this.e = azrwVar;
        this.h = azrwVar2;
        this.f = azrwVar3;
        this.b = azrwVar4;
        this.c = azrwVar5;
        this.d = azrwVar6;
        this.g = azrwVar7;
        this.a = azrwVar8;
    }

    public d(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, int i, char[] cArr) {
        this.i = i;
        this.f = azrwVar;
        this.a = azrwVar2;
        this.g = azrwVar3;
        this.b = azrwVar4;
        this.d = azrwVar5;
        this.e = azrwVar6;
        this.c = azrwVar7;
        this.h = azrwVar8;
    }

    public d(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, int i, float[] fArr) {
        this.i = i;
        this.g = azrwVar;
        this.f = azrwVar2;
        this.h = azrwVar3;
        this.b = azrwVar4;
        this.d = azrwVar5;
        this.c = azrwVar6;
        this.e = azrwVar7;
        this.a = azrwVar8;
    }

    public d(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, int i, int[] iArr) {
        this.i = i;
        this.b = azrwVar;
        this.d = azrwVar2;
        this.f = azrwVar3;
        this.e = azrwVar4;
        this.h = azrwVar5;
        this.a = azrwVar6;
        this.c = azrwVar7;
        this.g = azrwVar8;
    }

    public d(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, int i, short[] sArr) {
        this.i = i;
        this.e = azrwVar;
        this.d = azrwVar2;
        this.b = azrwVar3;
        this.g = azrwVar4;
        this.c = azrwVar5;
        this.a = azrwVar6;
        this.h = azrwVar7;
        this.f = azrwVar8;
    }

    public d(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, int i, boolean[] zArr) {
        this.i = i;
        this.b = azrwVar;
        this.f = azrwVar2;
        this.g = azrwVar3;
        this.c = azrwVar4;
        this.e = azrwVar5;
        this.a = azrwVar6;
        this.d = azrwVar7;
        this.h = azrwVar8;
    }

    public d(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, int i, byte[][] bArr) {
        this.i = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.d = azrwVar3;
        this.e = azrwVar4;
        this.b = azrwVar5;
        this.f = azrwVar6;
        this.h = azrwVar7;
        this.g = azrwVar8;
    }

    public d(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, int i, char[][] cArr) {
        this.i = i;
        this.g = azrwVar;
        this.e = azrwVar2;
        this.f = azrwVar3;
        this.a = azrwVar4;
        this.h = azrwVar5;
        this.b = azrwVar6;
        this.c = azrwVar7;
        this.d = azrwVar8;
    }

    public static d a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8) {
        return new d(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, 0);
    }

    public static acpr b(acpa acpaVar, aazq aazqVar, Object obj, afsy afsyVar, afqd afqdVar, ynn ynnVar, afrw afrwVar) {
        return new acpr(acpaVar, aazqVar, (acpm) obj, afsyVar, afqdVar, ynnVar, afrwVar);
    }

    public static aiki c(Context context, aivq aivqVar, aivo aivoVar, aioc aiocVar, aikl aiklVar, aikd aikdVar, shf shfVar, aikp aikpVar, List list) {
        return new aiki(context, aivqVar, aivoVar, aiocVar.aH(), aikdVar, aiklVar, shfVar, aikpVar, list);
    }

    public static d d(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8) {
        return new d(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, 1, (byte[]) null);
    }

    public static d e(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8) {
        return new d(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, 2, (char[]) null);
    }

    public static d f(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8) {
        return new d(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, 3, (short[]) null);
    }

    public static d g(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8) {
        return new d(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, 4, (int[]) null);
    }

    public static d h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8) {
        return new d(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, 5, (boolean[]) null);
    }

    public static d i(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8) {
        return new d(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, 6, (float[]) null);
    }

    public static d j(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8) {
        return new d(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, 7, (byte[][]) null);
    }

    public static d k(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8) {
        return new d(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, 8, (char[][]) null);
    }

    public static aahx l(afsy afsyVar, azrw azrwVar, ypa ypaVar, azrw azrwVar2, aals aalsVar, Map map, Executor executor, whu whuVar) {
        return new aahx(afsyVar, azrwVar, ypaVar, azrwVar2, aalsVar, map, executor);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.i) {
            case 0:
                return new c((aian) this.a.get(), (l) this.b.get(), (com.google.android.apps.youtube.embeddedplayer.service.innertube.a) this.c.get(), ((zgk) this.d).get(), (com.google.android.apps.youtube.embeddedplayer.service.hostappverification.b) this.e.get(), (aaea) this.f.get(), (aadw) this.g.get(), (axze) this.h.get(), null, null, null, null);
            case 1:
                return new afqa((Executor) this.e.get(), (Context) ((axqs) this.h).a, (yrw) this.f.get(), this.b, null, (shf) this.c.get(), ((ajkk) this.d).get(), new ajjm(), this.g, this.a, amlr.a);
            case 2:
                return new wwb(this.f, (wnz) this.a.get(), this.g, this.b, (amsx) this.d.get(), (aaea) this.e.get(), (aadw) this.c.get(), this.h);
            case 3:
                return new xlu((aifw) this.d.get(), (aifv) this.b.get(), (wmt) this.g.get(), (xbq) this.c.get(), (afxf) this.a.get(), (xcl) this.h.get(), (aahd) this.f.get());
            case 4:
                return l((afsy) this.b.get(), this.d, (ypa) this.f.get(), this.e, (aals) this.h.get(), (Map) ((axqs) this.a).a, (Executor) this.c.get(), (whu) this.g.get());
            case 5:
                ajoy ajoyVar = (ajoy) this.b.get();
                return new abds(ajoyVar, (ammv) ((axqs) this.g).a, this.c, (aaea) this.e.get(), (abdt) this.a.get(), ((abdv) this.d).get(), (zfm) this.h.get(), null, null, null);
            case 6:
                acpa acpaVar = (acpa) this.g.get();
                aazq aazqVar = (aazq) this.f.get();
                Object obj = this.h.get();
                afsy afsyVar = (afsy) this.b.get();
                afqd afqdVar = (afqd) this.d.get();
                ynn ynnVar = (ynn) this.c.get();
                afrw afrwVar = (afrw) this.e.get();
                return b(acpaVar, aazqVar, obj, afsyVar, afqdVar, ynnVar, afrwVar);
            case 7:
                return c((Context) ((axqs) this.c).a, (aivq) this.a.get(), (aivo) this.d.get(), (aioc) this.e.get(), ((ahao) this.b).get(), (aikd) this.f.get(), (shf) this.h.get(), ots.a(), (List) this.g.get());
            default:
                zgj zgjVar = ((zgk) this.g).get();
                aipn aipnVar = (aipn) this.e.get();
                aypn aypnVar = (aypn) this.f.get();
                aypn aypnVar2 = (aypn) this.a.get();
                aiih aiihVar = (aiih) this.h.get();
                aimx aimxVar = (aimx) this.b.get();
                axqq.a(this.c);
                return new aife(zgjVar, aipnVar, aypnVar, aypnVar2, aiihVar, aimxVar);
        }
    }
}
