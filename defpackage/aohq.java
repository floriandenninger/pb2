package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aohq implements aonq {
    REMOVE_REASON_UNKNOWN(0),
    CLICKED_IN_SYSTEM_TRAY(1),
    ACTION_CLICK_IN_SYSTEM_TRAY(2),
    DISMISSED_IN_SYSTEM_TRAY(3),
    CLICKED_IN_INBOX(4),
    ACTION_CLICK_IN_INBOX(5),
    DISMISSED_IN_INBOX(6),
    DISMISSED_REMOTE(7),
    DISMISSED_BY_API(8),
    EXPIRED(9),
    ACCOUNT_DATA_CLEANED(10);

    public final int l;

    aohq(int i) {
        this.l = i;
    }

    public static aohq a(int i) {
        switch (i) {
            case 0:
                return REMOVE_REASON_UNKNOWN;
            case 1:
                return CLICKED_IN_SYSTEM_TRAY;
            case 2:
                return ACTION_CLICK_IN_SYSTEM_TRAY;
            case 3:
                return DISMISSED_IN_SYSTEM_TRAY;
            case 4:
                return CLICKED_IN_INBOX;
            case 5:
                return ACTION_CLICK_IN_INBOX;
            case 6:
                return DISMISSED_IN_INBOX;
            case 7:
                return DISMISSED_REMOTE;
            case 8:
                return DISMISSED_BY_API;
            case 9:
                return EXPIRED;
            case 10:
                return ACCOUNT_DATA_CLEANED;
            default:
                return null;
        }
    }

    public static aons b() {
        return aogu.o;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
