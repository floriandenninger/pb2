package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class phj implements ate {
    private final phg a;
    private final ate b;
    private final ate c;
    private final ate d;
    private final afhd e;
    private final boolean f;
    private final boolean g;
    private Uri h;
    private ath i;
    private ath j;
    private ate k;
    private long l;
    private long m;
    private long n;
    private phl o;
    private boolean p;
    private boolean q;
    private long r;
    private long s;

    public phj(phg phgVar, ate ateVar, ate ateVar2, bfe bfeVar, int i, afhd afhdVar) {
        this.a = phgVar;
        this.b = ateVar2;
        this.f = 1 == (i & 1);
        this.g = (i & 2) != 0;
        this.d = ateVar;
        this.c = bfeVar != null ? new bgi(ateVar, bfeVar) : null;
        this.e = afhdVar;
    }

    private final void c() {
        ate ateVar = this.k;
        if (ateVar != null) {
            try {
                ateVar.j();
                this.j = null;
                this.k = null;
                phl phlVar = this.o;
                if (phlVar != null) {
                    this.a.j(phlVar);
                    this.o = null;
                }
            } catch (Throwable th) {
                this.j = null;
                this.k = null;
                phl phlVar2 = this.o;
                if (phlVar2 != null) {
                    this.a.j(phlVar2);
                    this.o = null;
                }
                throw th;
            }
        }
    }

    private final void d(Throwable th) {
        if (k() || (th instanceof phe)) {
            this.p = true;
        }
    }

    private final void e(boolean z) {
        phl b;
        long j;
        ath a;
        ate ateVar;
        String str = this.i.i;
        if (this.q) {
            b = null;
        } else if (this.f) {
            try {
                b = this.a.b(str, this.m);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            b = this.a.c(str, this.m);
        }
        if (b == null) {
            ateVar = this.d;
            atg a2 = this.i.a();
            a2.f = this.m;
            a2.g = this.n;
            a = a2.a();
        } else if (b.d) {
            Uri fromFile = Uri.fromFile(b.e);
            long j2 = b.b;
            long j3 = this.m - j2;
            long j4 = b.c - j3;
            long j5 = this.n;
            if (j5 != -1) {
                j4 = Math.min(j4, j5);
            }
            atg a3 = this.i.a();
            a3.a = fromFile;
            a3.b = j2;
            a3.f = j3;
            a3.g = j4;
            a = a3.a();
            ateVar = this.b;
        } else {
            if (b.c()) {
                j = this.n;
            } else {
                j = b.c;
                long j6 = this.n;
                if (j6 != -1) {
                    j = Math.min(j, j6);
                }
            }
            atg a4 = this.i.a();
            a4.f = this.m;
            a4.g = j;
            a = a4.a();
            ateVar = this.c;
            if (ateVar == null) {
                ateVar = this.d;
                this.a.j(b);
                b = null;
            }
        }
        long j7 = Long.MAX_VALUE;
        if (!this.q && ateVar == this.d) {
            j7 = this.m + 102400;
        }
        this.s = j7;
        if (z) {
            pse.g(this.k == this.d);
            if (ateVar == this.d) {
                return;
            }
            try {
                c();
            } finally {
            }
        }
        if (b != null && b.b()) {
            this.o = b;
        }
        this.k = ateVar;
        this.j = a;
        this.l = 0L;
        long h = ateVar.h(a);
        rzb rzbVar = new rzb(null);
        if (this.j.h == -1 && h != -1) {
            this.n = h;
            rzb.i(rzbVar, this.m + h);
        }
        if (l()) {
            this.h = this.k.i();
            Uri uri = this.i.a.equals(this.h) ? null : this.h;
            if (uri == null) {
                rzbVar.b.add("exo_redir");
                rzbVar.a.remove("exo_redir");
            } else {
                rzbVar.c("exo_redir", uri.toString());
            }
        }
        if (m()) {
            this.a.m(str, rzbVar);
        }
    }

    private final void f() {
        this.n = 0L;
        if (m()) {
            rzb rzbVar = new rzb(null);
            rzb.i(rzbVar, this.m);
            this.a.m(this.i.i, rzbVar);
        }
    }

    private final boolean k() {
        return this.k == this.b;
    }

    private final boolean l() {
        return !k();
    }

    private final boolean m() {
        return this.k == this.c;
    }

    @Override // defpackage.ate
    public final Map a() {
        return l() ? this.d.a() : Collections.emptyMap();
    }

    @Override // defpackage.ate
    public final void b(att attVar) {
        this.b.b(attVar);
        this.d.b(attVar);
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.n == 0) {
            return -1;
        }
        try {
            if (this.m >= this.s) {
                e(true);
            }
            int g = this.k.g(bArr, i, i2);
            if (g == -1) {
                if (l()) {
                    long j = this.j.h;
                    if (j == -1 || this.l < j) {
                        f();
                    }
                }
                long j2 = this.n;
                if (j2 <= 0) {
                    if (j2 == -1) {
                    }
                }
                c();
                e(false);
                return g(bArr, i, i2);
            }
            if (k()) {
                this.r += g;
            }
            long j3 = g;
            this.m += j3;
            this.l += j3;
            long j4 = this.n;
            if (j4 != -1) {
                this.n = j4 - j3;
            }
            return g;
        } catch (IOException e) {
            if (this.j.h != -1 || !atf.ro(e)) {
                d(e);
                throw e;
            }
            f();
            return -1;
        } catch (Throwable th) {
            d(th);
            throw th;
        }
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        long K;
        afhd afhdVar;
        try {
            String str = athVar.i;
            if (str == null) {
                str = athVar.a.toString();
            }
            atg a = athVar.a();
            a.h = str;
            ath a2 = a.a();
            this.i = a2;
            phg phgVar = this.a;
            Uri uri = a2.a;
            phq d = phgVar.d(str);
            Uri uri2 = null;
            String str2 = ((phr) d).b.containsKey("exo_redir") ? new String((byte[]) ((phr) d).b.get("exo_redir"), Charset.forName("UTF-8")) : null;
            if (str2 != null) {
                uri2 = Uri.parse(str2);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.h = uri;
            this.m = athVar.g;
            boolean z = true;
            int i = (this.g && this.p) ? 0 : athVar.h == -1 ? 1 : -1;
            if (i == -1) {
                z = false;
            }
            this.q = z;
            if (z && (afhdVar = this.e) != null) {
                afhdVar.b(i);
            }
            if (this.q) {
                this.n = -1L;
                K = -1;
            } else {
                K = muf.K(this.a.d(str));
                this.n = K;
                if (K != -1) {
                    K -= athVar.g;
                    this.n = K;
                    if (K < 0) {
                        throw new atf(2008);
                    }
                }
            }
            long j = athVar.h;
            if (j != -1) {
                K = K == -1 ? j : Math.min(K, j);
                this.n = K;
            }
            if (K > 0 || K == -1) {
                e(false);
            }
            long j2 = athVar.h;
            return j2 != -1 ? j2 : this.n;
        } catch (Throwable th) {
            d(th);
            throw th;
        }
    }

    @Override // defpackage.ate
    public final Uri i() {
        return this.h;
    }

    @Override // defpackage.ate
    public final void j() {
        this.i = null;
        this.h = null;
        if (this.e != null && this.r > 0) {
            try {
                this.a.a();
            } catch (Exception e) {
                this.e.a(e);
            }
            this.e.c(this.r);
            this.r = 0L;
        }
        try {
            c();
        } catch (IOException e2) {
            d(e2);
            throw e2;
        }
    }
}
