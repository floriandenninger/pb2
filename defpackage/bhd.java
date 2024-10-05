package defpackage;

import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhd {
    public final bgr a = new bgr();
    public final bgz b;
    public final bhc c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public int h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    private float p;
    private float q;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bhd(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            bgr r0 = new bgr
            r0.<init>()
            r3.a = r0
            r0 = 0
            if (r4 == 0) goto L38
            android.content.Context r4 = r4.getApplicationContext()
            int r1 = defpackage.pts.a
            int r1 = defpackage.bhb.a
            java.lang.String r1 = "display"
            java.lang.Object r1 = r4.getSystemService(r1)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            if (r1 == 0) goto L25
            bhb r2 = new bhb
            r2.<init>(r1)
            goto L26
        L25:
            r2 = r0
        L26:
            if (r2 != 0) goto L39
            java.lang.String r1 = "window"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 == 0) goto L38
            bha r2 = new bha
            r2.<init>(r4)
            goto L39
        L38:
            r2 = r0
        L39:
            r3.b = r2
            if (r2 == 0) goto L3f
            bhc r0 = defpackage.bhc.a
        L3f:
            r3.c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.i = r0
            r3.j = r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.f = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.g = r4
            r4 = 0
            r3.h = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhd.<init>(android.content.Context):void");
    }

    public final void a() {
        Surface surface;
        if (pts.a < 30 || (surface = this.e) == null || this.h == Integer.MIN_VALUE || this.q == 0.0f) {
            return;
        }
        this.q = 0.0f;
        bgy.a(surface, 0.0f);
    }

    public final void b() {
        this.k = 0L;
        this.n = -1L;
        this.l = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (java.lang.Math.abs(r0 - r10.p) >= r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        if (r4 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        if (r10.a.e >= 30) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r10 = this;
            int r0 = defpackage.pts.a
            r1 = 30
            if (r0 < r1) goto L90
            android.view.Surface r0 = r10.e
            if (r0 != 0) goto Lc
            goto L90
        Lc:
            bgr r0 = r10.a
            boolean r0 = r0.a()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L33
            bgr r0 = r10.a
            boolean r3 = r0.a()
            if (r3 == 0) goto L30
            r3 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            bgq r0 = r0.a
            long r5 = r0.b()
            double r5 = (double) r5
            java.lang.Double.isNaN(r5)
            double r3 = r3 / r5
            float r0 = (float) r3
            goto L35
        L30:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L35
        L33:
            float r0 = r10.f
        L35:
            float r3 = r10.p
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 != 0) goto L3c
            return
        L3c:
            r4 = 1
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L7b
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L7b
            bgr r1 = r10.a
            boolean r1 = r1.a()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L6e
            bgr r1 = r10.a
            boolean r3 = r1.a()
            if (r3 == 0) goto L5d
            bgq r1 = r1.a
            long r6 = r1.b
            goto L62
        L5d:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L62:
            r8 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L6e
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L6e:
            float r1 = r10.p
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L86
            goto L87
        L7b:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L8b
            bgr r2 = r10.a
            int r2 = r2.e
            if (r2 < r1) goto L86
            goto L87
        L86:
            r4 = 0
        L87:
            if (r4 == 0) goto L8a
            goto L8b
        L8a:
            return
        L8b:
            r10.p = r0
            r10.d(r5)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhd.c():void");
    }

    public final void d(boolean z) {
        Surface surface;
        if (pts.a < 30 || (surface = this.e) == null || this.h == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.d) {
            float f2 = this.p;
            if (f2 != -1.0f) {
                f = this.g * f2;
            }
        }
        if (z || this.q != f) {
            this.q = f;
            bgy.a(surface, f);
        }
    }
}
