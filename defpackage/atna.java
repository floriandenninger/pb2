package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atna implements aonq {
    NOTAIRE_EVENT_TYPE_UNKNOWN(0),
    NOTAIRE_EVENT_TYPE_BITMAP_FETCH_STARTED(1),
    NOTAIRE_EVENT_TYPE_BITMAP_FETCH_FINISHED(2),
    NOTAIRE_EVENT_TYPE_COMMANDS_EXECUTED(3),
    NOTAIRE_EVENT_TYPE_ERROR_RAISED(4),
    NOTAIRE_EVENT_TYPE_IDENTITY_DID_NOT_MATCH(5),
    NOTAIRE_EVENT_TYPE_IDENTITY_MISSING(6),
    NOTAIRE_EVENT_TYPE_NOTIFICATION_BUILDING_STARTED(7),
    NOTAIRE_EVENT_TYPE_NOTIFICATION_DID_NOT_BUILD(8),
    NOTAIRE_EVENT_TYPE_NOTIFICATION_POSTED(9),
    NOTAIRE_EVENT_TYPE_NOTIFICATION_OS_SETTINGS_DISABLED(16),
    NOTAIRE_EVENT_TYPE_NOTIFICATION_SETTINGS_DISABLED(10),
    NOTAIRE_EVENT_TYPE_PAYLOAD_NOT_VALID_1(11),
    NOTAIRE_EVENT_TYPE_PAYLOAD_NOT_VALID_2(12),
    NOTAIRE_EVENT_TYPE_PAYLOAD_PROCESSING_STARTED(13),
    NOTAIRE_EVENT_TYPE_PAYLOAD_RECEIVED(14),
    NOTAIRE_EVENT_TYPE_USER_SIGNED_OUT(15);

    public final int r;

    atna(int i) {
        this.r = i;
    }

    public static aons a() {
        return atmj.c;
    }

    public static atna b(int i) {
        switch (i) {
            case 0:
                return NOTAIRE_EVENT_TYPE_UNKNOWN;
            case 1:
                return NOTAIRE_EVENT_TYPE_BITMAP_FETCH_STARTED;
            case 2:
                return NOTAIRE_EVENT_TYPE_BITMAP_FETCH_FINISHED;
            case 3:
                return NOTAIRE_EVENT_TYPE_COMMANDS_EXECUTED;
            case 4:
                return NOTAIRE_EVENT_TYPE_ERROR_RAISED;
            case 5:
                return NOTAIRE_EVENT_TYPE_IDENTITY_DID_NOT_MATCH;
            case 6:
                return NOTAIRE_EVENT_TYPE_IDENTITY_MISSING;
            case 7:
                return NOTAIRE_EVENT_TYPE_NOTIFICATION_BUILDING_STARTED;
            case 8:
                return NOTAIRE_EVENT_TYPE_NOTIFICATION_DID_NOT_BUILD;
            case 9:
                return NOTAIRE_EVENT_TYPE_NOTIFICATION_POSTED;
            case 10:
                return NOTAIRE_EVENT_TYPE_NOTIFICATION_SETTINGS_DISABLED;
            case 11:
                return NOTAIRE_EVENT_TYPE_PAYLOAD_NOT_VALID_1;
            case 12:
                return NOTAIRE_EVENT_TYPE_PAYLOAD_NOT_VALID_2;
            case 13:
                return NOTAIRE_EVENT_TYPE_PAYLOAD_PROCESSING_STARTED;
            case 14:
                return NOTAIRE_EVENT_TYPE_PAYLOAD_RECEIVED;
            case 15:
                return NOTAIRE_EVENT_TYPE_USER_SIGNED_OUT;
            case 16:
                return NOTAIRE_EVENT_TYPE_NOTIFICATION_OS_SETTINGS_DISABLED;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.r;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.r);
    }
}
