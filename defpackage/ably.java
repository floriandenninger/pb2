package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ably implements Runnable {
    final /* synthetic */ ablz a;

    public ably(ablz ablzVar) {
        this.a = ablzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            ablz r0 = r9.a
            boolean r0 = r0.g
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = java.lang.System.currentTimeMillis()
            ablz r2 = r9.a
            long r3 = r2.h
            r5 = 0
            r7 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L22
            long r5 = r2.i
            int r8 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r8 > 0) goto L1d
            goto L22
        L1d:
            long r5 = r5 - r0
            float r0 = (float) r5
            float r1 = (float) r3
            float r0 = r0 / r1
            goto L23
        L22:
            r0 = 0
        L23:
            android.graphics.drawable.ClipDrawable r1 = r2.e
            r2 = 1176256512(0x461c4000, float:10000.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            r1.setLevel(r2)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 <= 0) goto L3b
            ablz r0 = r9.a
            android.view.View r0 = r0.b
            r1 = 300(0x12c, double:1.48E-321)
            r0.postDelayed(r9, r1)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ably.run():void");
    }
}
