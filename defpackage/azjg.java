package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azjg extends azqo implements aysc {
    final ayqb a;
    final AtomicReference b = new AtomicReference();

    public azjg(ayqb ayqbVar) {
        this.a = ayqbVar;
    }

    @Override // defpackage.azqo
    public final void a(ayrs ayrsVar) {
        azjf azjfVar;
        while (true) {
            azjfVar = (azjf) this.b.get();
            if (azjfVar != null && !azjfVar.e()) {
                break;
            }
            azjf azjfVar2 = new azjf(this.b);
            if (this.b.compareAndSet(azjfVar, azjfVar2)) {
                azjfVar = azjfVar2;
                break;
            }
        }
        boolean z = !azjfVar.c.get() && azjfVar.c.compareAndSet(false, true);
        try {
            ayrsVar.a(azjfVar);
            if (z) {
                this.a.aE(azjfVar);
            }
        } catch (Throwable th) {
            aynu.c(th);
            throw azqi.b(th);
        }
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        azjf azjfVar;
        azje[] azjeVarArr;
        azje[] azjeVarArr2;
        do {
            azjfVar = (azjf) this.b.get();
            if (azjfVar != null) {
                break;
            } else {
                azjfVar = new azjf(this.b);
            }
        } while (!this.b.compareAndSet(null, azjfVar));
        azje azjeVar = new azje(ayqdVar, azjfVar);
        ayqdVar.se(azjeVar);
        do {
            azjeVarArr = (azje[]) azjfVar.get();
            if (azjeVarArr == azjf.b) {
                Throwable th = azjfVar.f;
                if (th != null) {
                    ayqdVar.b(th);
                    return;
                } else {
                    ayqdVar.sh();
                    return;
                }
            }
            int length = azjeVarArr.length;
            azjeVarArr2 = new azje[length + 1];
            System.arraycopy(azjeVarArr, 0, azjeVarArr2, 0, length);
            azjeVarArr2[length] = azjeVar;
        } while (!azjfVar.compareAndSet(azjeVarArr, azjeVarArr2));
        if (azjeVar.e()) {
            azjfVar.f(azjeVar);
        }
    }

    @Override // defpackage.aysc
    public final void sl(ayqx ayqxVar) {
        this.b.compareAndSet((azjf) ayqxVar, null);
    }
}
