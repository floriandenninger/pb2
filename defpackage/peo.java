package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class peo extends pei {
    private boolean a;
    private final pev c;
    private final boolean[] d;
    private final per e;
    private final per f;
    private final per g;
    private final per h;
    private final per i;
    private final pen j;
    private long k;
    private long l;
    private final pgx m;

    public peo(pcn pcnVar, pev pevVar) {
        super(pcnVar);
        this.c = pevVar;
        this.d = new boolean[3];
        this.e = new per(32);
        this.f = new per(33);
        this.g = new per(34);
        this.h = new per(39);
        this.i = new per(40);
        this.j = new pen(pcnVar);
        this.m = new pgx();
    }

    private final void e(byte[] bArr, int i, int i2) {
        if (this.a) {
            pen penVar = this.j;
            if (penVar.e) {
                int i3 = penVar.c;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    penVar.f = (bArr[i4] & 128) != 0;
                    penVar.e = false;
                } else {
                    penVar.c = i3 + (i2 - i);
                }
            }
        } else {
            this.e.a(bArr, i, i2);
            this.f.a(bArr, i, i2);
            this.g.a(bArr, i, i2);
        }
        this.h.a(bArr, i, i2);
        this.i.a(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0168  */
    @Override // defpackage.pei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.pgx r32) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.peo.a(pgx):void");
    }

    @Override // defpackage.pei
    public final void b() {
    }

    @Override // defpackage.pei
    public final void c(long j, boolean z) {
        this.l = j;
    }

    @Override // defpackage.pei
    public final void d() {
        pgv.d(this.d);
        this.e.b();
        this.f.b();
        this.g.b();
        this.h.b();
        this.i.b();
        pen penVar = this.j;
        penVar.e = false;
        penVar.f = false;
        penVar.g = false;
        penVar.h = false;
        penVar.i = false;
        this.k = 0L;
    }
}
