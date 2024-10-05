package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azyu implements azyy {
    private final azty a;

    public azyu() {
    }

    public azyu(azty aztyVar) {
        this.a = aztyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.azyy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.azyz r6, defpackage.azsq r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.azyt
            if (r0 == 0) goto L13
            r0 = r7
            azyt r0 = (defpackage.azyt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            azyt r0 = new azyt
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            azsx r1 = defpackage.azsx.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.a
            defpackage.aype.m(r7)     // Catch: java.lang.Throwable -> L29
            goto L52
        L29:
            r7 = move-exception
            goto L5f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.aype.m(r7)
            azzf r7 = new azzf
            azsv r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.a = r7     // Catch: java.lang.Throwable -> L5b
            r0.d = r3     // Catch: java.lang.Throwable -> L5b
            azty r6 = r5.a     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch: java.lang.Throwable -> L5b
            azsx r0 = defpackage.azsx.COROUTINE_SUSPENDED     // Catch: java.lang.Throwable -> L5b
            if (r6 == r0) goto L4f
            azsf r6 = defpackage.azsf.a     // Catch: java.lang.Throwable -> L5b
        L4f:
            if (r6 == r1) goto L5a
            r6 = r7
        L52:
            azzf r6 = (defpackage.azzf) r6
            r6.releaseIntercepted()
            azsf r6 = defpackage.azsf.a
            return r6
        L5a:
            return r1
        L5b:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L5f:
            azzf r6 = (defpackage.azzf) r6
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azyu.a(azyz, azsq):java.lang.Object");
    }
}
