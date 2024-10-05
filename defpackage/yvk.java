package defpackage;

import org.chromium.net.NetworkException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yvk extends NetworkException {
    private final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yvk(int r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Connection timeout out"
            r0.<init>(r1)
            r1 = 6
            if (r3 != r1) goto L10
            java.lang.String r1 = ": connection timeout"
            r0.append(r1)
            goto L18
        L10:
            r1 = 4
            if (r3 != r1) goto L18
            java.lang.String r1 = ": read timeout"
            r0.append(r1)
        L18:
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2.<init>(r0, r1)
            r2.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvk.<init>(int):void");
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return -1;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.a;
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return true;
    }
}
