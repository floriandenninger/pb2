package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aobl implements aonq {
    ACCOUNT_LINKING_FLOW_UNSPECIFIED(0),
    OAUTH2_FLOW(1),
    GSI_OAUTH_LINKING_FLOW(2),
    GSI_OAUTH_CREATION_FLOW(3),
    GSI_ONLY_FLOW(4),
    THIRD_PARTY_INITIATED_FLOW(5),
    MOBILE_APP_REDIRECT_FLOW(6),
    UNRECOGNIZED(-1);

    private final int j;

    aobl(int i2) {
        this.j = i2;
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
