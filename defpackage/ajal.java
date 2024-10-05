package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajal implements ajai {
    public static final long a = TimeUnit.SECONDS.toMillis(25);
    public final azrw b;
    public final azrw c;
    private final Executor d;
    private final acpl e;
    private final aifk f;
    private aign g;
    private int h;
    private long i;
    private long j;
    private final aiow k;
    private int l = 1;

    public ajal(aiow aiowVar, Executor executor, azrw azrwVar, azrw azrwVar2, acpl acplVar, aifk aifkVar) {
        this.k = aiowVar;
        this.b = azrwVar;
        this.c = azrwVar2;
        executor.getClass();
        this.d = executor;
        this.e = acplVar;
        this.f = aifkVar;
    }

    public static apxf k(aryi aryiVar) {
        if (!l(aryiVar)) {
            return null;
        }
        aryc arycVar = aryiVar.n;
        if (arycVar == null) {
            arycVar = aryc.a;
        }
        asti astiVar = arycVar.c;
        if (astiVar == null) {
            astiVar = asti.a;
        }
        if ((astiVar.b & 4) == 0) {
            return null;
        }
        aryc arycVar2 = aryiVar.n;
        if (arycVar2 == null) {
            arycVar2 = aryc.a;
        }
        asti astiVar2 = arycVar2.c;
        if (astiVar2 == null) {
            astiVar2 = asti.a;
        }
        apxf apxfVar = astiVar2.c;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    private static boolean l(aryi aryiVar) {
        aryc arycVar = aryiVar.n;
        if (arycVar == null) {
            arycVar = aryc.a;
        }
        return (arycVar.b & 1) != 0;
    }

    private final boolean m() {
        return this.j - this.i < a;
    }

    @Override // defpackage.ajai
    public final int a(ajah ajahVar) {
        aryi aryiVar = ajahVar.a;
        if (aryiVar == null) {
            return 0;
        }
        int bG = anaf.bG(aryiVar.c);
        if (bG == 0) {
            bG = 1;
        }
        this.l = bG;
        int bG2 = anaf.bG(aryiVar.c);
        if (bG2 == 0 || bG2 != 7) {
            return 0;
        }
        if (l(aryiVar)) {
            aryc arycVar = aryiVar.n;
            if (arycVar == null) {
                arycVar = aryc.a;
            }
            asti astiVar = arycVar.c;
            if (astiVar == null) {
                astiVar = asti.a;
            }
            asth asthVar = astiVar.g;
            if (asthVar == null) {
                asthVar = asth.a;
            }
            if ((asthVar.b & 1) != 0) {
                return 0;
            }
        }
        this.k.b(new aigr(3, 2, aryiVar.d));
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    @Override // defpackage.ajai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(final defpackage.ajah r10) {
        /*
            r9 = this;
            aryi r0 = r10.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r2 = r0.c
            int r2 = defpackage.anaf.bG(r2)
            r3 = 1
            if (r2 != 0) goto L10
            r2 = 1
        L10:
            apxf r4 = k(r0)
            r5 = 3
            r6 = 2
            if (r4 == 0) goto L6a
            boolean r4 = l(r0)
            if (r4 == 0) goto L6a
            aryc r4 = r0.n
            if (r4 != 0) goto L24
            aryc r4 = defpackage.aryc.a
        L24:
            asti r4 = r4.c
            if (r4 != 0) goto L2a
            asti r4 = defpackage.asti.a
        L2a:
            int r4 = r4.e
            int r4 = defpackage.amkq.de(r4)
            if (r4 != 0) goto L33
            goto L37
        L33:
            r7 = 4
            if (r4 != r7) goto L37
            goto L6a
        L37:
            boolean r4 = r9.m()
            int r7 = r0.b
            r8 = 131072(0x20000, float:1.83671E-40)
            r7 = r7 & r8
            if (r7 == 0) goto L51
            aryc r7 = r0.n
            if (r7 != 0) goto L48
            aryc r7 = defpackage.aryc.a
        L48:
            asti r7 = r7.c
            if (r7 != 0) goto L4e
            asti r7 = defpackage.asti.a
        L4e:
            boolean r7 = r7.d
            goto L52
        L51:
            r7 = 0
        L52:
            if (r4 != 0) goto L56
            if (r7 == 0) goto L6a
        L56:
            java.util.concurrent.Executor r1 = r9.d
            ajak r2 = new ajak
            r2.<init>()
            r1.execute(r2)
            if (r3 == r4) goto L63
            r5 = 2
        L63:
            r10 = 5
            acpl r1 = r9.e
            defpackage.ahbj.t(r10, r5, r0, r1)
            return r3
        L6a:
            int r4 = r9.l
            r7 = 7
            if (r4 != r7) goto L7a
            aign r4 = r9.g
            aign r8 = defpackage.aign.PLAYBACK_LOADED
            if (r4 != r8) goto L7a
            if (r2 == r7) goto L79
            r4 = 1
            goto L7b
        L79:
            r2 = 7
        L7a:
            r4 = 0
        L7b:
            int r8 = r0.c
            int r8 = defpackage.anaf.bG(r8)
            if (r8 != 0) goto L84
            r8 = 1
        L84:
            r9.l = r8
            if (r4 == 0) goto L98
            java.util.concurrent.Executor r1 = r9.d
            ajaj r2 = new ajaj
            r2.<init>()
            r1.execute(r2)
            acpl r10 = r9.e
            defpackage.ahbj.t(r6, r6, r0, r10)
            return r3
        L98:
            boolean r10 = defpackage.ahbx.n(r0)
            if (r10 == 0) goto Lae
            if (r2 != r7) goto Lae
            boolean r10 = r9.m()
            if (r10 == 0) goto Lae
            int r10 = r9.h
            if (r10 == r6) goto Lae
            if (r10 != r5) goto Lad
            goto Lae
        Lad:
            return r5
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajal.b(ajah):int");
    }

    @Override // defpackage.ajai
    public final aigr c(aryi aryiVar) {
        return null;
    }

    @Override // defpackage.ajai
    public final aigr d(aasx aasxVar) {
        return null;
    }

    @Override // defpackage.ajai
    public final ajaf e() {
        return null;
    }

    @Override // defpackage.ajai
    public final void f(ahef ahefVar) {
        this.g = ahefVar.c();
        aign aignVar = aign.NEW;
    }

    @Override // defpackage.ajai
    public final void g(aheg ahegVar) {
        this.i = ahegVar.e();
        this.j = ahegVar.f();
    }

    @Override // defpackage.ajai
    public final void h(ahej ahejVar) {
        this.h = ahejVar.a();
    }

    @Override // defpackage.ajai
    public final void i() {
    }

    @Override // defpackage.ajai
    public final boolean j(ajad ajadVar, ajah ajahVar) {
        aryi aryiVar;
        if (aifk.e(this.f.a).P) {
            return (ajadVar == null || ajadVar.e == null) ? false : true;
        }
        if (ajahVar != null && (aryiVar = ajahVar.a) != null) {
            return l(aryiVar);
        }
        if (ajadVar != null) {
            return l(ajadVar.c);
        }
        return false;
    }
}
