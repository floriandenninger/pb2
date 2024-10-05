package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bia {
    public final bhu a;
    protected final bhz b;
    protected bhw c;
    private final int d;

    public bia(bhx bhxVar, bhz bhzVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = bhzVar;
        this.d = i;
        this.a = new bhu(bhxVar, j, j2, j3, j4, j5);
    }

    protected static final boolean d(bii biiVar, long j) {
        long j2 = j - ((bid) biiVar).c;
        if (j2 < 0 || j2 > 262144) {
            return false;
        }
        biiVar.m((int) j2);
        return true;
    }

    public static int e(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    protected static final int g(bii biiVar, long j, tfq tfqVar) {
        if (j == ((bid) biiVar).c) {
            return 0;
        }
        tfqVar.a = j;
        return 1;
    }

    public final void a(long j) {
        bhw bhwVar = this.c;
        if (bhwVar == null || bhwVar.a != j) {
            long a = this.a.a.a(j);
            bhu bhuVar = this.a;
            this.c = new bhw(j, a, bhuVar.b, bhuVar.c, bhuVar.d, bhuVar.e);
        }
    }

    public final boolean b() {
        return this.c != null;
    }

    protected final void c() {
        this.c = null;
        this.b.b();
    }

    public final int f(bii biiVar, tfq tfqVar) {
        while (true) {
            bhw bhwVar = this.c;
            pse.d(bhwVar);
            long j = bhwVar.e;
            long j2 = bhwVar.f;
            long j3 = bhwVar.g;
            if (j2 - j > this.d) {
                if (d(biiVar, j3)) {
                    biiVar.l();
                    bhy a = this.b.a(biiVar, bhwVar.b);
                    int i = a.b;
                    if (i == -3) {
                        c();
                        return g(biiVar, j3, tfqVar);
                    }
                    if (i == -2) {
                        long j4 = a.c;
                        long j5 = a.d;
                        bhwVar.c = j4;
                        bhwVar.e = j5;
                        bhwVar.b();
                    } else if (i == -1) {
                        long j6 = a.c;
                        long j7 = a.d;
                        bhwVar.d = j6;
                        bhwVar.f = j7;
                        bhwVar.b();
                    } else {
                        d(biiVar, a.d);
                        c();
                        return g(biiVar, a.d, tfqVar);
                    }
                } else {
                    return g(biiVar, j3, tfqVar);
                }
            } else {
                c();
                return g(biiVar, j, tfqVar);
            }
        }
    }
}
