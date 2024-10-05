package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bke implements bih {
    public boolean a;
    private final pth b;
    private final biv c;
    private final bir d;
    private final bit e;
    private final bjc f;
    private bik g;
    private bjc h;
    private bjc i;
    private int j;
    private Metadata k;
    private long l;
    private long m;
    private long n;
    private int o;
    private bkf p;

    public bke() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int a(defpackage.bii r40) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bke.a(bii):int");
    }

    private final long b(long j) {
        return this.l + ((j * 1000000) / this.c.d);
    }

    private static boolean c(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean i(bii biiVar) {
        bkf bkfVar = this.p;
        if (bkfVar != null) {
            long e = bkfVar.e();
            if (e != -1 && biiVar.d() > e - 4) {
                return true;
            }
        }
        try {
            return !biiVar.o(this.b.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean j(bii biiVar, boolean z) {
        int i;
        int i2;
        int a;
        int i3 = true != z ? 131072 : 32768;
        biiVar.l();
        if (((bid) biiVar).c == 0) {
            Metadata a2 = this.e.a(biiVar, null);
            this.k = a2;
            if (a2 != null) {
                this.d.b(a2);
            }
            i2 = (int) biiVar.d();
            if (!z) {
                biiVar.m(i2);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!i(biiVar)) {
                this.b.G(0);
                int d = this.b.d();
                if ((i == 0 || c(d, i)) && (a = biw.a(d)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.c.a(d);
                        i = d;
                    }
                    biiVar.f(a - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        throw pnr.a("Searched too many bytes.", null);
                    }
                    if (z) {
                        biiVar.l();
                        biiVar.f(i2 + i6);
                    } else {
                        biiVar.m(1);
                    }
                    i5 = i6;
                    i = 0;
                    i4 = 0;
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            biiVar.m(i2 + i5);
        } else {
            biiVar.l();
        }
        this.j = i;
        return true;
    }

    private final bkf k(bii biiVar) {
        biiVar.j(this.b.a, 0, 4);
        this.b.G(0);
        this.c.a(this.b.d());
        bid bidVar = (bid) biiVar;
        long j = bidVar.b;
        long j2 = bidVar.c;
        biv bivVar = this.c;
        return new bic(j, j2, bivVar.f, bivVar.c);
    }

    @Override // defpackage.bih
    public final void d(bik bikVar) {
        this.g = bikVar;
        bjc n = bikVar.n(0, 1);
        this.h = n;
        this.i = n;
        this.g.q();
    }

    @Override // defpackage.bih
    public final void e() {
    }

    @Override // defpackage.bih
    public final void f(long j, long j2) {
        this.j = 0;
        this.l = -9223372036854775807L;
        this.m = 0L;
        this.o = 0;
        bkf bkfVar = this.p;
        if (bkfVar instanceof bkc) {
            throw null;
        }
    }

    @Override // defpackage.bih
    public final boolean g(bii biiVar) {
        return j(biiVar, true);
    }

    @Override // defpackage.bih
    public final int h(bii biiVar, tfq tfqVar) {
        pse.d(this.h);
        int i = pts.a;
        int a = a(biiVar);
        if (a == -1 && (this.p instanceof bkc)) {
            if (this.p.a() != b(this.m)) {
                throw null;
            }
        }
        return a;
    }

    public bke(byte[] bArr) {
        this.b = new pth(10);
        this.c = new biv();
        this.d = new bir();
        this.l = -9223372036854775807L;
        this.e = new bit();
        big bigVar = new big();
        this.f = bigVar;
        this.i = bigVar;
    }
}
