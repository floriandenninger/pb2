package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum abww {
    GOOD(0),
    POOR(1),
    BAD(2);

    private static final SparseArray d = new SparseArray();
    private final int f;

    static {
        for (abww abwwVar : values()) {
            d.put(abwwVar.f, abwwVar);
        }
    }

    abww(int i) {
        this.f = i;
    }
}
