package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aesy implements ozt, afhi {
    static final long a = TimeUnit.HOURS.toMicros(4);
    private Long A;
    private final long B;
    private long C;
    private final long D;
    private boolean E = false;
    private int F;
    private final int G;
    private final muf H;
    public final boolean b;
    public final Handler c;
    public final aesw d;
    public final int e;
    public final Exchanger f;
    public Long g;
    public boolean h;
    public Long i;
    public boolean j;
    public Long k;
    public aeta l;
    private final String n;
    private final FormatStreamModel[] o;
    private final pfq p;
    private final ozx q;
    private final boolean r;
    private final int s;
    private final affc t;
    private final ozw u;
    private final ozm[] v;
    private final ozv[] w;
    private final PlayerConfigModel x;
    private final ysy y;
    private oyw z;

    public aesy(String str, FormatStreamModel[] formatStreamModelArr, afhf afhfVar, ozx ozxVar, affc affcVar, muf mufVar, boolean z, int i, Exchanger exchanger, Handler handler, aesw aeswVar, int i2, PlayerConfigModel playerConfigModel, boolean z2, ysy ysyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        ammv ammvVar;
        int length;
        this.n = str;
        this.o = formatStreamModelArr;
        int length2 = formatStreamModelArr.length;
        if (length2 > 0) {
            ammvVar = ammv.i(formatStreamModelArr[0].b);
        } else {
            ammvVar = amlr.a;
        }
        this.p = new afjg(afhfVar.c(this, str, ammvVar));
        this.q = ozxVar;
        this.r = z;
        this.s = i;
        this.t = affcVar;
        this.H = mufVar;
        this.f = exchanger;
        this.c = handler;
        this.d = aeswVar;
        this.e = i2;
        this.u = new ozw();
        int i3 = 1;
        this.j = true;
        this.x = playerConfigModel;
        aquz aquzVar = playerConfigModel.c.e;
        if ((anaf.bb((aquzVar == null ? aquz.b : aquzVar).aM) == 0 ? 1 : r5) - 1 > 0) {
            aquz aquzVar2 = playerConfigModel.c.e;
            int bb = anaf.bb((aquzVar2 == null ? aquz.b : aquzVar2).aM);
            if (bb != 0) {
                i3 = bb;
            }
        } else {
            i3 = 2;
        }
        this.G = i3;
        this.b = z2;
        this.v = new ozm[length2];
        this.w = new ozv[length2];
        this.y = ysyVar;
        aquz aquzVar3 = playerConfigModel.c.e;
        double d = (aquzVar3 == null ? aquz.b : aquzVar3).ba;
        Double.isNaN(d);
        this.D = (long) (d * 1000000.0d);
        int i4 = 0;
        while (true) {
            length = formatStreamModelArr.length;
            if (i4 >= length) {
                break;
            }
            this.w[i4] = ozv.d(formatStreamModelArr[i4]);
            this.v[i4] = new aesv(this, new aetb(this));
            i4++;
        }
        double a2 = length > 0 ? formatStreamModelArr[0].a() : 0.0d;
        this.B = a2 > 0.0d ? (long) (a2 * 1000000.0d) : a;
        this.z = new oyv(0L, 0L);
        s();
    }

    private final int m(ozv ozvVar) {
        int i = 0;
        while (true) {
            ozv[] ozvVarArr = this.w;
            if (i >= ozvVarArr.length) {
                return 0;
            }
            if (ozvVarArr[i].a.equals(ozvVar.a)) {
                return i;
            }
            i++;
        }
    }

    private final synchronized long n() {
        return this.z.a(null)[1];
    }

    private final Uri o(int i, Long l) {
        FormatStreamModel formatStreamModel = this.o[i];
        aane n = formatStreamModel.n();
        n.c(this.n);
        n.e(adyu.O(formatStreamModel, this.x, this.u.b, this.y.a()));
        if (l != null) {
            n.f(l.longValue());
        } else {
            n.d(this.t.b());
        }
        return n.a();
    }

    private static MediaFormat p(ozv ozvVar) {
        if (!aaov.d(ozvVar.b)) {
            return MediaFormat.b(ozvVar.a, "audio/mp4a-latm", ozvVar.c, -1, -1L, ozvVar.g, ozvVar.h, null, ozvVar.j);
        }
        return MediaFormat.j(ozvVar.a, "video/avc", ozvVar.c, -1L, ozvVar.d, ozvVar.e);
    }

    private final synchronized oyw q() {
        long max;
        oyw aetmVar;
        long n = n();
        if (n > 0) {
            boolean z = true;
            if (!this.b && !this.h && !this.E) {
                z = false;
            }
            long max2 = Math.max(n - this.t.d(), 0L);
            if (this.b) {
                long longValue = this.A.longValue();
                long longValue2 = this.k.longValue();
                long micros = TimeUnit.MILLISECONDS.toMicros(this.s);
                Long.signum(longValue2);
                max = Math.max(0L, longValue - (longValue2 * micros));
            } else {
                max = Math.max(0L, n - this.B);
            }
            long j = max;
            if (z) {
                aetmVar = new oyv(j, n);
            } else {
                aetmVar = new aetm(j, max2, this.H, true, null, null, null, null);
            }
            return aetmVar;
        }
        return new oyv(0L, 0L);
    }

    private final synchronized Long r(long j) {
        Long l;
        Long l2;
        if (this.r && this.s > 0 && (l = this.k) != null && l.longValue() > 0 && (l2 = this.A) != null && l2.longValue() > 0 && j > 0) {
            long micros = TimeUnit.MILLISECONDS.toMicros(this.s);
            double longValue = this.A.longValue() - j;
            double d = micros;
            Double.isNaN(longValue);
            Double.isNaN(d);
            return Long.valueOf(this.k.longValue() - ((long) Math.ceil(longValue / d)));
        }
        return null;
    }

    private final synchronized void s() {
        if (this.c == null || this.d == null) {
            return;
        }
        this.C = n();
        final oyw oywVar = this.z;
        final oyw q = q();
        this.c.post(new Runnable() { // from class: aest
            @Override // java.lang.Runnable
            public final void run() {
                aesy aesyVar = aesy.this;
                oyw oywVar2 = oywVar;
                oyw oywVar3 = q;
                afbs afbsVar = (afbs) aesyVar.d;
                if (aesyVar.e != afbsVar.u()) {
                    return;
                }
                afbsVar.E = oywVar2;
                long[] b = oywVar3.b();
                afbsVar.f.k(b[0], b[1]);
            }
        });
    }

    private final boolean t() {
        return this.q != null;
    }

    @Override // defpackage.afhi
    public final void D(int i, Map map) {
        ajun ajunVar = new ajun(map);
        Long c = ajunVar.c();
        Long d = ajunVar.d();
        if (d != null) {
            synchronized (this) {
                if (c != null) {
                    if (!d.equals(this.A)) {
                        if (this.b && this.B < d.longValue()) {
                            long micros = TimeUnit.MILLISECONDS.toMicros(this.s);
                            long longValue = d.longValue();
                            long longValue2 = c.longValue();
                            Long.signum(longValue2);
                            long max = (Math.max(0L, longValue - (longValue2 * micros)) + this.B) - micros;
                            this.k = Long.valueOf(max / micros);
                            this.A = Long.valueOf(max);
                        } else {
                            this.k = c;
                            this.A = d;
                        }
                        this.t.j(d.longValue());
                    }
                }
                l(this.A.longValue());
            }
        }
        aeta aetaVar = this.l;
        if (aetaVar != null) {
            try {
                if (aetaVar.r == 3) {
                    Long f = new ajun(map).f();
                    long longValue3 = f != null ? f.longValue() : -1L;
                    long j = aetaVar.n;
                    if (j != -1 && j != longValue3) {
                        aetaVar.n = Math.max(j, longValue3);
                        aetaVar.o = 0;
                        throw new afhv(aetaVar.d);
                    }
                    aetaVar.n = longValue3;
                }
            } catch (afhv e) {
                if ("x-segment-lmt".equals(e.e)) {
                    afif afifVar = afif.DEFAULT;
                    long o = this.l.o();
                    int i2 = this.l.i;
                    StringBuilder sb = new StringBuilder(14);
                    sb.append("sq.");
                    sb.append(i2);
                    k(afifVar, "manifestless.lmt", o, sb.toString());
                }
                throw e;
            }
        }
    }

    @Override // defpackage.ozt
    public final int a() {
        if (t()) {
            return 1;
        }
        return this.w.length;
    }

    @Override // defpackage.ozt
    public final MediaFormat b(int i) {
        return p(this.w[i]);
    }

    @Override // defpackage.ozt
    public final void c(long j) {
    }

    @Override // defpackage.ozt
    public final void d(List list) {
        this.u.c = null;
    }

    @Override // defpackage.ozt
    public final void e(int i) {
        this.F = i;
    }

    @Override // defpackage.ozt
    public final void f(List list, long j, ozn oznVar) {
        long j2;
        long j3;
        int i;
        ozk ozkVar;
        if (list.isEmpty()) {
            Long r = r(j);
            this.g = r;
            if (r != null) {
                this.g = Long.valueOf(r.longValue() - 1);
            }
            this.i = null;
            this.j = true;
            this.h = false;
        }
        if (this.h) {
            this.t.i(n());
            oznVar.c = true;
            return;
        }
        this.u.a = list.size();
        if (t()) {
            this.q.a(list, j, this.w, this.u);
        } else {
            ozw ozwVar = this.u;
            ozwVar.c = this.w[this.F];
            ozwVar.b = 2;
        }
        ozw ozwVar2 = this.u;
        ozv ozvVar = ozwVar2.c;
        int i2 = ozwVar2.a;
        oznVar.a = i2;
        if (ozvVar == null) {
            oznVar.b = null;
            return;
        }
        if (i2 == list.size() && (ozkVar = oznVar.b) != null && ozkVar.c.equals(ozvVar)) {
            return;
        }
        ozz ozzVar = list.isEmpty() ? null : (ozz) list.get(oznVar.a - 1);
        Long valueOf = (ozzVar == null || (i = ozzVar.i) < 0) ? this.g : Long.valueOf(i);
        this.g = valueOf != null ? Long.valueOf(valueOf.longValue() + 1) : null;
        long j4 = 0;
        if (this.b) {
            Long r2 = r(j);
            Long l = this.g;
            if (l != null) {
                if (r2 == null || l.longValue() >= r2.longValue()) {
                    r2 = this.g;
                }
                j3 = r2.longValue();
            } else {
                j3 = 0;
            }
            this.g = Long.valueOf(j3);
        }
        if (this.g == null || !(ozzVar instanceof aeta)) {
            j2 = 0;
        } else {
            aeta aetaVar = (aeta) ozzVar;
            j4 = aetaVar.n();
            j2 = (aetaVar.n() - aetaVar.o()) + j4;
        }
        oyv oyvVar = new oyv(j4, j2);
        int i3 = this.u.b;
        int m = m(ozvVar);
        long[] jArr = new long[2];
        oyvVar.a(jArr);
        pfq pfqVar = this.p;
        pfs pfsVar = new pfs(o(m, this.g));
        ozv ozvVar2 = this.w[m];
        long j5 = jArr[0];
        long j6 = jArr[1];
        Long l2 = this.g;
        aeta aetaVar2 = new aeta(pfqVar, pfsVar, i3, ozvVar2, j5, j6, l2 == null ? -1 : l2.intValue(), this.v[m], p(this.w[m]), this.G);
        this.l = aetaVar2;
        oznVar.b = aetaVar2;
    }

    @Override // defpackage.ozt
    public final void g() {
    }

    @Override // defpackage.ozt
    public final void h(ozk ozkVar) {
    }

    @Override // defpackage.ozt
    public final void i(ozk ozkVar, Exception exc) {
        if (!(exc instanceof aesz)) {
            if (!(exc.getCause() instanceof aesx)) {
                if (!(exc instanceof atn)) {
                    return;
                }
                if (!(exc instanceof atp) || ((atp) exc).d != 416) {
                    if (((atn) exc).c != 2 || !(ozkVar instanceof aeta)) {
                        return;
                    }
                    aeta aetaVar = (aeta) ozkVar;
                    if (aetaVar.i >= 0 || this.g == null || !aetaVar.d.a.toString().contains("headm")) {
                        return;
                    }
                }
            }
            aeta aetaVar2 = (aeta) ozkVar;
            aetaVar2.m = new pfs(o(m(this.u.c), this.g));
            aetaVar2.o = 0;
            return;
        }
        afif afifVar = afif.DEFAULT;
        long o = this.l.o();
        int i = this.l.i;
        StringBuilder sb = new StringBuilder(14);
        sb.append("sq.");
        sb.append(i);
        k(afifVar, "net.nocontent", o, sb.toString());
    }

    @Override // defpackage.ozt
    public final boolean j() {
        return true;
    }

    public final void k(afif afifVar, String str, long j, String str2) {
        if (this.c == null || this.d == null) {
            return;
        }
        final afih afihVar = new afih(afifVar, str, TimeUnit.MICROSECONDS.toMillis(j), str2);
        this.c.post(new Runnable() { // from class: aesu
            @Override // java.lang.Runnable
            public final void run() {
                aesy aesyVar = aesy.this;
                afih afihVar2 = afihVar;
                aesw aeswVar = aesyVar.d;
                if (!afihVar2.n()) {
                    afihVar2.l();
                    ((afbs) aeswVar).f.g(afihVar2);
                } else {
                    ((afbs) aeswVar).V(afihVar2);
                }
            }
        });
    }

    public final synchronized void l(long j) {
        oyw oyvVar;
        long n = n();
        long j2 = this.D;
        boolean z = false;
        if (j2 > 0 && j2 + j < n) {
            z = true;
        }
        this.E = z;
        if (j >= n) {
            if (!this.b && !this.h) {
                if (j > 0) {
                    oyvVar = new aetm(0L, j, this.H, false, null, null, null, null);
                } else {
                    oyvVar = new oyv(0L, 0L);
                }
                this.z = oyvVar;
            }
            this.z = new oyv(0L, TimeUnit.MILLISECONDS.toMicros(this.s) + j);
        } else if (z) {
            this.z = new oyv(0L, j);
        }
        if (n() - this.C > 300000) {
            s();
        }
    }
}
