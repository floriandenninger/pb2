package defpackage;

import j$.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yvr extends yvo {
    private final yvo a;
    private final awyw b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0062. Please report as an issue. */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yvr(defpackage.yvo r10, defpackage.awyw r11) {
        /*
            r9 = this;
            java.lang.String r0 = r11.b
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            r7 = 2
            r8 = 5
            switch(r1) {
                case -531492226: goto L57;
                case 70454: goto L4d;
                case 79599: goto L43;
                case 2213344: goto L39;
                case 2461856: goto L2f;
                case 75900968: goto L25;
                case 80083237: goto L1b;
                case 2012838315: goto L11;
                default: goto L10;
            }
        L10:
            goto L61
        L11:
            java.lang.String r1 = "DELETE"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L61
            r1 = 3
            goto L62
        L1b:
            java.lang.String r1 = "TRACE"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L61
            r1 = 6
            goto L62
        L25:
            java.lang.String r1 = "PATCH"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L61
            r1 = 7
            goto L62
        L2f:
            java.lang.String r1 = "POST"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L61
            r1 = 1
            goto L62
        L39:
            java.lang.String r1 = "HEAD"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L61
            r1 = 4
            goto L62
        L43:
            java.lang.String r1 = "PUT"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L61
            r1 = 2
            goto L62
        L4d:
            java.lang.String r1 = "GET"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L61
            r1 = 0
            goto L62
        L57:
            java.lang.String r1 = "OPTIONS"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L61
            r1 = 5
            goto L62
        L61:
            r1 = -1
        L62:
            switch(r1) {
                case 0: goto L87;
                case 1: goto L85;
                case 2: goto L83;
                case 3: goto L81;
                case 4: goto L7f;
                case 5: goto L7d;
                case 6: goto L88;
                case 7: goto L78;
                default: goto L65;
            }
        L65:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "Unknown method "
            int r1 = r11.length()
            if (r1 == 0) goto L9a
            java.lang.String r11 = r0.concat(r11)
            goto L9f
        L78:
            r2 = 8
            r4 = 8
            goto L88
        L7d:
            r4 = 6
            goto L88
        L7f:
            r4 = 5
            goto L88
        L81:
            r4 = 4
            goto L88
        L83:
            r4 = 3
            goto L88
        L85:
            r4 = 2
            goto L88
        L87:
            r4 = 1
        L88:
            java.lang.String r5 = r11.c
            yvn r6 = r10.i()
            r7 = 0
            boolean r8 = r10.e
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r9.a = r10
            r9.b = r11
            return
        L9a:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0)
        L9f:
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvr.<init>(yvo, awyw):void");
    }

    @Override // defpackage.yvo
    public final /* bridge */ /* synthetic */ Map f() {
        return (amrz) Collection.EL.stream(this.b.d).collect(ampm.a(opb.j, opb.k));
    }

    @Override // defpackage.yvo
    public final String l() {
        return this.a.l();
    }

    @Override // defpackage.yvo
    public final void n() {
        this.a.n();
    }

    @Override // defpackage.yvo
    public final void o(cnq cnqVar) {
        throw new UnsupportedOperationException("deliverError isn't supported in RetryCompatibleRequest");
    }

    @Override // defpackage.yvo
    public final boolean q() {
        return this.a.q();
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        return this.a.qk(cnhVar);
    }

    @Override // defpackage.yvo
    public final void ql(Object obj) {
        throw new UnsupportedOperationException("deliverResponse isn't supported in RetryCompatibleRequest");
    }

    @Override // defpackage.yvo
    public final byte[] qm() {
        return this.b.e.I();
    }
}
