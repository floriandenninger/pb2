package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfi implements bey, att {
    public static final amrv a;
    public static final amru b;
    public static final amru c;
    public static final amru d;
    public static final amru e;
    public static final amru f;
    public static final amru g;
    private static bfi i;
    public final bew h;
    private final amrz j;
    private final bgg k;
    private final boolean l;
    private int m;
    private long n;
    private long o;
    private int p;
    private long q;
    private long r;
    private long s;
    private long t;

    static {
        amsj amsjVar = new amsj();
        amsjVar.e("AD", 1, 2, 0, 0, 2, 2);
        amsjVar.e("AE", 1, 4, 4, 4, 2, 2);
        amsjVar.e("AF", 4, 4, 3, 4, 2, 2);
        amsjVar.e("AG", 4, 2, 1, 4, 2, 2);
        amsjVar.e("AI", 1, 2, 2, 2, 2, 2);
        amsjVar.e("AL", 1, 1, 1, 1, 2, 2);
        amsjVar.e("AM", 2, 2, 1, 3, 2, 2);
        amsjVar.e("AO", 3, 4, 3, 1, 2, 2);
        amsjVar.e("AR", 2, 4, 2, 1, 2, 2);
        amsjVar.e("AS", 2, 2, 3, 3, 2, 2);
        amsjVar.e("AT", 0, 1, 0, 0, 0, 2);
        amsjVar.e("AU", 0, 2, 0, 1, 1, 2);
        amsjVar.e("AW", 1, 2, 0, 4, 2, 2);
        amsjVar.e("AX", 0, 2, 2, 2, 2, 2);
        amsjVar.e("AZ", 3, 3, 3, 4, 4, 2);
        amsjVar.e("BA", 1, 1, 0, 1, 2, 2);
        amsjVar.e("BB", 0, 2, 0, 0, 2, 2);
        amsjVar.e("BD", 2, 0, 3, 3, 2, 2);
        amsjVar.e("BE", 0, 0, 2, 3, 2, 2);
        amsjVar.e("BF", 4, 4, 4, 2, 2, 2);
        amsjVar.e("BG", 0, 1, 0, 0, 2, 2);
        amsjVar.e("BH", 1, 0, 2, 4, 2, 2);
        amsjVar.e("BI", 4, 4, 4, 4, 2, 2);
        amsjVar.e("BJ", 4, 4, 4, 4, 2, 2);
        amsjVar.e("BL", 1, 2, 2, 2, 2, 2);
        amsjVar.e("BM", 0, 2, 0, 0, 2, 2);
        amsjVar.e("BN", 3, 2, 1, 0, 2, 2);
        amsjVar.e("BO", 1, 2, 4, 2, 2, 2);
        amsjVar.e("BQ", 1, 2, 1, 2, 2, 2);
        amsjVar.e("BR", 2, 4, 3, 2, 2, 2);
        amsjVar.e("BS", 2, 2, 1, 3, 2, 2);
        amsjVar.e("BT", 3, 0, 3, 2, 2, 2);
        amsjVar.e("BW", 3, 4, 1, 1, 2, 2);
        amsjVar.e("BY", 1, 1, 1, 2, 2, 2);
        amsjVar.e("BZ", 2, 2, 2, 2, 2, 2);
        amsjVar.e("CA", 0, 3, 1, 2, 4, 2);
        amsjVar.e("CD", 4, 2, 2, 1, 2, 2);
        amsjVar.e("CF", 4, 2, 3, 2, 2, 2);
        amsjVar.e("CG", 3, 4, 2, 2, 2, 2);
        amsjVar.e("CH", 0, 0, 0, 0, 1, 2);
        amsjVar.e("CI", 3, 3, 3, 3, 2, 2);
        amsjVar.e("CK", 2, 2, 3, 0, 2, 2);
        amsjVar.e("CL", 1, 1, 2, 2, 2, 2);
        amsjVar.e("CM", 3, 4, 3, 2, 2, 2);
        amsjVar.e("CN", 2, 2, 2, 1, 3, 2);
        amsjVar.e("CO", 2, 3, 4, 2, 2, 2);
        amsjVar.e("CR", 2, 3, 4, 4, 2, 2);
        amsjVar.e("CU", 4, 4, 2, 2, 2, 2);
        amsjVar.e("CV", 2, 3, 1, 0, 2, 2);
        amsjVar.e("CW", 1, 2, 0, 0, 2, 2);
        amsjVar.e("CY", 1, 1, 0, 0, 2, 2);
        amsjVar.e("CZ", 0, 1, 0, 0, 1, 2);
        amsjVar.e("DE", 0, 0, 1, 1, 0, 2);
        amsjVar.e("DJ", 4, 0, 4, 4, 2, 2);
        amsjVar.e("DK", 0, 0, 1, 0, 0, 2);
        amsjVar.e("DM", 1, 2, 2, 2, 2, 2);
        amsjVar.e("DO", 3, 4, 4, 4, 2, 2);
        amsjVar.e("DZ", 3, 3, 4, 4, 2, 4);
        amsjVar.e("EC", 2, 4, 3, 1, 2, 2);
        amsjVar.e("EE", 0, 1, 0, 0, 2, 2);
        amsjVar.e("EG", 3, 4, 3, 3, 2, 2);
        amsjVar.e("EH", 2, 2, 2, 2, 2, 2);
        amsjVar.e("ER", 4, 2, 2, 2, 2, 2);
        amsjVar.e("ES", 0, 1, 1, 1, 2, 2);
        amsjVar.e("ET", 4, 4, 4, 1, 2, 2);
        amsjVar.e("FI", 0, 0, 0, 0, 0, 2);
        amsjVar.e("FJ", 3, 0, 2, 3, 2, 2);
        amsjVar.e("FK", 4, 2, 2, 2, 2, 2);
        amsjVar.e("FM", 3, 2, 4, 4, 2, 2);
        amsjVar.e("FO", 1, 2, 0, 1, 2, 2);
        amsjVar.e("FR", 1, 1, 2, 0, 1, 2);
        amsjVar.e("GA", 3, 4, 1, 1, 2, 2);
        amsjVar.e("GB", 0, 0, 1, 1, 1, 2);
        amsjVar.e("GD", 1, 2, 2, 2, 2, 2);
        amsjVar.e("GE", 1, 1, 1, 2, 2, 2);
        amsjVar.e("GF", 2, 2, 2, 3, 2, 2);
        amsjVar.e("GG", 1, 2, 0, 0, 2, 2);
        amsjVar.e("GH", 3, 1, 3, 2, 2, 2);
        amsjVar.e("GI", 0, 2, 0, 0, 2, 2);
        amsjVar.e("GL", 1, 2, 0, 0, 2, 2);
        amsjVar.e("GM", 4, 3, 2, 4, 2, 2);
        amsjVar.e("GN", 4, 3, 4, 2, 2, 2);
        amsjVar.e("GP", 2, 1, 2, 3, 2, 2);
        amsjVar.e("GQ", 4, 2, 2, 4, 2, 2);
        amsjVar.e("GR", 1, 2, 0, 0, 2, 2);
        amsjVar.e("GT", 3, 2, 3, 1, 2, 2);
        amsjVar.e("GU", 1, 2, 3, 4, 2, 2);
        amsjVar.e("GW", 4, 4, 4, 4, 2, 2);
        amsjVar.e("GY", 3, 3, 3, 4, 2, 2);
        amsjVar.e("HK", 0, 1, 2, 3, 2, 0);
        amsjVar.e("HN", 3, 1, 3, 3, 2, 2);
        amsjVar.e("HR", 1, 1, 0, 0, 3, 2);
        amsjVar.e("HT", 4, 4, 4, 4, 2, 2);
        amsjVar.e("HU", 0, 0, 0, 0, 0, 2);
        amsjVar.e("ID", 3, 2, 3, 3, 2, 2);
        amsjVar.e("IE", 0, 0, 1, 1, 3, 2);
        amsjVar.e("IL", 1, 0, 2, 3, 4, 2);
        amsjVar.e("IM", 0, 2, 0, 1, 2, 2);
        amsjVar.e("IN", 2, 1, 3, 3, 2, 2);
        amsjVar.e("IO", 4, 2, 2, 4, 2, 2);
        amsjVar.e("IQ", 3, 3, 4, 4, 2, 2);
        amsjVar.e("IR", 3, 2, 3, 2, 2, 2);
        amsjVar.e("IS", 0, 2, 0, 0, 2, 2);
        amsjVar.e("IT", 0, 4, 0, 1, 2, 2);
        amsjVar.e("JE", 2, 2, 1, 2, 2, 2);
        amsjVar.e("JM", 3, 3, 4, 4, 2, 2);
        amsjVar.e("JO", 2, 2, 1, 1, 2, 2);
        amsjVar.e("JP", 0, 0, 0, 0, 2, 1);
        amsjVar.e("KE", 3, 4, 2, 2, 2, 2);
        amsjVar.e("KG", 2, 0, 1, 1, 2, 2);
        amsjVar.e("KH", 1, 0, 4, 3, 2, 2);
        amsjVar.e("KI", 4, 2, 4, 3, 2, 2);
        amsjVar.e("KM", 4, 3, 2, 3, 2, 2);
        amsjVar.e("KN", 1, 2, 2, 2, 2, 2);
        amsjVar.e("KP", 4, 2, 2, 2, 2, 2);
        amsjVar.e("KR", 0, 0, 1, 3, 1, 2);
        amsjVar.e("KW", 1, 3, 1, 1, 1, 2);
        amsjVar.e("KY", 1, 2, 0, 2, 2, 2);
        amsjVar.e("KZ", 2, 2, 2, 3, 2, 2);
        amsjVar.e("LA", 1, 2, 1, 1, 2, 2);
        amsjVar.e("LB", 3, 2, 0, 0, 2, 2);
        amsjVar.e("LC", 1, 2, 0, 0, 2, 2);
        amsjVar.e("LI", 0, 2, 2, 2, 2, 2);
        amsjVar.e("LK", 2, 0, 2, 3, 2, 2);
        amsjVar.e("LR", 3, 4, 4, 3, 2, 2);
        amsjVar.e("LS", 3, 3, 2, 3, 2, 2);
        amsjVar.e("LT", 0, 0, 0, 0, 2, 2);
        amsjVar.e("LU", 1, 0, 1, 1, 2, 2);
        amsjVar.e("LV", 0, 0, 0, 0, 2, 2);
        amsjVar.e("LY", 4, 2, 4, 3, 2, 2);
        amsjVar.e("MA", 3, 2, 2, 1, 2, 2);
        amsjVar.e("MC", 0, 2, 0, 0, 2, 2);
        amsjVar.e("MD", 1, 2, 0, 0, 2, 2);
        amsjVar.e("ME", 1, 2, 0, 1, 2, 2);
        amsjVar.e("MF", 2, 2, 1, 1, 2, 2);
        amsjVar.e("MG", 3, 4, 2, 2, 2, 2);
        amsjVar.e("MH", 4, 2, 2, 4, 2, 2);
        amsjVar.e("MK", 1, 1, 0, 0, 2, 2);
        amsjVar.e("ML", 4, 4, 2, 2, 2, 2);
        amsjVar.e("MM", 2, 3, 3, 3, 2, 2);
        amsjVar.e("MN", 2, 4, 2, 2, 2, 2);
        amsjVar.e("MO", 0, 2, 4, 4, 2, 2);
        amsjVar.e("MP", 0, 2, 2, 2, 2, 2);
        amsjVar.e("MQ", 2, 2, 2, 3, 2, 2);
        amsjVar.e("MR", 3, 0, 4, 3, 2, 2);
        amsjVar.e("MS", 1, 2, 2, 2, 2, 2);
        amsjVar.e("MT", 0, 2, 0, 0, 2, 2);
        amsjVar.e("MU", 2, 1, 1, 2, 2, 2);
        amsjVar.e("MV", 4, 3, 2, 4, 2, 2);
        amsjVar.e("MW", 4, 2, 1, 0, 2, 2);
        amsjVar.e("MX", 2, 4, 4, 4, 4, 2);
        amsjVar.e("MY", 1, 0, 3, 2, 2, 2);
        amsjVar.e("MZ", 3, 3, 2, 1, 2, 2);
        amsjVar.e("NA", 4, 3, 3, 2, 2, 2);
        amsjVar.e("NC", 3, 0, 4, 4, 2, 2);
        amsjVar.e("NE", 4, 4, 4, 4, 2, 2);
        amsjVar.e("NF", 2, 2, 2, 2, 2, 2);
        amsjVar.e("NG", 3, 3, 2, 3, 2, 2);
        amsjVar.e("NI", 2, 1, 4, 4, 2, 2);
        amsjVar.e("NL", 0, 2, 3, 2, 0, 2);
        amsjVar.e("NO", 0, 1, 2, 0, 0, 2);
        amsjVar.e("NP", 2, 0, 4, 2, 2, 2);
        amsjVar.e("NR", 3, 2, 3, 1, 2, 2);
        amsjVar.e("NU", 4, 2, 2, 2, 2, 2);
        amsjVar.e("NZ", 0, 2, 1, 2, 4, 2);
        amsjVar.e("OM", 2, 2, 1, 3, 3, 2);
        amsjVar.e("PA", 1, 3, 3, 3, 2, 2);
        amsjVar.e("PE", 2, 3, 4, 4, 2, 2);
        amsjVar.e("PF", 2, 2, 2, 1, 2, 2);
        amsjVar.e("PG", 4, 4, 3, 2, 2, 2);
        amsjVar.e("PH", 2, 1, 3, 3, 3, 2);
        amsjVar.e("PK", 3, 2, 3, 3, 2, 2);
        amsjVar.e("PL", 1, 0, 1, 2, 3, 2);
        amsjVar.e("PM", 0, 2, 2, 2, 2, 2);
        amsjVar.e("PR", 2, 1, 2, 2, 4, 3);
        amsjVar.e("PS", 3, 3, 2, 2, 2, 2);
        amsjVar.e("PT", 0, 1, 1, 0, 2, 2);
        amsjVar.e("PW", 1, 2, 4, 1, 2, 2);
        amsjVar.e("PY", 2, 0, 3, 2, 2, 2);
        amsjVar.e("QA", 2, 3, 1, 2, 3, 2);
        amsjVar.e("RE", 1, 0, 2, 2, 2, 2);
        amsjVar.e("RO", 0, 1, 0, 1, 0, 2);
        amsjVar.e("RS", 1, 2, 0, 0, 2, 2);
        amsjVar.e("RU", 0, 1, 0, 1, 4, 2);
        amsjVar.e("RW", 3, 3, 3, 1, 2, 2);
        amsjVar.e("SA", 2, 2, 2, 1, 1, 2);
        amsjVar.e("SB", 4, 2, 3, 2, 2, 2);
        amsjVar.e("SC", 4, 2, 1, 3, 2, 2);
        amsjVar.e("SD", 4, 4, 4, 4, 2, 2);
        amsjVar.e("SE", 0, 0, 0, 0, 0, 2);
        amsjVar.e("SG", 1, 0, 1, 2, 3, 2);
        amsjVar.e("SH", 4, 2, 2, 2, 2, 2);
        amsjVar.e("SI", 0, 0, 0, 0, 2, 2);
        amsjVar.e("SJ", 2, 2, 2, 2, 2, 2);
        amsjVar.e("SK", 0, 1, 0, 0, 2, 2);
        amsjVar.e("SL", 4, 3, 4, 0, 2, 2);
        amsjVar.e("SM", 0, 2, 2, 2, 2, 2);
        amsjVar.e("SN", 4, 4, 4, 4, 2, 2);
        amsjVar.e("SO", 3, 3, 3, 4, 2, 2);
        amsjVar.e("SR", 3, 2, 2, 2, 2, 2);
        amsjVar.e("SS", 4, 4, 3, 3, 2, 2);
        amsjVar.e("ST", 2, 2, 1, 2, 2, 2);
        amsjVar.e("SV", 2, 1, 4, 3, 2, 2);
        amsjVar.e("SX", 2, 2, 1, 0, 2, 2);
        amsjVar.e("SY", 4, 3, 3, 2, 2, 2);
        amsjVar.e("SZ", 3, 3, 2, 4, 2, 2);
        amsjVar.e("TC", 2, 2, 2, 0, 2, 2);
        amsjVar.e("TD", 4, 3, 4, 4, 2, 2);
        amsjVar.e("TG", 3, 2, 2, 4, 2, 2);
        amsjVar.e("TH", 0, 3, 2, 3, 2, 2);
        amsjVar.e("TJ", 4, 4, 4, 4, 2, 2);
        amsjVar.e("TL", 4, 0, 4, 4, 2, 2);
        amsjVar.e("TM", 4, 2, 4, 3, 2, 2);
        amsjVar.e("TN", 2, 1, 1, 2, 2, 2);
        amsjVar.e("TO", 3, 3, 4, 3, 2, 2);
        amsjVar.e("TR", 1, 2, 1, 1, 2, 2);
        amsjVar.e("TT", 1, 4, 0, 1, 2, 2);
        amsjVar.e("TV", 3, 2, 2, 4, 2, 2);
        amsjVar.e("TW", 0, 0, 0, 0, 1, 0);
        amsjVar.e("TZ", 3, 3, 3, 2, 2, 2);
        amsjVar.e("UA", 0, 3, 1, 1, 2, 2);
        amsjVar.e("UG", 3, 2, 3, 3, 2, 2);
        amsjVar.e("US", 1, 1, 2, 2, 4, 2);
        amsjVar.e("UY", 2, 2, 1, 1, 2, 2);
        amsjVar.e("UZ", 2, 1, 3, 4, 2, 2);
        amsjVar.e("VC", 1, 2, 2, 2, 2, 2);
        amsjVar.e("VE", 4, 4, 4, 4, 2, 2);
        amsjVar.e("VG", 2, 2, 1, 1, 2, 2);
        amsjVar.e("VI", 1, 2, 1, 2, 2, 2);
        amsjVar.e("VN", 0, 1, 3, 4, 2, 2);
        amsjVar.e("VU", 4, 0, 3, 1, 2, 2);
        amsjVar.e("WF", 4, 2, 2, 4, 2, 2);
        amsjVar.e("WS", 3, 1, 3, 1, 2, 2);
        amsjVar.e("XK", 0, 1, 1, 0, 2, 2);
        amsjVar.e("YE", 4, 4, 4, 3, 2, 2);
        amsjVar.e("YT", 4, 2, 2, 3, 2, 2);
        amsjVar.e("ZA", 3, 3, 2, 1, 2, 2);
        amsjVar.e("ZM", 3, 2, 3, 3, 2, 2);
        amsjVar.e("ZW", 3, 2, 4, 3, 2, 2);
        a = amsjVar.c();
        b = amru.v(6200000L, 3900000L, 2300000L, 1300000L, 620000L);
        c = amru.v(248000L, 160000L, 142000L, 127000L, 113000L);
        d = amru.v(2200000L, 1300000L, 950000L, 760000L, 520000L);
        e = amru.v(4400000L, 2300000L, 1500000L, 1100000L, 640000L);
        f = amru.v(10000000L, 7200000L, 5000000L, 2700000L, 1600000L);
        g = amru.v(2600000L, 2200000L, 2000000L, 1500000L, 470000L);
    }

    @Deprecated
    public bfi() {
        int i2 = amrz.a;
        psf psfVar = psf.a;
        throw null;
    }

    private final long j(int i2) {
        Long l = (Long) this.j.get(Integer.valueOf(i2));
        if (l == null) {
            l = (Long) this.j.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    private final void k(int i2, long j, long j2) {
        int i3;
        if (i2 != 0) {
            i3 = i2;
        } else if (j == 0 && j2 == this.t) {
            return;
        } else {
            i3 = 0;
        }
        this.t = j2;
        this.h.b(i3, j, j2);
    }

    private static boolean l(ath athVar, boolean z) {
        return z && !athVar.g(8);
    }

    @Override // defpackage.att
    public final synchronized void a(ate ateVar, ath athVar, boolean z, int i2) {
        if (l(athVar, z)) {
            this.o += i2;
        }
    }

    @Override // defpackage.att
    public final synchronized void b(ate ateVar, ath athVar, boolean z) {
        if (l(athVar, z)) {
            pse.g(this.m > 0);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = (int) (elapsedRealtime - this.n);
            this.q += i2;
            long j = this.r;
            long j2 = this.o;
            this.r = j + j2;
            if (i2 > 0) {
                this.k.m((int) Math.sqrt(j2), (((float) j2) * 8000.0f) / i2);
                if (this.q >= 2000 || this.r >= 524288) {
                    this.s = this.k.a(0.5f);
                }
                k(i2, this.o, this.s);
                this.n = elapsedRealtime;
                this.o = 0L;
            }
            this.m--;
        }
    }

    @Override // defpackage.att
    public final void c(ate ateVar, ath athVar, boolean z) {
    }

    @Override // defpackage.att
    public final synchronized void d(ate ateVar, ath athVar, boolean z) {
        if (l(athVar, z)) {
            if (this.m == 0) {
                this.n = SystemClock.elapsedRealtime();
            }
            this.m++;
        }
    }

    @Override // defpackage.bey
    public final synchronized long e() {
        return this.s;
    }

    @Override // defpackage.bey
    public final void f(Handler handler, bex bexVar) {
        throw null;
    }

    @Override // defpackage.bey
    public final void g(bex bexVar) {
        throw null;
    }

    public final synchronized void i(int i2) {
        int i3 = this.p;
        if (i3 == 0 || this.l) {
            if (i3 == i2) {
                return;
            }
            this.p = i2;
            if (i2 != 1 && i2 != 0 && i2 != 8) {
                this.s = j(i2);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                k(this.m > 0 ? (int) (elapsedRealtime - this.n) : 0, this.o, this.s);
                this.n = elapsedRealtime;
                this.o = 0L;
                this.r = 0L;
                this.q = 0L;
                bgg bggVar = this.k;
                bggVar.a.clear();
                bggVar.b = -1;
                bggVar.c = 0;
                bggVar.d = 0;
            }
        }
    }

    public static synchronized bfi h(Context context) {
        bfi bfiVar;
        synchronized (bfi.class) {
            if (i == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                amru a2 = a.a(pts.H(context));
                if (a2.isEmpty()) {
                    a2 = amru.w(2, 2, 2, 2, 2, 2);
                }
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                amru amruVar = b;
                hashMap.put(2, (Long) amruVar.get(((Integer) a2.get(0)).intValue()));
                hashMap.put(3, (Long) c.get(((Integer) a2.get(1)).intValue()));
                hashMap.put(4, (Long) d.get(((Integer) a2.get(2)).intValue()));
                hashMap.put(5, (Long) e.get(((Integer) a2.get(3)).intValue()));
                hashMap.put(10, (Long) f.get(((Integer) a2.get(4)).intValue()));
                hashMap.put(9, (Long) g.get(((Integer) a2.get(5)).intValue()));
                hashMap.put(7, (Long) amruVar.get(((Integer) a2.get(0)).intValue()));
                i = new bfi(applicationContext, hashMap);
            }
            bfiVar = i;
        }
        return bfiVar;
    }

    public bfi(Context context, Map map) {
        this.j = amrz.j(map);
        this.h = new bew();
        this.k = new bgg(2000);
        this.l = true;
        if (context != null) {
            final ptf b2 = ptf.b(context);
            int a2 = b2.a();
            this.p = a2;
            this.s = j(a2);
            final bfh bfhVar = new bfh(this);
            Iterator it = b2.b.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    b2.b.remove(weakReference);
                }
            }
            b2.b.add(new WeakReference(bfhVar));
            b2.a.post(new Runnable() { // from class: ptc
                @Override // java.lang.Runnable
                public final void run() {
                    bfhVar.a(ptf.this.a());
                }
            });
            return;
        }
        this.p = 0;
        this.s = j(0);
    }
}
