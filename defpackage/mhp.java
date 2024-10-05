package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mhp implements ggr {
    public final ajjz a;
    public final avgg b;
    public final ajjv c;
    public final WeakReference d;

    public mhp(mgu mguVar, ajjz ajjzVar, String str, awpf awpfVar, WeakReference weakReference) {
        this.a = ajjzVar;
        this.d = weakReference;
        this.b = ahbn.n(awpfVar);
        mho mhoVar = new mho(awpfVar, mguVar, str);
        ajju a = ajjv.a();
        a.c = mhoVar;
        this.c = a.a();
    }

    @Override // defpackage.ggr
    public final View g() {
        return null;
    }

    @Override // defpackage.ggr
    public final void i(boolean z) {
        fpx fpxVar = (fpx) this.d.get();
        if (fpxVar == null) {
            return;
        }
        if (z) {
            fpxVar.b(new mhn(this));
        } else {
            fpxVar.a(false);
        }
    }

    @Override // defpackage.ggr
    public final mhp j() {
        return this;
    }
}
