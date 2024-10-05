package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yxz implements yxx {
    private final zfh X;
    private final Context Y;
    private final azrw Z;
    public final AtomicReference a = new AtomicReference();
    private final yyf aa;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (defpackage.yjk.s(defpackage.yxt.q(r2)) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yxz(android.content.Context r2, j$.util.Optional r3, defpackage.azrw r4, defpackage.yyf r5) {
        /*
            r1 = this;
            r1.<init>()
            r1.Y = r2
            r0 = 0
            java.lang.Object r3 = r3.orElse(r0)
            zfh r3 = (defpackage.zfh) r3
            r1.X = r3
            r1.Z = r4
            r1.aa = r5
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r1.a = r3
            r3 = 1
            r4 = 0
            java.io.File r2 = defpackage.yxt.r(r2)     // Catch: java.lang.Exception -> L36
            if (r2 == 0) goto L36
            java.io.File r5 = defpackage.yxt.s(r2)     // Catch: java.lang.Exception -> L36
            boolean r5 = defpackage.yjk.s(r5)     // Catch: java.lang.Exception -> L36
            if (r5 != 0) goto L37
            java.io.File r2 = defpackage.yxt.q(r2)     // Catch: java.lang.Exception -> L36
            boolean r2 = defpackage.yjk.s(r2)     // Catch: java.lang.Exception -> L36
            if (r2 == 0) goto L36
            goto L37
        L36:
            r3 = 0
        L37:
            r1.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yxz.<init>(android.content.Context, j$.util.Optional, azrw, yyf):void");
    }

    final yxx a(boolean z, Object obj) {
        yxx yycVar;
        if (z) {
            yycVar = new yxt(this.Y, this.X, this.Z, this.aa, (String[]) obj);
        } else {
            yycVar = new yyc(this.Y, (long[][]) obj);
        }
        this.a.set(yycVar);
        return yycVar;
    }

    @Override // defpackage.yxx
    public final /* synthetic */ int b(yxw yxwVar) {
        return yxu.a(this, yxwVar);
    }

    public final void c() {
        this.aa.f.ax(new ayrs() { // from class: yxy
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                yxs yxsVar;
                yxr c;
                yxz yxzVar = yxz.this;
                long longValue = ((Long) obj).longValue();
                yxx yxxVar = (yxx) yxzVar.a.get();
                if (yxxVar instanceof yxt) {
                    yxt yxtVar = (yxt) yxxVar;
                    int ar = wbs.ar(longValue);
                    if (wbs.au(ar, yyf.a) == 3) {
                        yxtVar.l(2);
                        return;
                    }
                    int c2 = yxt.c(ar);
                    do {
                        yxsVar = (yxs) yxtVar.a.get();
                        if (yxsVar.e == c2) {
                            return;
                        }
                        int a = yxt.a(yxsVar.a, c2);
                        c = yxsVar.c();
                        c.i(c2);
                        c.g(a);
                    } while (!yxtVar.n(yxsVar, c));
                }
            }
        });
    }

    @Override // defpackage.yxx
    public final long f(yxw yxwVar) {
        return ((yxx) this.a.get()).f(yxwVar);
    }

    @Override // defpackage.yxx
    public final synchronized SharedPreferences.Editor g(SharedPreferences.Editor editor, apwy apwyVar, arfd arfdVar) {
        yxx yxxVar;
        avdz avdzVar = arfdVar.y;
        if (avdzVar == null) {
            avdzVar = avdz.a;
        }
        boolean z = avdzVar.c;
        yxxVar = (yxx) this.a.get();
        if (z != (this.a.get() instanceof yxt)) {
            Object j = yxxVar.j();
            yxxVar.l(1);
            yxxVar = a(z, j);
        }
        return yxxVar.g(editor, apwyVar, arfdVar);
    }

    @Override // defpackage.yxx
    public final synchronized SharedPreferences.Editor h(SharedPreferences.Editor editor) {
        return ((yxx) this.a.get()).h(editor);
    }

    @Override // defpackage.yxx
    public final Object j() {
        return ((yxx) this.a.get()).j();
    }

    @Override // defpackage.yxx
    public final /* synthetic */ void l(int i) {
        int i2 = yxu.a;
    }

    @Override // defpackage.yxx
    public final boolean o(yxw yxwVar) {
        return ((yxx) this.a.get()).o(yxwVar);
    }
}
