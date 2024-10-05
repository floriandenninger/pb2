package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaip {
    public volatile boolean a;
    private final int b;
    private int c;
    private final acpk d;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aaip(defpackage.aadw r2, defpackage.acpk r3) {
        /*
            r1 = this;
            r1.<init>()
            r1.d = r3
            r3 = 0
            if (r2 == 0) goto L1e
            apwy r0 = r2.b()
            atfq r0 = r0.o
            if (r0 != 0) goto L12
            atfq r0 = defpackage.atfq.a
        L12:
            aquh r0 = r0.e
            if (r0 != 0) goto L18
            aquh r0 = defpackage.aquh.a
        L18:
            boolean r0 = r0.b
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r1.a = r0
            if (r2 == 0) goto L36
            apwy r2 = r2.b()
            atfq r2 = r2.o
            if (r2 != 0) goto L2d
            atfq r2 = defpackage.atfq.a
        L2d:
            aquh r2 = r2.e
            if (r2 != 0) goto L33
            aquh r2 = defpackage.aquh.a
        L33:
            int r2 = r2.c
            goto L37
        L36:
            r2 = 0
        L37:
            r1.b = r2
            r1.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaip.<init>(aadw, acpk):void");
    }

    public final void a(aqtx aqtxVar) {
        int i;
        if (!this.a || ((i = this.b) != 0 && this.c >= i)) {
            this.a = false;
            return;
        }
        acpk acpkVar = this.d;
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).cv(aqtxVar);
        acpkVar.a((arpp) a.build());
        this.c++;
    }
}
