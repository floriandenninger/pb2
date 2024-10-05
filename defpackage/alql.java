package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alql extends alsg {
    public final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public alql(int r7) {
        /*
            r6 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 0
            r0[r2] = r1
            java.util.Map r1 = defpackage.alrc.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L5c
            java.util.Map r1 = defpackage.alrc.b
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L1f
            goto L5c
        L1f:
            java.util.Map r1 = defpackage.alrc.a
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map r3 = defpackage.alrc.b
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 118
            int r3 = r3 + r4
            r5.<init>(r3)
            r5.append(r1)
            java.lang.String r1 = " (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#"
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = ")"
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            goto L5e
        L5c:
            java.lang.String r1 = ""
        L5e:
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "Split Install Error(%d): %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r6.<init>(r0)
            if (r7 == 0) goto L6f
            r6.a = r7
            return
        L6f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errorCode should not be 0."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alql.<init>(int):void");
    }
}
