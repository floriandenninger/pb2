package defpackage;

import android.util.SparseIntArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qso {
    public final SparseIntArray a;
    public qmz b;

    public qso() {
        qmy qmyVar = qmy.a;
        throw null;
    }

    public final void a() {
        this.a.clear();
    }

    public final int b(int i) {
        return this.a.get(i, -1);
    }

    public qso(qmz qmzVar) {
        this.a = new SparseIntArray();
        qip.an(qmzVar);
        this.b = qmzVar;
    }
}
