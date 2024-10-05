package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aoct implements aonq {
    ERROR_CODE_UNSPECIFIED(0),
    ERROR_CODE_INVALID_REQUEST(1),
    ERROR_CODE_RPC_ERROR(2),
    ERROR_CODE_INTERNAL_ERROR(3),
    ERROR_CODE_AUTHENTICATION_DENIED_BY_USER(4),
    UNRECOGNIZED(-1);

    private final int h;

    aoct(int i) {
        this.h = i;
    }

    public static aoct a(int i) {
        if (i == 0) {
            return ERROR_CODE_UNSPECIFIED;
        }
        if (i == 1) {
            return ERROR_CODE_INVALID_REQUEST;
        }
        if (i == 2) {
            return ERROR_CODE_RPC_ERROR;
        }
        if (i == 3) {
            return ERROR_CODE_INTERNAL_ERROR;
        }
        if (i != 4) {
            return null;
        }
        return ERROR_CODE_AUTHENTICATION_DENIED_BY_USER;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
