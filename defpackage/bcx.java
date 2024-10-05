package defpackage;

import android.os.Looper;
import android.util.Log;
import androidx.media3.common.DrmInitData;
import java.io.EOFException;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bcx implements bjc {
    private pms C;
    private pms D;
    private boolean E;
    private boolean F;
    private final bbx G;
    public bcw a;
    public int b;
    public boolean d;
    public int e;
    public long f;
    private final bct g;
    private final ayr j;
    private final Looper k;
    private pms l;
    private ayh m;
    private int u;
    private int v;
    private int w;
    private boolean z;
    private final bcu h = new bcu();
    private int n = 1000;
    private int[] o = new int[1000];
    private long[] p = new long[1000];
    private long[] s = new long[1000];
    private int[] r = new int[1000];
    private int[] q = new int[1000];
    private bjb[] t = new bjb[1000];
    private final bdg i = new bdg(axo.c);
    public long c = Long.MIN_VALUE;
    private long x = Long.MIN_VALUE;
    private long y = Long.MIN_VALUE;
    private boolean B = true;
    private boolean A = true;

    public bcx(bfg bfgVar, Looper looper, ayr ayrVar, bbx bbxVar, byte[] bArr) {
        this.k = looper;
        this.j = ayrVar;
        this.G = bbxVar;
        this.g = new bct(bfgVar);
    }

    public static bcx D(bfg bfgVar, Looper looper, ayr ayrVar, bbx bbxVar) {
        pse.c(looper);
        pse.c(ayrVar);
        return new bcx(bfgVar, looper, ayrVar, bbxVar, null);
    }

    private final int E(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.s[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.r[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.n) {
                i = 0;
            }
        }
        return i3;
    }

    private final int F(int i) {
        int i2 = this.v + i;
        int i3 = this.n;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized int G(pmt pmtVar, asw aswVar, boolean z, boolean z2, bcu bcuVar) {
        aswVar.c = false;
        if (!P()) {
            if (!z2 && !this.z) {
                pms pmsVar = this.D;
                if (pmsVar == null || (!z && pmsVar == this.l)) {
                    return -3;
                }
                M(pmsVar, pmtVar);
                return -5;
            }
            aswVar.setFlags(4);
            return -4;
        }
        pms pmsVar2 = ((bcv) this.i.a(a())).a;
        if (!z && pmsVar2 == this.l) {
            int F = F(this.w);
            if (!Q(F)) {
                aswVar.c = true;
                return -3;
            }
            aswVar.setFlags(this.r[F]);
            long j = this.s[F];
            aswVar.d = j;
            if (j < this.c) {
                aswVar.addFlag(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            }
            bcuVar.a = this.q[F];
            bcuVar.b = this.p[F];
            bcuVar.c = this.t[F];
            return -4;
        }
        M(pmsVar2, pmtVar);
        return -5;
    }

    private final synchronized long H(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.u;
        if (i2 != 0) {
            long[] jArr = this.s;
            int i3 = this.v;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.w) != i2) {
                    i2 = i + 1;
                }
                int E = E(i3, i2, j, z);
                if (E == -1) {
                    return -1L;
                }
                return J(E);
            }
        }
        return -1L;
    }

    private final synchronized long I() {
        int i = this.u;
        if (i == 0) {
            return -1L;
        }
        return J(i);
    }

    private final long J(int i) {
        this.x = Math.max(this.x, K(i));
        this.u -= i;
        int i2 = this.b + i;
        this.b = i2;
        int i3 = this.v + i;
        this.v = i3;
        int i4 = this.n;
        if (i3 >= i4) {
            this.v = i3 - i4;
        }
        int i5 = this.w - i;
        this.w = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.w = 0;
        }
        bdg bdgVar = this.i;
        while (i6 < bdgVar.b.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < bdgVar.b.keyAt(i7)) {
                break;
            }
            bdgVar.c.a(bdgVar.b.valueAt(i6));
            bdgVar.b.removeAt(i6);
            int i8 = bdgVar.a;
            if (i8 > 0) {
                bdgVar.a = i8 - 1;
            }
            i6 = i7;
        }
        if (this.u == 0) {
            int i9 = this.v;
            if (i9 == 0) {
                i9 = this.n;
            }
            return this.p[i9 - 1] + this.q[r6];
        }
        return this.p[this.v];
    }

    private final long K(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int F = F(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.s[F]);
            if ((this.r[F] & 1) != 0) {
                break;
            }
            F--;
            if (F == -1) {
                F = this.n - 1;
            }
        }
        return j;
    }

    private final synchronized void L(long j, int i, long j2, int i2, bjb bjbVar) {
        ayq ayqVar;
        int i3 = this.u;
        if (i3 > 0) {
            int F = F(i3 - 1);
            pse.e(this.p[F] + ((long) this.q[F]) <= j2);
        }
        this.z = (536870912 & i) != 0;
        this.y = Math.max(this.y, j);
        int F2 = F(this.u);
        this.s[F2] = j;
        this.p[F2] = j2;
        this.q[F2] = i2;
        this.r[F2] = i;
        this.t[F2] = bjbVar;
        this.o[F2] = this.e;
        if (this.i.c() || !((bcv) this.i.b()).a.equals(this.D)) {
            ayr ayrVar = this.j;
            if (ayrVar != null) {
                Looper looper = this.k;
                pse.c(looper);
                ayqVar = ayrVar.g(looper, this.G, this.D);
            } else {
                ayqVar = ayq.e;
            }
            bdg bdgVar = this.i;
            int c = c();
            pms pmsVar = this.D;
            pse.c(pmsVar);
            bcv bcvVar = new bcv(pmsVar, ayqVar);
            if (bdgVar.a == -1) {
                pse.g(bdgVar.b.size() == 0);
                bdgVar.a = 0;
            }
            if (bdgVar.b.size() > 0) {
                int keyAt = bdgVar.b.keyAt(r0.size() - 1);
                pse.e(c >= keyAt);
                if (keyAt == c) {
                    bdgVar.c.a(bdgVar.b.valueAt(r8.size() - 1));
                }
            }
            bdgVar.b.append(c, bcvVar);
        }
        int i4 = this.u + 1;
        this.u = i4;
        int i5 = this.n;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            int[] iArr = new int[i6];
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            bjb[] bjbVarArr = new bjb[i6];
            int i7 = this.v;
            int i8 = i5 - i7;
            System.arraycopy(this.p, i7, jArr, 0, i8);
            System.arraycopy(this.s, this.v, jArr2, 0, i8);
            System.arraycopy(this.r, this.v, iArr2, 0, i8);
            System.arraycopy(this.q, this.v, iArr3, 0, i8);
            System.arraycopy(this.t, this.v, bjbVarArr, 0, i8);
            System.arraycopy(this.o, this.v, iArr, 0, i8);
            int i9 = this.v;
            System.arraycopy(this.p, 0, jArr, i8, i9);
            System.arraycopy(this.s, 0, jArr2, i8, i9);
            System.arraycopy(this.r, 0, iArr2, i8, i9);
            System.arraycopy(this.q, 0, iArr3, i8, i9);
            System.arraycopy(this.t, 0, bjbVarArr, i8, i9);
            System.arraycopy(this.o, 0, iArr, i8, i9);
            this.p = jArr;
            this.s = jArr2;
            this.r = iArr2;
            this.q = iArr3;
            this.t = bjbVarArr;
            this.o = iArr;
            this.v = 0;
            this.n = i6;
        }
    }

    private final void N() {
        ayh ayhVar = this.m;
        if (ayhVar != null) {
            ayhVar.p(this.G);
            this.m = null;
            this.l = null;
        }
    }

    private final synchronized void O() {
        this.w = 0;
        bct bctVar = this.g;
        bctVar.d = bctVar.c;
    }

    private final boolean P() {
        return this.w != this.u;
    }

    private final boolean Q(int i) {
        ayh ayhVar = this.m;
        return ayhVar == null || ayhVar.a() == 4 || ((this.r[i] & 1073741824) == 0 && this.m.m());
    }

    private final synchronized boolean R(pms pmsVar) {
        this.B = false;
        if (pts.R(pmsVar, this.D)) {
            return false;
        }
        if (!this.i.c() && ((bcv) this.i.b()).a.equals(pmsVar)) {
            this.D = ((bcv) this.i.b()).a;
        } else {
            this.D = pmsVar;
        }
        pms pmsVar2 = this.D;
        this.E = psz.i(pmsVar2.n, pmsVar2.k);
        this.F = false;
        return true;
    }

    public final synchronized boolean A(long j, boolean z) {
        O();
        int F = F(this.w);
        if (!P() || j < this.s[F] || (j > this.y && !z)) {
            return false;
        }
        int E = E(F, this.u - this.w, j, true);
        if (E == -1) {
            return false;
        }
        this.c = j;
        this.w += E;
        return true;
    }

    @Override // defpackage.bjc
    public final int B(atc atcVar, int i, boolean z) {
        bct bctVar = this.g;
        int a = bctVar.a(i);
        bcs bcsVar = bctVar.e;
        int g = atcVar.g(bcsVar.e.b, bcsVar.a(bctVar.f), a);
        if (g != -1) {
            bctVar.e(g);
            return g;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final synchronized void C() {
        int F = F(this.w);
        if (P()) {
            int i = this.o[F];
        }
    }

    public final int a() {
        return this.b + this.w;
    }

    public final synchronized int b(long j, boolean z) {
        int F = F(this.w);
        if (P() && j >= this.s[F]) {
            if (j > this.y && z) {
                return this.u - this.w;
            }
            int E = E(F, this.u - this.w, j, true);
            if (E == -1) {
                return 0;
            }
            return E;
        }
        return 0;
    }

    public final int c() {
        return this.b + this.u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r9 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(defpackage.pmt r9, defpackage.asw r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = 1
            goto L9
        L7:
            r0 = 0
            r5 = 0
        L9:
            bcu r7 = r8.h
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.G(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L49
            boolean r9 = r10.isEndOfStream()
            if (r9 != 0) goto L48
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L3f
            if (r9 == 0) goto L30
            bct r9 = r8.g
            bcu r11 = r8.h
            bcs r0 = r9.d
            pth r9 = r9.b
            defpackage.bct.b(r0, r10, r11, r9)
            goto L48
        L30:
            bct r9 = r8.g
            bcu r11 = r8.h
            bcs r0 = r9.d
            pth r2 = r9.b
            bcs r10 = defpackage.bct.b(r0, r10, r11, r2)
            r9.d = r10
            goto L42
        L3f:
            if (r9 == 0) goto L42
            goto L48
        L42:
            int r9 = r8.w
            int r9 = r9 + r1
            r8.w = r9
            return r12
        L48:
            r9 = -4
        L49:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcx.d(pmt, asw, int, boolean):int");
    }

    @Override // defpackage.bjc
    public final /* synthetic */ int e(atc atcVar, int i, boolean z) {
        return hp.d(this, atcVar, i, z);
    }

    public final synchronized long f() {
        if (this.u == 0) {
            return Long.MIN_VALUE;
        }
        return this.s[this.v];
    }

    public final synchronized long g() {
        return this.y;
    }

    public final synchronized long h() {
        return Math.max(this.x, K(this.w));
    }

    public final synchronized pms i() {
        if (this.B) {
            return null;
        }
        return this.D;
    }

    public final void j(long j, boolean z, boolean z2) {
        this.g.d(H(j, z, z2));
    }

    public final void k() {
        this.g.d(I());
    }

    public final void l(long j) {
        if (this.u == 0) {
            return;
        }
        pse.e(j > h());
        int i = this.u;
        int F = F(i - 1);
        while (i > this.w && this.s[F] >= j) {
            i--;
            F--;
            if (F == -1) {
                F = this.n - 1;
            }
        }
        m(this.b + i);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:489)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:492)
        */
    public final void m(int r10) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcx.m(int):void");
    }

    public final void o() {
        ayh ayhVar = this.m;
        if (ayhVar == null || ayhVar.a() != 1) {
            return;
        }
        ayg c = this.m.c();
        pse.c(c);
        throw c;
    }

    public final void p() {
        k();
        N();
    }

    public final void q() {
        s(true);
        N();
    }

    public final void r() {
        s(false);
    }

    @Override // defpackage.bjc
    public final void rp(pms pmsVar) {
        pms pmsVar2;
        if (this.f == 0 || pmsVar.r == Long.MAX_VALUE) {
            pmsVar2 = pmsVar;
        } else {
            pmr b = pmsVar.b();
            b.o = pmsVar.r + this.f;
            pmsVar2 = b.a();
        }
        this.d = false;
        this.C = pmsVar;
        boolean R = R(pmsVar2);
        bcw bcwVar = this.a;
        if (bcwVar == null || !R) {
            return;
        }
        bcn bcnVar = (bcn) bcwVar;
        bcnVar.h.post(bcnVar.f);
    }

    public final void s(boolean z) {
        bct bctVar = this.g;
        bctVar.c(bctVar.c);
        bctVar.c = new bcs(0L, bctVar.a);
        bcs bcsVar = bctVar.c;
        bctVar.d = bcsVar;
        bctVar.e = bcsVar;
        bctVar.f = 0L;
        bctVar.g.d();
        this.u = 0;
        this.b = 0;
        this.v = 0;
        this.w = 0;
        this.A = true;
        this.c = Long.MIN_VALUE;
        this.x = Long.MIN_VALUE;
        this.y = Long.MIN_VALUE;
        this.z = false;
        bdg bdgVar = this.i;
        for (int i = 0; i < bdgVar.b.size(); i++) {
            bdgVar.c.a(bdgVar.b.valueAt(i));
        }
        bdgVar.a = -1;
        bdgVar.b.clear();
        if (z) {
            this.C = null;
            this.D = null;
            this.B = true;
        }
    }

    @Override // defpackage.bjc
    public final /* synthetic */ void t(pth pthVar, int i) {
        hp.e(this, pthVar, i);
    }

    @Override // defpackage.bjc
    public final void u(pth pthVar, int i, int i2) {
        bct bctVar = this.g;
        while (i > 0) {
            int a = bctVar.a(i);
            bcs bcsVar = bctVar.e;
            pthVar.B(bcsVar.e.b, bcsVar.a(bctVar.f), a);
            i -= a;
            bctVar.e(a);
        }
    }

    @Override // defpackage.bjc
    public final void v(long j, int i, int i2, int i3, bjb bjbVar) {
        int i4;
        if (this.d) {
            pms pmsVar = this.C;
            pse.d(pmsVar);
            rp(pmsVar);
        }
        int i5 = i & 1;
        if (this.A) {
            if (i5 == 0) {
                return;
            } else {
                this.A = false;
            }
        }
        long j2 = this.f + j;
        if (this.E) {
            if (j2 < this.c) {
                return;
            }
            if (i5 == 0) {
                if (!this.F) {
                    String valueOf = String.valueOf(this.D);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                    sb.append("Overriding unexpected non-sync sample for format: ");
                    sb.append(valueOf);
                    Log.w("SampleQueue", sb.toString());
                    this.F = true;
                }
                i4 = i | 1;
                L(j2, i4, (this.g.f - i2) - i3, i2, bjbVar);
            }
        }
        i4 = i;
        L(j2, i4, (this.g.f - i2) - i3, i2, bjbVar);
    }

    public final synchronized void w(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.w + i <= this.u) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        pse.e(z);
        this.w += i;
    }

    public final synchronized boolean x() {
        return this.z;
    }

    public final synchronized boolean y(boolean z) {
        boolean z2 = true;
        if (P()) {
            if (((bcv) this.i.a(a())).a != this.l) {
                return true;
            }
            return Q(F(this.w));
        }
        if (!z && !this.z) {
            pms pmsVar = this.D;
            if (pmsVar == null) {
                z2 = false;
            } else if (pmsVar == this.l) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean z(int i) {
        boolean z;
        O();
        int i2 = this.b;
        if (i >= i2 && i <= this.u + i2) {
            this.c = Long.MIN_VALUE;
            this.w = i - i2;
            z = true;
        }
        z = false;
        return z;
    }

    private final void M(pms pmsVar, pmt pmtVar) {
        pms pmsVar2 = this.l;
        DrmInitData drmInitData = pmsVar2 == null ? null : pmsVar2.q;
        this.l = pmsVar;
        DrmInitData drmInitData2 = pmsVar.q;
        ayr ayrVar = this.j;
        pmtVar.b = ayrVar != null ? pmsVar.c(ayrVar.a(pmsVar)) : pmsVar;
        pmtVar.a = this.m;
        if (this.j == null) {
            return;
        }
        if (pmsVar2 == null || !pts.R(drmInitData, drmInitData2)) {
            ayh ayhVar = this.m;
            ayr ayrVar2 = this.j;
            Looper looper = this.k;
            pse.c(looper);
            ayh e = ayrVar2.e(looper, this.G, pmsVar);
            this.m = e;
            pmtVar.a = e;
            if (ayhVar != null) {
                ayhVar.p(this.G);
            }
        }
    }
}
