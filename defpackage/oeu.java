package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oeu implements obq {
    public oke b;
    private final azrw c;
    public final azrs a = azrh.aN(0).aT();
    private final Set d = new HashSet();
    private float e = 0.0f;

    public oeu(azrw azrwVar) {
        this.c = azrwVar;
    }

    private final void c(float f) {
        if (this.e == f) {
            return;
        }
        this.e = f;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((oet) it.next()).b(1.0f - f);
        }
        oke okeVar = this.b;
        if (okeVar != null) {
            okeVar.c(f);
        }
    }

    private final void d(float f) {
        ((kda) this.c.get()).a(f);
        this.a.c(2);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((oet) it.next()).a(f);
        }
    }

    private final void e(float f) {
        this.a.c(4);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((oet) it.next()).a(f);
        }
    }

    private final void f(float f) {
        this.a.c(1);
        c(1.0f - f);
    }

    public final void a(oet oetVar) {
        this.d.add(oetVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r7, int r8, float r9) {
        /*
            r6 = this;
            int r0 = defpackage.odd.a(r7)
            int r1 = defpackage.odd.a(r8)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 2
            r4 = 1
            r5 = 3
            if (r0 != r3) goto L1a
            if (r1 == r4) goto L15
            if (r1 == r5) goto L15
            r0 = 2
            goto L1a
        L15:
            float r2 = r2 - r9
            r6.f(r2)
            return
        L1a:
            if (r0 == r4) goto L1f
            if (r0 != r5) goto L21
            r0 = 3
        L1f:
            if (r1 == r3) goto L6d
        L21:
            boolean r3 = defpackage.muf.B(r0)
            if (r3 != 0) goto L31
            if (r1 != r5) goto L2d
            r6.e(r9)
            return
        L2d:
            r6.d(r9)
            return
        L31:
            boolean r3 = defpackage.muf.B(r1)
            if (r3 != 0) goto L43
            if (r0 != r5) goto L3e
            float r2 = r2 - r9
            r6.e(r2)
            return
        L3e:
            float r2 = r2 - r9
            r6.d(r2)
            return
        L43:
            if (r0 != r4) goto L47
            if (r1 == r5) goto L63
        L47:
            if (r0 != r5) goto L4b
            if (r1 == r4) goto L63
        L4b:
            r9 = 128(0x80, float:1.8E-43)
            if (r7 == r9) goto L63
            r9 = 256(0x100, float:3.59E-43)
            if (r8 != r9) goto L54
            goto L63
        L54:
            r8 = 512(0x200, float:7.17E-43)
            if (r7 != r8) goto L62
            azrs r7 = r6.a
            r8 = 4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.c(r8)
        L62:
            return
        L63:
            azrs r7 = r6.a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r7.c(r8)
            return
        L6d:
            r6.f(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oeu.b(int, int, float):void");
    }

    @Override // defpackage.obq
    public final void o(int i) {
        if (i == 1 || i == 3) {
            c(1.0f);
        } else {
            c(0.0f);
        }
    }
}
