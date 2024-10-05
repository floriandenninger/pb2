package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum apag implements aonq {
    TRIGGER_CATEGORY_UNSPECIFIED(0),
    TRIGGER_CATEGORY_SLOT_ENTRY(1),
    TRIGGER_CATEGORY_SLOT_FULFILLMENT(2),
    TRIGGER_CATEGORY_SLOT_EXPIRATION(3),
    TRIGGER_CATEGORY_LAYOUT_EXIT_NORMAL(4),
    TRIGGER_CATEGORY_LAYOUT_EXIT_USER_SKIPPED(5),
    TRIGGER_CATEGORY_LAYOUT_EXIT_USER_MUTED(6),
    TRIGGER_CATEGORY_LAYOUT_EXIT_USER_INPUT_SUBMITTED(8),
    TRIGGER_CATEGORY_LAYOUT_EXIT_USER_CANCELLED(9),
    TRIGGER_CATEGORY_PING_DISPATCH(7);

    public final int k;

    apag(int i) {
        this.k = i;
    }

    public static aons a() {
        return apaf.a;
    }

    public static apag b(int i) {
        switch (i) {
            case 0:
                return TRIGGER_CATEGORY_UNSPECIFIED;
            case 1:
                return TRIGGER_CATEGORY_SLOT_ENTRY;
            case 2:
                return TRIGGER_CATEGORY_SLOT_FULFILLMENT;
            case 3:
                return TRIGGER_CATEGORY_SLOT_EXPIRATION;
            case 4:
                return TRIGGER_CATEGORY_LAYOUT_EXIT_NORMAL;
            case 5:
                return TRIGGER_CATEGORY_LAYOUT_EXIT_USER_SKIPPED;
            case 6:
                return TRIGGER_CATEGORY_LAYOUT_EXIT_USER_MUTED;
            case 7:
                return TRIGGER_CATEGORY_PING_DISPATCH;
            case 8:
                return TRIGGER_CATEGORY_LAYOUT_EXIT_USER_INPUT_SUBMITTED;
            case 9:
                return TRIGGER_CATEGORY_LAYOUT_EXIT_USER_CANCELLED;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
