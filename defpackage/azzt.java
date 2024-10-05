package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class azzt {
    public final azvm c = azth.o(this);
    public final azvm d = azth.o(this);
    private final azvm a = azth.o(null);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (r3.c.c(r2, ((defpackage.azzz) r4).a) == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.azzt ss() {
        /*
            r7 = this;
        L0:
            azvm r0 = r7.d
            java.lang.Object r0 = r0.a
            azzt r0 = (defpackage.azzt) r0
            r1 = 0
            r2 = r0
        L8:
            r3 = r1
        L9:
            azvm r4 = r2.c
            java.lang.Object r4 = r4.a
            if (r4 != r7) goto L1b
            if (r0 != r2) goto L12
            return r2
        L12:
            azvm r1 = r7.d
            boolean r0 = r1.c(r0, r2)
            if (r0 == 0) goto L0
            return r2
        L1b:
            boolean r5 = r7.sr()
            if (r5 == 0) goto L22
            return r1
        L22:
            if (r4 != 0) goto L25
            return r2
        L25:
            boolean r5 = r4 instanceof defpackage.azzy
            if (r5 == 0) goto L2f
            azzy r4 = (defpackage.azzy) r4
            r4.c(r2)
            goto L0
        L2f:
            boolean r5 = r4 instanceof defpackage.azzz
            if (r5 == 0) goto L4a
            if (r3 == 0) goto L43
            azvm r5 = r3.c
            azzz r4 = (defpackage.azzz) r4
            azzt r4 = r4.a
            boolean r2 = r5.c(r2, r4)
            if (r2 == 0) goto L0
            r2 = r3
            goto L8
        L43:
            azvm r2 = r2.d
            java.lang.Object r2 = r2.a
            azzt r2 = (defpackage.azzt) r2
            goto L9
        L4a:
            r3 = r4
            azzt r3 = (defpackage.azzt) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azzt.ss():azzt");
    }

    public final int f(azzt azztVar, azzt azztVar2, azzs azzsVar) {
        azztVar.d.b(this);
        azztVar.c.b(azztVar2);
        azzsVar.d = azztVar2;
        if (this.c.c(azztVar2, azzsVar)) {
            return azzsVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }

    public final Object g() {
        azvm azvmVar = this.c;
        while (true) {
            Object obj = azvmVar.a;
            if (!(obj instanceof azzy)) {
                return obj;
            }
            ((azzy) obj).c(this);
        }
    }

    public final azzt h() {
        return azzr.a(g());
    }

    public final azzt i() {
        azzt ss = ss();
        if (ss != null) {
            return ss;
        }
        Object obj = this.d.a;
        while (true) {
            azzt azztVar = (azzt) obj;
            if (!azztVar.sr()) {
                return azztVar;
            }
            obj = azztVar.d.a;
        }
    }

    public final azzt j() {
        Object g;
        azzt azztVar;
        azzz azzzVar;
        do {
            g = g();
            if (g instanceof azzz) {
                return ((azzz) g).a;
            }
            if (g != this) {
                azztVar = (azzt) g;
                azzzVar = (azzz) azztVar.a.a;
                if (azzzVar == null) {
                    azzzVar = new azzz(azztVar);
                    azztVar.a.b(azzzVar);
                }
            } else {
                return (azzt) g;
            }
        } while (!this.c.c(g, azzzVar));
        azztVar.ss();
        return null;
    }

    public final void k(azzt azztVar) {
        azzt azztVar2;
        azvm azvmVar = azztVar.d;
        do {
            azztVar2 = (azzt) azvmVar.a;
            if (g() != azztVar) {
                return;
            }
        } while (!azztVar.d.c(azztVar2, this));
        if (sr()) {
            azztVar.ss();
        }
    }

    public final void l() {
        azzt azztVar = this;
        while (true) {
            Object g = azztVar.g();
            if (g instanceof azzz) {
                azztVar = ((azzz) g).a;
            } else {
                azztVar.ss();
                return;
            }
        }
    }

    public final boolean m() {
        return j() == null;
    }

    public boolean sr() {
        return g() instanceof azzz;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('@');
        sb.append((Object) Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }
}
