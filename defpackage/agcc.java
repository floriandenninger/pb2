package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agcc extends agcb {
    private final agaf d;
    private final aaea e;
    private volatile boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public agcc(defpackage.agaf r17, defpackage.aaxn r18, java.util.concurrent.ScheduledExecutorService r19, defpackage.zfm r20, defpackage.afyt r21, android.content.Context r22, defpackage.aaea r23, defpackage.shf r24, defpackage.ysy r25, defpackage.ajyg r26, defpackage.azrw r27, byte[] r28, byte[] r29, byte[] r30) {
        /*
            r16 = this;
            r15 = r16
            r0 = r26
            agch r10 = new agch
            azrw r1 = r0.c
            java.lang.Object r1 = r1.get()
            r2 = r1
            agaf r2 = (defpackage.agaf) r2
            r2.getClass()
            azrw r1 = r0.a
            java.lang.Object r1 = r1.get()
            r3 = r1
            android.content.Context r3 = (android.content.Context) r3
            r3.getClass()
            azrw r1 = r0.d
            java.lang.Object r1 = r1.get()
            r4 = r1
            shf r4 = (defpackage.shf) r4
            r4.getClass()
            azrw r0 = r0.b
            java.lang.Object r0 = r0.get()
            r5 = r0
            aaea r5 = (defpackage.aaea) r5
            r5.getClass()
            r0 = r10
            r1 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r12 = 0
            r13 = 0
            r14 = 0
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r24
            r8 = r23
            r9 = r25
            r11 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r17
            r15.d = r0
            r0 = r23
            r15.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agcc.<init>(agaf, aaxn, java.util.concurrent.ScheduledExecutorService, zfm, afyt, android.content.Context, aaea, shf, ysy, ajyg, azrw, byte[], byte[], byte[]):void");
    }

    private final boolean i(String str) {
        if (ammx.e(str)) {
            return false;
        }
        try {
            ynm.e(this.d.l(str), afyf.f, 30L, TimeUnit.SECONDS);
            this.f = true;
        } catch (Exception e) {
            zga.n("Failed to save registration Id for some unknown reason", e);
            this.f = false;
        }
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.agcb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agcc.g():boolean");
    }

    @Override // defpackage.agcf
    public final void h(String str) {
        String s = this.d.s();
        if (!i(str) || str.equals(s)) {
            return;
        }
        b(agce.FCM_TOKEN_CHANGED);
    }
}
