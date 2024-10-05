package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmh implements bly {
    private final bmt a;
    private String b;
    private bjc c;
    private bmg d;
    private boolean e;
    private long l;
    private final boolean[] f = new boolean[3];
    private final bml g = new bml(32);
    private final bml h = new bml(33);
    private final bml i = new bml(34);
    private final bml j = new bml(39);
    private final bml k = new bml(40);
    private long m = -9223372036854775807L;
    private final pth n = new pth();

    public bmh(bmt bmtVar) {
        this.a = bmtVar;
    }

    private final void f(byte[] bArr, int i, int i2) {
        bmg bmgVar = this.d;
        if (bmgVar.e) {
            int i3 = bmgVar.c;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                bmgVar.f = (bArr[i4] & 128) != 0;
                bmgVar.e = false;
            } else {
                bmgVar.c = i3 + (i2 - i);
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x040d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0167  */
    @Override // defpackage.bly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.pth r29) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmh.a(pth):void");
    }

    @Override // defpackage.bly
    public final void b(bik bikVar, bmz bmzVar) {
        bmzVar.c();
        this.b = bmzVar.b();
        this.c = bikVar.n(bmzVar.a(), 2);
        this.d = new bmg(this.c);
        this.a.b(bikVar, bmzVar);
    }

    @Override // defpackage.bly
    public final void c() {
    }

    @Override // defpackage.bly
    public final void d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
    }

    @Override // defpackage.bly
    public final void e() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        ptb.d(this.f);
        this.g.b();
        this.h.b();
        this.i.b();
        this.j.b();
        this.k.b();
        bmg bmgVar = this.d;
        if (bmgVar != null) {
            bmgVar.e = false;
            bmgVar.f = false;
            bmgVar.g = false;
            bmgVar.h = false;
            bmgVar.i = false;
        }
    }
}
