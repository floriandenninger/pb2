package defpackage;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amd {
    public als a;
    private final SparseArray b;

    private amd() {
        this(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final amd a(int i) {
        return (amd) this.b.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(als alsVar, int i, int i2) {
        amd a = a(alsVar.a(i));
        if (a == null) {
            a = new amd(1);
            this.b.put(alsVar.a(i), a);
        }
        if (i2 > i) {
            a.b(alsVar, i + 1, i2);
        } else {
            a.a = alsVar;
        }
    }

    public amd(int i) {
        this.b = new SparseArray(i);
    }
}
