package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hin extends beq {
    private final hir a;

    public hin(hir hirVar) {
        this.a = hirVar;
    }

    @Override // defpackage.beq
    public final void g(Object obj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0069, code lost:
    
        if (r0 == 0) goto L33;
     */
    @Override // defpackage.beq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ber h(defpackage.pof[] r11, defpackage.asj r12, defpackage.ash r13, defpackage.pou r14) {
        /*
            r10 = this;
            int r13 = r11.length
            bel[] r14 = new defpackage.bel[r13]
            pog[] r13 = new defpackage.pog[r13]
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        Lc:
            int r3 = r12.b
            r4 = 2
            r5 = 1
            if (r2 >= r3) goto L4f
            asi r3 = r12.b(r2)
            pms r6 = r3.a(r1)
            java.lang.String r7 = r6.n
            int r7 = defpackage.psz.b(r7)
            if (r7 == r5) goto L25
            if (r7 == r4) goto L25
            goto L4c
        L25:
            r4 = 0
        L26:
            int r8 = r11.length
            if (r4 >= r8) goto L4c
            r8 = r11[r4]     // Catch: defpackage.plp -> L49
            int r8 = r8.a(r6)     // Catch: defpackage.plp -> L49
            r8 = r8 & 7
            r9 = 4
            if (r8 != r9) goto L49
            r8 = r14[r4]     // Catch: defpackage.plp -> L49
            if (r8 != 0) goto L49
            bem r8 = new bem     // Catch: defpackage.plp -> L49
            r8.<init>(r3)     // Catch: defpackage.plp -> L49
            r14[r4] = r8     // Catch: defpackage.plp -> L49
            pog r8 = defpackage.pog.a     // Catch: defpackage.plp -> L49
            r13[r4] = r8     // Catch: defpackage.plp -> L49
            if (r7 != r5) goto L4c
            r0.add(r6)     // Catch: defpackage.plp -> L49
            goto L4c
        L49:
            int r4 = r4 + 1
            goto L26
        L4c:
            int r2 = r2 + 1
            goto Lc
        L4f:
            hir r11 = r10.a
            pms[] r12 = new defpackage.pms[r1]
            java.lang.Object[] r12 = r0.toArray(r12)
            pms[] r12 = (defpackage.pms[]) r12
            int r0 = r12.length
            r11.f = r0
            if (r0 <= r4) goto L69
            java.lang.String r2 = "More than two tracks supplied to AudioMixAudioProcessor"
            defpackage.zga.b(r2)
            r3 = 24
            defpackage.afsi.b(r5, r3, r2)
            goto L6c
        L69:
            if (r0 != 0) goto L6c
            goto L81
        L6c:
            r2 = r12[r1]
            int r2 = r2.B
            r11.h = r2
        L72:
            if (r1 >= r0) goto L81
            r2 = r12[r1]
            int r2 = r2.A
            int r3 = r11.e
            if (r2 <= r3) goto L7e
            r11.e = r2
        L7e:
            int r1 = r1 + 1
            goto L72
        L81:
            ber r11 = new ber
            java.lang.Object r12 = new java.lang.Object
            r12.<init>()
            r11.<init>(r13, r14, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hin.h(pof[], asj, ash, pou):ber");
    }
}
