package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ancy implements aonq {
    UNKNOWN_ALIGNMENT(0),
    DISABLED(1),
    ENABLED_NO_FILTERING(2),
    ENABLED_WITH_MEDIAN_FILTER(3);

    public static final int DISABLED_VALUE = 1;
    public static final int ENABLED_NO_FILTERING_VALUE = 2;
    public static final int ENABLED_WITH_MEDIAN_FILTER_VALUE = 3;
    public static final int UNKNOWN_ALIGNMENT_VALUE = 0;
    private static final aonr internalValueMap = new ancw(0);
    public final int value;

    ancy(int i) {
        this.value = i;
    }

    public static ancy a(int i) {
        if (i == 0) {
            return UNKNOWN_ALIGNMENT;
        }
        if (i == 1) {
            return DISABLED;
        }
        if (i == 2) {
            return ENABLED_NO_FILTERING;
        }
        if (i != 3) {
            return null;
        }
        return ENABLED_WITH_MEDIAN_FILTER;
    }

    public static aons b() {
        return ancx.INSTANCE;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.value);
    }
}
