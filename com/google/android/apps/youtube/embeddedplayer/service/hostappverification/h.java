package com.google.android.apps.youtube.embeddedplayer.service.hostappverification;

import android.content.Context;
import defpackage.aadw;
import defpackage.aaea;
import defpackage.afrz;
import defpackage.afsy;
import defpackage.ajoy;
import defpackage.ajyw;
import defpackage.aksc;
import defpackage.amda;
import defpackage.ammv;
import defpackage.anic;
import defpackage.aoae;
import defpackage.axqr;
import defpackage.axqs;
import defpackage.axqt;
import defpackage.ayaw;
import defpackage.aypn;
import defpackage.azrw;
import defpackage.sgf;
import defpackage.shf;
import defpackage.sif;
import defpackage.sii;
import defpackage.sij;
import defpackage.whu;
import defpackage.wki;
import defpackage.wkk;
import defpackage.wng;
import defpackage.wni;
import defpackage.wod;
import defpackage.wpu;
import defpackage.wqa;
import defpackage.wqd;
import defpackage.wsk;
import defpackage.wtx;
import defpackage.wvs;
import defpackage.wwg;
import defpackage.wwl;
import defpackage.wxm;
import defpackage.wxx;
import defpackage.wyf;
import defpackage.wym;
import defpackage.wyt;
import defpackage.wyu;
import defpackage.ysl;
import defpackage.yxx;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class h implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final /* synthetic */ int d;

    public h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i) {
        this.d = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, byte[] bArr) {
        this.d = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
    }

    public h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, char[] cArr) {
        this.d = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
    }

    public h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, float[] fArr) {
        this.d = i;
        this.a = azrwVar;
        this.c = azrwVar2;
        this.b = azrwVar3;
    }

    public h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, int[] iArr) {
        this.d = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
    }

    public h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, short[] sArr) {
        this.d = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
    }

    public h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, boolean[] zArr) {
        this.d = i;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
    }

    public h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, byte[][] bArr) {
        this.d = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
    }

    public h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, char[][] cArr) {
        this.d = i;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
    }

    public h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, float[][] fArr) {
        this.d = i;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
    }

    public h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, int[][] iArr) {
        this.d = i;
        this.a = azrwVar;
        this.c = azrwVar2;
        this.b = azrwVar3;
    }

    public h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, short[][] sArr) {
        this.d = i;
        this.c = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
    }

    public h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, boolean[][] zArr) {
        this.d = i;
        this.a = azrwVar;
        this.c = azrwVar2;
        this.b = azrwVar3;
    }

    public h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, byte[][][] bArr) {
        this.d = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
    }

    public h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, char[][][] cArr) {
        this.d = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
    }

    public h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, int[][][] iArr) {
        this.d = i;
        this.a = azrwVar;
        this.c = azrwVar2;
        this.b = azrwVar3;
    }

    public h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, short[][][] sArr) {
        this.d = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
    }

    public static h A(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 19, (short[][][]) null);
    }

    public static h B(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 20, (int[][][]) null);
    }

    public static wqa C(aypn aypnVar, wxx wxxVar, whu whuVar) {
        return new wqa(aypnVar, wxxVar, whuVar, null, null);
    }

    public static wwl D(wod wodVar, Map map, whu whuVar) {
        return new wwl(wodVar, map);
    }

    public static wxm E(aoae aoaeVar, whu whuVar) {
        return new wxm(aoaeVar, whuVar, null, null, null, null);
    }

    public static h a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 0);
    }

    public static anic b(anic anicVar, ammv ammvVar, sii siiVar) {
        anic a;
        if (((Boolean) ammvVar.e(false)).booleanValue()) {
            a = siiVar.a(sgf.g(anicVar));
        } else {
            a = siiVar.a(sif.a(anicVar));
        }
        ayaw.k(a);
        return a;
    }

    public static anic c(anic anicVar, ammv ammvVar, sii siiVar) {
        anic a;
        if (((Boolean) ammvVar.e(false)).booleanValue()) {
            a = siiVar.a(sgf.g(anicVar));
        } else {
            a = siiVar.a(sif.a(anicVar));
        }
        ayaw.k(a);
        return a;
    }

    public static anic d(anic anicVar, ammv ammvVar, sii siiVar) {
        anic a;
        if (((Boolean) ammvVar.e(false)).booleanValue()) {
            a = siiVar.a(sgf.g(anicVar));
        } else {
            a = siiVar.a(sif.a(anicVar));
        }
        ayaw.k(a);
        return a;
    }

    public static wpu e(Executor executor, Executor executor2) {
        return new wpu(executor, executor2);
    }

    public static wqd f(afsy afsyVar, Executor executor) {
        return new wqd(afsyVar, executor);
    }

    public static wsk g(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new wsk(azrwVar, azrwVar2, azrwVar3);
    }

    public static wtx h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new wtx(azrwVar, azrwVar2, azrwVar3);
    }

    public static wyu i(aaea aaeaVar, shf shfVar, wng wngVar) {
        return new wyu(aaeaVar, shfVar, wngVar);
    }

    public static h j(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 1, (byte[]) null);
    }

    public static h k(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 2, (char[]) null);
    }

    public static h l(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 3);
    }

    public static h m(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 4);
    }

    public static h n(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 5);
    }

    public static h o(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 6, (short[]) null);
    }

    public static h p(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 8, (boolean[]) null);
    }

    public static h q(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 9, (float[]) null);
    }

    public static h r(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 10);
    }

    public static h s(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 11, (byte[][]) null);
    }

    public static h t(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new h(azrwVar, azrwVar3, azrwVar4, 12, (char[][]) null);
    }

    public static h u(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 13, (short[][]) null);
    }

    public static h v(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 14, (int[][]) null);
    }

    public static h w(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 15, (boolean[][]) null);
    }

    public static h x(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 16, (float[][]) null);
    }

    public static h y(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 17, (byte[][][]) null);
    }

    public static h z(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new h(azrwVar, azrwVar2, azrwVar3, 18, (char[][][]) null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        afrz afrzVar;
        switch (this.d) {
            case 0:
                return new g((ysl) this.a.get(), (com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.f) this.b.get(), (String) this.c.get());
            case 1:
                azrw azrwVar = this.c;
                azrw azrwVar2 = this.a;
                if (((yxx) this.b.get()).f(yxx.S) == 1) {
                    afrzVar = (afrz) azrwVar.get();
                } else {
                    afrzVar = (afrz) azrwVar2.get();
                }
                ayaw.k(afrzVar);
                return afrzVar;
            case 2:
                return new com.google.android.apps.youtube.embeddedplayer.service.permissions.c((b) this.c.get(), (Executor) this.a.get(), (aadw) this.b.get());
            case 3:
                return b((anic) this.a.get(), (ammv) this.b.get(), ((sij) this.c).get());
            case 4:
                return c((anic) this.a.get(), (ammv) this.b.get(), ((sij) this.c).get());
            case 5:
                return d((anic) this.a.get(), (ammv) this.b.get(), ((sij) this.c).get());
            case 6:
                return new ajyw(this.b, this.a, this.c, (short[]) null, (byte[]) null, (byte[]) null);
            case 7:
                return new wkk(((amda) this.b).get(), (wki) this.a.get(), aksc.a(), (Context) ((axqs) this.c).a);
            case 8:
                return e((Executor) this.c.get(), (Executor) this.a.get());
            case 9:
                return C((aypn) this.a.get(), (wxx) this.c.get(), (whu) this.b.get());
            case 10:
                afsy afsyVar = (afsy) this.a.get();
                Executor executor = (Executor) this.b.get();
                return f(afsyVar, executor);
            case 11:
                return g(this.b, this.a, this.c);
            case 12:
                return h(this.b, this.c, this.a);
            case 13:
                return new wvs(this.c, this.b, this.a);
            case 14:
                azrw azrwVar3 = this.a;
                azrw azrwVar4 = this.c;
                return new wwg(azrwVar3, azrwVar4);
            case 15:
                return D((wod) this.a.get(), ((axqt) this.c).get(), (whu) this.b.get());
            case 16:
                aoae aoaeVar = (aoae) this.b.get();
                whu whuVar = (whu) this.c.get();
                return E(aoaeVar, whuVar);
            case 17:
                azrw azrwVar5 = this.b;
                azrw azrwVar6 = this.a;
                return new wyf(azrwVar5, azrwVar6);
            case 18:
                wni wniVar = (wni) ((axqs) this.b).a;
                ajoy ajoyVar = (ajoy) this.a.get();
                return new wym(wniVar, ajoyVar, null, null, null, null);
            case 19:
                return new wyt((wni) ((axqs) this.b).a, (wym) this.a.get(), (aaea) this.c.get());
            default:
                return i((aaea) this.a.get(), (shf) this.c.get(), (wng) this.b.get());
        }
    }
}
