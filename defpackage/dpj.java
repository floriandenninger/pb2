package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dpj extends dhe {
    public dpt n;
    public WeakReference o;
    public diy p;
    public final aoae q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dpj(defpackage.dhe r18) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            android.content.Context r1 = r0.b
            java.lang.String r2 = r0.c
            taz r3 = r0.l
            amsj r9 = r18.n()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.m = r9
            aoae r0 = new aoae
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r8.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpj.<init>(dhe):void");
    }

    public static dpj o(dpj dpjVar, dpi dpiVar) {
        dpj dpjVar2 = new dpj(dpjVar);
        dpjVar2.n = dpjVar.n;
        dpjVar2.p = dpjVar.p;
        dpjVar2.o = new WeakReference(dpiVar);
        return dpjVar2;
    }

    @Override // defpackage.dhe
    public final void g(dlp dlpVar, String str) {
        dpi dpiVar = (dpi) this.o.get();
        dpt dptVar = this.n;
        if (dptVar == null || dpiVar == null) {
            return;
        }
        if (dth.a) {
            this.n.hashCode();
            String.valueOf(dlpVar.getClass().getName()).length();
        }
        dptVar.i(dpiVar.i, dlpVar, str);
    }

    @Override // defpackage.dhe
    public final void h(dlp dlpVar, String str) {
        dpi dpiVar = (dpi) this.o.get();
        dpt dptVar = this.n;
        if (dptVar == null || dpiVar == null) {
            return;
        }
        if (dth.a) {
            this.n.hashCode();
            String.valueOf(dlpVar.getClass().getName()).length();
        }
        dptVar.h(dpiVar.i, dlpVar, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhe
    public final amsj m() {
        return this.m;
    }
}
