package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azjt implements ayqb {
    private final AtomicReference a;
    private final azjo b;

    public azjt(AtomicReference atomicReference, azjo azjoVar) {
        this.a = atomicReference;
        this.b = azjoVar;
    }

    @Override // defpackage.ayqb
    public final void aE(ayqd ayqdVar) {
        azjs azjsVar;
        azjp[] azjpVarArr;
        azjp[] azjpVarArr2;
        while (true) {
            azjsVar = (azjs) this.a.get();
            if (azjsVar != null) {
                break;
            }
            azjs azjsVar2 = new azjs(this.b.a());
            if (this.a.compareAndSet(null, azjsVar2)) {
                azjsVar = azjsVar2;
                break;
            }
        }
        azjp azjpVar = new azjp(azjsVar, ayqdVar);
        ayqdVar.se(azjpVar);
        do {
            azjpVarArr = (azjp[]) azjsVar.e.get();
            if (azjpVarArr == azjs.b) {
                break;
            }
            int length = azjpVarArr.length;
            azjpVarArr2 = new azjp[length + 1];
            System.arraycopy(azjpVarArr, 0, azjpVarArr2, 0, length);
            azjpVarArr2[length] = azjpVar;
        } while (!azjsVar.e.compareAndSet(azjpVarArr, azjpVarArr2));
        if (azjpVar.d) {
            azjsVar.f(azjpVar);
        } else {
            azjsVar.c.e(azjpVar);
        }
    }
}
