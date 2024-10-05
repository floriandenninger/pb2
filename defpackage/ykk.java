package defpackage;

import android.content.Intent;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ykk {
    public SparseArray a;

    public final boolean a(int i) {
        SparseArray sparseArray = this.a;
        return (sparseArray == null || sparseArray.get(i) == null) ? false : true;
    }

    public final boolean b(int i, int i2, Intent intent) {
        SparseArray sparseArray = this.a;
        if (sparseArray == null || sparseArray.get(i) == null) {
            return false;
        }
        ((ykj) this.a.get(i)).kD(i, i2, intent);
        SparseArray sparseArray2 = this.a;
        if (sparseArray2 == null) {
            return true;
        }
        sparseArray2.remove(i);
        return true;
    }
}
