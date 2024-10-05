package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aovo implements aonq {
    REGISTERED_GAIA_SERVICES_UNSPECIFIED(0),
    REGISTERED_GAIA_SERVICES_IS_UNICORN_CHILD_ACCOUNT(1),
    REGISTERED_GAIA_SERVICES_IS_UNICORN_OVER_13_IN_EU(2),
    REGISTERED_GAIA_SERVICES_IS_YOUTUBE_PERSONA(3),
    REGISTERED_GAIA_SERVICES_IS_MADISON_ACCOUNT(4),
    REGISTERED_GAIA_SERVICES_IS_YOUTUBE_CHANNEL_ACCOUNT(5),
    REGISTERED_GAIA_SERVICES_HAS_GRIFFIN_POLICY(6),
    UNRECOGNIZED(-1);

    private final int j;

    aovo(int i2) {
        this.j = i2;
    }

    public static aons a() {
        return aouo.i;
    }

    public static aovo b(int i2) {
        switch (i2) {
            case 0:
                return REGISTERED_GAIA_SERVICES_UNSPECIFIED;
            case 1:
                return REGISTERED_GAIA_SERVICES_IS_UNICORN_CHILD_ACCOUNT;
            case 2:
                return REGISTERED_GAIA_SERVICES_IS_UNICORN_OVER_13_IN_EU;
            case 3:
                return REGISTERED_GAIA_SERVICES_IS_YOUTUBE_PERSONA;
            case 4:
                return REGISTERED_GAIA_SERVICES_IS_MADISON_ACCOUNT;
            case 5:
                return REGISTERED_GAIA_SERVICES_IS_YOUTUBE_CHANNEL_ACCOUNT;
            case 6:
                return REGISTERED_GAIA_SERVICES_HAS_GRIFFIN_POLICY;
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
