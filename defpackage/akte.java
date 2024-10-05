package defpackage;

import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akte implements Thread.UncaughtExceptionHandler {
    public final aktg a;
    public Thread.UncaughtExceptionHandler b;
    private final azrw c;

    public akte(aktg aktgVar, azrw azrwVar) {
        this.a = aktgVar;
        this.c = azrwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0208, code lost:
    
        if ((r0 & 2) != 0) goto L38;
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uncaughtException(java.lang.Thread r14, java.lang.Throwable r15) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akte.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
