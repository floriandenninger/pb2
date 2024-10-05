package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azek extends AtomicInteger implements ayqx {
    private static final long serialVersionUID = -5556924161382950569L;
    final aypt a;
    final ayrv b;
    final azel[] c;
    final Object[] d;

    public azek(aypt ayptVar, ayrv ayrvVar) {
        super(2);
        this.a = ayptVar;
        this.b = ayrvVar;
        azel[] azelVarArr = new azel[2];
        for (int i = 0; i < 2; i++) {
            azelVarArr[i] = new azel(this, i);
        }
        this.c = azelVarArr;
        this.d = new Object[2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        azel[] azelVarArr = this.c;
        int length = azelVarArr.length;
        for (int i2 = 0; i2 < i; i2++) {
            ayrz.c(azelVarArr[i2]);
        }
        while (true) {
            i++;
            if (i >= 2) {
                return;
            } else {
                ayrz.c(azelVarArr[i]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Throwable th, int i) {
        if (getAndSet(0) > 0) {
            a(i);
            this.a.b(th);
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() <= 0;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (getAndSet(0) > 0) {
            azel[] azelVarArr = this.c;
            int length = azelVarArr.length;
            for (int i = 0; i < 2; i++) {
                ayrz.c(azelVarArr[i]);
            }
        }
    }
}
