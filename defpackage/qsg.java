package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.Feature;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qsg extends qrx implements qnv {
    private static volatile Executor a;
    public final qrz H;
    private final Set b;
    private final Account c;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qsg(android.content.Context r10, android.os.Looper r11, int r12, defpackage.qrz r13, defpackage.qpj r14, defpackage.qqp r15) {
        /*
            r9 = this;
            qsi r3 = defpackage.qsi.a(r10)
            qmy r4 = defpackage.qmy.a
            defpackage.qip.an(r14)
            defpackage.qip.an(r15)
            qse r6 = new qse
            r6.<init>(r14)
            qsf r7 = new qsf
            r7.<init>(r15)
            java.lang.String r8 = r13.f
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.H = r13
            android.accounts.Account r10 = r13.a
            r9.c = r10
            java.util.Set r10 = r13.c
            java.util.Iterator r11 = r10.iterator()
        L2b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L46
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L3e
            goto L2b
        L3e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L46:
            r9.b = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsg.<init>(android.content.Context, android.os.Looper, int, qrz, qpj, qqp):void");
    }

    @Override // defpackage.qrx
    public final Account C() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final Set F() {
        return this.b;
    }

    @Override // defpackage.qrx
    public final Feature[] M() {
        return new Feature[0];
    }

    @Override // defpackage.qrx
    protected final void O() {
    }

    @Override // defpackage.qrx, defpackage.qnv
    public int a() {
        throw null;
    }

    @Override // defpackage.qnv
    public final Set u() {
        return j() ? this.b : Collections.emptySet();
    }
}
