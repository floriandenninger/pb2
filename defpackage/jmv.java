package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jmv implements amml {
    public final /* synthetic */ Optional a;
    private final /* synthetic */ int b;

    public /* synthetic */ jmv(Optional optional, int i) {
        this.b = i;
        this.a = optional;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
    
        if (r0 < r3.d) goto L45;
     */
    @Override // defpackage.amml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object apply(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.b
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L40
            if (r0 == r2) goto L31
            j$.util.Optional r0 = r8.a
            awvj r9 = (defpackage.awvj) r9
            java.lang.String r2 = defpackage.adtk.a
            aone r9 = r9.toBuilder()
            java.lang.Object r0 = r0.get()
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r9.copyOnWrite()
            aonm r0 = r9.instance
            awvj r0 = (defpackage.awvj) r0
            int r4 = r0.b
            r1 = r1 | r4
            r0.b = r1
            r0.d = r2
            aonm r9 = r9.build()
            awvj r9 = (defpackage.awvj) r9
            return r9
        L31:
            j$.util.Optional r0 = r8.a
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            int r1 = defpackage.gqw.e
            boolean r9 = r9.booleanValue()
            gqv r9 = defpackage.gqv.a(r0, r9)
            return r9
        L40:
            j$.util.Optional r0 = r8.a
            jps r9 = (defpackage.jps) r9
            jps r3 = defpackage.jps.PLAYABLE
            r4 = 0
            if (r9 == r3) goto Lb4
            boolean r9 = r9.p
            if (r9 != 0) goto Lb3
            boolean r9 = r0.isPresent()
            if (r9 != 0) goto L55
            goto Lb3
        L55:
            java.lang.Object r9 = r0.get()
            atxb r9 = (defpackage.atxb) r9
            avjs r9 = r9.g()
            if (r9 == 0) goto L66
            java.util.List r9 = r9.getStreamProgress()
            goto L6a
        L66:
            amru r9 = defpackage.amru.q()
        L6a:
            java.util.Iterator r9 = r9.iterator()
            r0 = 0
            r3 = r0
        L70:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L98
            java.lang.Object r5 = r9.next()
            auyr r5 = (defpackage.auyr) r5
            int r6 = r5.e
            int r6 = defpackage.aobq.bc(r6)
            if (r6 != 0) goto L85
            goto L89
        L85:
            if (r6 != r1) goto L89
            r0 = r5
            goto L70
        L89:
            int r6 = r5.e
            int r6 = defpackage.aobq.bc(r6)
            if (r6 != 0) goto L92
            goto L70
        L92:
            r7 = 3
            if (r6 == r7) goto L96
            goto L70
        L96:
            r3 = r5
            goto L70
        L98:
            if (r0 == 0) goto Lb3
            if (r3 == 0) goto Lb3
            long r5 = r0.c
            long r0 = r0.d
            int r9 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r9 != 0) goto Lb3
            long r0 = r3.c
            r5 = 0
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 <= 0) goto Lb3
            long r5 = r3.d
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 >= 0) goto Lb3
            goto Lb4
        Lb3:
            r2 = 0
        Lb4:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmv.apply(java.lang.Object):java.lang.Object");
    }
}
