package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum akvy implements akvu {
    UNKNOWN(0),
    NORMAL(1),
    REELS(2),
    FEEDBACK_ONLY(3),
    LIVE_HIGHLIGHT(5);

    static final SparseArray f = new SparseArray();
    private final int h;

    static {
        for (akvy akvyVar : values()) {
            f.put(akvyVar.h, akvyVar);
        }
    }

    akvy(int i) {
        this.h = i;
    }

    public static String c(akzq akzqVar) {
        akzq akzqVar2 = akzq.UNKNOWN_UPLOAD;
        int ordinal = akzqVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return FEEDBACK_ONLY.d();
            }
            if (ordinal == 3) {
                return REELS.d();
            }
            if (ordinal == 4) {
                return LIVE_HIGHLIGHT.d();
            }
            if (ordinal != 5) {
                return UNKNOWN.d();
            }
        }
        return NORMAL.d();
    }

    @Override // defpackage.akvu
    public final /* bridge */ /* synthetic */ akvu a(int i) {
        return (akvy) f.get(i);
    }

    @Override // defpackage.akvu
    public final String b() {
        return "ut";
    }

    public final String d() {
        int i = this.h;
        StringBuilder sb = new StringBuilder(14);
        sb.append("ut=");
        sb.append(i);
        return sb.toString();
    }
}
