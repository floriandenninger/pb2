package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azad implements banv {
    private final AtomicReference a;
    private final Callable b;

    public azad(AtomicReference atomicReference, Callable callable) {
        this.a = atomicReference;
        this.b = callable;
    }

    @Override // defpackage.banv
    public final void ab(banw banwVar) {
        azae azaeVar;
        azaa[] azaaVarArr;
        azaa[] azaaVarArr2;
        while (true) {
            azaeVar = (azae) this.a.get();
            if (azaeVar != null) {
                break;
            }
            try {
                azae azaeVar2 = new azae((ayzz) this.b.call());
                if (this.a.compareAndSet(null, azaeVar2)) {
                    azaeVar = azaeVar2;
                    break;
                }
            } catch (Throwable th) {
                aynu.c(th);
                azpy.f(th, banwVar);
                return;
            }
        }
        azaa azaaVar = new azaa(azaeVar, banwVar);
        banwVar.f(azaaVar);
        do {
            azaaVarArr = (azaa[]) azaeVar.d.get();
            if (azaaVarArr == azae.b) {
                break;
            }
            int length = azaaVarArr.length;
            azaaVarArr2 = new azaa[length + 1];
            System.arraycopy(azaaVarArr, 0, azaaVarArr2, 0, length);
            azaaVarArr2[length] = azaaVar;
        } while (!azaeVar.d.compareAndSet(azaaVarArr, azaaVarArr2));
        if (azaaVar.e()) {
            azaeVar.g(azaaVar);
        } else {
            azaeVar.d();
            azaeVar.i.b(azaaVar);
        }
    }
}
