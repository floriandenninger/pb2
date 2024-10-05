package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhv extends RuntimeException {
    public dhv(dha dhaVar, Throwable th) {
        super(dhaVar.o());
        initCause(th);
        setStackTrace(new StackTraceElement[0]);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dhv(defpackage.dha r2, java.lang.Throwable r3, byte[] r4) {
        /*
            r1 = this;
            java.lang.String r2 = r2.o()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r4 = r4 + 42
            r0.<init>(r4)
            java.lang.String r4 = "Component root of the crashing hierarchy: "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            r1.initCause(r3)
            r2 = 0
            java.lang.StackTraceElement[] r2 = new java.lang.StackTraceElement[r2]
            r1.setStackTrace(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhv.<init>(dha, java.lang.Throwable, byte[]):void");
    }
}
