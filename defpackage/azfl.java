package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azfl extends AtomicInteger implements ayqx {
    private static final long serialVersionUID = 6770240836423125754L;
    final ayqd a;
    final azfn b;
    azfm c;
    int d;
    long e;
    volatile boolean f;

    public azfl(ayqd ayqdVar, azfn azfnVar) {
        this.a = ayqdVar;
        this.b = azfnVar;
        this.c = azfnVar.g;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.f;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        azfl[] azflVarArr;
        azfl[] azflVarArr2;
        if (this.f) {
            return;
        }
        this.f = true;
        azfn azfnVar = this.b;
        do {
            azflVarArr = (azfl[]) azfnVar.e.get();
            int length = azflVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azflVarArr[i] == this) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azflVarArr2 = azfn.b;
            } else {
                azfl[] azflVarArr3 = new azfl[length - 1];
                System.arraycopy(azflVarArr, 0, azflVarArr3, 0, i);
                System.arraycopy(azflVarArr, i + 1, azflVarArr3, i, (length - i) - 1);
                azflVarArr2 = azflVarArr3;
            }
        } while (!azfnVar.e.compareAndSet(azflVarArr, azflVarArr2));
    }
}
