package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmj implements bly {
    private final String a;
    private final pth b;
    private final ptg c;
    private bjc d;
    private String e;
    private pms f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;
    private String u;

    public bmj(String str) {
        this.a = str;
        pth pthVar = new pth(1024);
        this.b = pthVar;
        this.c = new ptg(pthVar.a);
        this.k = -9223372036854775807L;
    }

    private final int f(ptg ptgVar) {
        int a = ptgVar.a();
        bagd b = bhq.b(ptgVar, true);
        this.u = b.a;
        this.r = b.b;
        this.t = b.c;
        return a - ptgVar.a();
    }

    private static long g(ptg ptgVar) {
        return ptgVar.d((ptgVar.d(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x014d, code lost:
    
        if (r14.l == false) goto L88;
     */
    @Override // defpackage.bly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.pth r15) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmj.a(pth):void");
    }

    @Override // defpackage.bly
    public final void b(bik bikVar, bmz bmzVar) {
        bmzVar.c();
        this.d = bikVar.n(bmzVar.a(), 1);
        this.e = bmzVar.b();
    }

    @Override // defpackage.bly
    public final void c() {
    }

    @Override // defpackage.bly
    public final void d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // defpackage.bly
    public final void e() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }
}
