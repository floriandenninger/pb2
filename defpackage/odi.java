package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class odi implements zdg {
    public int a;
    public int b;
    public boolean c;
    private float d;
    private float e;

    @Override // defpackage.zdg
    public final void c() {
        this.c = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r4 != 3) goto L21;
     */
    @Override // defpackage.zdg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            int r4 = r5.getPointerCount()
            r0 = 1
            r1 = 0
            if (r4 <= r0) goto Lb
            r3.c = r1
            return r1
        Lb:
            int r4 = r5.getAction()
            if (r4 == 0) goto L3e
            if (r4 == r0) goto L3b
            r2 = 2
            if (r4 == r2) goto L1a
            r5 = 3
            if (r4 == r5) goto L3b
            goto L4a
        L1a:
            float r4 = r5.getX()
            float r2 = r3.d
            float r4 = r4 - r2
            float r4 = java.lang.Math.abs(r4)
            float r5 = r5.getY()
            float r2 = r3.e
            float r5 = r5 - r2
            float r5 = java.lang.Math.abs(r5)
            boolean r2 = r3.c
            if (r2 != 0) goto L4a
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L4a
            r3.c = r0
            goto L4a
        L3b:
            r3.c = r1
            goto L4a
        L3e:
            float r4 = r5.getX()
            r3.d = r4
            float r4 = r5.getY()
            r3.e = r4
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.odi.d(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // defpackage.zdg
    public final boolean nq() {
        return true;
    }
}
