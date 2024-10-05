package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bma implements bly {
    private static final double[] a = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String b;
    private bjc c;
    private final bnb d;
    private final pth e;
    private final bml f;
    private final boolean[] g;
    private final blz h;
    private long i;
    private boolean j;
    private boolean k;
    private long l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private boolean q;

    public bma() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f7  */
    @Override // defpackage.bly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.pth r22) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bma.a(pth):void");
    }

    @Override // defpackage.bly
    public final void b(bik bikVar, bmz bmzVar) {
        bmzVar.c();
        this.b = bmzVar.b();
        this.c = bikVar.n(bmzVar.a(), 2);
        bnb bnbVar = this.d;
        if (bnbVar != null) {
            bnbVar.b(bikVar, bmzVar);
        }
    }

    @Override // defpackage.bly
    public final void c() {
    }

    @Override // defpackage.bly
    public final void d(long j, int i) {
        this.m = j;
    }

    @Override // defpackage.bly
    public final void e() {
        ptb.d(this.g);
        blz blzVar = this.h;
        blzVar.b = false;
        blzVar.c = 0;
        blzVar.d = 0;
        bml bmlVar = this.f;
        if (bmlVar != null) {
            bmlVar.b();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    public bma(bnb bnbVar) {
        pth pthVar;
        this.d = bnbVar;
        this.g = new boolean[4];
        this.h = new blz();
        if (bnbVar != null) {
            this.f = new bml(178);
            pthVar = new pth();
        } else {
            pthVar = null;
            this.f = null;
        }
        this.e = pthVar;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }
}
