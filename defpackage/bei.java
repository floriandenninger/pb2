package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bei implements Comparable {
    public final boolean a;
    private final bee b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final int f;
    private final int g;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (r10 >= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
    
        if (r10 >= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (r10 >= 0.0f) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
    
        if (r10 >= 0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bei(defpackage.pms r7, defpackage.bee r8, int r9, boolean r10) {
        /*
            r6 = this;
            r6.<init>()
            r6.b = r8
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1
            r2 = -1
            r3 = 0
            if (r10 == 0) goto L33
            int r4 = r7.s
            if (r4 == r2) goto L14
            int r5 = r8.a
            if (r4 > r5) goto L33
        L14:
            int r4 = r7.t
            if (r4 == r2) goto L1c
            int r5 = r8.b
            if (r4 > r5) goto L33
        L1c:
            float r4 = r7.u
            int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r5 == 0) goto L29
            int r5 = r8.c
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L33
        L29:
            int r4 = r7.j
            if (r4 == r2) goto L31
            int r5 = r8.d
            if (r4 > r5) goto L33
        L31:
            r4 = 1
            goto L34
        L33:
            r4 = 0
        L34:
            r6.a = r4
            if (r10 == 0) goto L5e
            int r10 = r7.s
            if (r10 == r2) goto L40
            int r4 = r8.e
            if (r10 < 0) goto L5e
        L40:
            int r10 = r7.t
            if (r10 == r2) goto L48
            int r4 = r8.f
            if (r10 < 0) goto L5e
        L48:
            float r10 = r7.u
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 == 0) goto L55
            int r0 = r8.g
            r0 = 0
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5e
        L55:
            int r10 = r7.j
            if (r10 == r2) goto L5f
            int r0 = r8.h
            if (r10 < 0) goto L5e
            goto L5f
        L5e:
            r1 = 0
        L5f:
            r6.c = r1
            boolean r9 = defpackage.bej.e(r9, r3)
            r6.d = r9
            int r9 = r7.j
            r6.e = r9
            int r9 = r7.a()
            r6.f = r9
        L71:
            amru r9 = r8.l
            r10 = r9
            amvj r10 = (defpackage.amvj) r10
            int r10 = r10.c
            if (r3 >= r10) goto L8c
            java.lang.String r10 = r7.n
            if (r10 == 0) goto L89
            java.lang.Object r9 = r9.get(r3)
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L89
            goto L8f
        L89:
            int r3 = r3 + 1
            goto L71
        L8c:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L8f:
            r6.g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bei.<init>(pms, bee, int, boolean):void");
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(bei beiVar) {
        amvd a = (this.a && this.d) ? bej.a : bej.a.a();
        amqd d = amqd.b.e(this.d, beiVar.d).e(this.a, beiVar.a).e(this.c, beiVar.c).d(Integer.valueOf(this.g), Integer.valueOf(beiVar.g), amvu.a);
        Integer valueOf = Integer.valueOf(this.e);
        Integer valueOf2 = Integer.valueOf(beiVar.e);
        boolean z = this.b.u;
        return d.d(valueOf, valueOf2, bej.b).d(Integer.valueOf(this.f), Integer.valueOf(beiVar.f), a).d(Integer.valueOf(this.e), Integer.valueOf(beiVar.e), a).a();
    }
}
