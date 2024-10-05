package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bcn implements bbp, bik, bft, bfw, bcw {
    public static final Map a;
    public static final pms b;
    private boolean B;
    private boolean C;
    private bcm D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;

    /* renamed from: J, reason: collision with root package name */
    private boolean f147J;
    private int K;
    private final bfg L;
    private final bbx M;
    public final bcj c;
    public final long d;
    public final Runnable f;
    public final Runnable g;
    public bbo i;
    public IcyHeaders j;
    public boolean l;
    public biz m;
    public boolean o;
    public boolean r;
    public boolean s;
    private final Uri u;
    private final ate v;
    private final ayr w;
    private final bfs x;
    private final bbx y;
    private final bcf z;
    public final bfz e = new bfz("ProgressiveMediaPeriod");
    private final eun N = new eun((char[]) null);
    public final Handler h = pts.x();
    private bcl[] A = new bcl[0];
    public bcx[] k = new bcx[0];
    private long I = -9223372036854775807L;
    public long q = -1;
    public long n = -9223372036854775807L;
    public int p = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        a = Collections.unmodifiableMap(hashMap);
        pmr pmrVar = new pmr();
        pmrVar.a = "icy";
        pmrVar.k = "application/x-icy";
        b = pmrVar.a();
    }

    public bcn(Uri uri, ate ateVar, bcf bcfVar, ayr ayrVar, bbx bbxVar, bfs bfsVar, bbx bbxVar2, bcj bcjVar, bfg bfgVar, int i, byte[] bArr) {
        this.u = uri;
        this.v = ateVar;
        this.w = ayrVar;
        this.M = bbxVar;
        this.x = bfsVar;
        this.y = bbxVar2;
        this.c = bcjVar;
        this.L = bfgVar;
        this.d = i;
        this.z = bcfVar;
        final int i2 = 0;
        this.f = new Runnable(this) { // from class: bcg
            public final /* synthetic */ bcn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (i2 == 0) {
                    this.a.r();
                    return;
                }
                bcn bcnVar = this.a;
                if (bcnVar.s) {
                    return;
                }
                bbo bboVar = bcnVar.i;
                pse.c(bboVar);
                bboVar.j(bcnVar);
            }
        };
        final int i3 = 1;
        this.g = new Runnable(this) { // from class: bcg
            public final /* synthetic */ bcn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (i3 == 0) {
                    this.a.r();
                    return;
                }
                bcn bcnVar = this.a;
                if (bcnVar.s) {
                    return;
                }
                bbo bboVar = bcnVar.i;
                pse.c(bboVar);
                bboVar.j(bcnVar);
            }
        };
    }

    private final int B() {
        int i = 0;
        for (bcx bcxVar : this.k) {
            i += bcxVar.c();
        }
        return i;
    }

    private final void C() {
        pse.g(this.l);
        pse.c(this.D);
        pse.c(this.m);
    }

    private final void D(bci bciVar) {
        if (this.q == -1) {
            this.q = bciVar.e;
        }
    }

    private final void E() {
        bci bciVar = new bci(this, this.u, this.v, this.z, this, this.N, null);
        if (this.l) {
            pse.g(F());
            long j = this.n;
            if (j == -9223372036854775807L || this.I <= j) {
                biz bizVar = this.m;
                pse.c(bizVar);
                bciVar.c(bizVar.b(this.I).a.c, this.I);
                for (bcx bcxVar : this.k) {
                    bcxVar.c = this.I;
                }
                this.I = -9223372036854775807L;
            } else {
                this.r = true;
                this.I = -9223372036854775807L;
                return;
            }
        }
        this.K = B();
        this.e.g(bciVar, this, this.x.a(this.p));
        this.y.n(new bbi(bciVar.a, bciVar.d), -1, null, 0, null, bciVar.c, this.n);
    }

    private final boolean F() {
        return this.I != -9223372036854775807L;
    }

    @Override // defpackage.bft
    public final /* bridge */ /* synthetic */ aeqp A(bfv bfvVar, IOException iOException, int i) {
        aeqp h;
        biz bizVar;
        bci bciVar = (bci) bfvVar;
        D(bciVar);
        bbi bbiVar = new bbi(bciVar.a, bciVar.d, bciVar.b.a);
        plh.d(bciVar.c);
        plh.d(this.n);
        new bbn(-1, null, 0, null);
        long b2 = this.x.b(new bfr(bbiVar, iOException, i));
        if (b2 == -9223372036854775807L) {
            h = bfz.e;
        } else {
            int B = B();
            boolean z = B > this.K;
            if (this.q != -1 || ((bizVar = this.m) != null && bizVar.a() != -9223372036854775807L)) {
                this.K = B;
            } else if (!this.l || x()) {
                this.F = this.l;
                this.H = 0L;
                this.K = 0;
                for (bcx bcxVar : this.k) {
                    bcxVar.r();
                }
                bciVar.c(0L, 0L);
            } else {
                this.f147J = true;
                h = bfz.d;
            }
            h = bfz.h(z, b2);
        }
        boolean z2 = !h.c();
        this.y.m(bbiVar, -1, null, 0, null, bciVar.c, this.n, iOException, z2);
        if (z2) {
            long j = bciVar.a;
        }
        return h;
    }

    @Override // defpackage.bbp
    public final long a(long j, poi poiVar) {
        C();
        if (!this.m.c()) {
            return 0L;
        }
        bix b2 = this.m.b(j);
        return poiVar.a(j, b2.a.b, b2.b.b);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final long c() {
        if (this.G == 0) {
            return Long.MIN_VALUE;
        }
        return jJ();
    }

    @Override // defpackage.bbp
    public final long d() {
        if (!this.F) {
            return -9223372036854775807L;
        }
        if (!this.r && B() <= this.K) {
            return -9223372036854775807L;
        }
        this.F = false;
        return this.H;
    }

    @Override // defpackage.bbp
    public final long e(long j) {
        int i;
        C();
        boolean[] zArr = this.D.b;
        if (true != this.m.c()) {
            j = 0;
        }
        int i2 = 0;
        this.F = false;
        this.H = j;
        if (F()) {
            this.I = j;
            return j;
        }
        if (this.p != 7) {
            int length = this.k.length;
            while (i < length) {
                i = (this.k[i].A(j, false) || (!zArr[i] && this.C)) ? i + 1 : 0;
            }
            return j;
        }
        this.f147J = false;
        this.I = j;
        this.r = false;
        if (this.e.f()) {
            bcx[] bcxVarArr = this.k;
            int length2 = bcxVarArr.length;
            while (i2 < length2) {
                bcxVarArr[i2].k();
                i2++;
            }
            this.e.a();
        } else {
            this.e.b();
            bcx[] bcxVarArr2 = this.k;
            int length3 = bcxVarArr2.length;
            while (i2 < length3) {
                bcxVarArr2[i2].r();
                i2++;
            }
        }
        return j;
    }

    @Override // defpackage.bbp
    public final long f(bel[] belVarArr, boolean[] zArr, bcy[] bcyVarArr, boolean[] zArr2, long j) {
        bel belVar;
        C();
        bcm bcmVar = this.D;
        asj asjVar = bcmVar.a;
        boolean[] zArr3 = bcmVar.c;
        int i = this.G;
        int i2 = 0;
        for (int i3 = 0; i3 < belVarArr.length; i3++) {
            bcy bcyVar = bcyVarArr[i3];
            if (bcyVar != null && (belVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((bck) bcyVar).a;
                pse.g(zArr3[i4]);
                this.G--;
                zArr3[i4] = false;
                bcyVarArr[i3] = null;
            }
        }
        boolean z = !this.E ? j == 0 : i != 0;
        for (int i5 = 0; i5 < belVarArr.length; i5++) {
            if (bcyVarArr[i5] == null && (belVar = belVarArr[i5]) != null) {
                pse.g(belVar.d() == 1);
                pse.g(belVar.a(0) == 0);
                int a2 = asjVar.a(belVar.e());
                pse.g(!zArr3[a2]);
                this.G++;
                zArr3[a2] = true;
                bcyVarArr[i5] = new bck(this, a2);
                zArr2[i5] = true;
                if (!z) {
                    bcx bcxVar = this.k[a2];
                    z = (bcxVar.A(j, true) || bcxVar.a() == 0) ? false : true;
                }
            }
        }
        if (this.G == 0) {
            this.f147J = false;
            this.F = false;
            if (this.e.f()) {
                bcx[] bcxVarArr = this.k;
                int length = bcxVarArr.length;
                while (i2 < length) {
                    bcxVarArr[i2].k();
                    i2++;
                }
                this.e.a();
            } else {
                bcx[] bcxVarArr2 = this.k;
                int length2 = bcxVarArr2.length;
                while (i2 < length2) {
                    bcxVarArr2[i2].r();
                    i2++;
                }
            }
        } else if (z) {
            j = e(j);
            while (i2 < bcyVarArr.length) {
                if (bcyVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.E = true;
        return j;
    }

    @Override // defpackage.bbp
    public final asj g() {
        C();
        return this.D.a;
    }

    @Override // defpackage.bbp
    public final void h(long j, boolean z) {
        C();
        if (F()) {
            return;
        }
        boolean[] zArr = this.D.c;
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            this.k[i].j(j, z, zArr[i]);
        }
    }

    @Override // defpackage.bbp
    public final void i() {
        u();
        if (this.r && !this.l) {
            throw pnr.a("Loading finished before preparation is complete.", null);
        }
    }

    public final long j() {
        long j = Long.MIN_VALUE;
        for (bcx bcxVar : this.k) {
            j = Math.max(j, bcxVar.g());
        }
        return j;
    }

    @Override // defpackage.bbp, defpackage.bda
    public final long jJ() {
        long j;
        C();
        boolean[] zArr = this.D.b;
        if (this.r) {
            return Long.MIN_VALUE;
        }
        if (F()) {
            return this.I;
        }
        if (this.C) {
            int length = this.k.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.k[i].x()) {
                    j = Math.min(j, this.k[i].g());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = j();
        }
        return j == Long.MIN_VALUE ? this.H : j;
    }

    public final bjc k(bcl bclVar) {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            if (bclVar.equals(this.A[i])) {
                return this.k[i];
            }
        }
        bcx D = bcx.D(this.L, this.h.getLooper(), this.w, this.M);
        D.a = this;
        int i2 = length + 1;
        bcl[] bclVarArr = (bcl[]) Arrays.copyOf(this.A, i2);
        bclVarArr[length] = bclVar;
        this.A = (bcl[]) pts.ab(bclVarArr);
        bcx[] bcxVarArr = (bcx[]) Arrays.copyOf(this.k, i2);
        bcxVarArr[length] = D;
        this.k = (bcx[]) pts.ab(bcxVarArr);
        return D;
    }

    @Override // defpackage.bbp
    public final void l(bbo bboVar, long j) {
        this.i = bboVar;
        this.N.e();
        E();
    }

    @Override // defpackage.bbp, defpackage.bda
    public final void m(long j) {
    }

    @Override // defpackage.bik
    public final bjc n(int i, int i2) {
        return k(new bcl(i, false));
    }

    @Override // defpackage.bbp, defpackage.bda
    public final boolean o(long j) {
        if (this.r || this.e.e() || this.f147J) {
            return false;
        }
        if (this.l && this.G == 0) {
            return false;
        }
        boolean e = this.N.e();
        if (this.e.f()) {
            return e;
        }
        E();
        return true;
    }

    @Override // defpackage.bbp, defpackage.bda
    public final boolean p() {
        return this.e.f() && this.N.d();
    }

    @Override // defpackage.bik
    public final void q() {
        this.B = true;
        this.h.post(this.f);
    }

    public final void r() {
        Metadata c;
        if (this.s || this.l || !this.B || this.m == null) {
            return;
        }
        for (bcx bcxVar : this.k) {
            if (bcxVar.i() == null) {
                return;
            }
        }
        this.N.f();
        int length = this.k.length;
        asi[] asiVarArr = new asi[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            pms i2 = this.k[i].i();
            pse.c(i2);
            String str = i2.n;
            boolean j = psz.j(str);
            boolean z = j || psz.l(str);
            zArr[i] = z;
            this.C = z | this.C;
            IcyHeaders icyHeaders = this.j;
            if (icyHeaders != null) {
                if (j || this.A[i].b) {
                    Metadata metadata = i2.l;
                    if (metadata == null) {
                        c = new Metadata(icyHeaders);
                    } else {
                        c = metadata.c(icyHeaders);
                    }
                    pmr b2 = i2.b();
                    b2.i = c;
                    i2 = b2.a();
                }
                if (j && i2.h == -1 && i2.i == -1 && icyHeaders.a != -1) {
                    pmr b3 = i2.b();
                    b3.f = icyHeaders.a;
                    i2 = b3.a();
                }
            }
            asiVarArr[i] = new asi(i2.c(this.w.a(i2)));
        }
        this.D = new bcm(new asj(asiVarArr), zArr);
        this.l = true;
        bbo bboVar = this.i;
        pse.c(bboVar);
        bboVar.k(this);
    }

    public final void s(int i) {
        C();
        bcm bcmVar = this.D;
        boolean[] zArr = bcmVar.d;
        if (zArr[i]) {
            return;
        }
        pms a2 = bcmVar.a.b(i).a(0);
        this.y.c(psz.b(a2.n), a2, 0, null, this.H);
        zArr[i] = true;
    }

    public final void t(int i) {
        C();
        boolean[] zArr = this.D.b;
        if (this.f147J && zArr[i]) {
            if (this.k[i].y(false)) {
                return;
            }
            this.I = 0L;
            this.f147J = false;
            this.F = true;
            this.H = 0L;
            this.K = 0;
            for (bcx bcxVar : this.k) {
                bcxVar.r();
            }
            bbo bboVar = this.i;
            pse.c(bboVar);
            bboVar.j(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u() {
        this.e.c(this.x.a(this.p));
    }

    @Override // defpackage.bfw
    public final void v() {
        for (bcx bcxVar : this.k) {
            bcxVar.q();
        }
        bat batVar = (bat) this.z;
        if (batVar.a != null) {
            batVar.a = null;
        }
        batVar.b = null;
    }

    @Override // defpackage.bik
    public final void w(final biz bizVar) {
        this.h.post(new Runnable() { // from class: bch
            @Override // java.lang.Runnable
            public final void run() {
                bcn bcnVar = bcn.this;
                biz bizVar2 = bizVar;
                bcnVar.m = bcnVar.j == null ? bizVar2 : new biy(-9223372036854775807L);
                bcnVar.n = bizVar2.a();
                boolean z = false;
                if (bcnVar.q == -1 && bizVar2.a() == -9223372036854775807L) {
                    z = true;
                }
                bcnVar.o = z;
                bcnVar.p = true == z ? 7 : 1;
                bcnVar.c.a(bcnVar.n, bizVar2.c(), bcnVar.o);
                if (bcnVar.l) {
                    return;
                }
                bcnVar.r();
            }
        });
    }

    public final boolean x() {
        return this.F || F();
    }

    @Override // defpackage.bft
    public final /* bridge */ /* synthetic */ void y(bfv bfvVar, boolean z) {
        bci bciVar = (bci) bfvVar;
        bbi bbiVar = new bbi(bciVar.a, bciVar.d, bciVar.b.a);
        long j = bciVar.a;
        this.y.k(bbiVar, -1, null, 0, null, bciVar.c, this.n);
        if (z) {
            return;
        }
        D(bciVar);
        for (bcx bcxVar : this.k) {
            bcxVar.r();
        }
        if (this.G > 0) {
            bbo bboVar = this.i;
            pse.c(bboVar);
            bboVar.j(this);
        }
    }

    @Override // defpackage.bft
    public final /* bridge */ /* synthetic */ void z(bfv bfvVar) {
        biz bizVar;
        bci bciVar = (bci) bfvVar;
        if (this.n == -9223372036854775807L && (bizVar = this.m) != null) {
            boolean c = bizVar.c();
            long j = j();
            long j2 = j == Long.MIN_VALUE ? 0L : j + 10000;
            this.n = j2;
            this.c.a(j2, c, this.o);
        }
        bbi bbiVar = new bbi(bciVar.a, bciVar.d, bciVar.b.a);
        long j3 = bciVar.a;
        this.y.l(bbiVar, -1, null, 0, null, bciVar.c, this.n);
        D(bciVar);
        this.r = true;
        bbo bboVar = this.i;
        pse.c(bboVar);
        bboVar.j(this);
    }
}
