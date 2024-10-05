package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.exoplayer.MediaFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pcg implements oyr, oyq, pca, pga {
    private static final List c;
    private IOException A;
    private int B;
    private long C;
    private boolean D;
    private int E;
    private final pft F;
    public final pcd a;
    public int b;
    private final int d;
    private final SparseArray e;
    private final Uri f;
    private final pfq g;
    private volatile boolean h;
    private volatile pcm i;
    private volatile pbg j;
    private boolean k;
    private int l;
    private MediaFormat[] m;
    private long n;
    private boolean[] o;
    private boolean[] p;
    private boolean[] q;
    private int r;
    private long s;
    private long t;
    private long u;
    private boolean v;
    private long w;
    private long x;
    private pge y;
    private pcc z;

    static {
        ArrayList arrayList = new ArrayList();
        c = arrayList;
        try {
            arrayList.add(Class.forName("pfj").asSubclass(pbz.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            c.add(Class.forName("pdk").asSubclass(pbz.class));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            c.add(Class.forName("pdm").asSubclass(pbz.class));
        } catch (ClassNotFoundException unused3) {
        }
        try {
            c.add(Class.forName("pcx").asSubclass(pbz.class));
        } catch (ClassNotFoundException unused4) {
        }
        try {
            c.add(Class.forName("pef").asSubclass(pbz.class));
        } catch (ClassNotFoundException unused5) {
        }
        try {
            c.add(Class.forName("pfa").asSubclass(pbz.class));
        } catch (ClassNotFoundException unused6) {
        }
        try {
            c.add(Class.forName("pcp").asSubclass(pbz.class));
        } catch (ClassNotFoundException unused7) {
        }
        try {
            c.add(Class.forName("pdt").asSubclass(pbz.class));
        } catch (ClassNotFoundException unused8) {
        }
        try {
            c.add(Class.forName("pet").asSubclass(pbz.class));
        } catch (ClassNotFoundException unused9) {
        }
        try {
            c.add(Class.forName("pfb").asSubclass(pbz.class));
        } catch (ClassNotFoundException unused10) {
        }
        try {
            c.add(Class.forName("com.google.android.exoplayer.ext.flac.FlacExtractor").asSubclass(pbz.class));
        } catch (ClassNotFoundException unused11) {
        }
    }

    public pcg(Uri uri, pfq pfqVar, pft pftVar, int i, pbz... pbzVarArr) {
        this.f = uri;
        this.g = pfqVar;
        this.F = pftVar;
        this.d = i;
        if (pbzVarArr.length == 0) {
            int size = c.size();
            pbzVarArr = new pbz[size];
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    pbzVarArr[i2] = (pbz) ((Class) c.get(i2)).newInstance();
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException("Unexpected error creating default extractor", e);
                } catch (InstantiationException e2) {
                    throw new IllegalStateException("Unexpected error creating default extractor", e2);
                }
            }
        }
        this.a = new pcd(pbzVarArr, this);
        this.e = new SparseArray();
        this.u = Long.MIN_VALUE;
    }

    private final pcc q() {
        return new pcc(this.f, this.g, this.a, this.F, this.d, 0L);
    }

    private final void r() {
        for (int i = 0; i < this.e.size(); i++) {
            ((pce) this.e.valueAt(i)).b();
        }
        this.z = null;
        this.A = null;
        this.B = 0;
    }

    private final void s() {
        if (this.D || this.y.b) {
            return;
        }
        int i = 0;
        if (this.A == null) {
            this.x = 0L;
            this.v = false;
            if (!this.k) {
                this.z = q();
            } else {
                opn.k(v());
                long j = this.n;
                if (j == -1 || this.u < j) {
                    this.z = new pcc(this.f, this.g, this.a, this.F, this.d, this.i.b(this.u));
                    this.u = Long.MIN_VALUE;
                } else {
                    this.D = true;
                    this.u = Long.MIN_VALUE;
                    return;
                }
            }
            this.E = this.b;
            this.y.d(this.z, this);
            return;
        }
        if (u()) {
            return;
        }
        opn.k(this.z != null);
        if (SystemClock.elapsedRealtime() - this.C >= Math.min((this.B - 1) * 1000, 5000L)) {
            this.A = null;
            if (!this.k) {
                while (i < this.e.size()) {
                    ((pce) this.e.valueAt(i)).b();
                    i++;
                }
                this.z = q();
            } else if (!this.i.c() && this.n == -1) {
                while (i < this.e.size()) {
                    ((pce) this.e.valueAt(i)).b();
                    i++;
                }
                this.z = q();
                this.w = this.s;
                this.v = true;
            }
            this.E = this.b;
            this.y.d(this.z, this);
        }
    }

    private final void t(long j) {
        this.u = j;
        this.D = false;
        pge pgeVar = this.y;
        if (pgeVar.b) {
            pgeVar.a();
        } else {
            r();
            s();
        }
    }

    private final boolean u() {
        return this.A instanceof pcf;
    }

    private final boolean v() {
        return this.u != Long.MIN_VALUE;
    }

    @Override // defpackage.oyq
    public final int a() {
        return this.e.size();
    }

    @Override // defpackage.oyq
    public final int b(int i, long j, oyn oynVar, oyp oypVar) {
        this.s = j;
        if (!this.p[i] && !v()) {
            pce pceVar = (pce) this.e.valueAt(i);
            if (this.o[i]) {
                oynVar.a = pceVar.e;
                oynVar.b = this.j;
                this.o[i] = false;
                return -4;
            }
            if (pceVar.c(oypVar)) {
                long j2 = oypVar.e;
                long j3 = this.t;
                oypVar.d = (j2 < j3 ? 134217728 : 0) | oypVar.d;
                if (this.v) {
                    this.x = this.w - j2;
                    this.v = false;
                }
                oypVar.e = j2 + this.x;
                return -3;
            }
            if (this.D) {
                return -1;
            }
        }
        return -2;
    }

    @Override // defpackage.oyq
    public final long c() {
        if (this.D) {
            return -3L;
        }
        if (v()) {
            return this.u;
        }
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.e.size(); i++) {
            j = Math.max(j, ((pce) this.e.valueAt(i)).d);
        }
        return j == Long.MIN_VALUE ? this.s : j;
    }

    @Override // defpackage.oyq
    public final long d(int i) {
        boolean[] zArr = this.p;
        if (!zArr[i]) {
            return Long.MIN_VALUE;
        }
        zArr[i] = false;
        return this.t;
    }

    @Override // defpackage.oyq
    public final MediaFormat e(int i) {
        opn.k(this.k);
        return this.m[i];
    }

    @Override // defpackage.oyr
    public final oyq f() {
        this.r++;
        return this;
    }

    @Override // defpackage.oyq
    public final void g(int i) {
        opn.k(this.k);
        opn.k(this.q[i]);
        int i2 = this.l - 1;
        this.l = i2;
        this.q[i] = false;
        if (i2 == 0) {
            this.s = Long.MIN_VALUE;
            pge pgeVar = this.y;
            if (pgeVar.b) {
                pgeVar.a();
            } else {
                r();
                this.F.c(0);
            }
        }
    }

    @Override // defpackage.oyq
    public final void h(int i, long j) {
        opn.k(this.k);
        opn.k(!this.q[i]);
        int i2 = this.l + 1;
        this.l = i2;
        this.q[i] = true;
        this.o[i] = true;
        this.p[i] = false;
        if (i2 == 1) {
            if (true != this.i.c()) {
                j = 0;
            }
            this.s = j;
            this.t = j;
            t(j);
        }
    }

    @Override // defpackage.oyq
    public final void i() {
        if (this.A == null) {
            return;
        }
        if (!u()) {
            int i = 3;
            if (this.i != null && !this.i.c()) {
                i = 6;
            }
            if (this.B > i) {
                throw this.A;
            }
            return;
        }
        throw this.A;
    }

    @Override // defpackage.oyq
    public final void j() {
        pge pgeVar;
        opn.k(this.r > 0);
        int i = this.r - 1;
        this.r = i;
        if (i != 0 || (pgeVar = this.y) == null) {
            return;
        }
        pgeVar.c(new pcb(this));
        this.y = null;
    }

    @Override // defpackage.oyq
    public final void k(long j) {
        opn.k(this.k);
        int i = 0;
        opn.k(this.l > 0);
        if (true != this.i.c()) {
            j = 0;
        }
        long j2 = v() ? this.u : this.s;
        this.s = j;
        this.t = j;
        if (j2 == j) {
            return;
        }
        boolean z = !v();
        int i2 = 0;
        while (true) {
            if (z) {
                if (i2 >= this.e.size()) {
                    break;
                }
                z = ((pce) this.e.valueAt(i2)).h(j);
                i2++;
            } else {
                t(j);
                break;
            }
        }
        while (true) {
            boolean[] zArr = this.p;
            if (i >= zArr.length) {
                return;
            }
            zArr[i] = true;
            i++;
        }
    }

    @Override // defpackage.oyq
    public final boolean l(int i, long j) {
        opn.k(this.k);
        opn.k(this.q[i]);
        this.s = j;
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.q;
            if (i2 >= zArr.length) {
                break;
            }
            if (!zArr[i2]) {
                pce pceVar = (pce) this.e.valueAt(i2);
                while (pceVar.a.e(pceVar.b) && pceVar.b.e < j) {
                    pceVar.a.d();
                    pceVar.c = true;
                }
            }
            i2++;
        }
        if (this.D) {
            return true;
        }
        s();
        return (v() || ((pce) this.e.valueAt(i)).e()) ? false : true;
    }

    @Override // defpackage.oyq
    public final boolean m() {
        if (this.k) {
            return true;
        }
        if (this.y == null) {
            this.y = new pge("Loader:ExtractorSampleSource");
        }
        s();
        if (this.i != null && this.h) {
            for (int i = 0; i < this.e.size(); i++) {
                if (((pce) this.e.valueAt(i)).e != null) {
                }
            }
            int size = this.e.size();
            this.q = new boolean[size];
            this.p = new boolean[size];
            this.o = new boolean[size];
            this.m = new MediaFormat[size];
            this.n = -1L;
            for (int i2 = 0; i2 < size; i2++) {
                MediaFormat mediaFormat = ((pce) this.e.valueAt(i2)).e;
                this.m[i2] = mediaFormat;
                long j = mediaFormat.e;
                if (j != -1 && j > this.n) {
                    this.n = j;
                }
            }
            this.k = true;
            return true;
        }
        return false;
    }

    @Override // defpackage.pga
    public final void n(pgc pgcVar) {
        this.D = true;
    }

    @Override // defpackage.pga
    public final void o(pgc pgcVar, IOException iOException) {
        this.A = iOException;
        this.B = this.b <= this.E ? 1 + this.B : 1;
        this.C = SystemClock.elapsedRealtime();
        s();
    }

    @Override // defpackage.pga
    public final void p() {
        if (this.l > 0) {
            t(this.u);
        } else {
            r();
            this.F.c(0);
        }
    }

    @Override // defpackage.pca
    public final pcn pH(int i) {
        pce pceVar = (pce) this.e.get(i);
        if (pceVar != null) {
            return pceVar;
        }
        pce pceVar2 = new pce(this, this.F);
        this.e.put(i, pceVar2);
        return pceVar2;
    }

    @Override // defpackage.pca
    public final void pI(pbg pbgVar) {
        this.j = pbgVar;
    }

    @Override // defpackage.pca
    public final void pJ() {
        this.h = true;
    }

    @Override // defpackage.pca
    public final void pK(pcm pcmVar) {
        this.i = pcmVar;
    }
}
