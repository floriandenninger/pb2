package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aorv implements aonq {
    STATE_UNKNOWN(0),
    STATE_START(1),
    STATE_ACCOUNT_SELECTION(2),
    STATE_PROVIDER_CONSENT(3),
    STATE_ACCOUNT_CREATION(4),
    STATE_APP_AUTH(5),
    STATE_ADD_PHONE(6),
    STATE_VERIFY_PHONE(7),
    STATE_VERIFY_PHONE_FAIL(8),
    STATE_COMPLETE(9),
    STATE_ERROR(10),
    STATE_INFO_DIALOG(11),
    STATE_APP_FLIP(12),
    STATE_LINKING_INFO(13),
    STATE_USAGE_NOTICE(14),
    UNRECOGNIZED(-1);

    private final int r;

    aorv(int i) {
        this.r = i;
    }

    public static aons a() {
        return aokr.i;
    }

    public static aorv b(int i) {
        switch (i) {
            case 0:
                return STATE_UNKNOWN;
            case 1:
                return STATE_START;
            case 2:
                return STATE_ACCOUNT_SELECTION;
            case 3:
                return STATE_PROVIDER_CONSENT;
            case 4:
                return STATE_ACCOUNT_CREATION;
            case 5:
                return STATE_APP_AUTH;
            case 6:
                return STATE_ADD_PHONE;
            case 7:
                return STATE_VERIFY_PHONE;
            case 8:
                return STATE_VERIFY_PHONE_FAIL;
            case 9:
                return STATE_COMPLETE;
            case 10:
                return STATE_ERROR;
            case 11:
                return STATE_INFO_DIALOG;
            case 12:
                return STATE_APP_FLIP;
            case 13:
                return STATE_LINKING_INFO;
            case 14:
                return STATE_USAGE_NOTICE;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.r;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
