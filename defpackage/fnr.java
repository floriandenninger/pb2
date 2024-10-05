package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class fnr implements fnp {
    public final aivf a;
    private final fnp b;

    public fnr(aivf aivfVar) {
        aivfVar.getClass();
        if (aivfVar instanceof fnp) {
            this.b = (fnp) aivfVar;
        } else {
            this.b = new fnq(aivfVar);
        }
        this.a = aivfVar;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return this.b.c();
    }

    @Override // defpackage.aivf
    public final View ld() {
        return this.b.ld();
    }

    @Override // defpackage.fnp
    public boolean mY(fhg fhgVar) {
        return this.b.mY(fhgVar);
    }

    @Override // defpackage.fnp
    public final void nH(fhg fhgVar) {
        this.b.nH(fhgVar);
    }
}
