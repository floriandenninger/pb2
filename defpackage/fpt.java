package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fpt implements gmf {
    private final fps a;
    private final axpg b;
    private final awnw c;
    private final awnw d;

    public fpt(WeakReference weakReference, axpg axpgVar, awnw awnwVar, awnw awnwVar2, fpy fpyVar, AtomicBoolean atomicBoolean) {
        this.b = axpgVar;
        this.c = awnwVar;
        this.d = awnwVar2;
        this.a = new fps(fpyVar, weakReference, atomicBoolean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(WeakReference weakReference) {
        this.a.a = weakReference;
    }

    @Override // defpackage.gmf
    public final boolean oA(gmf gmfVar) {
        return (gmfVar instanceof fpt) && this.d == ((fpt) gmfVar).d;
    }

    @Override // defpackage.gmf
    public final ayph oz(int i) {
        fpp fppVar = new fpp();
        fppVar.a = false;
        fppVar.b = this.a;
        if (i == 1) {
            if (this.d != null) {
                return ((sww) this.b.get()).b(this.d, fppVar.a());
            }
            i = 1;
        }
        if (i != 2) {
            if (i == 0 && this.c != null) {
                return ((sww) this.b.get()).b(this.c, fppVar.a());
            }
        } else if (this.d != null) {
            sww swwVar = (sww) this.b.get();
            awnw awnwVar = this.d;
            fppVar.a = true;
            return swwVar.b(awnwVar, fppVar.a());
        }
        return ayph.f();
    }
}
