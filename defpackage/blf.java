package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class blf implements bih {
    private bik a;
    private blm b;
    private boolean c;

    private final boolean a(bii biiVar) {
        blh blhVar = new blh();
        if (blhVar.b(biiVar, true) && (blhVar.a & 2) == 2) {
            int min = Math.min(blhVar.e, 8);
            pth pthVar = new pth(min);
            biiVar.j(pthVar.a, 0, min);
            b(pthVar);
            if (pthVar.a() < 5 || pthVar.i() != 127 || pthVar.p() != 1179402563) {
                b(pthVar);
                try {
                    if (jf.g(1, pthVar, true)) {
                        this.b = new blo();
                    }
                } catch (pnr unused) {
                }
                b(pthVar);
                byte[] bArr = blj.a;
                if (pthVar.a() >= 8) {
                    byte[] bArr2 = new byte[8];
                    pthVar.B(bArr2, 0, 8);
                    if (Arrays.equals(bArr2, blj.a)) {
                        this.b = new blj();
                    }
                }
            } else {
                this.b = new ble();
            }
            return true;
        }
        return false;
    }

    private static void b(pth pthVar) {
        pthVar.G(0);
    }

    @Override // defpackage.bih
    public final void d(bik bikVar) {
        this.a = bikVar;
    }

    @Override // defpackage.bih
    public final void e() {
    }

    @Override // defpackage.bih
    public final void f(long j, long j2) {
        blm blmVar = this.b;
        if (blmVar != null) {
            blg blgVar = blmVar.b;
            blgVar.a.a();
            blgVar.b.C(0);
            blgVar.c = -1;
            blgVar.d = false;
            if (j == 0) {
                blmVar.b(!blmVar.m);
                return;
            }
            if (blmVar.i != 0) {
                long e = blmVar.e(j2);
                blmVar.f = e;
                bli bliVar = blmVar.e;
                int i = pts.a;
                bliVar.c(e);
                blmVar.i = 2;
            }
        }
    }

    @Override // defpackage.bih
    public final boolean g(bii biiVar) {
        try {
            return a(biiVar);
        } catch (pnr unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.bih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(defpackage.bii r19, defpackage.tfq r20) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blf.h(bii, tfq):int");
    }
}
