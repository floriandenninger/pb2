package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aort implements aonq {
    ENVIRONMENT_UNKNOWN(0),
    ENVIRONMENT_PROD(1),
    ENVIRONMENT_STAGING(2),
    ENVIRONMENT_TEST_STAGING(3),
    ENVIRONMENT_AUTOPUSH(4),
    ENVIRONMENT_TEST_AUTOPUSH(5),
    ENVIRONMENT_TEST(6),
    UNRECOGNIZED(-1);

    private final int j;

    aort(int i2) {
        this.j = i2;
    }

    public static aons a() {
        return aokr.h;
    }

    public static aort b(int i2) {
        switch (i2) {
            case 0:
                return ENVIRONMENT_UNKNOWN;
            case 1:
                return ENVIRONMENT_PROD;
            case 2:
                return ENVIRONMENT_STAGING;
            case 3:
                return ENVIRONMENT_TEST_STAGING;
            case 4:
                return ENVIRONMENT_AUTOPUSH;
            case 5:
                return ENVIRONMENT_TEST_AUTOPUSH;
            case 6:
                return ENVIRONMENT_TEST;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
