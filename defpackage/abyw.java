package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abyw implements afwx {
    final /* synthetic */ abxt a;
    final /* synthetic */ abzl b;

    public abyw(abzl abzlVar, abxt abxtVar) {
        this.b = abzlVar;
        this.a = abxtVar;
    }

    private final void d(final int i, final aqdt aqdtVar) {
        Handler handler = this.b.b;
        final abxt abxtVar = this.a;
        handler.post(new Runnable() { // from class: abyu
            @Override // java.lang.Runnable
            public final void run() {
                abxt.this.b(i, aqdtVar);
            }
        });
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        cnh cnhVar;
        zga.d("Cannot load GetBroadcastSetupResponse from InnerTube.", cnqVar);
        if (cnqVar == null || (cnhVar = cnqVar.b) == null || cnhVar.a != 403) {
            abvt.b().n(3, 1, cnqVar);
            d(1, null);
        } else {
            abvt.b().n(3, 2, cnqVar);
            d(4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:2:0x0008->B:30:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.cnl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void kZ(java.lang.Object r9) {
        /*
            r8 = this;
            arqo r9 = (defpackage.arqo) r9
            aony r0 = r9.d
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            r2 = 18
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L85
            java.lang.Object r1 = r0.next()
            aulq r1 = (defpackage.aulq) r1
            aonk r5 = defpackage.asst.a
            boolean r5 = r1.pY(r5)
            if (r5 == 0) goto L66
            aonk r5 = defpackage.asst.a
            java.lang.Object r1 = r1.pX(r5)
            asss r1 = (defpackage.asss) r1
            int r5 = r1.d
            int r5 = defpackage.amkq.df(r5)
            if (r5 != 0) goto L31
            goto L32
        L31:
            r3 = r5
        L32:
            int r5 = r1.b
            r6 = 5
            if (r5 != r6) goto L43
            java.lang.Object r1 = r1.c
            aqyg r1 = (defpackage.aqyg) r1
            android.text.Spanned r1 = defpackage.ajcq.b(r1)
            r1.toString()
            goto L66
        L43:
            r6 = 6
            if (r5 != r6) goto L66
            java.lang.Object r5 = r1.c
            aulq r5 = (defpackage.aulq) r5
            aonk r7 = com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass.confirmDialogRenderer
            boolean r5 = r5.pY(r7)
            if (r5 == 0) goto L66
            int r5 = r1.b
            if (r5 != r6) goto L5b
            java.lang.Object r1 = r1.c
            aulq r1 = (defpackage.aulq) r1
            goto L5d
        L5b:
            aulq r1 = defpackage.aulq.a
        L5d:
            aonk r5 = com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass.confirmDialogRenderer
            java.lang.Object r1 = r1.pX(r5)
            aqdt r1 = (defpackage.aqdt) r1
            goto L67
        L66:
            r1 = r4
        L67:
            r5 = 2
            r6 = 4
            if (r3 == r5) goto L72
            r5 = 14
            if (r3 == r5) goto L72
            if (r3 != r6) goto L8
            r3 = 4
        L72:
            abvt r9 = defpackage.abvt.b()
            int r0 = defpackage.abzl.o(r3)
            r9.n(r2, r0, r4)
            int r9 = defpackage.abzl.p(r3)
            r8.d(r9, r1)
            return
        L85:
            if (r9 != 0) goto L88
            goto Lb2
        L88:
            aulq r0 = r9.e
            if (r0 != 0) goto L8e
            aulq r0 = defpackage.aulq.a
        L8e:
            aonk r1 = com.google.protos.youtube.api.innertube.BroadcastParticipantJoinScreenRendererOuterClass.broadcastParticipantJoinScreenRenderer
            boolean r1 = r0.pY(r1)
            if (r1 == 0) goto Lb2
            aonk r1 = com.google.protos.youtube.api.innertube.BroadcastParticipantJoinScreenRendererOuterClass.broadcastParticipantJoinScreenRenderer
            java.lang.Object r0 = r0.pX(r1)
            aplq r0 = (defpackage.aplq) r0
            int r0 = r0.b
            r0 = r0 & r3
            if (r0 == 0) goto Lb2
            abzl r0 = r8.b
            android.os.Handler r0 = r0.b
            abxt r1 = r8.a
            abyv r2 = new abyv
            r2.<init>()
            r0.post(r2)
            return
        Lb2:
            abvt r9 = defpackage.abvt.b()
            r9.n(r2, r3, r4)
            r8.d(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyw.kZ(java.lang.Object):void");
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
