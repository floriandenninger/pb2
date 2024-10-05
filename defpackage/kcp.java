package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kcp extends aild implements ypd {
    public kcg a;
    private final afsy e;
    private final azrw f;
    private final aili g;
    private final shf h;
    private final aaea i;
    private final boolean j;
    private boolean k;

    public kcp(Context context, aifs aifsVar, afsy afsyVar, azrw azrwVar, aili ailiVar, shf shfVar, aadw aadwVar, aaea aaeaVar) {
        super(context, aifsVar);
        this.e = afsyVar;
        this.f = azrwVar;
        this.g = ailiVar;
        this.h = shfVar;
        this.i = aaeaVar;
        asvu asvuVar = aadwVar.b().e;
        boolean z = (asvuVar == null ? asvu.a : asvuVar).an;
        this.j = z;
        this.k = false;
        g();
        if (z) {
            return;
        }
        n(0L);
    }

    private final long m() {
        return TimeUnit.MILLISECONDS.toSeconds(this.h.c());
    }

    private final void n(long j) {
        if (this.e.t()) {
            ynm.m(this.g.a.b(new wgt(aili.b(this.e.c(), "playability_adult_confirmation_time_stamp"), j, 5)), ailg.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aild
    public final void b(aryi aryiVar, ykl yklVar, String str) {
        ailf j = j();
        if (j == null) {
            aile.a(yklVar, h(aryiVar, str));
        } else {
            ((aftn) this.f.get()).c(j.a(), null, new kco(this, aryiVar, yklVar, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aild
    public final void c(aryi aryiVar, ykl yklVar, String str) {
        aqdt g = ahbx.g(aryiVar);
        kcg kcgVar = this.a;
        if (kcgVar == null || g == null) {
            super.c(aryiVar, yklVar, str);
            return;
        }
        kcgVar.f = ahbx.g(aryiVar);
        kcn kcnVar = new kcn(this, aryiVar, yklVar, str);
        if (kcgVar.f != null) {
            acra mM = kcgVar.d.mM();
            aqdt aqdtVar = kcgVar.f;
            aqdtVar.getClass();
            mM.D(new acqx(aqdtVar.n));
            Activity activity = kcgVar.a;
            aqdt aqdtVar2 = kcgVar.f;
            aqdtVar2.getClass();
            kcgVar.g = ajdf.g(activity, aqdtVar2, kcgVar.c, kcgVar.d.mM(), kcgVar.e, false, false, new kcf(kcgVar, kcnVar), null);
        }
        l(kcgVar);
    }

    @Override // defpackage.aild
    protected final void d() {
        this.k = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aild
    public final void e() {
        if (this.e.t()) {
            this.g.e(this.e.c(), true);
        }
        if (this.j) {
            n(m());
            this.k = true;
        }
    }

    public final void g() {
        anhy O;
        if (this.e.t()) {
            O = this.g.a(this.e.c());
        } else {
            O = anaf.O(false);
        }
        this.b = O;
        this.c = false;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class, afto.class};
        }
        if (i == 0) {
            g();
            return null;
        }
        if (i == 1) {
            g();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    @Override // defpackage.aild, defpackage.aijo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qZ(defpackage.aijr r9) {
        /*
            r8 = this;
            boolean r0 = r8.j
            if (r0 == 0) goto L7c
            boolean r0 = r8.k
            if (r0 != 0) goto L7c
            long r0 = r8.m()
            aaea r2 = r8.i
            arfd r2 = r2.a()
            aswb r2 = r2.e
            if (r2 != 0) goto L18
            aswb r2 = defpackage.aswb.a
        L18:
            int r2 = r2.O
            afsy r3 = r8.e
            boolean r3 = r3.t()
            r4 = 0
            if (r3 == 0) goto L50
            aili r3 = r8.g
            afsy r6 = r8.e
            afsx r6 = r6.c()
            java.lang.String r7 = "playability_adult_confirmation_time_stamp"
            java.lang.String r6 = defpackage.aili.b(r6, r7)
            ywr r3 = r3.a
            aooy r3 = r3.c()
            awwp r3 = (defpackage.awwp) r3
            r6.getClass()
            aoot r3 = r3.e
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L50
            java.lang.Object r3 = r3.get(r6)
            java.lang.Long r3 = (java.lang.Long) r3
            long r6 = r3.longValue()
            goto L51
        L50:
            r6 = r4
        L51:
            if (r2 < 0) goto L5a
            long r0 = r0 - r6
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L7c
            goto L5e
        L5a:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L7c
        L5e:
            afsy r0 = r8.e
            boolean r0 = r0.t()
            r1 = 0
            if (r0 == 0) goto L72
            aili r0 = r8.g
            afsy r2 = r8.e
            afsx r2 = r2.c()
            r0.e(r2, r1)
        L72:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            anhy r0 = defpackage.anaf.O(r0)
            r8.b = r0
        L7c:
            super.qZ(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcp.qZ(aijr):void");
    }
}
