package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avjp implements aonq {
    TRANSFER_FAILURE_REASON_UNKNOWN(0),
    TRANSFER_FAILURE_REASON_FILESYSTEM_WRITE(1),
    TRANSFER_FAILURE_REASON_EXTERNAL_FILESYSTEM_WRITE(2),
    TRANSFER_FAILURE_REASON_PLAYABILITY(3),
    TRANSFER_FAILURE_REASON_TOO_MANY_RETRIES(4),
    TRANSFER_FAILURE_REASON_INTERNAL(5),
    TRANSFER_FAILURE_REASON_STREAM_MISSING(6),
    TRANSFER_FAILURE_REASON_SERVER(7),
    TRANSFER_FAILURE_REASON_SERVER_PROPERTY_MISSING(8),
    TRANSFER_FAILURE_REASON_NETWORK(9),
    TRANSFER_FAILURE_REASON_TERMINATED_BY_USER(10),
    TRANSFER_FAILURE_REASON_NETWORK_LOST(11);

    public final int m;

    avjp(int i) {
        this.m = i;
    }

    public static aons a() {
        return avhw.f;
    }

    public static avjp b(int i) {
        switch (i) {
            case 0:
                return TRANSFER_FAILURE_REASON_UNKNOWN;
            case 1:
                return TRANSFER_FAILURE_REASON_FILESYSTEM_WRITE;
            case 2:
                return TRANSFER_FAILURE_REASON_EXTERNAL_FILESYSTEM_WRITE;
            case 3:
                return TRANSFER_FAILURE_REASON_PLAYABILITY;
            case 4:
                return TRANSFER_FAILURE_REASON_TOO_MANY_RETRIES;
            case 5:
                return TRANSFER_FAILURE_REASON_INTERNAL;
            case 6:
                return TRANSFER_FAILURE_REASON_STREAM_MISSING;
            case 7:
                return TRANSFER_FAILURE_REASON_SERVER;
            case 8:
                return TRANSFER_FAILURE_REASON_SERVER_PROPERTY_MISSING;
            case 9:
                return TRANSFER_FAILURE_REASON_NETWORK;
            case 10:
                return TRANSFER_FAILURE_REASON_TERMINATED_BY_USER;
            case 11:
                return TRANSFER_FAILURE_REASON_NETWORK_LOST;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
