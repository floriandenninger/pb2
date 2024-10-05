package defpackage;

import android.util.SparseBooleanArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class psn {
    private final SparseBooleanArray a;

    public psn(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        pse.i(i, b());
        return this.a.keyAt(i);
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psn)) {
            return false;
        }
        psn psnVar = (psn) obj;
        if (pts.a < 24) {
            if (b() != psnVar.b()) {
                return false;
            }
            for (int i = 0; i < b(); i++) {
                if (a(i) != psnVar.a(i)) {
                    return false;
                }
            }
            return true;
        }
        return this.a.equals(psnVar.a);
    }

    public final int hashCode() {
        if (pts.a < 24) {
            int b = b();
            for (int i = 0; i < b(); i++) {
                b = (b * 31) + a(i);
            }
            return b;
        }
        return this.a.hashCode();
    }
}
