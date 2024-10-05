package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bdg {
    public int a;
    public final SparseArray b;
    public final psi c;

    public bdg() {
        axo axoVar = axo.d;
        throw null;
    }

    public final Object b() {
        return this.b.valueAt(r0.size() - 1);
    }

    public final boolean c() {
        return this.b.size() == 0;
    }

    public bdg(psi psiVar) {
        this.b = new SparseArray();
        this.c = psiVar;
        this.a = -1;
    }

    public final Object a(int i) {
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 > 0 && i < this.b.keyAt(i2)) {
                this.a--;
            }
        }
        while (this.a < this.b.size() - 1 && i >= this.b.keyAt(this.a + 1)) {
            this.a++;
        }
        return this.b.valueAt(this.a);
    }
}
