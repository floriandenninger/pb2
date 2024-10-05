package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayzv extends ayrk implements aysc {
    final banv b;
    final int c;
    final AtomicReference d = new AtomicReference();

    public ayzv(banv banvVar, int i) {
        this.b = banvVar;
        this.c = i;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        ayzu ayzuVar;
        ayzt[] ayztVarArr;
        ayzt[] ayztVarArr2;
        do {
            ayzuVar = (ayzu) this.d.get();
            if (ayzuVar != null) {
                break;
            } else {
                ayzuVar = new ayzu(this.d, this.c);
            }
        } while (!this.d.compareAndSet(null, ayzuVar));
        ayzt ayztVar = new ayzt(banwVar, ayzuVar);
        banwVar.f(ayztVar);
        do {
            ayztVarArr = (ayzt[]) ayzuVar.f.get();
            if (ayztVarArr == ayzu.b) {
                Throwable th = ayzuVar.k;
                if (th != null) {
                    banwVar.b(th);
                    return;
                } else {
                    banwVar.sh();
                    return;
                }
            }
            int length = ayztVarArr.length;
            ayztVarArr2 = new ayzt[length + 1];
            System.arraycopy(ayztVarArr, 0, ayztVarArr2, 0, length);
            ayztVarArr2[length] = ayztVar;
        } while (!ayzuVar.f.compareAndSet(ayztVarArr, ayztVarArr2));
        if (ayztVar.a()) {
            ayzuVar.g(ayztVar);
        } else {
            ayzuVar.d();
        }
    }

    @Override // defpackage.ayrk
    public final void ap(ayrs ayrsVar) {
        ayzu ayzuVar;
        while (true) {
            ayzuVar = (ayzu) this.d.get();
            if (ayzuVar != null && !ayzuVar.e()) {
                break;
            }
            ayzu ayzuVar2 = new ayzu(this.d, this.c);
            if (this.d.compareAndSet(ayzuVar, ayzuVar2)) {
                ayzuVar = ayzuVar2;
                break;
            }
        }
        boolean z = !ayzuVar.e.get() && ayzuVar.e.compareAndSet(false, true);
        try {
            ayrsVar.a(ayzuVar);
            if (z) {
                this.b.ab(ayzuVar);
            }
        } catch (Throwable th) {
            aynu.c(th);
            throw azqi.b(th);
        }
    }

    @Override // defpackage.aysc
    public final void sl(ayqx ayqxVar) {
        this.d.compareAndSet((ayzu) ayqxVar, null);
    }
}
