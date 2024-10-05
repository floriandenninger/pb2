package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afai implements bdr, aezd {
    protected final afah[] a;
    private final axj b;
    private final boolean c;
    private final boolean d;
    private final int[] e;
    private final bel f;
    private final int g;
    private final ate h;
    private final int i;
    private final PlayerConfigModel j;
    private final ysy k;
    private boolean l;
    private final afag m;
    private final aevc[] n;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0090 A[LOOP:0: B:7:0x008e->B:8:0x0090, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public afai(defpackage.axj r16, com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel[] r17, defpackage.afhs r18, int[] r19, defpackage.bel r20, int r21, defpackage.ate r22, int r23, defpackage.afjf r24, int r25, defpackage.aevc[] r26, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r27, defpackage.ysy r28) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afai.<init>(axj, com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel[], afhs, int[], bel, int, ate, int, afjf, int, aevc[], com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, ysy):void");
    }

    private final bdw k(int i, long j, bdu bduVar) {
        afah afahVar = this.a[i];
        if (afahVar.c == null) {
            return bdw.b;
        }
        afahVar.g();
        long f = afahVar.f();
        long l = l(afahVar, bduVar, j, f);
        return l < 0 ? bdw.b : new bdj(afahVar, l, f);
    }

    private static final long l(afah afahVar, bdu bduVar, long j, long j2) {
        if (bduVar != null) {
            long f = bduVar.f();
            if (f != -1) {
                return f;
            }
        }
        return pts.m(afahVar.c(j), 0L, j2);
    }

    private static final void m() {
        System.currentTimeMillis();
    }

    @Override // defpackage.bdr
    public final int a(long j, List list) {
        if (this.f.d() < 2) {
            return list.size();
        }
        return this.f.g(j, list);
    }

    @Override // defpackage.bdr
    public final long b(long j, poi poiVar) {
        for (afah afahVar : this.a) {
            if (afahVar.c != null) {
                long c = afahVar.c(j);
                long d = afahVar.d(c);
                return poiVar.a(j, d, (d >= j || c >= afahVar.a() + (-1)) ? d : afahVar.d(c + 1));
            }
        }
        return j;
    }

    @Override // defpackage.bdr
    public void c(long j, long j2, List list, bdp bdpVar) {
        afai afaiVar;
        long j3;
        int i;
        pms pmsVar;
        bdn bdsVar;
        axk b;
        long j4 = j2 - j;
        m();
        bdu bduVar = list.isEmpty() ? null : (bdu) list.get(list.size() - 1);
        int d = this.f.d();
        bdw[] bdwVarArr = new bdw[d];
        for (int i2 = 0; i2 < d; i2++) {
            bdwVarArr[i2] = k(i2, j2, bduVar);
        }
        bdu bduVar2 = bduVar;
        this.f.o(j, j4, -9223372036854775807L, list, bdwVarArr);
        afah afahVar = this.a[this.f.h()];
        bdm bdmVar = afahVar.e;
        if (bdmVar != null) {
            axl axlVar = afahVar.a;
            axk axkVar = bdmVar.a == null ? axlVar.d : null;
            axk axkVar2 = afahVar.c == null ? axlVar.g : null;
            if (axkVar != null || axkVar2 != null) {
                bdpVar.a = j(afahVar, this.h, this.f.p(), this.f.i(), this.f.j(), axkVar, axkVar2, j);
                return;
            }
        }
        if (afahVar.a() == 0) {
            boolean z = this.b.b;
            bdpVar.b = true;
            return;
        }
        afahVar.g();
        long f = afahVar.f();
        long l = l(afahVar, bduVar2, j2, f);
        if (l <= f && (!this.l || l < f)) {
            long j5 = afahVar.d;
            if (j5 == -9223372036854775807L || afahVar.d(l) < j5) {
                int min = (int) Math.min(this.i, (f - l) + 1);
                if (j5 != -9223372036854775807L) {
                    while (min > 1 && afahVar.d((min + l) - 1) >= j5) {
                        min--;
                    }
                }
                if (true != list.isEmpty()) {
                    j3 = -9223372036854775807L;
                    afaiVar = this;
                } else {
                    afaiVar = this;
                    j3 = j2;
                }
                ate ateVar = afaiVar.h;
                int i3 = afaiVar.g;
                pms p = afaiVar.f.p();
                int i4 = afaiVar.f.i();
                Object j6 = afaiVar.f.j();
                axl axlVar2 = afahVar.a;
                long d2 = afahVar.d(l);
                axk e = afahVar.e(l);
                String str = ((axi) axlVar2.b.get(0)).a;
                if (afahVar.e != null) {
                    int i5 = 1;
                    int i6 = 1;
                    while (true) {
                        i = i3;
                        pmsVar = p;
                        if (i5 >= min || (b = e.b(afahVar.e(i5 + l), str)) == null) {
                            break;
                        }
                        i6++;
                        i5++;
                        p = pmsVar;
                        e = b;
                        i3 = i;
                    }
                    long b2 = afahVar.b((i6 + l) - 1);
                    long j7 = afahVar.d;
                    long j8 = (j7 == -9223372036854775807L || j7 > b2) ? -9223372036854775807L : j7;
                    aane b3 = aane.b(e.a(str));
                    b3.e(adyu.O(afahVar.b, afaiVar.j, i4, afaiVar.k.a()));
                    Uri a = b3.a();
                    atg atgVar = new atg();
                    atgVar.a = a;
                    atgVar.f = e.a;
                    atgVar.g = e.b;
                    atgVar.h = axlVar2.f;
                    aehw a2 = aehx.a();
                    a2.i(afaiVar.n);
                    a2.h(TimeUnit.MICROSECONDS.toMillis(j));
                    a2.g(d2 / 1000);
                    a2.f((b2 - d2) / 1000);
                    a2.e(afahVar.b.f);
                    atgVar.j = a2.a();
                    ath a3 = atgVar.a();
                    long j9 = -axlVar2.c;
                    if (afaiVar.d) {
                        bdsVar = new afad(ateVar, a3, pmsVar, i4, j6, d2, b2, j3, j8, l, i6, j9, afahVar.e, afaiVar.m, i);
                    } else {
                        bdsVar = new bds(ateVar, a3, pmsVar, i4, j6, d2, b2, j3, j8, l, i6, j9, afahVar.e);
                    }
                } else {
                    long b4 = afahVar.b(l);
                    aane b5 = aane.b(e.a(str));
                    b5.e(adyu.O(afahVar.b, afaiVar.j, i4, afaiVar.k.a()));
                    Uri a4 = b5.a();
                    atg atgVar2 = new atg();
                    atgVar2.a = a4;
                    atgVar2.f = e.a;
                    atgVar2.g = e.b;
                    atgVar2.h = axlVar2.f;
                    aehw a5 = aehx.a();
                    a5.i(afaiVar.n);
                    a5.h(TimeUnit.MICROSECONDS.toMillis(j));
                    a5.g(d2 / 1000);
                    a5.f((b4 - d2) / 1000);
                    a5.e(afahVar.b.f);
                    atgVar2.j = a5.a();
                    bdsVar = new bdx(ateVar, atgVar2.a(), p, i4, j6, d2, b4, l, i3, p);
                }
                bdpVar.a = bdsVar;
                return;
            }
            bdpVar.b = true;
            return;
        }
        boolean z2 = this.b.b;
        bdpVar.b = true;
    }

    @Override // defpackage.bdr
    public final void d() {
    }

    @Override // defpackage.bdr
    public final void e(bdn bdnVar) {
        int c;
        bib a;
        if (bdnVar instanceof afab) {
            c = this.f.c(((afab) bdnVar).h);
        } else {
            c = bdnVar instanceof bdt ? this.f.c(((bdt) bdnVar).h) : -1;
        }
        if (c >= 0) {
            afah afahVar = this.a[c];
            if (afahVar.c != null || (a = afahVar.e.a()) == null) {
                return;
            }
            this.a[c] = new afah(afahVar.d, afahVar.a, afahVar.b, afahVar.e, new axh(a, afahVar.a.c));
        }
    }

    @Override // defpackage.bdr
    public final void f() {
        for (afah afahVar : this.a) {
            bdm bdmVar = afahVar.e;
            if (bdmVar != null) {
                bdmVar.c();
            }
        }
    }

    @Override // defpackage.bdr
    public final boolean g(bdn bdnVar, boolean z, bfr bfrVar, bfs bfsVar) {
        if (!z) {
            return false;
        }
        boolean z2 = this.b.b;
        if (bdnVar instanceof bdu) {
            IOException iOException = bfrVar.b;
            if ((iOException instanceof atp) && ((atp) iOException).d == 404) {
                afah afahVar = this.a[this.f.c(bdnVar.h)];
                long a = afahVar.a();
                if (a != 0) {
                    afahVar.h();
                    if (((bdu) bdnVar).f() > a - 1) {
                        this.l = true;
                        return true;
                    }
                }
            }
        }
        affp d = bfsVar.d(aezt.e(this.f), bfrVar);
        if (d != null) {
            bel belVar = this.f;
            if (belVar.q(belVar.c(bdnVar.h), d.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bdr
    public final void h() {
        this.f.s();
    }

    @Override // defpackage.aezd
    public final bdw i(ask askVar, int i, long j, bdu bduVar) {
        if (askVar != this.f) {
            return bdw.b;
        }
        m();
        return k(i, j, bduVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public bdn j(afah afahVar, ate ateVar, pms pmsVar, int i, Object obj, axk axkVar, axk axkVar2, long j) {
        axk axkVar3;
        String str = ((axi) afahVar.a.b.get(0)).a;
        if (axkVar != null) {
            axkVar3 = axkVar.b(axkVar2, str);
            if (axkVar3 == null) {
                axkVar3 = axkVar;
            }
        } else {
            axkVar3 = axkVar2;
        }
        aane b = aane.b(axkVar3.a(str));
        b.e(adyu.O(afahVar.b, this.j, i, this.k.a()));
        Uri a = b.a();
        atg atgVar = new atg();
        atgVar.a = a;
        atgVar.f = axkVar3.a;
        atgVar.g = axkVar3.b;
        atgVar.h = afahVar.a.f;
        aehw a2 = aehx.a();
        a2.i(this.n);
        a2.h(TimeUnit.MICROSECONDS.toMillis(j));
        a2.e(afahVar.b.f);
        atgVar.j = a2.a();
        ath a3 = atgVar.a();
        if (this.c) {
            return new afab(ateVar, a3, pmsVar, i, obj, afahVar.e);
        }
        return new bdt(ateVar, a3, pmsVar, i, obj, afahVar.e);
    }
}
