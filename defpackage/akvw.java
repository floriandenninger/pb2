package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum akvw implements akvu {
    UNKNOWN(0),
    LEGACY(1),
    EXTERNAL(2),
    SHORTS(3);

    static final SparseArray e = new SparseArray();
    private final int g;

    static {
        for (akvw akvwVar : values()) {
            e.put(akvwVar.g, akvwVar);
        }
    }

    akvw(int i) {
        this.g = i;
    }

    public static String c(avtl avtlVar) {
        int ordinal = avtlVar.ordinal();
        if (ordinal == 0) {
            return UNKNOWN.d();
        }
        if (ordinal == 1) {
            return LEGACY.d();
        }
        if (ordinal == 2) {
            return EXTERNAL.d();
        }
        if (ordinal == 3) {
            return SHORTS.d();
        }
        return UNKNOWN.d();
    }

    @Override // defpackage.akvu
    public final /* bridge */ /* synthetic */ akvu a(int i) {
        return (akvw) e.get(i);
    }

    @Override // defpackage.akvu
    public final String b() {
        return "cf";
    }

    public final String d() {
        int i = this.g;
        StringBuilder sb = new StringBuilder(14);
        sb.append("cf=");
        sb.append(i);
        return sb.toString();
    }
}
