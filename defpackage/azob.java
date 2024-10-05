package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azob extends AtomicInteger implements ayqx {
    private static final long serialVersionUID = -5556924161382950569L;
    final ayqk a;
    final ayrv b;
    final azoc[] c;
    final Object[] d;

    public azob(ayqk ayqkVar, ayrv ayrvVar) {
        super(2);
        this.a = ayqkVar;
        this.b = ayrvVar;
        azoc[] azocVarArr = new azoc[2];
        for (int i = 0; i < 2; i++) {
            azocVarArr[i] = new azoc(this, i);
        }
        this.c = azocVarArr;
        this.d = new Object[2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Throwable th, int i) {
        if (getAndSet(0) > 0) {
            azoc[] azocVarArr = this.c;
            int length = azocVarArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                ayrz.c(azocVarArr[i2]);
            }
            while (true) {
                i++;
                if (i < 2) {
                    ayrz.c(azocVarArr[i]);
                } else {
                    this.a.b(th);
                    return;
                }
            }
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
            azoc[] azocVarArr = this.c;
            int length = azocVarArr.length;
            for (int i = 0; i < 2; i++) {
                ayrz.c(azocVarArr[i]);
            }
        }
    }
}
