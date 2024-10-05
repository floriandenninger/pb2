package defpackage;

import android.util.SparseIntArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abjt {
    private static final SparseIntArray a = new agbw((char[]) null);
    private static final SparseIntArray b = new agbw(null, null);
    private final SparseIntArray c;

    public abjt(abjs abjsVar) {
        SparseIntArray sparseIntArray;
        abjs abjsVar2 = abjs.DARK;
        int ordinal = abjsVar.ordinal();
        if (ordinal != 0) {
            sparseIntArray = ordinal != 1 ? null : b;
        } else {
            sparseIntArray = a;
        }
        sparseIntArray.getClass();
        this.c = sparseIntArray;
    }

    public final int a(int i) {
        if (this.c.indexOfKey(i) >= 0) {
            return this.c.get(i);
        }
        return 0;
    }
}
