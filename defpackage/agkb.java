package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum agkb {
    EMPTY(0),
    FORECASTING(1),
    FULL(2);

    static final SparseArray d = new SparseArray();
    public final int e;

    static {
        for (agkb agkbVar : values()) {
            d.put(agkbVar.e, agkbVar);
        }
    }

    agkb(int i) {
        this.e = i;
    }
}
