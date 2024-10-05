package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nxn implements nxm {
    private final nwy a;
    private final nvz b;

    public nxn(nwy nwyVar, nvz nvzVar) {
        this.a = nwyVar;
        this.b = nvzVar;
    }

    private static nxh e(int i, int i2, int i3, nxh nxhVar) {
        return i3 < i / 2 ? nxhVar : i3 > (i2 + i) / 2 ? nxh.HIDDEN : nxh.EXPANDED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 < r0) goto L13;
     */
    @Override // defpackage.nxm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nxh a(defpackage.nxu r6, int r7) {
        /*
            r5 = this;
            nvz r0 = r5.b
            boolean r0 = r0.e()
            nvz r1 = r5.b
            amsx r1 = r1.a()
            ammv r0 = r5.d(r0, r1)
            boolean r1 = r0.h()
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r0.c()
            nxh r4 = defpackage.nxh.FULL_BLEED
            if (r1 != r4) goto L42
            nwy r0 = r5.a
            int r0 = r0.a()
            nxu r1 = defpackage.nxu.NO_FLING
            int r1 = r6.ordinal()
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L35
        L32:
            nxh r6 = defpackage.nxh.HIDDEN
            goto L41
        L35:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>(r6)
            throw r7
        L3b:
            nxh r6 = defpackage.nxh.FULL_BLEED
            goto L41
        L3e:
            if (r7 >= r0) goto L32
            goto L3b
        L41:
            return r6
        L42:
            java.lang.Object r0 = r0.c()
            nxh r1 = defpackage.nxh.EXPANDED
            if (r0 != r1) goto L7a
            nwy r0 = r5.a
            int r0 = r0.a()
            nwy r1 = r5.a
            android.graphics.Rect r1 = r1.b()
            nxu r4 = defpackage.nxu.NO_FLING
            int r4 = r6.ordinal()
            if (r4 == 0) goto L71
            if (r4 == r3) goto L6e
            if (r4 != r2) goto L68
            if (r7 >= r0) goto L65
            goto L6e
        L65:
            nxh r6 = defpackage.nxh.HIDDEN
            goto L79
        L68:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>(r6)
            throw r7
        L6e:
            nxh r6 = defpackage.nxh.EXPANDED
            goto L79
        L71:
            int r6 = r1.bottom
            nxh r1 = defpackage.nxh.EXPANDED
            nxh r6 = e(r0, r6, r7, r1)
        L79:
            return r6
        L7a:
            nwy r0 = r5.a
            int r0 = r0.a()
            nwy r1 = r5.a
            android.graphics.Rect r1 = r1.b()
            nxu r4 = defpackage.nxu.NO_FLING
            nxh r4 = defpackage.nxh.FULL_BLEED
            int r4 = r6.ordinal()
            if (r4 == 0) goto La8
            if (r4 == r3) goto La0
            if (r4 != r2) goto L9a
            if (r7 >= r0) goto L97
            goto La5
        L97:
            nxh r6 = defpackage.nxh.HIDDEN
            goto Lb0
        L9a:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>(r6)
            throw r7
        La0:
            if (r7 >= r0) goto La5
            nxh r6 = defpackage.nxh.FULL_BLEED
            goto Lb0
        La5:
            nxh r6 = defpackage.nxh.EXPANDED
            goto Lb0
        La8:
            int r6 = r1.bottom
            nxh r1 = defpackage.nxh.FULL_BLEED
            nxh r6 = e(r0, r6, r7, r1)
        Lb0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxn.a(nxu, int):nxh");
    }

    @Override // defpackage.nxm
    public final nxh b(boolean z, amsx amsxVar) {
        return (nxh) d(z, amsxVar).e(nxh.EXPANDED);
    }

    @Override // defpackage.nxm
    public final nxh c(nxh nxhVar) {
        if (nxhVar != nxh.HIDDEN) {
            ammv d = d(this.b.e(), this.b.a());
            if (d.h()) {
                return (nxh) d.c();
            }
        }
        nxu nxuVar = nxu.NO_FLING;
        int ordinal = nxhVar.ordinal();
        if (ordinal == 0) {
            return nxh.EXPANDED;
        }
        if (ordinal == 1) {
            return nxh.FULL_BLEED;
        }
        if (ordinal == 2) {
            return nxh.HIDDEN;
        }
        throw new AssertionError(nxhVar);
    }

    @Override // defpackage.nxm
    public final ammv d(boolean z, amsx amsxVar) {
        if (!z) {
            return ammv.j(nxh.EXPANDED);
        }
        if (amsxVar.size() == 1) {
            if (amsxVar.contains(aqtl.ENGAGEMENT_PANEL_SNAP_STATE_FULL_BLEED)) {
                return ammv.j(nxh.FULL_BLEED);
            }
            if (amsxVar.contains(aqtl.ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_PLAYER)) {
                return ammv.j(nxh.EXPANDED);
            }
        }
        return amlr.a;
    }
}
