package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmd implements bly {
    private static final float[] a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final bnb b;
    private final pth c;
    private final boolean[] d;
    private final bmb e;
    private final bml f;
    private bmc g;
    private long h;
    private String i;
    private bjc j;
    private boolean k;
    private long l;

    public bmd() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013f  */
    @Override // defpackage.bly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.pth r26) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmd.a(pth):void");
    }

    @Override // defpackage.bly
    public final void b(bik bikVar, bmz bmzVar) {
        bmzVar.c();
        this.i = bmzVar.b();
        this.j = bikVar.n(bmzVar.a(), 2);
        this.g = new bmc(this.j);
        this.b.b(bikVar, bmzVar);
    }

    @Override // defpackage.bly
    public final void c() {
    }

    @Override // defpackage.bly
    public final void d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // defpackage.bly
    public final void e() {
        ptb.d(this.d);
        this.e.b();
        bmc bmcVar = this.g;
        if (bmcVar != null) {
            bmcVar.b = false;
            bmcVar.c = false;
            bmcVar.d = false;
            bmcVar.e = -1;
        }
        this.f.b();
        this.h = 0L;
        this.l = -9223372036854775807L;
    }

    public bmd(bnb bnbVar) {
        this.b = bnbVar;
        this.d = new boolean[4];
        this.e = new bmb();
        this.l = -9223372036854775807L;
        this.f = new bml(178);
        this.c = new pth();
    }
}
