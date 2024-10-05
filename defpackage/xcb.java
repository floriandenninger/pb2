package defpackage;

import com.google.android.libraries.lidar.VisibilityChangeEventData;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xcb extends xca {
    private final tdv i;
    private final String j;
    private final aryr k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xcb(defpackage.xev r12, defpackage.aryr r13, defpackage.woz r14, defpackage.tdv r15, android.view.View r16) {
        /*
            r11 = this;
            r7 = r11
            r8 = r13
            r9 = r15
            r10 = r16
            aryx r0 = r8.g
            if (r0 != 0) goto Lb
            aryx r0 = defpackage.aryx.a
        Lb:
            long r0 = r0.e
            r2 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r4 = 1
            r5 = 0
            r0 = r11
            r1 = r12
            r6 = r14
            r0.<init>(r1, r2, r4, r5, r6)
            r7.k = r8
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r7.j = r0
            r7.i = r9
            wne r1 = r9.c
            boolean r1 = r1.a()
            if (r1 != 0) goto L30
            return
        L30:
            java.util.Map r1 = r9.b
            java.lang.Object r1 = r1.get(r0)
            tey r1 = (defpackage.tey) r1
            if (r1 == 0) goto L46
            android.view.View r2 = r1.a()
            if (r10 == r2) goto L46
            r1.d(r10)
            r1.h = r7
            return
        L46:
            tey r1 = new tey
            rwh r2 = r9.d
            baof r2 = new baof
            r2.<init>()
            r3 = 0
            r1.<init>(r11, r2, r3)
            tfd r2 = r11.a()
            boolean r2 = r2.d
            r1.a = r2
            r1.d(r10)
            r2 = 2
            r1.r = r2
            java.util.Map r2 = r9.b
            r2.put(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xcb.<init>(xev, aryr, woz, tdv, android.view.View):void");
    }

    @Override // defpackage.tez
    public final Set b(tfa tfaVar) {
        aowc aowcVar;
        for (aryk arykVar : this.k.m) {
            if (arykVar.b == 84813246) {
                aowcVar = (aowc) arykVar.c;
            } else {
                aowcVar = aowc.a;
            }
            for (aowd aowdVar : aowcVar.c) {
                if ((aowdVar.b & 64) != 0) {
                    avwa avwaVar = aowdVar.g;
                    if (avwaVar == null) {
                        avwaVar = avwa.a;
                    }
                    return afxf.d(xgt.b(avwaVar, tfaVar), a);
                }
            }
        }
        return amvs.a;
    }

    @Override // defpackage.xca
    public final tdt f(int i) {
        if (i == 1) {
            return this.i.a(this.j, tfa.FIRST_QUARTILE);
        }
        if (i == 2) {
            return this.i.a(this.j, tfa.MIDPOINT);
        }
        if (i != 3) {
            return null;
        }
        return this.i.a(this.j, tfa.THIRD_QUARTILE);
    }

    @Override // defpackage.xca
    public final void h() {
        this.e = this.i.a(this.j, tfa.ABANDON);
    }

    @Override // defpackage.xca
    public final void i() {
        this.e = this.i.a(this.j, tfa.COMPLETE);
    }

    @Override // defpackage.xca
    public final void j() {
        this.e = this.i.a(this.j, tfa.START);
    }

    @Override // defpackage.xca
    public final void k() {
        this.e = this.i.a(this.j, tfa.PAUSE);
    }

    @Override // defpackage.xca
    public final void l() {
        this.e = this.i.a(this.j, tfa.RESUME);
    }

    @Override // defpackage.xca
    public final void m() {
        this.e = this.i.a(this.j, tfa.SKIP);
    }

    @Override // defpackage.xca
    public final void n() {
        this.e = this.i.a(this.j, tfa.ABANDON);
    }

    @Override // defpackage.xca
    public final void o(VisibilityChangeEventData visibilityChangeEventData) {
    }

    @Override // defpackage.xca
    public final void p() {
        this.i.a(this.j, tfa.SUSPEND);
        this.e = this.i.a(this.j, tfa.ABANDON);
    }

    @Override // defpackage.xca
    public final void q(aigf aigfVar) {
    }

    @Override // defpackage.xca
    public final void s(int i, int i2, int i3, int i4) {
        tdv tdvVar = this.i;
        String str = this.j;
        teb tebVar = (teb) tdvVar.a.get(str);
        if (tebVar != null) {
            tebVar.e(i, i2, i3, i4);
        }
        tey teyVar = (tey) tdvVar.b.get(str);
        if (teyVar != null) {
            teyVar.e(i, i2, i3, i4);
        }
    }
}
