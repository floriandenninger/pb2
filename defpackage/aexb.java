package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aexb implements bdr, afhi, aewr {
    static final long a = TimeUnit.HOURS.toMicros(4);
    private final long B;
    private final aquy E;
    private int F;
    private final ysy I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f39J;
    private final aevc[] K;
    private final afhs L;
    private final String b;
    private final pnd c;
    private final ate d;
    private final bel e;
    private final affc f;
    private final aexm g;
    private final int h;
    private final aexa k;
    private final aexh l;
    private final boolean n;
    private final long o;
    private final PlayerConfigModel p;
    private final aesm q;
    private aexd r;
    private aexl s;
    private Exception t;
    private boolean u;
    private final long w;
    private long x;
    private final long y;
    private long z;
    private final Map i = new HashMap();
    private final Map j = new HashMap();
    private long v = -9223372036854775807L;
    private long A = -9223372036854775807L;
    private long C = -9223372036854775807L;
    private long D = -1;
    private int G = 0;
    private long H = -9223372036854775807L;

    public aexb(PlayerConfigModel playerConfigModel, FormatStreamModel[] formatStreamModelArr, afhf afhfVar, aesm aesmVar, att attVar, aexh aexhVar, bel belVar, affc affcVar, aexm aexmVar, String str, int i, boolean z, boolean z2, pnd pndVar, aevc[] aevcVarArr, ysy ysyVar, afhs afhsVar) {
        aquy aquyVar;
        Long l;
        this.x = -9223372036854775807L;
        this.z = -9223372036854775807L;
        afki.b(formatStreamModelArr.length > 0);
        this.b = str;
        ate c = afhfVar.c(this, str, ammv.i(formatStreamModelArr[0].b));
        this.d = c;
        if (attVar != null) {
            c.b(attVar);
        }
        this.q = aesmVar;
        this.l = aexhVar;
        this.e = belVar;
        this.f = affcVar;
        this.g = aexmVar;
        this.h = i;
        this.p = playerConfigModel;
        this.k = new aexa(this);
        for (FormatStreamModel formatStreamModel : formatStreamModelArr) {
            pms m = formatStreamModel.m();
            this.i.put(m, formatStreamModel);
            this.j.put(m, new bdm(aedn.c(formatStreamModel.v(), amvs.a, this), i, m));
        }
        this.u = true;
        this.n = z;
        this.F = true == z2 ? 3 : 1;
        this.c = pndVar;
        aquz aquzVar = playerConfigModel.c.e;
        if (((aquzVar == null ? aquz.b : aquzVar).e & 64) == 0) {
            aquyVar = aquy.MANIFESTLESS_SEQUENCE_METHOD_LIVE_HEAD;
        } else {
            aquz aquzVar2 = playerConfigModel.c.e;
            aquyVar = aquy.b((aquzVar2 == null ? aquz.b : aquzVar2).bf);
            if (aquyVar == null) {
                aquyVar = aquy.MANIFESTLESS_SEQUENCE_METHOD_UNKNOWN;
            }
        }
        this.E = aquyVar;
        this.K = aevcVarArr;
        this.I = ysyVar;
        this.L = afhsVar;
        Long T = playerConfigModel.T();
        if (T != null) {
            this.w = T.longValue();
            asyn asynVar = playerConfigModel.c.f119J;
            Long l2 = null;
            if (((asynVar == null ? asyn.a : asynVar).b & 4) != 0) {
                asyn asynVar2 = playerConfigModel.c.f119J;
                l = Long.valueOf((asynVar2 == null ? asyn.a : asynVar2).e);
            } else {
                l = null;
            }
            if (l != null) {
                this.x = TimeUnit.MILLISECONDS.toMicros(l.longValue());
            }
            Long S = playerConfigModel.S();
            asyn asynVar3 = playerConfigModel.c.f119J;
            if (((asynVar3 == null ? asyn.a : asynVar3).b & 8) != 0) {
                asyn asynVar4 = playerConfigModel.c.f119J;
                l2 = Long.valueOf((asynVar4 == null ? asyn.a : asynVar4).f);
            }
            this.y = S != null ? S.longValue() : -1L;
            this.z = l2 != null ? TimeUnit.MILLISECONDS.toMicros(l2.longValue()) : -9223372036854775807L;
        } else {
            this.w = formatStreamModelArr[0].T();
            this.y = formatStreamModelArr[0].S();
        }
        FormatStreamModel formatStreamModel2 = formatStreamModelArr[0];
        this.o = (long) (formatStreamModel2.a.y * 1000000.0d);
        double a2 = formatStreamModel2.a();
        this.B = a2 > 0.0d ? (long) (a2 * 1000000.0d) : a;
    }

    private final synchronized boolean A(long j) {
        aexd aexdVar = this.r;
        if (aexdVar != null) {
            long j2 = aexdVar.a;
            if (j2 != -9223372036854775807L) {
                long j3 = this.o;
                if (j3 != -9223372036854775807L && j3 > 0) {
                    long j4 = j2 - j;
                    if (j4 >= 0) {
                        if (j4 <= 0) {
                            return false;
                        }
                        aexl aexlVar = this.s;
                        if (aexlVar != null && j2 > aexlVar.l() && this.y == -1) {
                            afic aficVar = afic.MFL;
                            Object[] objArr = new Object[3];
                            objArr[0] = Integer.valueOf(this.h);
                            double d = this.r.a;
                            Double.isNaN(d);
                            objArr[1] = Double.valueOf(d / 1000000.0d);
                            double d2 = this.s.k;
                            Double.isNaN(d2);
                            objArr[2] = Double.valueOf(d2 / 1000000.0d);
                            afid.e(aficVar, "Track %d seekTime %.1f sec is after windowMaxMediaTimeUs = %.1f sec.", objArr);
                            return true;
                        }
                        long j5 = this.o;
                        return j4 >= j5 + j5;
                    }
                    if (j4 >= -40000) {
                        return false;
                    }
                    if (this.w != -1 && aexdVar.i() == this.w) {
                        return false;
                    }
                    aexl aexlVar2 = this.s;
                    if (aexlVar2 == null || this.r.a >= aexlVar2.j || this.w != -1) {
                        return true;
                    }
                    afic aficVar2 = afic.MFL;
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = Integer.valueOf(this.h);
                    double d3 = this.r.a;
                    Double.isNaN(d3);
                    objArr2[1] = Double.valueOf(d3 / 1000000.0d);
                    double d4 = this.s.j;
                    Double.isNaN(d4);
                    objArr2[2] = Double.valueOf(d4 / 1000000.0d);
                    afid.e(aficVar2, "Track %d seekTime %.1f sec is before windowMinMediaTime = %.1f sec. Ignoring seek.", objArr2);
                    return false;
                }
            }
        }
        return false;
    }

    private final synchronized boolean B(long j, long j2, long j3) {
        if (j == -9223372036854775807L) {
            return false;
        }
        if (j != 0) {
            if (j >= aexl.c) {
                if (j2 == 0 && j == aexl.c) {
                    return true;
                }
                aexl aexlVar = this.s;
                if (aexlVar != null && (j < aexlVar.j || j > aexlVar.k)) {
                    return true;
                }
                long j4 = this.w;
                if (j4 != -1 && j2 == j4 && j <= p(j4)) {
                    return true;
                }
                long j5 = this.y;
                if (j5 != -1 && j2 > j5 - 2) {
                    return true;
                }
                if (j3 != -1) {
                    int i = this.F;
                    if ((i == 2 || i == 3) && j2 > j3 - 2) {
                        return true;
                    }
                }
                if (this.F == 3 && this.w == -1) {
                    if (j > this.B) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private final synchronized String C(ajun ajunVar) {
        StringBuilder sb;
        String g = ajunVar.g("x-head-seqnum");
        String g2 = ajunVar.g("x-head-time-millis");
        aexd aexdVar = this.r;
        String valueOf = String.valueOf(aexdVar != null ? Long.valueOf(aexdVar.i()) : "null");
        sb = new StringBuilder(String.valueOf(g).length() + 19 + String.valueOf(g2).length() + String.valueOf(valueOf).length());
        sb.append("headsq.");
        sb.append(g);
        sb.append(";headms.");
        sb.append(g2);
        sb.append(";sq.");
        sb.append(valueOf);
        return sb.toString();
    }

    private final synchronized long o(long j) {
        long j2 = this.w;
        if (j2 != -1 && this.y != -1) {
            return j2;
        }
        if (this.F == 3) {
            return 0L;
        }
        if (j != -9223372036854775807L && j2 != -1) {
            long j3 = this.x;
            if (j3 == -9223372036854775807L) {
                aexl aexlVar = this.s;
                j3 = aexlVar != null ? aexlVar.j : -9223372036854775807L;
            }
            if (j3 != -9223372036854775807L && j <= j3) {
                return j2;
            }
        }
        return -1L;
    }

    private final synchronized long p(long j) {
        aexl aexlVar = this.s;
        long j2 = -9223372036854775807L;
        if (aexlVar == null) {
            long j3 = this.w;
            if (j3 != -1 && j == j3) {
                return this.x;
            }
            if (this.F != 3) {
                return -9223372036854775807L;
            }
            return j * this.o;
        }
        if (j != -1 && j >= 0) {
            long j4 = aexlVar.g;
            if (j <= j4) {
                long j5 = aexlVar.h;
                if (j >= j5 || j5 == -1) {
                    long j6 = aexlVar.i;
                    if (j <= j6 || j6 == -1) {
                        if (j5 == -1 || j != j5) {
                            long j7 = aexlVar.f;
                            long j8 = j4 - j;
                            long j9 = aexlVar.m;
                            Long.signum(j8);
                            j2 = j7 - (j8 * j9);
                        } else {
                            j2 = aexlVar.j;
                        }
                    }
                }
            }
        }
        return j2;
    }

    private final synchronized Pair q(Long l, Long l2) {
        if (l2 != null && l != null) {
            if (l2.longValue() != -1) {
                if (l.longValue() != -9223372036854775807L && this.F != 2) {
                    if (this.D != -1 && this.v != -9223372036854775807L && l2.longValue() <= this.D && l.longValue() <= this.v + 40000) {
                        return null;
                    }
                    long longValue = this.D != -1 ? l2.longValue() - this.D : -1L;
                    long longValue2 = this.v != -9223372036854775807L ? l.longValue() - this.v : -9223372036854775807L;
                    this.v = l.longValue();
                    this.D = l2.longValue();
                    this.f.j(this.v);
                    z();
                    return Pair.create(Long.valueOf(longValue), Long.valueOf(longValue2));
                }
            }
        }
        return null;
    }

    private final synchronized aexl r() {
        return new aexl(this.v, this.D, this.w, this.y, this.x, this.z, this.A, this.B, this.o, this.f.d(), this.C, this.n, this.F, this.c, this.E);
    }

    private final synchronized void s(Long l, Long l2) {
        afki.a(this.r);
        long j = this.w;
        long j2 = this.y;
        long j3 = this.x;
        long j4 = this.z;
        String valueOf = String.valueOf(l != null ? Long.valueOf(pts.u(l.longValue())) : "null");
        String valueOf2 = String.valueOf(l2 != null ? l2 : "null");
        String valueOf3 = String.valueOf(j != -1 ? Long.valueOf(j) : "UNSET");
        String valueOf4 = String.valueOf(j2 != -1 ? Long.valueOf(j2) : "UNSET");
        String valueOf5 = String.valueOf(j3 != -9223372036854775807L ? Long.valueOf(pts.u(j3)) : "UNSET");
        String valueOf6 = String.valueOf(j4 != -9223372036854775807L ? Long.valueOf(pts.u(j4)) : "UNSET");
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 59 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("maxtime.");
        sb.append(valueOf);
        sb.append(";maxsq.");
        sb.append(valueOf2);
        sb.append(";mindvrsq.");
        sb.append(valueOf3);
        sb.append(";maxdvrsq.");
        sb.append(valueOf4);
        sb.append(";mindvrtime.");
        sb.append(valueOf5);
        sb.append(";maxdvrtime.");
        sb.append(valueOf6);
        String sb2 = sb.toString();
        aewq aewqVar = null;
        if (l != null) {
            if (this.x != -9223372036854775807L && l.longValue() < this.x) {
                aewqVar = new aewq(this.r.k(), "x-head-time-millis", sb2);
            } else if (this.z != -9223372036854775807L && l.longValue() < this.z) {
                aewqVar = new aewq(this.r.k(), "x-head-time-millis", sb2);
            }
        }
        if (aewqVar == null && l2 != null) {
            if (this.w != -1 && l2.longValue() < this.w) {
                aewqVar = new aewq(this.r.k(), "x-head-seqnum", sb2);
            } else if (this.y != -1 && l2.longValue() < this.y) {
                aewqVar = new aewq(this.r.k(), "x-head-seqnum", sb2);
            }
        }
        if (aewqVar != null) {
            afid.e(afic.MFL, "Track %d Stale WindowedLiveConfig: %s", Integer.valueOf(this.h), sb2);
            throw aewqVar;
        }
    }

    private final synchronized void t() {
        if (this.D == -1 || this.v == -9223372036854775807L) {
            return;
        }
        z();
    }

    private final synchronized void u(String str, String str2) {
        aexd aexdVar = this.r;
        long j = -1;
        if (aexdVar != null && aexdVar.j() != -9223372036854775807L) {
            j = pts.u(this.r.j());
        }
        final aexh aexhVar = this.l;
        final afih afihVar = new afih(str, j, str2);
        aexhVar.a.post(new Runnable() { // from class: aewu
            @Override // java.lang.Runnable
            public final void run() {
                aeww aewwVar = aeww.this;
                afih afihVar2 = afihVar;
                aevd aevdVar = (aevd) aewwVar.b;
                aevdVar.a.u(aevdVar.b, afihVar2);
            }
        });
    }

    private final synchronized void v(aesh aeshVar) {
        afki.a(this.r);
        afki.b(aeshVar.a.equals("http://youtube.com/streaming/metadata/segment/102015"));
        Integer b = aeshVar.b("Sequence-Number");
        if (b == null) {
            throw pnr.a("Sequence-Number not found in EmbeddedMetadata", null);
        }
        if (this.r.i() == -1) {
            this.r.r(b.intValue());
            if (this.r.a == -9223372036854775807L) {
                long a2 = this.g.a(this, b.intValue());
                if (a2 != b.intValue()) {
                    afid.e(afic.MFL, "Track %d Live head race, got sequence %d, coordinatedSequence %d", Integer.valueOf(this.h), b, Long.valueOf(a2));
                    throw new aewo(b.intValue(), a2);
                }
            }
        } else if (this.r.i() != b.intValue()) {
            long i = this.r.i();
            String valueOf = String.valueOf(b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("Expected sequence ");
            sb.append(i);
            sb.append(" got sequence ");
            sb.append(valueOf);
            throw pnr.a(sb.toString(), null);
        }
        Long c = aeshVar.c("Ingestion-Walltime-Us");
        if (c != null) {
            this.r.p(c.longValue());
        }
        if ("T".equals(aeshVar.d("Stream-Finished"))) {
            this.r.t = true;
        }
    }

    private final synchronized void w() {
        this.G = 0;
        this.H = -9223372036854775807L;
    }

    private final synchronized void x(long j) {
        long j2;
        long j3;
        afki.a(this.r);
        long j4 = this.r.a - j;
        double d = j4;
        double d2 = this.o;
        Double.isNaN(d);
        Double.isNaN(d2);
        long floor = (long) Math.floor(d / d2);
        aexd aexdVar = this.r;
        String str = aexdVar.h.c;
        long j5 = this.D;
        long j6 = this.v;
        long j7 = aexdVar.a;
        long i = aexdVar.i();
        int i2 = this.G;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 202);
        sb.append("fmt.");
        sb.append(str);
        sb.append(";liveSeq.");
        sb.append(j5);
        sb.append(";liveMs.");
        sb.append(j6 / 1000);
        sb.append(";seekMs.");
        sb.append(j7 / 1000);
        sb.append(";loadedMs.");
        sb.append(j / 1000);
        sb.append(";loadedSeq.");
        sb.append(i);
        sb.append(";errorChunks.");
        sb.append(floor);
        sb.append(";misses.");
        sb.append(i2);
        this.l.a("skms", new aeqs(sb.toString()));
        afic aficVar = afic.MFL;
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(this.h);
        objArr[1] = Long.valueOf(this.r.i());
        double d3 = j;
        Double.isNaN(d3);
        objArr[2] = Double.valueOf(d3 / 1000000.0d);
        objArr[3] = Long.valueOf(floor);
        afid.e(aficVar, "Track %d Seek miss, loaded sequence %d starts at time %.1f sec, errorChunks %d", objArr);
        long i3 = this.r.i();
        long j8 = this.o;
        long max = Math.max(i3 + floor, 0L);
        Long.signum(floor);
        long max2 = Math.max(j + (j8 * floor), aexl.c);
        long j9 = this.w;
        if (j9 != -1) {
            max = Math.max(max, j9);
        }
        long j10 = this.y;
        if (j10 != -1) {
            max = Math.min(max, j10);
        }
        aexl aexlVar = this.s;
        if (aexlVar != null) {
            max = Math.min(max, aexlVar.A(aexlVar.k));
        }
        long j11 = this.x;
        if (j11 != -9223372036854775807L) {
            max2 = Math.max(max2, j11);
        }
        long j12 = this.z;
        if (j12 != -9223372036854775807L) {
            max2 = Math.min(max2, j12);
        }
        long j13 = this.v;
        if (j13 != -9223372036854775807L) {
            max2 = Math.min(max2, j13);
        }
        long abs = Math.abs(j4);
        if (max != this.r.i()) {
            long j14 = this.H;
            if ((j14 == -9223372036854775807L || abs < j14) && this.G < 8) {
                j2 = max2;
                j3 = max;
                this.G++;
                this.H = abs;
                throw new aewp(this.r.a, floor, j3, j2);
            }
        }
        j2 = -9223372036854775807L;
        j3 = -1;
        this.G++;
        this.H = abs;
        throw new aewp(this.r.a, floor, j3, j2);
    }

    private final synchronized void y(long j) {
        long p = p(j);
        long j2 = this.o;
        aane b = aane.b(this.r.k().a);
        b.a.j("headm");
        b.f(j);
        this.r.s(j, p, aear.t(p, j2), b.a());
    }

    private final synchronized void z() {
        try {
            aexl aexlVar = this.s;
            aexl r = r();
            this.s = r;
            this.l.b(r);
            if (aexlVar != null || this.w == -1) {
                return;
            }
            aexh aexhVar = this.l;
            aexl aexlVar2 = this.s;
            String n = aexl.n(aexlVar2.f);
            long j = aexlVar2.g;
            long j2 = aexlVar2.h;
            long j3 = aexlVar2.i;
            long u = pts.u(aexlVar2.j);
            long u2 = pts.u(aexlVar2.k);
            String n2 = aexl.n(aexlVar2.p);
            StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 159 + String.valueOf(n2).length());
            sb.append("maxtime.");
            sb.append(n);
            sb.append(";maxsq.");
            sb.append(j);
            sb.append(";mindvrsq.");
            sb.append(j2);
            sb.append(";maxdvrsq.");
            sb.append(j3);
            sb.append(";winmin.");
            sb.append(u);
            sb.append(";winmax.");
            sb.append(u2);
            sb.append(";winutc.");
            sb.append(n2);
            String sb2 = sb.toString();
            long F = this.p.F();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 27);
            sb3.append(sb2);
            sb3.append(";start.");
            sb3.append(F);
            aexhVar.a("tmln", new aeqs(sb3.toString()));
        } catch (aexk e) {
            u("manifest.unparseable", e.a);
        }
    }

    @Override // defpackage.afhi
    public final synchronized void D(int i, Map map) {
        afki.a(this.r);
        ajun ajunVar = new ajun(map);
        Long d = ajunVar.d();
        Long c = ajunVar.c();
        try {
            if (c != null && c.longValue() >= 0 && d != null && d.longValue() >= 0) {
                if (this.p.aB(aqux.EXO_PLAYER_CONFIG_FEATURES_LOG_HTTP_HEADER_DECREASED) && this.D != -1 && this.v != -9223372036854775807L && (c.longValue() < this.D || d.longValue() + this.o < this.v)) {
                    aexh aexhVar = this.l;
                    int i2 = this.h;
                    long j = this.D;
                    long u = pts.u(this.v);
                    String C = C(ajunVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(C).length() + 70);
                    sb.append("trk.");
                    sb.append(i2);
                    sb.append(";maxsq.");
                    sb.append(j);
                    sb.append(";maxms.");
                    sb.append(u);
                    sb.append(";");
                    sb.append(C);
                    aexhVar.a("lvhead", new aeqs(sb.toString()));
                }
                s(d, c);
                q(d, c);
                this.r.x(i, ajunVar);
            }
            this.r.x(i, ajunVar);
        } catch (afhu e) {
            throw new aewn(e, TimeUnit.MICROSECONDS.toMillis(this.o));
        }
        this.l.a("lvhead", new aeqs(C(ajunVar)));
        s(d, c);
        q(d, c);
    }

    @Override // defpackage.bdr
    public final int a(long j, List list) {
        return this.e.g(j, list);
    }

    @Override // defpackage.bdr
    public final long b(long j, poi poiVar) {
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01a7 A[Catch: all -> 0x0308, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0014, B:7:0x0026, B:12:0x0081, B:14:0x0089, B:15:0x008f, B:17:0x00c9, B:22:0x00d0, B:24:0x00e0, B:28:0x01dd, B:29:0x01e2, B:31:0x01f2, B:33:0x0202, B:34:0x020c, B:35:0x020f, B:36:0x0207, B:37:0x0210, B:42:0x021f, B:43:0x0228, B:45:0x0232, B:46:0x0234, B:48:0x0265, B:50:0x0275, B:51:0x027f, B:52:0x0282, B:53:0x027a, B:56:0x0287, B:61:0x029e, B:64:0x02a7, B:65:0x02ac, B:68:0x02aa, B:69:0x028b, B:73:0x00fd, B:76:0x0118, B:78:0x011c, B:80:0x0120, B:83:0x012f, B:89:0x014f, B:92:0x015c, B:94:0x0162, B:96:0x016a, B:98:0x0172, B:100:0x0189, B:105:0x0193, B:109:0x019d, B:112:0x01a7, B:116:0x01ba, B:121:0x0182, B:124:0x002f, B:127:0x004d, B:130:0x0053, B:132:0x0057, B:134:0x0076, B:137:0x0063, B:140:0x006b, B:143:0x0037, B:146:0x003f, B:148:0x0043), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d3  */
    @Override // defpackage.bdr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(long r40, long r42, java.util.List r44, defpackage.bdp r45) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aexb.c(long, long, java.util.List, bdp):void");
    }

    @Override // defpackage.bdr
    public final void d() {
    }

    @Override // defpackage.bdr
    public final synchronized void e(bdn bdnVar) {
        if ((bdnVar instanceof aexd) && bdnVar == this.r) {
            aexd aexdVar = (aexd) bdnVar;
            if (this.F == 1 && aexdVar.t) {
                this.F = 2;
                this.D = aexdVar.i();
                this.v = aexdVar.j();
                this.A = aexdVar.g();
                afic aficVar = afic.ABR;
                aexdVar.i();
                aexdVar.j();
                aexdVar.g();
                this.f.i(aexdVar.j());
                t();
            }
        }
    }

    @Override // defpackage.bdr
    public final void f() {
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            ((bdm) it.next()).c();
        }
    }

    @Override // defpackage.bdr
    public final synchronized boolean g(bdn bdnVar, boolean z, bfr bfrVar, bfs bfsVar) {
        IOException iOException = bfrVar.b;
        if ((bdnVar instanceof aexd) && bdnVar == this.r) {
            this.g.d();
            if ((iOException instanceof aewo) && z) {
                this.t = iOException;
                return true;
            }
            if ((iOException instanceof aewp) && z) {
                this.t = iOException;
                return true;
            }
            if ((iOException instanceof aesf) && z) {
                this.t = iOException;
                return true;
            }
            if (iOException instanceof aewm) {
                this.r.o();
                return false;
            }
            if (iOException instanceof atp) {
                afid.e(afic.MFL, "Track %d Http status %d blocked load", Integer.valueOf(this.h), Integer.valueOf(((atp) iOException).d));
            }
            if (this.r.k().a.getQueryParameter("headm") != null) {
                if (this.r.i() != -1) {
                    y(this.r.i());
                } else {
                    aexd aexdVar = this.r;
                    aexdVar.t(aexdVar.k().a);
                }
            }
        }
        if (!z) {
            return false;
        }
        affp d = bfsVar.d(aezt.e(this.e), bfrVar);
        if (this.L.Q() && d != null) {
            bel belVar = this.e;
            if (belVar.q(belVar.c(bdnVar.h), d.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bdr
    public final void h() {
        this.e.s();
    }

    @Override // defpackage.aewr
    public final synchronized void i(aesh aeshVar) {
        afki.a(this.r);
        this.r.n(aeshVar);
        if (aeshVar.a.equals("http://youtube.com/streaming/metadata/segment/102015")) {
            if (aeshVar.b("Sequence-Number") != null) {
                v(aeshVar);
                return;
            }
            throw pnr.a("Sequence-Number not found in EmbeddedMetadata", null);
        }
    }

    @Override // defpackage.aewr
    public final synchronized void j(IOException iOException) {
        n(iOException);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized long k(long j) {
        aexl aexlVar = this.s;
        if (aexlVar != null) {
            return aexlVar.A(j);
        }
        long j2 = this.x;
        if (j2 != -9223372036854775807L && j == j2) {
            return this.w;
        }
        if (this.F != 3 || j == 0 || j == 0 || j < aexl.c || this.w != -1 || j >= this.B) {
            return -1L;
        }
        return j / this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized aesf l() {
        Exception exc = this.t;
        if (!(exc instanceof aesf)) {
            return null;
        }
        return (aesf) exc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0225, code lost:
    
        if (r0 != false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void m(long r20) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aexb.m(long):void");
    }

    public final synchronized void n(IOException iOException) {
        this.k.c = iOException;
    }
}
