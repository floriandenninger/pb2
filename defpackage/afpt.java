package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afpt implements axqr {
    private final azrw a;

    public afpt(azrw azrwVar) {
        this.a = azrwVar;
    }

    public static SparseArray b(afqc afqcVar) {
        SparseArray b = afqcVar.b();
        ayaw.k(b);
        return b;
    }

    public static afpt c(azrw azrwVar) {
        return new afpt(azrwVar);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SparseArray get() {
        return b(((afpu) this.a).get());
    }
}
