package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azlq extends AtomicInteger implements ayqx {
    private static final long serialVersionUID = 2983708048395377667L;
    final ayqd a;
    final ayrv b;
    final azlr[] c = new azlr[2];
    final Object[] d = new Object[2];
    volatile boolean e;

    public azlq(ayqd ayqdVar, ayrv ayrvVar) {
        this.a = ayqdVar;
        this.b = ayrvVar;
    }

    final void a() {
        d();
        c();
    }

    final void c() {
        azlr[] azlrVarArr = this.c;
        int length = azlrVarArr.length;
        for (int i = 0; i < 2; i++) {
            ayrz.c(azlrVarArr[i].e);
        }
    }

    final void d() {
        azlr[] azlrVarArr = this.c;
        int length = azlrVarArr.length;
        for (int i = 0; i < 2; i++) {
            azlrVarArr[i].b.d();
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.e;
    }

    public final void f() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        azlr[] azlrVarArr = this.c;
        ayqd ayqdVar = this.a;
        Object[] objArr = this.d;
        int i = 1;
        while (true) {
            int length = azlrVarArr.length;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < 2; i4++) {
                azlr azlrVar = azlrVarArr[i4];
                if (objArr[i3] == null) {
                    boolean z = azlrVar.c;
                    Object sg = azlrVar.b.sg();
                    if (this.e) {
                        a();
                        return;
                    }
                    if (z) {
                        Throwable th2 = azlrVar.d;
                        if (th2 != null) {
                            this.e = true;
                            a();
                            ayqdVar.b(th2);
                            return;
                        } else if (sg == null) {
                            this.e = true;
                            a();
                            ayqdVar.sh();
                            return;
                        }
                    }
                    if (sg != null) {
                        objArr[i3] = sg;
                    } else {
                        i2++;
                    }
                } else if (azlrVar.c && (th = azlrVar.d) != null) {
                    this.e = true;
                    a();
                    ayqdVar.b(th);
                    return;
                }
                i3++;
            }
            if (i2 != 0) {
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                try {
                    Object a = this.b.a(objArr.clone());
                    aysw.b(a, "The zipper returned a null value");
                    ayqdVar.c(a);
                    Arrays.fill(objArr, (Object) null);
                } catch (Throwable th3) {
                    aynu.c(th3);
                    a();
                    ayqdVar.b(th3);
                    return;
                }
            }
        }
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.e) {
            return;
        }
        this.e = true;
        c();
        if (getAndIncrement() == 0) {
            d();
        }
    }
}
