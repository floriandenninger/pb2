package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aylm implements Closeable, aygr {
    public aylj a;
    public int b;
    public ayak c;
    public long e;
    private final ayoa g;
    private final ayoj h;
    private boolean j;
    private aygn k;
    private int n;
    private int p = 1;
    private int i = 5;
    public aygn d = new aygn();
    private boolean l = false;
    private int m = -1;
    public boolean f = false;
    private volatile boolean o = false;

    public aylm(aylj ayljVar, ayak ayakVar, int i, ayoa ayoaVar, ayoj ayojVar) {
        this.a = ayljVar;
        this.c = ayakVar;
        this.b = i;
        this.g = ayoaVar;
        this.h = ayojVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01ad, code lost:
    
        if (r12.f == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01b3, code lost:
    
        if (c() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01b5, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01ba, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        if (r3 <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
    
        r12.a.j(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0062, code lost:
    
        if (r12.p != 2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        r12.g.g(r3);
        r12.n += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
    
        r3 = r12.p;
        r4 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0074, code lost:
    
        if (r3 == 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0076, code lost:
    
        if (r4 == 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010a, code lost:
    
        r3 = r12.k.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0112, code lost:
    
        if ((r3 & 254) != 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0116, code lost:
    
        if (1 == (r3 & 1)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0118, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011b, code lost:
    
        r12.j = r3;
        r3 = r12.k;
        r3.a(4);
        r3 = r3.e() | (((r3.e() << 24) | (r3.e() << 16)) | (r3.e() << 8));
        r12.i = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013e, code lost:
    
        if (r3 < 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0142, code lost:
    
        if (r3 > r12.b) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0144, code lost:
    
        r3 = r12.m + 1;
        r12.m = r3;
        r12.g.d(r3);
        r3 = r12.h;
        r3.e.a();
        r3.f = r3.b.a();
        r12.p = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0183, code lost:
    
        throw io.grpc.Status.j.withDescription(java.lang.String.format("gRPC message exceeds maximum size %d: %d", java.lang.Integer.valueOf(r12.b), java.lang.Integer.valueOf(r12.i))).d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0190, code lost:
    
        throw io.grpc.Status.n.withDescription("gRPC frame header malformed: reserved bits not zero").d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0078, code lost:
    
        if (r4 == 1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x009e, code lost:
    
        r12.g.e(r12.m, r12.n, -1);
        r12.n = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ae, code lost:
    
        if (r12.j == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b4, code lost:
    
        if (r12.c == defpackage.ayaa.a) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b6, code lost:
    
        r3 = new defpackage.ayll(r12.c.a(defpackage.aymf.c(r12.k)), r12.b, r12.g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f0, code lost:
    
        r12.k = null;
        r12.a.a(new defpackage.aylk(r3));
        r12.p = 1;
        r12.i = 5;
        r12.e--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00cc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d2, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00df, code lost:
    
        throw io.grpc.Status.n.withDescription("Can't decode compressed gRPC message as compression not configured").d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e0, code lost:
    
        r12.g.f(r12.k.a);
        r3 = defpackage.aymf.c(r12.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x007c, code lost:
    
        if (r3 == 1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x007e, code lost:
    
        r0 = "BODY";
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0083, code lost:
    
        r4 = new java.lang.StringBuilder(r0.length() + 15);
        r4.append("Invalid state: ");
        r4.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x009d, code lost:
    
        throw new java.lang.AssertionError(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0081, code lost:
    
        r0 = "HEADER";
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0191, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aylm.a():void");
    }

    public final boolean b() {
        return this.d == null;
    }

    public final boolean c() {
        return this.d.a == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, defpackage.aygr
    public final void close() {
        if (b()) {
            return;
        }
        aygn aygnVar = this.k;
        boolean z = false;
        if (aygnVar != null && aygnVar.a > 0) {
            z = true;
        }
        try {
            aygn aygnVar2 = this.d;
            if (aygnVar2 != null) {
                aygnVar2.close();
            }
            aygn aygnVar3 = this.k;
            if (aygnVar3 != null) {
                aygnVar3.close();
            }
            this.d = null;
            this.k = null;
            this.a.e(z);
        } catch (Throwable th) {
            this.d = null;
            this.k = null;
            throw th;
        }
    }
}
