package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmf implements bly {
    private final bmt a;
    private long e;
    private String g;
    private bjc h;
    private bme i;
    private boolean j;
    private boolean l;
    private final boolean[] f = new boolean[3];
    private final bml b = new bml(7);
    private final bml c = new bml(8);
    private final bml d = new bml(6);
    private long k = -9223372036854775807L;
    private final pth m = new pth();

    public bmf(bmt bmtVar) {
        this.a = bmtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0159  */
    @Override // defpackage.bly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.pth r26) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmf.a(pth):void");
    }

    @Override // defpackage.bly
    public final void b(bik bikVar, bmz bmzVar) {
        bmzVar.c();
        this.g = bmzVar.b();
        this.h = bikVar.n(bmzVar.a(), 2);
        this.i = new bme(this.h);
        this.a.b(bikVar, bmzVar);
    }

    @Override // defpackage.bly
    public final void c() {
    }

    @Override // defpackage.bly
    public final void d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
        this.l |= (i & 2) != 0;
    }

    @Override // defpackage.bly
    public final void e() {
        this.e = 0L;
        this.l = false;
        this.k = -9223372036854775807L;
        ptb.d(this.f);
        this.b.b();
        this.c.b();
        this.d.b();
        bme bmeVar = this.i;
        if (bmeVar != null) {
            bmeVar.b();
        }
    }

    private final void f(byte[] bArr, int i, int i2) {
        if (this.j) {
            boolean z = this.i.c;
        } else {
            this.b.a(bArr, i, i2);
            this.c.a(bArr, i, i2);
        }
        this.d.a(bArr, i, i2);
        boolean z2 = this.i.g;
    }
}
