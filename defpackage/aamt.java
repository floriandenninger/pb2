package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aamt {
    SINGLE_ANSWERS("single-answer"),
    MULTI_SELECT("multi-select"),
    UNSUPPORTED("unsupported");

    private final String e;

    aamt(String str) {
        this.e = str;
    }

    public static aamt a(String str) {
        for (aamt aamtVar : values()) {
            if (aamtVar.e.equals(str)) {
                return aamtVar;
            }
        }
        return UNSUPPORTED;
    }
}
