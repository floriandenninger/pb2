package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nll extends nlb {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public nll(defpackage.aahd r14, defpackage.mda r15, defpackage.ypa r16, defpackage.ohg r17, defpackage.ajyw r18, defpackage.acra r19, com.google.android.libraries.youtube.innertube.model.BrowseResponseModel r20, byte[] r21, byte[] r22, byte[] r23, byte[] r24) {
        /*
            r13 = this;
            r7 = r20
            arjv r0 = r7.a
            arjq r0 = r0.d
            if (r0 != 0) goto La
            arjq r0 = defpackage.arjq.a
        La:
            int r1 = r0.b
            r2 = 102883021(0x621decd, float:3.0444423E-35)
            if (r1 != r2) goto L16
            java.lang.Object r0 = r0.c
            aqec r0 = (defpackage.aqec) r0
            goto L18
        L16:
            aqec r0 = defpackage.aqec.a
        L18:
            r8 = r0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r0 = r13
            r1 = r14
            r2 = r16
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nll.<init>(aahd, mda, ypa, ohg, ajyw, acra, com.google.android.libraries.youtube.innertube.model.BrowseResponseModel, byte[], byte[], byte[], byte[]):void");
    }

    @Override // defpackage.nlb, defpackage.nky
    public final amsx a(amsx amsxVar) {
        apmh apmhVar = ((aqec) this.a).d;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) == 0) {
            return amvs.a;
        }
        aahd aahdVar = this.e;
        apmh apmhVar2 = ((aqec) this.a).d;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        apmg apmgVar = apmhVar2.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        return amsx.r(new lro(aahdVar, apmgVar));
    }

    @Override // defpackage.nky
    public final CharSequence c() {
        aqyg aqygVar;
        aqec aqecVar = (aqec) this.a;
        if ((aqecVar.b & 1) != 0) {
            aqygVar = aqecVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return zhq.d(ajcq.b(aqygVar));
    }
}
